import java.util.ArrayList;

public class arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String> ();
		System.out.println("Adding the list in Array");
		
		list.add("A");
		list.add("B");
		list.add("D");
		list.add("E");
		
		System.out.println("ArrayList insertion order." +list);
		System.out.println("Adding an element in specific index");
		list.add(2, "C");

		System.out.println("ArrayList after insertion" +list);
		
		System.out.println("ArrayList after removing");
		list.remove(2);
		System.out.println("ArrayList Remove" +list);
	}

}
 