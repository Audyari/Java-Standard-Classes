package SystemClass;

public class SystemExample {

    public static void main(String[] args) {

        // Mengakses masukan dan keluaran standar
        System.out.println("Ini adalah keluaran standar");
        System.err.println("Ini adalah keluaran error standar");

        try {
            int input = System.in.read();
            System.out.println("Masukan yang dibaca: " + (char) input);
        } catch (Exception e) {
            System.err.println("Terjadi kesalahan saat membaca masukan: " + e.getMessage());
        }

        // Mendapatkan informasi sistem
        String javaVersion = System.getProperty("java.version");
        System.out.println("Versi Java: " + javaVersion);

        String userName = System.getenv("USER");
        System.out.println("Nama pengguna: " + userName);

        // Manajemen waktu
        long startTime = System.currentTimeMillis();
        // Jalankan kode yang ingin diukur waktunya
        long endTime = System.currentTimeMillis();
        System.out.println("Waktu eksekusi: " + (endTime - startTime) + " milidetik");

        // Mengelola sistem
        if (javaVersion.startsWith("1.8")) {
            System.out.println("Versi Java yang digunakan adalah Java 8");
        } else {
            System.out.println("Versi Java yang digunakan bukan Java 8");
            System.exit(1); // Keluar dengan status 1 (kesalahan)
        }

        System.gc(); // Meminta garbage collector untuk menjalankan koleksi sampah
    }
}