
public class NumFibbonacci {

  static  int num1=0,num2=1,sum=0;
   
    static void numFib(int n)
    {
    	if(n>0)
    	{
    		sum=num1+num2;
    		num1=num2;
    		num2=sum;
    		System.out.print(" " +sum);
    		numFib(n-1);
    		
    	}
    }
	public static void main(String[] args) {

		int num=10;
		System.out.print( num1 + " " +num2);
		numFib(num-2);
		
	}

}
