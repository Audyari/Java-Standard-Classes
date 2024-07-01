package StringClass;

public class StringExample {

    public static void main(String[] args) {

        // Contoh 1: Membuat dan memanipulasi string
        String greeting = "Hello, world!";
        char firstChar = greeting.charAt(0);
        System.out.println("First character: " + firstChar); // Output: First character: H

        String shortGreeting = greeting.substring(0, 5);
        System.out.println("Substring: " + shortGreeting); // Output: Substring: Hello

        String fullGreeting = shortGreeting + "!";
        System.out.println("Full greeting: " + fullGreeting); // Output: Full greeting: Hello!

        boolean isEqual = greeting.equals("Hello, world!");
        System.out.println("Are the strings equal? " + isEqual); // Output: Are the strings equal? true

        // Contoh 2: Menggunakan metode String
        String name = "   John Doe   ";
        String trimmedName = name.trim();
        System.out.println("Trimmed name: " + trimmedName); // Output: Trimmed name: John Doe

        String lowerCaseName = name.toLowerCase();
        System.out.println("Lowercase name: " + lowerCaseName); // Output: Lowercase name:    john doe

        String updatedName = name.replace("Doe", "Smith");
        System.out.println("Updated name: " + updatedName); // Output: Updated name:    John Smith

        // Contoh 3: Menggunakan StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", ");
        sb.append("world");
        sb.replace(6, 11, "Java");
        String result = sb.toString();
        System.out.println("Result: " + result); // Output: Result: Hello, Java

        // Contoh 4: String Pool
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println("s1 == s2: " + (s1 == s2)); // Output: s1 == s2: true
        System.out.println("s1 == s3: " + (s1 == s3)); // Output: s1 == s3: false
    }
}