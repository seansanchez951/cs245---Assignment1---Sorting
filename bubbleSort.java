import java.util.Arrays;

public class bubbleSort {

    // helper function that swaps elements
    public static void swap(double [] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // sort function iterates through array
    public double [] bSort(double [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

    // sort function has parameters that define the extent of sorting range
    public double[] sortRange (double[] arr, int low, int high) {

        for (int i = low; i < high+1 ; i++) {
            for (int j = low; j < high; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

    public void bubbleSort(double[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length-1; j++) {
                if (arr2[j] > arr2[j+1]) {
                    swap(arr2, j, j+1);
                }
            }
        }
    }

}
