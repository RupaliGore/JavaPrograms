
public class Factorial {
 
	  
	
	static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
			return (n* factorial (n-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int fact,num=5;
      fact = factorial(num);
	System.out.print(fact);	
	}

}
