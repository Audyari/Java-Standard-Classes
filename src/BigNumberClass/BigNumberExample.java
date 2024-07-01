package BigNumberClass;
import java.math.BigInteger;
import java.math.BigDecimal;

public class BigNumberExample {

    public static void main(String[] args) {

        // Contoh BigInteger
        BigInteger a = new BigInteger("12345678901234567890");
        BigInteger b = new BigInteger("98765432109876543210");
        System.out.println("a + b = " + a.add(b));
        System.out.println("a - b = " + a.subtract(b));
        System.out.println("a * b = " + a.multiply(b));
        System.out.println("a / b = " + a.divide(b));
        System.out.println("a % b = " + a.mod(b));

        // Contoh BigDecimal
        BigDecimal c = new BigDecimal("3.14159265358979");
        BigDecimal d = new BigDecimal("2.71828182845904");
        System.out.println("c + d = " + c.add(d));
        System.out.println("c - d = " + c.subtract(d));
        System.out.println("c * d = " + c.multiply(d));

        BigDecimal e = new BigDecimal("3");
        BigDecimal f = new BigDecimal("2");
        System.out.println("e / f = " + e.divide(f));
    }
}
