import java.util.Iterator;
import java.util.Stack;

public class Vecttor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Stack<String>stack =new Stack<String>();
			stack.push("hi");
			stack.push("hello");
			stack.push("bye");
			stack.push("gm");
			
			System.out.println("Stack is empty? "+stack.empty());
		
		
		 System.out.println("which element is at top: " +stack.peek());
			
			
			
					Iterator<String> itr = stack.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next()+"");
			}
			System.out.println();
			
			stack.pop();
			itr= stack.iterator();
			while(itr.hasNext()) {   
				System.out.println(itr.next()+ "");
				
		
			}
	}

}
