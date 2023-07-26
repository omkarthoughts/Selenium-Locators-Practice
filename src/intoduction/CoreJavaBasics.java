package intoduction;

import java.util.Arrays;
import java.util.List;

public class CoreJavaBasics {

	public static void main(String[] args) {
		
		int num = 5;
		String website = "rahul shetty academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCart = true;
		
		System.out.println(num+" is value stored in num veriable");
		System.out.println(website+" is the website name stored in website variable");
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(myCart);
		
		//Arrays
		int [] arr = new int [5];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		
		int [] arr2 = {1,2,4,5,6,8,9,10,122};
		
		//for loop arr.length - 5
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i = 0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		//if you want to convert noraml Array to ArrayList
		String [] names = {"rahul", "shetty", "selenium"};
		List<String> nameArrayList = Arrays.asList(names);
		nameArrayList.contains("selenium");
		
		for(int i = 0; i<names.length; i++)
		{
			System.out.println(names[i]);
		}
		
		//Enhanced for loop
		
		for(String s: names)
		{
			System.out.println(s);
		}
	}

}
