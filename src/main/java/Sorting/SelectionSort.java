package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort is = new SelectionSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90, 17};
        is.SelectionSort(arr);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }

    private void SelectionSort(int[] arr) {

        int min_idx = 0;
        for (int i = 0; i < arr.length; i++) {

            min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;

                    //swap
                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
