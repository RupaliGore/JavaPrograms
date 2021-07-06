
public class Fibbonnacci {

	static  int num1=0, num2=1,sum=0;
	
     static void numFibbonacci(int n){
	   if(n>0)
	{
		sum=num1+num2;
		num1=num2;
		num2=sum;
		System.out.print(" " +sum);
		
      	numFibbonacci(n-1);
	  }
     }
	public static void main(String[] args) {

         int num=10;
         System.out.print(num1 +" " +num2);
         
         numFibbonacci(num-2);
         
	}

}
