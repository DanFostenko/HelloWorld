package mypackage;

public class HelloWorld4 {

    public static void main(String[] args) {
        divide (10, 2);

        try {
            divide2 (10, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("");
        }
    }

    public static void divide(int a, int b) {
        try {
            System.out.println("Result is: " + a/b);
        } catch (ArithmeticException e) {
            System.out.println("Problem!"); //обработка арифм. исключений
        } finally {
            System.out.println("Finish"); //вывести в любом случае, поймали ошибку или нет
        }
    }

    public static void divide2(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException ("Cannot divide by zero");
        } else {
            System.out.println("Result is: " + a/b);
        }
    }
}
