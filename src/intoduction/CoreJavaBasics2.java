package intoduction;

public class CoreJavaBasics2 {

	public static void main(String[] args) {
		// String is an Object //String Literal
		
		//String s1 = "Rahul Shetty Academy";
		String s5 =  "hello";
		
		//new object
		String s2 = new String("welcome");
		String s3 = new String("welcome");
		
		String s = "Rahul Shetty Academy";
		String[] splittedString = s.split("Shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		for( int i=0 ; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}		
		System.out.println("*************************");
		
		for(int i=s.length()-1; i>=0;i--)     //for reverse string printing
		{
			System.out.println(s.charAt(i));
		}
	}
}
