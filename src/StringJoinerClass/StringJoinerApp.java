package StringJoinerClass;
import java.util.StringJoiner;

public class StringJoinerApp {

    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(", ", "{", "}");

        joiner.add("Audy");
        joiner.add("Ari");
        joiner.add("Wiyono");

        String value = joiner.toString();
        System.out.println(value);

    }
}
