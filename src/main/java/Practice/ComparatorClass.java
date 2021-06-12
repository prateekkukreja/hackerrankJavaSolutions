package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.stream.Stream;

public class ComparatorClass {

    public static void main(String[] args) {

//        StringCheck();
//        sort1DArr();
        sort2DArray();
//        sort3DArray();

    }

//    public static void sort3DArray() {
//
//        int[][][] threeDim = {{{0, 10}, {10, 30}, {30, 50}},
//                {{0, 10}, {3, 19}, {35, 45}},
//                {{10, 30}, {27, 33}, {30, 50}},
//                {{-10, 10}, {0, 20}, {35, 45}},
//                {{10, 30}, {20, 40}, {30, 50}},
//                {{0, 20}, {8, 28}, {37, 43}},
//                {{0, 20}, {15, 35}, {37, 43}},
//                {{0, 0}, {8, 28}, {10, 40}}};
//
//        //  Java 8 solution for 3D int[][][]
//        //   Arrays.sort(twoDim, Collections.reverseOrder());
//        Arrays.sort(threeDim, Comparator.comparingInt((int[] arr) -> arr[0])
//                     .thenComparing(Comparator.comparingInt((int[] arr) -> arr[1])
//                        .reversed()));
//        System.out.println(Arrays.deepToString(threeDim));
//    }

    public static void sort2DArray() {

        int[][] twoDim = {{1, 2}, {3, 7}, {8, 9}, {4, 2}, {5, 3}};

        //  Java 8 solution for 2D int[][]
        Arrays.sort(twoDim, Comparator.comparingInt((int[] arr) -> arr[0]).reversed());
        System.out.println(Arrays.deepToString(twoDim));

        //  Java 7 solution for 2D int[][]
        Arrays.sort(twoDim, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o2[0], o1[0]);
            }
        });
        System.out.println(Arrays.deepToString(twoDim));

        //  Java 6 solution for 2D int[][]
        Arrays.sort(twoDim, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return ((Integer) o2[0]).compareTo(o1[0]);
            }
        });
        System.out.println(Arrays.deepToString(twoDim));

// java 8
        Arrays.sort(twoDim, (a1, a2) -> a2[0] - a1[0]);
        System.out.println(Arrays.deepToString(twoDim));
    }

    public static void sort1DArr() {

        int[] oneDim = {1, 2, 3, 7, 8, 4, 2, 5, 3};
        int[] what = Arrays.stream(oneDim).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(what));

        Integer[] ever = Arrays.stream(oneDim).boxed().toArray(Integer[]::new);
        Comparator<Integer> comp = (Integer::compareTo);
        Arrays.sort(ever, comp.reversed());
        System.out.println(Arrays.toString(ever));
    }

    public static void StringCheck() {

        String A = "hello";
        String B = "java";

        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(toCamelCase(A) + " " + toCamelCase(B));
    }

    public static String toCamelCase(final String str) {
        if (str == null)
            return null;

        final StringBuilder ret = new StringBuilder(str.length());

        for (final String word : str.split(" ")) {
            if (!word.isEmpty()) {
                ret.append(Character.toUpperCase(word.charAt(0)));
                System.out.println(word.substring(0));
                System.out.println(word.substring(1));
                ret.append(word.substring(1).toLowerCase(Locale.ROOT));
            }
            if (!(ret.length() == str.length()))
                ret.append(" ");
        }
        return ret.toString();
    }
}
