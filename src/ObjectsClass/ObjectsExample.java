package ObjectsClass;

import java.util.Objects;

public class ObjectsExample {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = null;

        // Membandingkan objek
        System.out.println(Objects.equals(str1, str2)); // false
        System.out.println(Objects.equals(str1, "Hello")); // true
        System.out.println(Objects.equals(str3, "null")); // false

        // Mendapatkan hash code
        System.out.println(Objects.hashCode(str1)); // 69609650
        System.out.println(Objects.hash(str1, str2)); // 1527045236

        // Mengelola null
        System.out.println(Objects.requireNonNull(str1)); // Hello
        // System.out.println(Objects.requireNonNull(str3)); // NullPointerException

        // Membandingkan
        System.out.println(Objects.compare("Apple", "Banana", String::compareTo)); // -1
    }
}
