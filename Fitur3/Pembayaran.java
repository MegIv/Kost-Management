import java.time.LocalDate;

public class Pembayaran {
    private double jumlah;
    private String metode; 
    private LocalDate tanggal;
    private boolean terverifikasi;
    private String id;

    public Pembayaran(String id, double jumlah, String metode) {
        this.id = id;
        this.jumlah = jumlah;
        this.metode = metode;
        this.tanggal = LocalDate.now();
        this.terverifikasi = false;
    }

    public String getId(){
        return id;
    }

    public void verifikasi() {
        this.terverifikasi = true;
    }

    public boolean isTerverifikasi() {
        return terverifikasi;
    }

    public double getJumlah() {
        return jumlah;
    }

    public String getMetode() {
        return metode;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    @Override
    public String toString() {
        String statusStr = terverifikasi ? "Terverifikasi" : "Belum Diverifikasi";
        return String.format("Tanggal: %s, ID: %s, Jumlah: %.1f, Metode: %s, Status: %s",
                tanggal.toString(), id, jumlah, metode.toLowerCase(), statusStr);
    }

}
