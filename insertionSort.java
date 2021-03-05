import java.util.Arrays;

public class insertionSort {

    public void iSort (double [] arr) {
        for (int i = 1; i < arr.length; i++) { // "i" is 1st unsorted item
            double temp = arr[i]; // Copy
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) { // Move (loop)
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = temp; // Copy back
        }
    }
}
