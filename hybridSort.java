import java.util.*;
import java.util.Random;
import java.util.Arrays;

public class hybridSort {


    public void hybrid_Sort (double [] arr, int left, int right) {

        if (right - left < arr.length / 2 ) {
            quadraticSort s1 = new quadraticSort();
            s1.quadratic_Sort(arr, left, right);
        } else {
            randomQuickSort s2 = new randomQuickSort();
            s2.quick_sort(arr, left, right-1);
        }
    }

    public static void main(String[] args){

        hybridSort hs = new hybridSort();

        // make a list of the ten array sizes
        int[] arraySizes = {50000, 100000, 150000, 200000, 250000, 300000, 350000, 400000, 450000, 500000};

        double[] hybridSortRuntimes = new double[arraySizes.length];

        double[] arr50000 = runTest.generateArray((arraySizes[0]));
        double[] arr100000 = runTest.generateArray((arraySizes[1]));
        double[] arr150000 = runTest.generateArray((arraySizes[2]));
        double[] arr200000 = runTest.generateArray((arraySizes[3]));
        double[] arr250000 = runTest.generateArray((arraySizes[4]));
        double[] arr300000 = runTest.generateArray((arraySizes[5]));
        double[] arr350000 = runTest.generateArray((arraySizes[6]));
        double[] arr400000 = runTest.generateArray((arraySizes[7]));
        double[] arr450000 = runTest.generateArray((arraySizes[8]));
        double[] arr500000 = runTest.generateArray((arraySizes[9]));

        double[][] arrayVariable = {arr50000, arr100000, arr150000, arr200000, arr250000, arr300000, arr350000, arr400000, arr450000, arr500000};

        // run array through selection sort clock run time into the run times array
        for (int i = 0; i < arrayVariable.length; i++) {

            int l = 0;
            int r = arrayVariable[i].length-1;
            long time_start1 = System.currentTimeMillis();
            hs.hybrid_Sort(arrayVariable[i],l,r);
            long time_end1 = System.currentTimeMillis();

            hybridSortRuntimes[i] = (time_end1 - time_start1);
            System.out.println("Hybrid Sort Run Times");
            System.out.println(Arrays.toString(hybridSortRuntimes));

        }

    }



}
