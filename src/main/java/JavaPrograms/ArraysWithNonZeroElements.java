package JavaPrograms;

import java.util.Arrays;
import java.util.*;

public class ArraysWithNonZeroElements {

    public static void main(String[] args) {

        int[] a = new int[5];
        Random rn = new Random();
        int answer = rn.nextInt(10) + 1;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10) + 1;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    a[j] = (int) (Math.random() * 10) + 1; //What's this! Another random number!
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
