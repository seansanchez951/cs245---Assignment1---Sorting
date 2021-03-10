import java.util.*;
import java.util.Arrays;

public class quadraticSort {

    // this is a modified version of insertion sort
    public void quadratic_Sort (double [] arr, int left, int right) {
        for (int i = left; i < right; i++) {
            double temp = arr[i]; // Copy
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) { // Move (loop)
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = temp; // Copy back
        }
    }

    public static void main(String[] args) {

        quadraticSort qs = new quadraticSort();

        double[] arr = {3,4,5,2,7,8,9,1,13};

        int l = 0;
        int r = arr.length;
        qs.quadratic_Sort(arr,l,r);
        System.out.println(Arrays.toString(arr));


    }

}
