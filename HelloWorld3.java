package mypackage;

public class HelloWorld3 {
    public static void main(String[] args) {
        int a = 13;
        int b = 3;
        int sum;
        sum = getSum(a, b); //вызвать метод getSum, метод примет a на место x, b - y
        System.out.println(sum);
        sum = getSum (10, 150);
        System.out.println(sum);
        System.out.println(getSum(2,11));

        showSum (10, 51, 77);
        showSum (5, 12, 14);
        saySmth();
        saySmth();

        sayHello("Petya"); //вызывает метод, передаем в него значение
        String name = "Vasya";
        sayHello(name);

        showSumToPerson("Valera", 15, 11, 33);

        boolean result = showSum(1, 22, 333);
        System.out.println(result);

        //вызов перегруженных методов
        int methodresult;
        methodresult = getSum(1, 10);
        System.out.println(methodresult);

        methodresult = getSum(5, 100, 66);
        System.out.println(methodresult);

        sayHello("Petya");
        sayHello("Vasya", "Vanya");
        sayHello();

        int[] array = {1, 22, 52, 34, 16};
        sum = getSum(array, "Oleg");
    }
    //методы
    static int getSum(int x, int y) { //статический метод, тип возвращаемого значения, переменные на приём
        int sum = x + y; //внутренния переменная
        return sum; //метод возвращения
    }

    static boolean showSum (int x, int y, int z) { //void не возвращает никакой тип
        int sum = x + y + z;
        System.out.println("Sum is: " + sum);
        return true;
    }

    static void saySmth() {
        System.out.println("Hi");
        System.out.println("I'm running");
        System.out.println("You see me");
    }
    static void sayHello(String name) {
        System.out.println("Hello " + name + "!");
        System.out.println("I'm your program");
        System.out.println("Nice to meet you.");
    }
    static void showSumToPerson(String name, int a, int b, int c) {
        sayHello(name);
        showSum(a, b, c);
        System.out.println("End of program");
    }
    //перегрузка методов getSum и sayHello
    //выполнить тот же метод с различными входными параметрами
    static int getSum(int x, int y, int z) { //дублирующийся метод, но с др. кол-вом параметров
        int sum = x + y + z; //внутренния переменная
        return sum; //метод возвращения
    }
    static int getSum(int[] array, String name) { //дублирующийся метод, принимающий массив
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Hi " + name + "!");
        System.out.println("Your sum is: " + sum);
        return sum;
    }
    static void sayHello(String name1, String name2) {
        System.out.println("Hello " + name1 + "!");
        System.out.println("Hello " + name2 + "!");
        System.out.println("I'm your program");
        System.out.println("Nice to meet you.");
    }
    static void sayHello() { //метод без возврата
        System.out.println("Hello");
        System.out.println("I'm your program");
        System.out.println("Nice to meet you.");
    }
}
