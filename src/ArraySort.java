import java.util.Arrays;

public class ArraySort 
{
	public static void main(String args[])
	{
		
		int[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
		
		// Sort Array using Arrays util class
		// Arrays.sort(arr);
        // System.out.print("Sorted (using Array util) arr[] : "+ Arrays.toString(arr));
		
		
		// sort array using for loops
		int len = arr.length;
		for(int i=0; i<len; i++)
		{
			for(int j=0; j<len-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}		
		
		System.out.print("Sorted (using for loop) arr[] : "+ Arrays.toString(arr));        
		
	}

}
