package mypackage;

public class HelloWorld5 {
    public static void main(String[] args) {

        HelloWorld5_1 car1 = new HelloWorld5_1();
        car1.color = "Black";
        car1.length = 5000;
        car1.height = 2000;
        car1.width = 2000;

        car1.addWeight(50);
        car1.drive(120);

        car1.addWeight(700);
        car1.drive(100);

        HelloWorld5_1 car2 = new HelloWorld5_1();
        car2.color = "White";
        HelloWorld5_1 car3 = new HelloWorld5_1();
        car3.color = "Red";

        car2.drive(100);
        car3.drive(150);

        HelloWorld5_1 car4 = new HelloWorld5_1("Black");
        System.out.println("Car color is: " + car4.color);

        HelloWorld5_1 car5 = new HelloWorld5_1("Red", 2100, 2000, 5100);
        System.out.println(car5.color + " " + car5.height + " " + car5.width + " " + car5.length);

        //модификатор static и final
        //static позволяет хранить метод и переменную в ед.экз. в классе
        System.out.println(HelloWorld5_1.var); //обратиться к переменной через класс
        HelloWorld5_1.var = 100; //присвоить значение переменной через класс

        System.out.println(car1.var); //при изменении статичной переменной, она поменялась во всех объектах
        System.out.println(car2.var);
        System.out.println(car3.var);

        HelloWorld5_1.method(); //обращение к методу через класс

        String.format("New is string", "string");
        Math.sqrt(25);
    }
}
