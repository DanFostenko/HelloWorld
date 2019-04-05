package mypackage;

public class HelloWorld8 {
    public static void main(String[] args) {
        HelloWorld8_2 car = new HelloWorld8_2();
        HelloWorld8_3 plane = new HelloWorld8_3();

        car.go();
        car.stop();
        car.method1();
        car.method2();

        plane.go();
        plane.stop();
        plane.setSpeed(500);
    }
}
