package ProblemSolving.enambelas.PropertiesClass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class BikinPropertisApp {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            Properties testBikinPropertis = new Properties();

            testBikinPropertis.put("nama.depan","Audyari W");
            testBikinPropertis.store(new FileOutputStream("test.properties"),"INI SEBUAH COMMAND");

            String ambilData = testBikinPropertis.getProperty("nama.depan");
            System.out.println(ambilData);

        }catch (IOException error){
            System.out.println(error);

        }
    }
}
