package ProblemSolving.enambelas.PropertiesClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {

    public static void main(String[] args) {

        //File Aplication Properies nya di taro di luar

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("name.depan");
            String port = properties.getProperty("name.belakang");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            properties.put("KEYPERTAMA","ISIDARI KEY NYA");
            properties.store(new FileOutputStream("application.properties"),"INI SEBUAH COMMAND");



            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);

        } catch (FileNotFoundException exception) {
            System.out.println("File tidak ketemu");
        } catch (IOException exception) {
            System.out.println("Gagal load data dari file");
        }



    }
}
