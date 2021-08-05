package JavaPrograms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayUpdateSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        findSumWithoutUsingStream(arr);
    }

    public static int[] findSumWithoutUsingStream(int[] array) {

        int sum = 0;
        int temp = 0;

        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < array.length; index++) {
            temp = array[index] % 10;
            sb.append(temp);
            sum /= 10;
        }

        System.out.println(sb.toString());

        sum = Integer.parseInt(sb.toString()) + 1;
        System.out.println(sum);

        int len = Integer.toString(sum).length();
        int[] iarray = new int[len];
        for (int index = 0; index < len; index++) {
            iarray[index] = sum % 10;
            sum /= 10;
        }
        System.out.println(Arrays.toString(iarray));
        int[] val = IntStream.range(0, iarray.length)
                .map(i -> iarray[iarray.length - 1 - i])
                .toArray();
        System.out.println(Arrays.toString(val));
        return val;
    }
}
