package Serialization;

public abstract class BaseTest extends TestBase implements NewBaseTest, NewBaseTest1 {
    //default methods when in interface
    static void temp1() {
        System.out.println("x");
    }
}
