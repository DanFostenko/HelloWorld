public class HelloWorld {
	public static void main(String[] args){
		System.out.println("Hello, World");
		String p = "qwe";						//������������� ������ ��� ��������
		String r = new String("rty");			//����������� ������, ������������� � �������, ���������� �������� ������ �������
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
		
		class DataOnly {	//�������� ������, ������� ������ �� ������, ����� �������� ������
			int i;	//�������� ������
			boolean k;
		}
		DataOnly data = new DataOnly(); //�������� ������� ������ �� ��� ���������
		data.i = 47;	//��������� � ����� ������, ������������ �������� ���� ������
		System.out.print(data.k);	//����� �������� �� ��������� ������������ ���� ������
		flag();

	}
	static boolean flag(){		//�������� ������, ���������� ���������� ������ ��������. 
								//����� ������ �� ��������� �� ����.N.B.��������� �� ��������� main-������
		System.out.print("\nMethod output occurs");	//����� �� ����� �� ������ ������� �������� ������
		//flag();		//���, ����� ����� �������� ��� ���� - StackOverflowError
		return true;	//���������� ��������� ������ ��������
	}
	void nothing(){		//����� ���������� void
		//flag();
	}
}