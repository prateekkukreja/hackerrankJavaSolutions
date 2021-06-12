package JavaPrograms;

public class MethodOverload {

    public static void main(String[] args) {
        test(null);
    }

    public static void test(Object o){
        System.out.println("Object Args");
    }

//    public static void test(String s){
//        System.out.println("String Args");
//    }
//
//    public static void test(StringBuffer s){
//        System.out.println("StringBuffer Args");
//    }
    public static void test(Integer o){
        System.out.println("Integer Args");
    }
}
