package mypackage;
//animal class
public class HelloWorld6_1 {
    String name;
    String color;
//инкапсуляция, модификаторы доступа
    public int var1; //публичный идентификатор доступа, доступ к переменным и методам во всей программе
    private int var2; //приватный идентификатор доступа, доступ внутри класса
    protected int var3; //защищенный идентификатор доступа, доступ к классу и к классам наследников
    int var4; //пакетный идентификатор доступа, видимость параметра ограничивается пакетом

    public void walk(String place) {
        System.out.println("We are walking here: " + place);
        var1 = 10;
        var2 = 10;
        var3 = 10;
        var4 = 10;
    }

    public void sleep() {
        System.out.println("Zzzz");
    }
    //полиморфизм - способность объектов с одинаковаой спецификацией иметь различную реализацию
    public void sound() {
        System.out.println("Hello");
    }
}
