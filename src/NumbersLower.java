
public class NumbersLower {

	public static void main(String[] args) {
 
		 int num1=0,num2=1 , count=10, sum=0;
		 System.out.print(num1);
		 System.out.print(num2);
		 
		 for(int i=2;i<=count;i++)
		 {
			 
			 sum=num1+num2;
			 num1=num2;
			 num2=sum;
			 
		 
	  	System.out.print(sum);
	}
       
	}
}

