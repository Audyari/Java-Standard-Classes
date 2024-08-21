package ProblemSolving.empatbelas.ObjectsClass;

import java.util.Objects;

public class ObjectsClass {

    public static class Data {

        String Data;

        public Data(String data) {
            Data = data;
        }

        public String getData() {
            return Data;
        }

        public void setData(String data) {
            Data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Data data = (Data) o;
            return Objects.equals(Data, data.Data);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(Data);
        }

        @Override
        public String toString() {
            return "Data{" +
                    "Data='" + Data + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {

       // TestPanggilData(new Data(null));
       // TestPanggilData(new Data("Panggil Data Tanpa Objects Class"));

        testPakeObjectsClass(new Data(null));
        testPakeObjectsClass(new Data("Panggil Data Dengan Objects Class"));

    }


    public static void TestPanggilData(Data data) {

        if (data != null) {
            System.out.println(data.toString());
            System.out.println(data.hashCode());
        }
    }

    public static void testPakeObjectsClass(Data data) {

        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));
    }
}
