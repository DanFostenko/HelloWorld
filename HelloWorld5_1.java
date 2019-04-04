package mypackage;

public class HelloWorld5_1 { //новый класс со своими характеристиками и методами

    //конструктор - метод, который вызывается при создании объекта класса, назв.метода = назв.класса
    public HelloWorld5_1() { //название пустого метода совпадает с названием класса, создать класс
        System.out.println("New car created");
    }

    public HelloWorld5_1(String color) { //конструктор, который принимает параметр
        this.color = color; // переменная принимает передаваемое значение
    }

    public HelloWorld5_1(String color, int height, int width, int length) { //конструктор, перегружен входящими параметрами
        this.color = color; // переменная принимает передаваемое значение
        this.height = height;
        this.width = width;
        this.length = length;
    }

    static int var = 10;
//    final static int var = 10; //final запрещает изменять переменную
//    final static void method() //запрещает переопределять метод
    static void method() {
        System.out.println("This is static method");
    }

    int height;
    int width;
    int length;
    int weight = 2000;
    int maxWeight = 2700;
    String color;
    int speed;
    int maxSpeed = 260;

    public void addWeight(int weight) {
        this.weight += weight; //указатель на текущую переменную
        System.out.println("New weight: " + this.weight);
    }
    public void drive(int speed) {
        if (weight <= maxWeight) {
            this.speed = speed;
            System.out.println("We are driving");
        } else {
            System.out.println("Cannot drive");
        }
    }

}
