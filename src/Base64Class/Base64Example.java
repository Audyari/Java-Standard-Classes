package Base64Class;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Example {

    public static void main(String[] args) {
        // Enkode string ke Base64
        String originalString = "Hello, World!";
        byte[] encodedBytes = Base64.getEncoder().encode(originalString.getBytes(StandardCharsets.UTF_8));
        String encodedString = new String(encodedBytes, StandardCharsets.UTF_8);
        System.out.println("Encoded string: " + encodedString);

        // Dekode Base64 string kembali ke string asli
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString.getBytes(StandardCharsets.UTF_8));
        String decodedString = new String(decodedBytes, StandardCharsets.UTF_8);
        System.out.println("Decoded string: " + decodedString);

        // Enkode byte array ke Base64
        byte[] data = {0x48, 0x65, 0x6c, 0x6c, 0x6f};
        String encodedData = Base64.getEncoder().encodeToString(data);
        System.out.println("Encoded bytes: " + encodedData);

        // Dekode Base64 string kembali ke byte array
        byte[] decodedData = Base64.getDecoder().decode(encodedData);
        System.out.println("Decoded bytes: ");
        for (byte b : decodedData) {
            System.out.print(b + " ");
        }
    }
}
