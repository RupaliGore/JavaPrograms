
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num1=0 ,num2 =1, sum=0;
  int i, num=5;
  
   System.out.print(num1 + " " + num2 );
   for(i=2;i<num; i++)
   {
	   sum  =num1+num2;
	   num1 = num2;
	   num2 =sum;
	   System.out.print(sum);
	}
	}
}
