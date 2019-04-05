package mypackage;
//plane class
public class HelloWorld8_3 implements HelloWorld8_1 {
    @Override
    public void go() {
        System.out.println("We are flying on a plane");
    }

    @Override
    public void stop() {
        System.out.println("We are landing");
    }

    public void setSpeed(int speed) {
        System.out.println("Our speed is: " + speed);
    }
}
