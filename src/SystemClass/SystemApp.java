package SystemClass;

public class SystemApp {

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv());


        System.out.println(System.getenv("OS"));
        System.out.println(System.getenv("TEMP"));

        System.exit(1);

        System.out.println("Hi");



    }
}
