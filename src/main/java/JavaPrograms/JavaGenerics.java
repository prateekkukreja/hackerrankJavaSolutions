//package JavaPrograms;
//
//import com.sun.tools.javac.code.Printer;
//
//import java.lang.reflect.Method;
//
//class JavaGenerics {
//
//    public void printArray(Object[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//}
//
//class Solution {
//
//    public static void main(String args[]) {
//        JavaGenerics myPrinter = new JavaGenerics();
//        Integer[] intArray = {1, 2, 3};
//        String[] stringArray = {"Hello", "World"};
//        myPrinter.printArray(intArray);
//        myPrinter.printArray(stringArray);
//        int count = 0;
//
//        for (Method method : Printer.class.getDeclaredMethods()) {
//            String name = method.getName();
//
//            if (name.equals("printArray"))
//                count++;
//        }
//
//        if (count > 1) System.out.println("Method overloading is not allowed!");
//
//    }
//}
