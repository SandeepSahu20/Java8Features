package Lambda;

 interface X {

	void add();
	default void sub(){
		System.out.println("Substract");
	}
	
	 class Y implements X{
		
		public void add(){
			System.out.println("child");
		}
		
	}
	
	public class dynamicInterfaceMethod
	{
	public static void main(String[] args){
		X obj=new Y();
		obj.add();
		obj.sub();
		
	}
	}
}
