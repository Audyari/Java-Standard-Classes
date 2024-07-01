package RandomClass;

import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {
        // Membuat objek Random dengan seed default
        Random rand = new Random();

        // Menghasilkan bilangan acak
        System.out.println("Random integer: " + rand.nextInt());
        System.out.println("Random integer (0-100): " + rand.nextInt(100));
        System.out.println("Random long: " + rand.nextLong());
        System.out.println("Random float: " + rand.nextFloat());
        System.out.println("Random double: " + rand.nextDouble());
        System.out.println("Random boolean: " + rand.nextBoolean());

        // Mengisi array byte dengan nilai-nilai acak
        byte[] bytes = new byte[10];
        rand.nextBytes(bytes);
        System.out.println("Random bytes: " + bytes);

        // Mengatur seed
        rand.setSeed(12345L);
        System.out.println("Random integer after setting seed: " + rand.nextInt());
    }
}