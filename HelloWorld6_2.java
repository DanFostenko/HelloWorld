package mypackage;
//dog class
public class HelloWorld6_2 extends HelloWorld6_1 { //наследовать характеристики род.класса

    private int weight = 2; //приватный модификатор доступа

// создать простые методы get и set (alt+insert), чтобы получить доступ к приватной переменной в обход прямого доступа
    public int getWeight() { //возвращает значение защищенной переменной
        return weight;
    }

//    public void setWeight(int weight) { //принимает значение, чтобы установить для защищенной переменной
//        this.weight = weight;
//    }

    public void sit() { //добавить метод/характеристики к унаследованным
        System.out.println("I'm sitting");
        var1 = 20; //переприсвоение родительской публичной переменной
//        var2 = 20; //переприсвоение родительской приватной переменной невозможно
        var3 = 20; //к защищенной переменной можно обращаться внутри класса-наследника
        var4 = 20; //к пакетной переменной можно обратиться в рамках пакета mypackage
    }
    public void lay() {
        System.out.println("I'm laying");
    }
}
