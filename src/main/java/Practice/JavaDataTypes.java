package Practice;

import java.util.Scanner;

public class JavaDataTypes {

    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                System.out.println("Enter input to check : ");
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
                    System.out.println("* byte\n* short\n* int\n* long");
                else if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                    System.out.println("* short\n* int\n* long");
                else if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
                    System.out.println("* int\n* long");
                else
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}