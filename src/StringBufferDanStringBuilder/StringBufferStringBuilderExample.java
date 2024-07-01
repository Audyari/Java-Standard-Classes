package StringBufferDanStringBuilder;

public class StringBufferStringBuilderExample {

    public static void main(String[] args) {

        // Contoh penggunaan StringBuffer
        StringBuffer sbuffer = new StringBuffer("Hello");
        sbuffer.append(", ");
        sbuffer.append("World");

        System.out.println(sbuffer.toString()); // Output: Hello, World

        // Contoh penggunaan StringBuilder
        StringBuilder sbuilder = new StringBuilder("Java");
        sbuilder.insert(4, " Programming");

        System.out.println(sbuilder.toString()); // Output: Java Programming

        // Perbedaan kecepatan antara StringBuffer dan StringBuilder
        long startTime, endTime;

        // Menggunakan StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbuffBuilder = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            sbuffBuilder.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ns");

        // Menggunakan StringBuilder
        startTime = System.nanoTime();
        StringBuilder sbuilderObj = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sbuilderObj.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ns");
    }
}
