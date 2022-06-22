import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet<String> set = new HashSet<String>();

		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Java");
		set.add("C");
		set.add("C++");
		set.add("JSP");
		set.add("HI");
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		System.out.println("size is: " + set.size());
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
