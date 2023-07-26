package intoduction;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

//public class test {
//	
//	public static void main (String []args) {
//	
//		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://rahulshettyacademy.com");
//	System.out.println(driver.getTitle());
//	System.out.println(driver.getCurrentUrl());
//	driver.close();
//	}
//}

class test {
    public static void main(String[] args) {
        
        int  num = 100;
        boolean flag = true;
        
        
        for( int i = 2; i<num; i++)
        {
            for(int j = 2; j<=i; j++)
            {
                if(i%j == 0)
                { 
                    flag = false;
                    break;
                    
                 }
                 else
                 {
                     System.out.println(i) ;
                 }
                
            } 
        }
    }
}

/*class test{
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	      int i =0;
	      int num =0;
	      //Empty String
	      String  primeNumbers = "";
	      System.out.println("Enter the value of n:");
	      int n = scanner.nextInt();
	      scanner.close();
	      for (i = 1; i <= n; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    //Appended the Prime number to the String
		    primeNumbers = primeNumbers + i + " ";
		 }	
	      }	
	      System.out.println("Prime numbers from 1 to n are :");
	      System.out.println(primeNumbers);
	}
}*/