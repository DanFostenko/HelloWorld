package mypackage;
//TestClass
//абстрактный класс
public class HelloWorld7 {
    public static void main(String[] args) {
        HelloWorld7_3 dog = new HelloWorld7_3();
        HelloWorld7_2 cat = new HelloWorld7_2();

        dog.walk("Park");
        dog.saySmth();

        cat.walk("Backyard");
        cat.eat();
    }
}
