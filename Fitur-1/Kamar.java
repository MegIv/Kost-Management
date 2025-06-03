public class Kamar {
    private String id;
    private String jenis;
    private double harga;
    private boolean tersedia;

    public Kamar(String id, String jenis, double harga, boolean tersedia) {
        this.id = id;
        this.jenis = jenis;
        this.harga = harga;
        this.tersedia = tersedia;
    }
    public String getId() {
        return id;
    }

    public String getJenis() {
        return jenis;
    }
    public double getHarga() {
        return harga;
    }
    public boolean isTersedia() {
        return tersedia;
    }
    public void setJenisn(String jenis) {
        this.jenis = jenis;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
    
    public void tampilkanInfo() {
        String status = tersedia ? "tersedia" : "tidak tersedia";
        System.out.println("ID: " + id + ", jenis: " + jenis + ", harga: " + harga + ", status: " + status);
    }

}
