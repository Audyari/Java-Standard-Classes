package PropertiesClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

    public static void main(String[] args) {
        // Membuat objek Properties
        Properties props = new Properties();

        // Mengatur properti
        props.setProperty("database.url", "jdbc:mysql://localhost/mydb");
        props.setProperty("database.username", "myuser");
        props.setProperty("database.password", "mypassword");

        // Menyimpan properti ke file
        try (FileOutputStream fos = new FileOutputStream("config.properties")) {
            props.store(fos, "Database Configuration");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Membaca properti dari file
        Properties loadedProps = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            loadedProps.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Mengakses properti
        String url = loadedProps.getProperty("database.url");
        String username = loadedProps.getProperty("database.username");
        String password = loadedProps.getProperty("database.password");

        System.out.println("Database URL: " + url);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
