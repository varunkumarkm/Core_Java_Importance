package StringExample;

import java.io.FileNotFoundException;

class ReverseStringExample {
	
	
	public static String reverse(String input) {
		String result = "";
		
		for (int i = input.length()-1; i>=0; i--) {
//			result = result + input.charAt(i);
			result += input.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {
//         StringBuffer reverse = new StringBuffer("varun").reverse();
//         System.out.println(reverse);
		
		System.out.println(ReverseStringExample.reverse("varunkumar"));
		}
	}

 

 class Test 
{
	public static void m1()
	{
		System.out.print("A");
		try
		{
			System.out.print("B");
			System.out.print(10/0);
		}
		catch (ArithmeticException e)
		{
			System.out.print("C");			
		}
		finally
		{
			System.out.print("D");
		}
		System.out.print("E");
	}
 
	public static void main(String[] args) 
	{
	    m1();
	    System.out.print("F");
	}
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 