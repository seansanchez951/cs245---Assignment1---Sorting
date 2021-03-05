import java.text.DecimalFormat;
import java.util.Random;
import java.util.Arrays;


public class runTest {

    public static double[] generateArray(int n) {
        // n is the size of the array
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (new Random()).nextDouble();
        }
        return arr;
    }

//    public boolean isSorted(double[] array) {
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] > array[i + 1])
//                return false;
//        }
//        return true;
//    }

    public static void main(String[] args) {

        runTest r = new runTest();

        DecimalFormat df = new DecimalFormat("#.#####");

        // create the instances for each sorting algorithm
        selectionSort select = new selectionSort();
        bubbleSort bubble = new bubbleSort();
        insertionSort insert = new insertionSort();
        mergeSort merge = new mergeSort();
        quickSort quick = new quickSort();

        // make a list of the ten array sizes
        int[] arraySizes = {50000, 100000, 150000, 200000, 250000, 300000, 350000, 400000, 450000, 500000};

        // create a lists for each different sort to store the run times
        float[] selectionSortRuntimes = new float[arraySizes.length];
        float[] bubbleSortRuntimes = new float[arraySizes.length];
        float[] insertionSortRuntimes = new float[arraySizes.length];
        float[] mergeSortRuntimes = new float[arraySizes.length];
        double[] quickSortRuntimes = new double[arraySizes.length];

        double[] arr50000 = generateArray((arraySizes[0]));
        double[] arr100000 = generateArray((arraySizes[1]));
        double[] arr150000 = generateArray((arraySizes[2]));
        double[] arr200000 = generateArray((arraySizes[3]));
        double[] arr250000 = generateArray((arraySizes[4]));
        double[] arr300000 = generateArray((arraySizes[5]));
        double[] arr350000 = generateArray((arraySizes[6]));
        double[] arr400000 = generateArray((arraySizes[7]));
        double[] arr450000 = generateArray((arraySizes[8]));
        double[] arr500000 = generateArray((arraySizes[9]));

        double[][] arrayVariable = {arr50000, arr100000, arr150000, arr200000, arr250000, arr300000, arr350000, arr400000, arr450000, arr500000};


        // run array through selection sort clock run time into the run times array
        for (int i = 0; i < arrayVariable.length; i++) {

            long time_start1 = System.currentTimeMillis();
            select.selectionSort(arrayVariable[i]);
            long time_end1 = System.currentTimeMillis();

            selectionSortRuntimes[i] = (time_end1 - time_start1);
            System.out.println("Selection Sort Run Times");
            System.out.println(Arrays.toString(selectionSortRuntimes));
        }

        // run array through bubble sort clock run time into the run times array
        for (int i = 0; i < arrayVariable.length; i++) {

            long time_start2 = System.currentTimeMillis();
            bubble.bubbleSort(arrayVariable[i]);
            long time_end2 = System.currentTimeMillis();

            bubbleSortRuntimes[i] = (time_end2 - time_start2);
            System.out.println("Bubble Sort Run Times");
            System.out.println(Arrays.toString(bubbleSortRuntimes));
        }

        // run array through insertion sort clock run time into the run times array
        for (int i = 0; i < arrayVariable.length; i++) {

            long time_start3 = System.currentTimeMillis();
            insert.iSort(arrayVariable[i]);
            long time_end3 = System.currentTimeMillis();

            insertionSortRuntimes[i] = (time_end3 - time_start3);
            System.out.println("Insertion Sort Run Times");
            System.out.println(Arrays.toString(insertionSortRuntimes));
        }

        // run array through merge sort clock run time into the run times array
        for (int i = 0; i < arrayVariable.length; i++) {

            long time_start4 = System.currentTimeMillis();
            merge.mSort(arrayVariable[i]);
            long time_end4 = System.currentTimeMillis();

            mergeSortRuntimes[i] = (time_end4 - time_start4);
            System.out.println("Merge Sort Run Times");
            System.out.println(Arrays.toString(mergeSortRuntimes));
        }

        // run array through quick sort clock run time into the run times array
        for (int i = 0; i < arrayVariable.length; i++) {

            long time_start5 = System.currentTimeMillis();
            quick.qSort(arrayVariable[i], 0, arrayVariable[i].length-1);
            long time_end5 = System.currentTimeMillis();

            quickSortRuntimes[i] = (time_end5 - time_start5);

            System.out.println("Quick Sort Run Times");
            System.out.println(Arrays.toString(quickSortRuntimes));


            // add a readme about stackedoverflow error

        }
    }
}

