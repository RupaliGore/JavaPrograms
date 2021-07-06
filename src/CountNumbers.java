
public class CountNumbers {
	
public static int countwords(String str)
{
	String strArray[] = str.split(" ");	
	int count=0;
	for(String s: strArray)
	{
		if(!s.equals(""))
		{
			count++;
		}
	}
		return count;	
	
}
	
	
	
	public static void main(String[] args) {
		String str1 ="I am      learnig Java";
		int c= countwords(str1);
		System.out.println(c);
		

	}

}
