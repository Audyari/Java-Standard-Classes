package ProblemSolving.tigabelas.Base64Class;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Class {
    public static void main(String[] args) {
        String Data = "SEBUAH TEXT";

        String dataDiEncode = Base64.getEncoder().encodeToString(Data.getBytes(StandardCharsets.UTF_8));
        System.out.println(dataDiEncode);

        String dataDiDecode = new String(Base64.getDecoder().decode(dataDiEncode));
        System.out.println(dataDiDecode);
    }


}
