package ProblemSolving.empat.StringTokenizerClass;

import java.util.StringTokenizer;

public class StringTokenizerClass {
    public static void main(String[] args) {
        //untuk ukuran lebih besar mending pake tokenize dibanding pake split
        String nama = "AUDYARI WIYONO";
        StringTokenizer testTokenize = new StringTokenizer(nama," ");

        while ((testTokenize.hasMoreTokens())){
            String potong = testTokenize.nextToken();
            System.out.println(potong);
        }

        // test pake split :

        String nama1 = "AUDYARI WIYONO";
        String[] tokens = nama1.split(" ");

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
