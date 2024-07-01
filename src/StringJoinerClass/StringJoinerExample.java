package StringJoinerClass;
import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {

        // Contoh 1: Menggabungkan string dengan delimiter
        StringJoiner sj1 = new StringJoiner(",");
        sj1.add("apple").add("banana").add("cherry");
        System.out.println(sj1.toString()); // Output: apple,banana,cherry

        // Contoh 2: Menambahkan prefix dan suffix
        StringJoiner sj2 = new StringJoiner(",", "[", "]");
        sj2.add("apple").add("banana").add("cherry");
        System.out.println(sj2.toString()); // Output: [apple,banana,cherry]

        // Contoh 3: Menggabungkan dua StringJoiner
        StringJoiner sj3 = new StringJoiner(",", "[", "]");
        sj3.add("apple").add("banana");
        StringJoiner sj4 = new StringJoiner("-", "{", "}");
        sj4.add("cherry").add("durian");
        StringJoiner combined = sj3.merge(sj4);
        System.out.println(combined.toString()); // Output: [apple,banana]-{cherry-durian}

        // Contoh 4: Menghitung jumlah elemen
        StringJoiner sj5 = new StringJoiner(",");
        sj5.add("apple").add("banana").add("cherry");
        System.out.println(sj5.length()); // Output: 17

        // Contoh 5: Mengubah delimiter, prefix, dan suffix
        StringJoiner sj6 = new StringJoiner(",", "[", "]");
        sj6.add("apple").add("banana").add("cherry");
        sj6.setEmptyValue("(empty)");

        System.out.println(sj6.toString()); // Output: [#pple,banana,cherry]
    }
}

