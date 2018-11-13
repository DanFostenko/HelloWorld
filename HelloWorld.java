public class HelloWorld {
	public static void main(String[] args){
		System.out.println("Hello, World");
		String p = "qwe";						//инициализация ссылки при создании
		String r = new String("rty");			//определение ссылки, присоединение к объекту, фактически создание нового объекта
		System.out.printf("%s%s",p,r);			//printf() is primarily needed when you need to print big strings to avoid string concatenation in println() which can be confusing at times
		System.out.print("\n" + p + r + "\n");	//println() prints a new blank line and then your message
		boolean a = true;
		char b = 'b';
		byte c = -127;
		short d = 32767;
		int e = -2147483648;
		long f =  Long.MAX_VALUE;	//2^31
		System.out.println(f);
		float g = Float.MIN_VALUE;	//0xff7fffff
		System.out.println(g);
		double h = Double.MAX_VALUE;
		System.out.println(h);
		
		class DataOnly {	//создание класса, который ничего не делает, кроме хранения данных
			int i;	//создание ссылки
			boolean k;
		}
		DataOnly data = new DataOnly(); //создание объекта класса за его пределами
		data.i = 47;	//обращение к члену класса, присваивание значения полю класса
		System.out.print(data.k);	//вывод значения по умолчанию примитивного типа данных
		flag();

	}
	static boolean flag(){		//создание метода, способного возвратить Булево значение. 
								//Метод ничего не принимает на вход.N.B.создается за пределами main-метода
		System.out.print("\nMethod output occurs");	//вывод на экран не значит возврат значения метода
		//flag();		//лол, метод может вызывать сам себя - StackOverflowError
		return true;	//возвращает возможное Булево значение
	}
	void nothing(){		//метод возвращает void
		//flag();
	}
}