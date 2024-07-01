package UUIDClass;
import java.util.UUID;

public class UUIDExample {

    public static void main(String[] args) {

        // Menghasilkan UUID versi 4 yang bersifat random
        UUID uuid1 = UUID.randomUUID();
        System.out.println("UUID Random: " + uuid1.toString());

        // Menghasilkan UUID berdasarkan namespace
        byte[] ns = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6};
        UUID uuid2 = UUID.nameUUIDFromBytes(ns);
        System.out.println("UUID dari namespace: " + uuid2.toString());

        // Parsing UUID dari String
        String uuidString = "123e4567-e89b-12d3-a456-426655440000";
        UUID uuid3 = UUID.fromString(uuidString);
        System.out.println("UUID dari String: " + uuid3.toString());

        // Membandingkan UUID
        int comparison = uuid1.compareTo(uuid2);
        System.out.println("Perbandingan UUID: " + comparison);

        // Mendapatkan komponen UUID
        long lsb = uuid1.getLeastSignificantBits();
        long msb = uuid1.getMostSignificantBits();
        System.out.println("LSB: " + lsb + ", MSB: " + msb);
    }
}

