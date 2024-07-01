package StringBufferDanStringBuilder;

public class StringBuilderApp {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Audyari");
        builder.append(" ");
        builder.append("Wiyono");
        builder.append(" ");
        builder.append("Orkay");

        String name = builder.toString();
        System.out.println(name);

    }
}
