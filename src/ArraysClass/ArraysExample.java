package ArraysClass;

import java.util.Arrays;
import java.util.List;

public class ArraysExample {

    public static void main(String[] args) {

        // Pengurutan array
        int[] numbers = {5, 2, 8, 1, 9};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 5, 8, 9]

        // Pencarian dalam array
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("Index of 5: " + index); // Output: 2

        // Perbandingan array
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println("Arrays are equal? " + Arrays.equals(arr1, arr2)); // Output: true

        // Pengisian array
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 7);
        System.out.println(Arrays.toString(fillArray)); // Output: [7, 7, 7, 7, 7]

        // Duplikasi array
        int[] duplicateArray = Arrays.copyOf(numbers, 3);
        System.out.println(Arrays.toString(duplicateArray)); // Output: [1, 2, 5]

        // Konversi array ke daftar
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbersList); // Output: [1, 2, 3, 4, 5]
    }
}
