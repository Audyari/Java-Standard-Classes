package NumberClass;

public class NumberExample {

    public static void main(String[] args) {

        // Contoh 1: Menggunakan metode-metode kelas Number
        Number num1 = 42.5;
        System.out.println("num1 as byte: " + num1.byteValue());
        System.out.println("num1 as int: " + num1.intValue());
        System.out.println("num1 as double: " + num1.doubleValue());

        // Contoh 2: Membandingkan nilai numerik
        Number num2 = 43.2;
        int compareResult = Double.compare(num1.doubleValue(), num2.doubleValue());
        System.out.println("\nComparison result: " + compareResult);

        // Contoh 3: Konversi ke string
        String numStr = num1.toString();
        System.out.println("\nnum1 as string: " + numStr);

        // Contoh 4: Menggunakan kelas numerik turunan (Integer)
        Integer intNum = 100;
        System.out.println("\nInteger value: " + intNum);
        System.out.println("Integer as byte: " + intNum.byteValue());
        System.out.println("Integer as double: " + intNum.doubleValue());
    }
}