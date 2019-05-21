package Lambda;

 interface A {
	
	void add();
  }
 
// class B implements A{
//	
//	 public void add(){
//		 System.out.println("Adition");
//	 }
// }

public class lambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj;
//		obj =new B();
//		obj.add();
		
//		obj =new A()
//		{
//			public void add()
//			{
//				System.out.println("Hello");
//			}
//		};
		
		obj = ()->System.out.println("Hello");
		
			
		 
		obj.add();
	}
}


		
		
		
		

