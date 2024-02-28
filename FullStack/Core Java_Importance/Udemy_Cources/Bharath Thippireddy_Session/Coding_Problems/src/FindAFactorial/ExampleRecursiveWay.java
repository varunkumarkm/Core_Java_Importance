package FindAFactorial;

//we do the two way to find the factorial number 1) Recursive way and 2) non-recursive way

// 1) Recursive way
   class ExampleRecursiveWay {

	 public static int recursiveFactorial(int num) {
		if(num == 0) {
			return 1;
		}else {
			return (num*recursiveFactorial(num-1));
		}
	 }
	 
	 public static void main(String[] args) {
		System.out.println(ExampleRecursiveWay.recursiveFactorial(5));
	}
}
   

// 2) non-recursive way
  class ExampleNonRecursiveWay {

	 public static int findFactorial(int number) {
		 int result = 1;
		 
		 for (int i = 1; i <= number; i++) {
			result = result*i;
		}
		 return result;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(ExampleNonRecursiveWay.findFactorial(5));
	}
 }
 
  
  class Test 
  {
  	public static void main(String[] args) 
  	{
  		StringBuilder sb = new StringBuilder();
  		sb.append("durga");
  		sb.deleteCharAt(0);
  		sb.delete(1,3);
  		System.out.println(sb);
  	}
  }
  
  class Str {
	  public static void main(String[] args) {
		  String s = "java";

		  String s1 = new String("java");
		  
		  System.out.println(s == s1);
		  System.out.println(s.equals(s1));
	}
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	 
	 