package StringClass;

public class StringApp {

    public static void main(String[] args) {

        String name = "Audyari Wiyono";
        String nameLowercase = name.toLowerCase();
        String nameUppercase = name.toUpperCase();


        System.out.println(name);
        System.out.println(nameLowercase);
        System.out.println(nameUppercase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Audy"));
        System.out.println(name.endsWith("Wiyono"));

        String[] names = name.split(" ");
        for(var value : names){
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(0));

        char[] chars = name.toCharArray();

    }
}
