package StringTokenizerClass;

import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {

        // Contoh 1: Memisahkan string berdasarkan koma
        String input1 = "apple,banana,cherry";
        StringTokenizer tokenizer1 = new StringTokenizer(input1, ",");
        System.out.println("Tokens in input1:");
        while (tokenizer1.hasMoreTokens()) {
            System.out.println(tokenizer1.nextToken());
        }

        // Contoh 2: Memisahkan string berdasarkan spasi
        String input2 = "quick brown fox jumps over the lazy dog";
        StringTokenizer tokenizer2 = new StringTokenizer(input2);
        System.out.println("\nTokens in input2:");
        while (tokenizer2.hasMoreTokens()) {
            System.out.println(tokenizer2.nextToken());
        }

        // Contoh 3: Mengembalikan delimiter sebagai token
        String input3 = "one-two-three-four";
        StringTokenizer tokenizer3 = new StringTokenizer(input3, "-", true);
        System.out.println("\nTokens in input3:");
        while (tokenizer3.hasMoreTokens()) {
            System.out.println(tokenizer3.nextToken());
        }

        // Contoh 4: Menghitung jumlah token
        String input4 = "apple banana    cherry   durian";
        StringTokenizer tokenizer4 = new StringTokenizer(input4);
        System.out.println("\nNumber of tokens in input4: " + tokenizer4.countTokens());
    }

}
