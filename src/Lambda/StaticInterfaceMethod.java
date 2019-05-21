package Lambda;

import java.util.LinkedList;
import java.util.List;

public interface StaticInterfaceMethod {
	
	public static void addd(){
	    System.out.println("LamdaClass.add()");
	}
	
	

	
	public static void main (String args[])
	{
		System.out.println("addmain");
		addd();
		
		
	}
}
