package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public boolean swapped;

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90, 17};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }

    void bubbleSort(int[] arr) {

        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            swapped = false;
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }
}
