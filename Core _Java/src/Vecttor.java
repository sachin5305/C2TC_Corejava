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
			
			System.out.println("element in stack "+stack);
			stack.empty();
			System.out.println("is the stack ?" + stack);
			
			System.out.println("first element in stack is"+ stack);
		 stack.peek();
			
			System.out.println("which element is at top"+stack);
			
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
