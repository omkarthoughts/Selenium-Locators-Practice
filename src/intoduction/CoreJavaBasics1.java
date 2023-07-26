package intoduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CoreJavaBasics1 {

	public static void main(String[] args) {
		
		int [] arr2 = {1,2,4,5,6,8,9,10,122};
		
		// 2,4,6,8,10,122
		//check this array has multiple of 2
		
		for (int i=0;i<arr2.length;i++)
		{
			if(arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
			}
			else
			{
				System.out.println(arr2[i]+ "is not multiple of 2");
			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("selenium");
		a.add("java");
		a.add("academy");
		a.remove(3);
		
		a.isEmpty();
		System.out.println(a.get(2));
		
		//iterating over arrays or array list
		
		for (int i = 0; i<a.size();i++)
		{
			System.out.println(a.get(i));
			
		}

		System.out.println("*******************");
		//using enhanced for loop
		for (String val :a)
		{
			System.out.println(val);
		}
		
		//Item is pesent in ArrayList or not
		System.out.println(a.contains("selenium"));
	}
	
		
}
