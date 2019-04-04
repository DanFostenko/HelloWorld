package testpackage;

import mypackage.HelloWorld6_2; //импорт класса HelloWorld6_2 (dog)

//инкапсуляция, модификаторы доступа
public class FirstClass {
    void method() {
        HelloWorld6_2 dog = new HelloWorld6_2();
        dog.var1 = 10; //публичный идентификатор доступа
//        dog.var2 = 10; //приватный идентификатор доступа
//        dog.var3 = 10; //защищенный идентификатор доступа, нельзя обращаться во внешнем пакете,
// если только класс не наследуется от родительского: public class FirstClass extends HelloWorld6_1
//        dog.var4 = 10; //пакеьный идентификатор доступа, нельзя обращаться в другом пакете

        System.out.println(dog.getWeight()); //доступ к приватной переменной через метод get
    }
}
