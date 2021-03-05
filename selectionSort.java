public class selectionSort {

    public static void swap(double [] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int findSmallest (double [] arr, int start) {
        int smallest = start; // Assume first item is smallest
        for (int i = start+1; i < arr.length; i++)
            if (arr[i] < arr[smallest]) // Change smallest, as necessary
                smallest = i;
        return smallest;
    }

    public double[] sSort(double [] arr) {
        for (int i = 0; i< arr.length; i++) {
            swap(arr, i, findSmallest(arr,i));
        }
        return arr;
    }

    public void selectionSort(double[] arr1) {
        for (int i = 0; i< arr1.length -1; i++) {
            swap(arr1, i, findSmallest(arr1,i));
        }
    }
}