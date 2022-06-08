package AAa;



class B {
	interface A{
		void print();
	}

	interface B{
		void print();
	}
	class C implements A,B{
		public void print() {
			System.out.println("hi....");
		}
		
		public static void main(String[] args) {
			C obj = new C();
			obj.print();
			// TODO Auto-generated method
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
