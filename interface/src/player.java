 interface player {
int player_id = 10;
	void display();

}
 
 
class test1 implements player{
	public void display() {
		System.out.println("Captain");
	}
	public static void main(String[] args) {
		test1 T =new test1();
		T.display();
		System.out.println("ho");
	}
} 