import Fitur5.PencarianBase;
import java.util.*;
import java.util.stream.Collectors;

public class PencarianPembayaran extends PencarianBase<Pembayaran> {

    private List<Penyewa> daftarPenyewa;

    public PencarianPembayaran(List<Penyewa> daftarPenyewa) {
        super(daftarPenyewa.stream()
            .flatMap(p -> p.getRiwayatPembayaran().stream())
            .collect(Collectors.toList()));
        this.daftarPenyewa = daftarPenyewa;
    }

    @Override
    public Pembayaran searchById(String id) {
        for (Pembayaran p : dataSource) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Pembayaran> filterDariKriteria(Map<String, Object> criteria) {
        return dataSource.stream()
            .filter(p -> {
                boolean match = true;
                for (String key : criteria.keySet()) {
                    Object value = criteria.get(key);
                    switch (key.toLowerCase()) {
                        case "metode":
                            match &= p.getMetode().equalsIgnoreCase((String) value);
                            break;
                        case "terverifikasi":
                            match &= p.isTerverifikasi() == (Boolean) value;
                            break;
                        case "tanggal":
                            match &= p.getTanggal().equals(value);
                            break;
                        case "jumlah":
                            match &= p.getJumlah() == (Double) value;
                            break;
                        default:
                            break;
                    }
                    if (!match) break;
                }
                return match;
            })
            .collect(Collectors.toList());
    }

    public static List<Pembayaran> cariByPenyewa(List<Penyewa> daftarPenyewa, String namaPenyewa) {
        for (Penyewa p : daftarPenyewa) {
            if (p.getNama().equalsIgnoreCase(namaPenyewa)) {
                return p.getRiwayatPembayaran();
            }
        }
        return null;
    }

    public static List<Pembayaran> cariPembayaranByNama(List<Penyewa> daftarPenyewa, String namaPenyewa) {
        return cariByPenyewa(daftarPenyewa, namaPenyewa);
    }

    public static List<Pembayaran> filterByStatus(List<Penyewa> daftarPenyewa, boolean hanyaTerverifikasi) {
        return daftarPenyewa.stream()
            .flatMap(penyewa -> penyewa.getRiwayatPembayaran().stream())
            .filter(pembayaran -> pembayaran.isTerverifikasi() == hanyaTerverifikasi)
            .collect(Collectors.toList());
    }

    public static List<Pembayaran> cariPembayaranByStatus(List<Penyewa> daftarPenyewa, boolean lunas) {
        List<Pembayaran> hasil = new ArrayList<>();
        for (Penyewa penyewa : daftarPenyewa) {
            Kamar kamar = penyewa.getKamar();
            if (kamar == null) continue; 

            List<Pembayaran> semuaPembayaran = penyewa.getRiwayatPembayaran();
            List<Pembayaran> pembayaranTerverifikasi = semuaPembayaran.stream()
                .filter(Pembayaran::isTerverifikasi)
                .collect(Collectors.toList());

            double total = pembayaranTerverifikasi.stream()
                .mapToDouble(Pembayaran::getJumlah)
                .sum();

            double hargaKamar = kamar.getHarga();
            boolean statusLunas = total >= hargaKamar;

            if (statusLunas == lunas) {
                hasil.addAll(pembayaranTerverifikasi); 
            }
        }
        return hasil;
    }


    public static void tampilkanPembayaran(List<Pembayaran> daftarPembayaran) {
        if (daftarPembayaran == null || daftarPembayaran.isEmpty()) {
            System.out.println("Tidak ada data pembayaran ditemukan.");
            return;
        }
        for (Pembayaran p : daftarPembayaran) {
            System.out.println(p);
        }
    }
}
