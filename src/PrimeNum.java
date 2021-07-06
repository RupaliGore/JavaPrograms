
public class PrimeNum {

	public static void main(String[] args) {
		
		int num=11;
		boolean isPrime=true;
		if(num==0||num==1)
		{
			System.out.println("Number is not prime " +num);
		}
		else
		{
			for(int i=2;i<=num;i++)
			{
				if(num%i==0)
				{
				isPrime=false;
				}
			}
			if(isPrime)
			{
				System.out.println("Number is prime " +num);
			}
			else
				System.out.println("Number is not prime " +num);
		}
		
		
		
	}

}
