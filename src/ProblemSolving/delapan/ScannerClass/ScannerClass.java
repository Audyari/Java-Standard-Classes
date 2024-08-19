package ProblemSolving.delapan.ScannerClass;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner testScan = new Scanner(System.in);

        System.out.print("Nama Anda : ");
        String dataInput = testScan.nextLine();

        System.out.print("Umur Anda : ");
        Integer dataUmur = testScan.nextInt();


        System.out.println("data yg di input : " + dataInput + "Umur Anda " + dataUmur);
    }
}
