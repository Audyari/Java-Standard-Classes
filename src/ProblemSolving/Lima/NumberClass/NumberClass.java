package ProblemSolving.Lima.NumberClass;

public class NumberClass {

    public static void main(String[] args) {
//        shortValue()
//        byteValue()
//        intValue()
//        longValue()
//        floatValue()
//        doubleValue()

        Short tipeShort = 10;
        Byte tipeByte = tipeShort.byteValue();
        Integer tipeInteger = 10;
        Long tipeLong = tipeInteger.longValue();
        Double tipeDouble = tipeLong.doubleValue();
        Short tipeShort1 = tipeDouble.shortValue();

        String Contoh = "10000";
        Integer ubahKeInteger = Integer.valueOf(Contoh);
        System.out.println(ubahKeInteger);

        String Contoh1 = "100.00";
        Double ubahKeDouble = Double.valueOf(Contoh1);
        System.out.println(ubahKeDouble);



    }
}
