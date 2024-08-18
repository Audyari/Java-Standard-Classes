package ProblemSolving.Satu.StringClass;

public class testStringClass {

    public static void main(String[] args) {
        String testObjek = "Audyari W";
        String hurufKecil = testObjek.toLowerCase();
        String hurufBesar = testObjek.toUpperCase();

        System.out.println(testObjek);
        System.out.println(hurufKecil);
        System.out.println(hurufBesar);

        System.out.println(testObjek.length());
        System.out.println(testObjek.startsWith("A"));
        System.out.println(testObjek.endsWith("W"));

        String[] testSplit = testObjek.split(" ");
        System.out.println(testSplit);
        for(var HasilSplit : testSplit){
            System.out.println(HasilSplit);
        }

        for(var i =0; i < testSplit.length; i++){
            System.out.println(" DATA KE : " +testSplit[i]);
        }

        System.out.println(testObjek.isBlank()); // apakah objek tersebut null atau hanya berisi karakter spasi (seperti spasi, tab, atau baris baru).
        System.out.println(testObjek.isEmpty()); // memeriksa apakah panjang/ukuran objek tersebut nol.


        System.out.println(testObjek.charAt(0));

        char[] charArray = testObjek.toCharArray();
        for(var hasilCharArray: charArray){
            System.out.println(hasilCharArray);
        }
    }

}
