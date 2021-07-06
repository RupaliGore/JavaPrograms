
public class BiggestWord {
	
	public static String  findBigWord(String str)
	{
	  String strArray[]=str.split(" ");
	  int len=0;
	  String word="";
 for(String s:strArray)
 {
	 if(s.length()>len)
	 {
		 
		 len=s.length();
		 word=s;
	 }
 }
	return word;
	
	
	}

	public static void main(String[] args) {
		String s2="I am learning Java";
		String s4= findBigWord(s2);
		System.out.println(s4);

	}

}
