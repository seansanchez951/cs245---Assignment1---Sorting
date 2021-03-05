import java.util.Arrays;

public class quickSort {

    public static void swap(double[] arr, int p, int t) {
        double temp = arr[p];
        arr[p] = arr[t];
        arr[t] = temp;
    }

    public void qSort (double [] arr, int bot, int top) {
        if (bot < top) { // Base case (top < bot) is NOP
            int p = partition(arr, bot, top);
            qSort(arr, bot, p-1); // All values in left are <= arr[p]
            qSort(arr, p+1, top);
        }
    }

    private int partition(double[] arr, int left, int right) {
        // Base case -- or reverse of the base case
        if (left < right) {
            // Setup: pivot is 1st item
            int pivot = left;
            int bot = left + 1; // Avoids re-sorting the pivot
            int top = right;
            while (bot <= top) {
                // Count up from bot, down from top, swap ... on the next slide
                while (bot <= right && arr[bot] <= arr[pivot]) {
                    ++bot;
                }
                while (top >= bot && arr[top] > arr[pivot]) {
                    --top;
                }
                if (bot <= right && bot < top) {
                    swap(arr, bot, top);
                }
            }
            swap(arr, pivot, top); // pivot to the middle
            return top;
        }
        return left;
    }

    public static void main (String[]args){

        quickSort s = new quickSort();

        double [] arr1 = {76, 94, 33, 90, 100, 49, 30, 75};

        // run arr1 through quickSort
        s.qSort(arr1, (int) 0, (int) arr1.length-1);

        System.out.println(Arrays.toString(arr1));

    }

}