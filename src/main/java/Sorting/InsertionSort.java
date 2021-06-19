package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90, 17};
        is.insertionSort(arr);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }

    void insertionSort(int[] arr) {

        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
