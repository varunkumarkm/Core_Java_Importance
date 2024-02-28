package FebonacchiSeriesExample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class ExpFebanacchi {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int fiba;
		
		System.out.println(num1 + " " + num2);
		
		int count = 10;
		
		for (int i = 0; i < count; i++) {
			
			fiba = num1+num2;
			
			System.out.println(" " + fiba);
			
			num1 = num2;
			num2 = fiba;
		}
	}
}

  class Test 
 {
 	public static void main(String[] args) 
 	{
 		LocalDate dt = LocalDate.parse("2002-05-28",DateTimeFormatter.ISO_LOCAL_DATE);
 		dt.plusMonths(2);
 		dt.plusYears(2);
 		System.out.println(dt);
 		
 	}
 }
  
  class Testing 
  {
  	public static void main(String[] args) 
  	{
  		List<String> l = Arrays.asList("Cat","Dog");
  		for(String s1 : l)
  		{
  			for (String s2: l  )
  			{
  				System.out.println(s1+"..."+s2);
  			}
  		}
  	}
  }
  
  class TestException extends Exception
  {
  }
   class Tested 
  {
  	public static void m1() throws Exception
  	{
  		System.out.print("A");
  		throw new TestException();
  	}
  	public static void main(String[] args) throws Exception 
  	{
  		try
  		{
  			m1();
  		}
  		catch (TestException e)
  		{
  			System.out.println("B");
  		}
  		finally
  		{
  			System.out.println("C");
  		}
  		
  	}
  }
  
  
   class Testate 
   {
   	public static void main(String[] args) 
   	{
   		String s = new String("JavaSE8Certification");
   		s=s.substring(2,10);
   		s=s.substring(2,7);
   		s=s.substring(2,5);
   		System.out.println(s);
   	}
   }
  
  
   class Trust 
   {
   	public static void main(String[] args) 
   	{
   		ArrayList<Integer> l = new ArrayList<Integer>();
   		l.add(10);
   		l.add(-20);
   		l.add(30);
   		l.add(-40);
   		process(l, i->i>0);
   	}
   	public static void process(List<Integer> l, Predicate<Integer> p)
   	{
   		for (Integer I: l )
   		{
   			if(p.test(I))
   			{
   				System.out.print(I);
   			}
   		}
   	}
   }
   
   class Teated  
   {
   	public static int m1()
   	{
   		try
   		{
   			return 1;
   		}
   		catch (ArithmeticException e)
   		{
   			return 2;	
   		}
   		finally
   		{
   			return 3;
   		}		
   	}
    
   	public static void main(String[] args) 
   	{
   	    System.out.print(m1());
   	}
   }
   
   class Pen {
	   public static void main(String[] args) 
		{
			Object obj = new String("Durga");
			StringBuffer sb = (StringBuffer)obj;
			System.out.println(sb);
		}
   }
  
   class Equal {
	   public static void main(String[] args) 
		{
			StringBuilder sb1 = new StringBuilder("durga");
			StringBuilder sb2 = new StringBuilder("durga");
			
			String  a="three";
			String b="four";
			String c;
			c=a;
			
			System.out.println(c==b);
			System.out.println(c.equals(b));
		}
   }
   
   class Tang {
	   public static void main(String[] args) 
		{
			StringBuilder sb = new StringBuilder("Java8");
			sb.reverse().deleteCharAt(0).append("SE").delete(3,sb.length());
			
			
			StringBuilder sb1 = new StringBuilder("varun");
			StringBuilder sb2 = new StringBuilder("sathwik");

			sb1.reverse();
			sb2.append(sb1).append("SE");
			System.out.println(sb2);
			
					
//			System.out.println(sb);		
		}
   }
  
   interface Interf
   {
   	public int squareIt(int n);
   }
   class InterfImpl implements Interf
   {
   	public int squareIt(int n)
   	{
   		return n*n;
   	}	
   }
   
   
   
   class XXX{
	   public static void main(String[] args) {
//		Integer x = 10;
//		Integer y = 10;
				
		
		
//		System.out.println(x==y);
//		System.out.println(x.equals(y));
	}
   }
   
   class Fibu {
		
		  public static void main(String[] args) {
			String str = "varun";
			
			for (int i = str.length()-1; i >=0; i--) {
				System.out.print(str.charAt(i));
			}
		}
	}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  