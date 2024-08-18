package Objek.Pembayaran;

public class PengunnanPembayaran {

    public static void main(String[] args) {
        Pembayaran pembayaran = new Pembayaran(1, "Transfer Bank", 100.0);
        System.out.println(pembayaran.getInformasi()); // Output: Pembayaran ID: 1, Metode: Transfer Bank, Jumlah: 100.0, Tanggal: 2024-08-18T12:34:56, Status: Pending

        pembayaran.lakukan_pembayaran();
        System.out.println(pembayaran.getInformasi()); // Output: Pembayaran ID: 1, Metode: Transfer Bank, Jumlah: 100.0, Tanggal: 2024-08-18T12:34:56, Status: Berhasil
    }
}
