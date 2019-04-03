package mypackage;

import java.util.*;

public class HelloWorld2 {
    public static void main(String[] args) {
        System.out.print("\n");
        System.out.println("Hello World!");
        byte a = 5; // -128 127
        short b = -100; // -32768 32767
        int c;
        c = 1000000;
        long d = -122335544;
        System.out.println(a);
        System.out.println("short b: " + b);
        System.out.println("int c: " + c);
        System.out.println("long d: " + d);

        double double1 = 133.155;
        System.out.println();
        System.out.println("double double1: " + double1);

        float float1 = 150.32f;
        System.out.println(float1);

        boolean boolean1 = true;
        boolean boolean2 = false;
        System.out.println(boolean1);
        System.out.println(boolean2);
        boolean bolean3 = 1 + 2 > 0;
        boolean bolean4 = 1 + 2 > 5;
        System.out.println(bolean3);
        System.out.println(bolean4);

        String str = "Hello";
        String str2 = "World!";
        String str3 = str + " " + str2;
        System.out.println();
        System.out.println(str3);

        char char1 = 'q';
        System.out.println(char1);

        //массивы

        String[] names;
        names = new String[3];

        String[] name = new String[3];
        int[] arr = new int[10];

        name[0] = "Vasya";
        name[1] = "Petya";
        name[2] = "Vanya";

        System.out.println(name[0]);
        System.out.println(name[2]);

        arr[3] = 15;
        arr[3] = 10;
        System.out.println(arr[3]);

        int[] array = {15,10,100,9,44};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        int[] arr2 = new int[15];

        for (int j = 0; j < 15; j++) {
            arr2[j] = j*10;
            System.out.println(arr2[j]);
        }

        System.out.println(arr2.length);
        System.out.println(arr2[arr2.length-1]);

        //циклы

        for (int element : array) {
            System.out.println(element);
        }

        int i = 0;
        while (i < 10) {
            System.out.println("While: " + i);
            i++;
        }

        i = 0;
        boolean bool = true;
        while (bool) {
            System.out.println("While: " + i);
            i++;
            if (i == 5) bool = false;
        }

        i = 5;
        do { //выполнит действие хотя бы один раз
            System.out.println("Do: " + i);
            i++;
        } while (i < 5);

        //коллекции (лист, список) - массив по заполнению элементами одного типа

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10); //добавить последовательно
        list.add(9);

        i = list.get(2);

        System.out.println(list.get(1));
        System.out.println(i);

        list.set(2, 100); //заменить
        System.out.println(list.get(2));
        System.out.println(list.get(1));
        list.remove( 1); //удалить
        System.out.println(list.get(1));

        System.out.println(list.size());
        list.add(9);
        System.out.println(list.size());

//        list.clear();
        System.out.println(list.size());

        List<Integer> list2 = new ArrayList<>();
        list.add(45); //добавить
        list.add(56);
        System.out.println(list.size());
        list.addAll(list2); //присоединить
        System.out.println(list.size());

        list.removeAll(list2); //удаляя элементы второго списка, удаляем их же, присоединенные к первому
        System.out.println(list.size());

        System.out.println(list.isEmpty());
//        list.clear(); //очистить
        System.out.println(list.isEmpty());

        System.out.println(list.contains(100)); //проверить вхождение
        System.out.println(list.contains(987));

        list.addAll(list2);
        System.out.println(list.containsAll(list2)); //проверить вхождение списка в другой список
        list.removeAll(list2); //удалить эл-ты 2го списка в 1м
        System.out.println(list.containsAll(list2));

        //итератор позволяет работать с элементами коллекции

        Iterator<Integer> iterator = list.iterator(); //список вернет итератор, чтобы указывать на элементы
        /*
        System.out.println(iterator.next()); //метод указывает на следующий элемент в списке
        System.out.println(iterator.next()); //перейти на следующий элемент
        System.out.println(iterator.hasNext()); //существует ли следующий
        */

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //set - коллекция уникальных неиндексируемых элементов

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(11);

        System.out.println(set.size());

        for (int e : set) {
            System.out.println(e);
        }

        set.remove(11); //удалить элемент (не по индексу)
//        set.clear(); //очистить
        System.out.println(set.size());
        System.out.println(set.contains(10));
        System.out.println(set.contains(11));

        //map - коллекция, в которой данные хранятся по уникальному ключу

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Black");
        map.put(2, "White");
        map.put(3, "Yellow");
        map.put(10, "Green");
        System.out.println(map.get(10));

        System.out.println(map.size());
//        map.clear(); //очистить
        System.out.println(map.size());
        System.out.println(map.containsKey(90));
        System.out.println(map.containsKey(10));
        System.out.println(map.containsValue("White"));
        System.out.println(map.containsValue("Grey"));

        Set<Integer> keys = map.keySet(); //создание набора keys
        Iterator<Integer> iterator2 = keys.iterator(); //создать и получить итератор из набора keys
        while (iterator2.hasNext()) {
            System.out.println(map.get(iterator2.next())); //
        }

        System.out.println(map.get(2));
        map.put(2, "Yellow");
        System.out.println(map.get(2));

        Map<String,String> map2 = new HashMap<>();
        map2.put("Vasya", "Frolov");
        map2.put("Petya", "Gromov");
        System.out.println(map2.get("Petya"));
    }
}
