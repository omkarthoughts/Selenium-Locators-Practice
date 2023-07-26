package intoduction;

public class MethodsDemo1 {

	public static void main(String[] args) {

		MethodsDemo1 d = new MethodsDemo1();//if you want to call this non static method -
											//in same class req to create object of class name
		String name = d.getData(); //after that you can access this method
		System.out.println(name);
		
		MethodsDemo2 d1 = new MethodsDemo2();
	//	d1.getUserData();
		
		getData2();  //doesn't req to create object, access directly
			
	}
	
	public String getData()
	{
		System.out.println("hello world");
		return "rahul shetty";
	}

	public static String getData2()   //if you use static you can access this methods without creating object
	{
		System.out.println("hello world");
		return "rahul shetty";
	}
}
