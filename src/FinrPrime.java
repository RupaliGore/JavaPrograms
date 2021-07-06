
public class FinrPrime {
	
	
	static void findPrime(int n)
	{
		boolean isPrime =true;
		if(n==0||n==1)
		{
			System.out.println("Number is not prime " +n);
		}
		
		else
		{
			 for(int i=2;i<n;i++)
			 {
				 if(n%i==0)
				 {
					 isPrime=false;
				 }
			 }
		}
	
	    if(isPrime)
	    {
	    	System.out.println("Number is Pime " +n);
	    }
	    else 
	    {
	    	System.out.println("Number is not prime " +n);
	    }
	}
	    public static void main(String args[])
	    {
	    	 int x=10,y=15;
	    	for(int i =x;i<=y;i++)
	    	{
	    		findPrime(i);
	    	}
	    }
	}


