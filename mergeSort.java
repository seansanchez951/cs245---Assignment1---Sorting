import java.util.Arrays;

public class mergeSort {

    // create a private getLeft function
    private double[] getLeft(double [] arr) {
        int size = arr.length/2;
        double [] left = new double[size];

        for (int i = 0; i < size; i++) {
            left[i] = arr[i];
        }
        return left;
    }

    // create a private getRight function
    private double[] getRight(double [] arr) {
        int size = arr.length/2;
        double [] right = new double[size];
        int mid = arr.length/2;
        for (int i = 0; i < size; i++) {
            right[i] = arr[mid++];

        }
        return right;
    }

    private void merge(double [] target, double [] left, double [] right) {

        int l =0,r=0, t=0;

        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                target[t++] = left[l++];
            }
            else {
                target[t++] = right[r++];
            }
        }
        while (l < left.length) {
            target[t++] = left[l++];
        }
        while (r < right.length) {
            target[t++] = right[r++];
        }
    }

    public void mSort(double [] arr) {

        if (arr.length > 1) {

            double [] left = getLeft(arr);
            double [] right = getRight(arr);

            mSort(left);
            mSort(right);

            merge(arr,left,right);

        }
    }


}
