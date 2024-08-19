package ProblemSolving.tujuh.BigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerClass {

    public static void main(String[] args) {
        BigInteger tipeBigInteger = new BigInteger("1000");

        System.out.println(tipeBigInteger);

        BigDecimal tipeBigDesimal = new BigDecimal("1000");
        System.out.println(tipeBigInteger);

        // Penjumlahan di BigInteger

        BigInteger tipeBigInteger2 = new BigInteger("1000");
        BigInteger penjumlahan = tipeBigInteger.add(tipeBigInteger2);

        System.out.println(penjumlahan);
    }
}
