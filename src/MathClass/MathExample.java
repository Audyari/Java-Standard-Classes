package MathClass;

public class MathExample {

    public static void main(String[] args) {

        double x = 3.14;
        double y = 2.71;

        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y: " + y);

        // Operasi Trigonometri
        System.out.println("Sinus dari x: " + Math.sin(x));
        System.out.println("Cosinus dari x: " + Math.cos(x));
        System.out.println("Tangen dari x: " + Math.tan(x));

        // Operasi Logaritma dan Eksponen
        System.out.println("Logaritma natural dari x: " + Math.log(x));
        System.out.println("Logaritma basis 10 dari x: " + Math.log10(x));
        System.out.println("Nilai e pangkat y: " + Math.exp(y));

        // Nilai Absolut dan Pembulatan
        System.out.println("Nilai absolut dari y: " + Math.abs(y));
        System.out.println("Ceiling dari x: " + Math.ceil(x));
        System.out.println("Floor dari x: " + Math.floor(x));
        System.out.println("Pembulatan x: " + Math.round(x));

        // Nilai Minimum dan Maksimum
        System.out.println("Nilai minimum dari x dan y: " + Math.min(x, y));
        System.out.println("Nilai maksimum dari x dan y: " + Math.max(x, y));

        // Operasi Lainnya
        System.out.println("Akar kuadrat dari x: " + Math.sqrt(x));
        System.out.println("x pangkat y: " + Math.pow(x, y));
        System.out.println("Nilai acak: " + Math.random());
    }
}
