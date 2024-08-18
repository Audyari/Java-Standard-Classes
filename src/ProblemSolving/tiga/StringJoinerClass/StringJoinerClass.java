package ProblemSolving.tiga.StringJoinerClass;

import java.util.StringJoiner;

public class StringJoinerClass {
    public static void main(String[] args) {
        String[] testObjek = {"AUDY", "ARI","WIYONO"};
        StringJoiner testJoin = new StringJoiner("||","[","]");

        for(var dataOutput:testObjek){
            testJoin.add(dataOutput);
            //System.out.println(dataOutput);
        }
        System.out.println(testJoin.toString());
    }
}
