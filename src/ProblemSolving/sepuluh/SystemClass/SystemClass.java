package ProblemSolving.sepuluh.SystemClass;

public class SystemClass {

    // cek environment di cmd cara nya  dir env:

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv("ALLUSERSPROFILE"));

        System.gc();
        System.exit(12);
        System.out.println("HIII");
    }
}
