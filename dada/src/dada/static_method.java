package dada;

public class static_method {
	static int i = 30;
	int n =40;
	static void a()
	{
	//int a = 300;
		System.out.println("Print from a");
	//n =100;
	//a2();
	// System.out.println("super.j");
	
	}
	void a2()
	{
		System.out.println("Inside a2");
	}

	public static void main(String[] args) {
		static_method ob1 = new static_method();
		 ob1.a2();
		 static_method.a();
		 
		 

	}

}
