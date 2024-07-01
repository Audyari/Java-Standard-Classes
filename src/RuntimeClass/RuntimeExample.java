package RuntimeClass;

public class RuntimeExample {

    public static void main(String[] args) {

        // Mendapatkan instance Runtime saat ini
        Runtime runtime = Runtime.getRuntime();

        // Memeriksa total memori dan memori bebas
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        System.out.println("Total Memory: " + totalMemory + " bytes");
        System.out.println("Free Memory: " + freeMemory + " bytes");

        // Memicu garbage collection
        System.out.println("Memicu garbage collection...");
        runtime.gc();
        freeMemory = runtime.freeMemory();
        System.out.println("Free Memory setelah garbage collection: " + freeMemory + " bytes");

        // Menjalankan perintah sistem operasi
        try {
            String[] command = {"ls", "-l"};
            Process process = runtime.exec(command);
            int exitCode = process.waitFor();
            System.out.println("Exit code dari perintah: " + exitCode);
        } catch (Exception e) {
            System.err.println("Terjadi error: " + e.getMessage());
        }

        // Mendaftarkan hook shutdownkk
        runtime.addShutdownHook(new Thread(() -> {
            System.out.println("Aplikasi akan dihentikan...");
        }));

        System.out.println("Akhir program.");
    }
}
