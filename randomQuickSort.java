import java.util.*;
import java.util.Random;
import java.util.Arrays;

public class randomQuickSort {

    public static void getRandom(double arr[], int start, int end){
        Random r = new Random();
        int pivot = r.nextInt(end-start)+start;
        double temp = arr[pivot];
        arr[pivot] = arr[end];
        arr[end] = temp;
    }

    public int partition(double arr[], int start, int end){
        getRandom(arr,start,end);
        double pivot = arr[end];
        int i = (start-1);
        for (int j=start;j<end;j++){
            if (arr[j]<=pivot) {
                i++;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        double temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return i+1;
    }

    // this is a modified quickort that returns the pivot after the first partition
    public int quick_sort(double arr[], int low, int high) {
        int pivot =0;
        if (low < high) {
            //partition the array around pivot => partitioning index and return pivot
            pivot = partition(arr, low, high);

        }
        return pivot;
    }

    public static void main(String args[]) {
        // initialize a numeric array, arr
        double arr[] = {5, 2, 9, 12, 6, 8, 3, 7};
        int n = arr.length;

        // print the original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // call quick_sort using randomQuickSort object
        randomQuickSort obj = new randomQuickSort();
        int result = obj.quick_sort(arr, 0, n - 1);

        // print the sorted array after the first partition
        // testing to print the index of the pivot after the partition
        // testing to print the value to of the pivot index
        System.out.println("\nArray sorted after 1st partition: " + Arrays.toString(arr));
        System.out.println("\n index of the pivot after the partition: " + result);
        System.out.println("\n this is the value from the index: " + arr[result]);

    }

}
