
public class TreeEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Thread obj = Thread.currentThread();
	System.out.println("name of thread is:"+obj.getName());
	obj.setName("sachin");
	System.out.println("Name of thrade is"+ obj);
	
	obj.setPriority(2);
	System.out.println("new prioruty is:" + obj);

	}

}
