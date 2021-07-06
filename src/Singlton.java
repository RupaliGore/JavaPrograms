
public class Singlton {

	private static Singlton refs= null;
	
	public String str;
	private Singlton(){
		 str = "hi there";
	}
	
	public static Singlton getInstance(){
		if(refs == null)
		{
			refs =new Singlton();
		}
		return refs;
		
	}
	
	
	
	public static void main(String[] args) {

		Singlton a = Singlton.getInstance();
		Singlton b=Singlton.getInstance();
		a.str= a.str.toUpperCase();
		System.out.println(a.str);
		
		System.out.println(b.str);
	
	
	
	
	}

}
