package mypackage;
//наследование
public class HelloWorld6 {
    public static void main(String[] args) {
        HelloWorld6_2 dog = new HelloWorld6_2();
        HelloWorld6_3 cat = new HelloWorld6_3();

        cat.name = "Barsik";
        dog.name = "Sharik";

        cat.color = "White";
        cat.color = "Black";

        cat.walk("Backyard");
        dog.walk("Park");

        cat.feed("Milk");
        cat.feed( "mdf");
        dog.sit();

        System.out.println("Cat's name is: " + cat.name);
        System.out.println("Dog's name is: " + dog.name);

        dog.var1 = 10;
//        dog.var2 = 10;
        dog.var3 = 10;
        dog.var4 = 10;

//        dog.weight = 2; нет прямого доступа к приватной переменной
        System.out.println(dog.getWeight()); //доступ к приватной переменной через метод get

    }
}
