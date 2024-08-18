package Objek.Pembayaran;

public class Pembayaran {

    private int id;
    private String metodePembayaran;
    private double jumlahDibayar;
    private String tanggalPembayaran;
    private String status;

    public Pembayaran(int id, String metodePembayaran, double jumlahDibayar) {
        this.id = id;
        this.metodePembayaran = metodePembayaran;
        this.jumlahDibayar = jumlahDibayar;
        this.tanggalPembayaran = getCurrentDate();
        this.status = "Pending";
    }

    public void lakukan_pembayaran() {
        this.tanggalPembayaran = getCurrentDate();
        this.status = "Berhasil";
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInformasi() {
        return "Pembayaran ID: " + this.id +
                ", Metode: " + this.metodePembayaran +
                ", Jumlah: " + this.jumlahDibayar +
                ", Tanggal: " + this.tanggalPembayaran +
                ", Status: " + this.status;
    }

    private String getCurrentDate() {
        return java.time.LocalDateTime.now().toString();
    }
}

