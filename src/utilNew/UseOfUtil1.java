package utilNew;

import java.util.ArrayList;





public class UseOfUtil1 {

	public static void main(String[] args) {

		int a1[]={10,28,3,44,55};
		Util1.sortArray(a1);
		System.out.print("Sorted array" );
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(" " +a1[i]);
		}
		

          int fact = Util1.factorial1(5);
          System.out.println(" " );
          System.out.println(" Number is " +fact );



          ArrayList al =Util1.fibonnacci(5);
          System.out.println("Fibbonnacci " +al);
	}

}
