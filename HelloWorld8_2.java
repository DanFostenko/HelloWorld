package mypackage;
//car class
public class HelloWorld8_2 implements HelloWorld8_1, HelloWorld8_4 {
    @Override
    public void go() {
        System.out.println("We are driving");
    }

    @Override
    public void stop() {
        System.out.println("We are driving slower");
    }

    @Override
    public void method1() {
        System.out.println("Test method1");
    }

    @Override
    public void method2() {
        System.out.println("Test method2");
    }
}