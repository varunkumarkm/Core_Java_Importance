package DurgaSoft_Assignment;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test {

	public static void main(String[] args) {
		
		int a = 10;
		double b = 10.0;
		boolean c = true;
		
//		System.out.println(++a + ++b + ++c); compilation fails
	}
}

 class Student {
	 
	 private String name;
	 private boolean passed;
	 private int marks;
	 
	 public static void main(String[] args) {
		 Student s = new Student();
		 System.out.println(s.name+"...."+ s.passed+"...."+s.marks);
	}//null....false....0
 }
 
  class Arr {
	  public static void main(String[] args) {
		  
		  int[] x = {2,3,4,5};
			System.out.println(x.length);
	}//4
  }
  
  class Countt {
	  int count;
	  
	  public void Countt() {
		  count = 7;
	  }
	  public static void main(String[] args) {
		  Countt c = new Countt();
		  c.Countt();// 7
		  System.out.println(c.count);//  0
	}
  }
  
  class Testt {
	  
	  static int i = 10;
	  int j = 20;
	  
	  public void m1() {
		  i++;
		  j++;
	  }
	  public static void main(String[] args) {
		  Testt t1 = new Testt();
		  t1.m1();
		  
		  Testt t2 = new Testt();
		  t2.m1();
		  
		  System.out.println(Testt.i+ " " + t2.j);
	}//12 21
  }
  
   class Testing{
	   
  	public static void main(String[] args) {
  		
  		for(int i =0; i<= args.length; i++) {
  			System.out.print(args[i]);
  		}
  	}//Runtime Exception occured
  }
  
   class Example {
	   
	   public static void main(String[] args) {
		
		   String[] s = new String[2];
		   System.out.println(s);
		   System.out.println(s[0]);
	
	   }   //   [Ljava.lang.String;@cac736f
   }       //   null
  
   class Demo {
	   
   	String title ="Demo";
   }
    class Tested {
   	public static void m1(Demo d) {
   		d.title = "NewDemo";
   	}
   	public static void main(String[] args) {
   		Demo d =new Demo();
   		m1(d);
   		System.out.println(d.title);
   	}//NewDemo
   }
    
    class Testtt  
    {
    	public static void main(String[] args) 
    	{
    		String[] argv = new String[2];
    		argv=args;
    		for(String v : argv)
    		{
    			System.out.print(v);
    		}
    	}////Runtime Exception occured
    }
    
     class Testeed
    {
    	public static void main(String[] args) 
    	{
    		int x =10;
    		String s= "Java";
    		if(s.equals("Java"))
    		{
    			int y = 20;
    			x= x+30;
    		}
//    		System.out.println(x+"..."+y); compilation fails
    	}
    } 
  
      class Teet 
     {
     	public static void m1(int x)
     	{
     		x=20;
     	}
     	public static void main(String[] args) 
     	{
     		int x =10;
     		m1(x);
     		System.out.println(x);
     		
     	}//10
     }
      
      class Calc 
    	  {
    			public static void main(String[] args) 
    			{
    				char c1 = 'a';//Line-1
    				char c2 = 97;//Line-2
//    				char c3 = 65536;//Line-3
//    				char c4 = -10;//Line-4
//    				System.out.println(c1+c2+c3+c4);
    			}
    		}//3 and 4 error
      
      class Alc 
      {
    	  public static void main(String[] args) 
    		{
    			int[] a = new int[3];
    			a[0]=10;
//    			a[1]=10.0;
    			System.out.println(a[0]+a[1]+a[2]);
    		}//compilation fails
    	}  
      
      class Mike {
    	  public static void main(String[] args) 
    		{
    			int[] a = {10,20,30};
    			int[] b = {10,20};
    			a=b;
    			for(int i :a)
    			{
    				System.out.print(i);
    			}		
    		}//1020
      }
  
     class Raj {
    	 public static void main(String[] args) 
    		{
    			Boolean b1 = new Boolean(null);
    			Boolean b2 = new Boolean(false);
    			System.out.print((b1 == b2)+" ");
    			System.out.print(b1.equals(b2));
    		}//false true
     }
     
     class Maj {
    	 public static void main(String[] args) 
    		{
    			char ch1 = 'a';
    			char ch2 = 'b';
    			System.out.println(ch1+ch2);
    		}
     }
     
     class Dec {
    	 public static void main(String[] args) 
    		{
    			int[] a = {10,20};
    			char[] b = {'a','b'};
//    			a=b; compile fails 
    			for(int i :a)
    			{
    				System.out.print(i);
    			}		
    		}
     }
     
     class Nut {
    	 public static void main(String... subjects) 
    		{
    			System.out.println(subjects[0]);
    		}
     }//Exception thrown at runtime
     
     class Bolt {
    	 public static void main(String[] args) 
    		{
    			int[] a = new int[3];
    			a[0]='a';
    			a[1]='b';
    			System.out.println(a[0]+a[1]+a[2]);
    		}
     }//195
     
     class Thread {
    	 public static void main(String[] args) 
    		{
    			Boolean b1 = Boolean.valueOf(null);
    			Boolean b2 = Boolean.valueOf(false);
    			System.out.print((b1 == b2)+" ");
    			System.out.print(b1.equals(b2));
    		}//true true
     }
     
      class Swet   
     {
     	public static void main(String[] args) 
     	{
     		int x = 40;
     		switch(x)
     		{
     			default :
     				System.out.print("A");
     			case 10: 
     				System.out.print("B");
     			    break;
     			case 20: 
     				System.out.print("C");
     			case 30: 
     				System.out.print("D");			
     		}
     	}
     }
  
  class Mud {
	  public static void main(String[] args) 
		{
			int x =10;
			int y =0;
			switch(x)
			{
				case 10: 
					y++;
				case 20:
					y=y+2;
				case 30:
					y= y+3;
			}
			System.out.println(y);
		}
  }
  
  class Did {
	  public static void main(String[] args) 
		{
			int x =10;
			switch(x)
			{
				default :
					System.out.print("A");
				case 10: 
					System.out.print("B");
				    break;
				case 20: 
					System.out.print("C");
				case 30: 
					System.out.print("D");			
			}
		}
  }
  
  class Tet {
	  public static void main(String[] args) 
		{
			int x =10;
//			String result=(x>20)?"x is >20":(x>5)?"x is > 5";
//			System.out.println(result); compilation files
		}
  }
  
  class Break {
	  public static void main(String... args) 
		{
			List<Integer> list = new ArrayList<Integer>();
			list.add(10);
			list.add(20);
			list.add(30);
			list.add(40);
			for (Integer I : list)
			{
				System.out.println(I);
				break;
			}		
		}
  }
  
  class Daft {
	  public static void main(String[] args) 
		{
			int  x = 0;
			int y = 0;
			y = ++x;
//			if(x)
			{
				System.out.println("Hello");
			}
//			else
			{
				System.out.println("Hi");
			}
		}//compilation fails
  }
  
  
  class Swth {
	  public static void main(String[] args) 
		{
			byte b = 10;
			switch(b+1)
			{
				case 10: System.out.print(10);
				case 100: System.out.print(100);
				case 1000: System.out.print(1000);	
			}
		}
  }
  
  class Six {
	  public static void main(String[] args) 
		{
			int x =10;
			final int y =20;
			switch(x)
			{
				//Line-1
				case 10+20+30:
					System.out.println(30);
				default:
					System.out.println(0);
			}
		}
  }
  
  class Do {
	  public static void main(String[] args) 
		{
			byte b = 10;
			switch(b)
			{
				case 10: System.out.print(10);
				case 100: System.out.print(100);
//				case 1000: System.out.print(1000);CE			
			}
		}
  }
  
  class See {
	  public static void main(String[] args) 
		{
			String[] s = {"Cat","Dog","Rat"};
			for(int i=0; i<=s.length; i++)
			{
				System.out.println(s[i]);
			}
		}//Runtime exception
  }
  
  class Out {
	  public static void main(String[] args) 
		{
			int[] x = new int[3];
			int y =0;
			for (int i =0; i>x.length; i++)
			{
				x[i]=++y;
			}
			for(int x1 : x)
			{
				System.out.print(x1);
			}		
		}
  }
  
  class Contin {
	  public static void main(String[] args) 
		{
			List<Integer> list = new ArrayList<Integer>();
			list.add(10);
			list.add(20);
			list.add(30);
			list.add(40);
			for (Integer I : list)
			{
				continue;
//				System.out.println(list); CE
			}	
		}
  }
  
  class Durga {
	  public static void main(String[] args) 
		{
			String a = "durga";
			int b =10;
			int c =20;
			int d = 30;
			System.out.println(a+b+c+d);
		}
  }
  
  class Whil {
	  public static void main(String[] args) 
		{
			int i = 5;
			while(++i < 10)
			{
				System.out.print(i++);
			}		
		}
  }
  
   class Books 
  {
  	public static void main(String... titles) 
  	{
  		System.out.println(titles[1]);
  	}
  }
   
   class Whit {
	   public static void main(String[] args) 
		{
			int i = 1;
			do
			{
				while(++i<3)
				{
					System.out.print(++i);
				}
			}
			while (++i<10);				
		}
   }
  
   class Meet {
	   public static void main(String[] args) 
		{
			List<String> l1= Arrays.asList(new String[] {"A","B"});
			List<String> l2= new ArrayList<>();
			l2.add("A");
			l2.add("B");
			if (l1==l2)
			{
				System.out.println("Equal By Address");
			}
			else if(l1.equals(l2))
			{
				System.out.println("Equal By Content");
			}
			else
			{
				System.out.println("Not Equal either by Address or by Content");
			}	
			
		}
   }
  
  class Cond {
	  public static void main(String[] args) 
		{
			int i = 0;
			if(++i<0)
			{
				System.out.print("A");
			}
			{
				System.out.print("B");
			}
			System.out.print("C");				
		}
  }
  
  class Parent
  {
  	int x =10;
  }
  class Child extends Parent
  {
  	int x=20;
  }
   class Opp 
  {
  	public static void main(String[] args) 
  	{
  		Parent p = new Child();
  		System.out.println(p.x);
  	}
  }
  
   interface Put {
	   public static void main(String[] args) {
		System.out.println("interface main method");
	}
   }
  
  class Add {
	  public static void main(String[] args) 
		{
			Date d = new Date(10);
		
			System.out.println(d);
		}
  }
  
  
  class Tect {
	  public static void m1(int x)
		{
			System.out.println("int argument");
		}
		public static void m1(short x)
		{
			System.out.println("short argument");
		}
		public static void m1(double x)
		{
			System.out.println("double argument");
		}
		public static void main(String[] args) 
		{
			char ch = 'j';
			m1(ch);
		}// int argument
		
  }
  
  
  class Tangi {
	  Tangi(Integer I)
		{
			System.out.print(0);
		}
	  Tangi(int... i)
		{
			System.out.print(1);
		}
	  Tangi(double d)
		{
			System.out.print(2);
		}
	  Tangi(Object o)
		{
			System.out.print(3);
		}
		public static void main(String[] args) 
		{
			new Tangi('a');
			new Tangi(10);
			new Tangi(10.5);
		}
  }
  
  
  
  class Match {
	  Match()
		{
			this(10);
			System.out.print(0);
		}
	  Match(int i)
		{
			this(10.5);
			System.out.print(1);
		}
	  Match(double i)
		{
			System.out.print(2);
		}
		public static void main(String[] args) 
		{
			new Match(10);
		}
  }
  
  
  class Parents {
	  public void m1()
		{
			System.out.println("Parent Method");
		}
	}
	class Childed extends Parents
	{
		public void m1()
		{
			System.out.println("Child Method");
		}
	}
	 class Tacting 
	{
		public static void main(String[] args) 
		{
			Parents p = new Childed();
			p.m1();
		}//Child Method
  }
  
	 
	 class Fact {
		 public static void m1(int x)
			{
				System.out.print("int");
			}
			public static void m1(long l)
			{
				System.out.print("long");
			}
			public static void m1(float f)
			{
				System.out.print("float");
			}
			public static void m1(Object o)
			{
				System.out.print("Object");
			}
			public static void main(String[] args) 
			{
				m1('a');
				m1(true);
				m1(10.5);			
			}
	 }
  
	 class Parounts {
		 private void m1()
			{
				System.out.println("Parent");
			}
		}
		class Childent extends Parounts
		{
			private void m1()
			{
				System.out.println("Child");
			}
			public static void main(String[] args) 
			{
				Childent c = new Childent();
				c.m1();
			}
	 }
		
interface Intruff {
	default void m1()
	{
		System.out.println("interface default method");
	}
}
 class Tut implements Intruff
{
	public void m1()
	{
		System.out.println("Test class method");
	}
	public static void main(String[] args) 
	{
		Intruff i = new Tut();
		i.m1();		
	}
}
 
 class Dashbod {
	 public Dashbod()
		{
			System.out.print("X");
		}
		public void Dashbod()
		{
			System.out.print("Y");
		}
		public void m1()
		{
			new Dashbod();
			Dashbod();
		}
		public static void main(String[] args) 
		{
			Dashbod t = new Dashbod();
			t.m1();	
		}
 }
  
  
  
  
  
  
  
  
  
  