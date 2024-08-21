package ProblemSolving.tujuhbelas.ArraysClass;

import java.util.Arrays;

public class ArraysClass {

    public static void main(String[] args) {
        int[] dataArray = {5,3,6,7,8,2,4,1,8,10};

        Arrays.sort(dataArray);
        for (var urukanArray : dataArray){
            System.out.print(urukanArray);
        }
        System.out.println("");
        System.out.println(Arrays.toString(dataArray));

        System.out.println(Arrays.binarySearch(dataArray,8));

        System.out.println(Arrays.binarySearch(dataArray,0));

        int[] testDataBaru = Arrays.copyOf(dataArray,5);

        System.out.println(Arrays.toString(testDataBaru));

        int[] testDataRange = Arrays.copyOfRange(dataArray,5,7);

        System.out.println(Arrays.toString(testDataRange));
    }
}
