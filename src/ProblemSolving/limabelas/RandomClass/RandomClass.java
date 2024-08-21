package ProblemSolving.limabelas.RandomClass;

import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {

        //test rendom String
        String randomString = generateRandomString(8);
        System.out.println(randomString);

        //test rendome int

        Random testrandom = new Random();

        for (var i = 0; i <= 10; i++) {
            var value = testrandom.nextInt(10);
            System.out.println(value);
        }

    }

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        //"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }
}
