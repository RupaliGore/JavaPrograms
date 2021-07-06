package utilNew;
import java.util.ArrayList;
import java.util.Arrays;


public class Util1 {

	static int[] sortArray(int arr[])
	{
		Arrays.sort(arr);
		return arr;
	}

	
	 static int factorial1(int n)
	 {
		 int fact =1;
		 for(int i =1;i<=n;i++)
		 {
			 fact=fact*i;
		 }
		 return fact;
	 }
	 
	 
	 static ArrayList fibonnacci(int num)
	 {
		 int num1=0,num2=1,sum=0;
		 ArrayList al= new ArrayList();
		 al.add(num1);
		 al.add(num2);
		 		 for(int i=2;i<=num;i++){
		 sum=num1+num2;
		 num1=num2;
		 num2=sum;
		 
		 al.add(sum);
		 }
		 return al;
	 }
	
	
}
