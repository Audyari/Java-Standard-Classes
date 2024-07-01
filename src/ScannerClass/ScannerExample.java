package ScannerClass;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        // Buat objek Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // Minta pengguna memasukkan nama
        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();
        System.out.println("Halo, " + name + "!");

        // Minta pengguna memasukkan umur
        System.out.print("Masukkan umur Anda: ");
        int age = scanner.nextInt();
        System.out.println("Umur Anda adalah " + age + " tahun.");

        // Minta pengguna memasukkan angka desimal
        System.out.print("Masukkan angka desimal: ");
        double decimal = scanner.nextDouble();
        System.out.println("Angka desimal yang Anda masukkan adalah: " + decimal);

        // Tutup objek Scanner
        scanner.close();
    }
}
