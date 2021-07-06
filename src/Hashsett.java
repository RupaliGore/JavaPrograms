import java.util.HashSet;
import java.util.Set;


public class Hashsett {

	public static void main(String[] args) {
	
         String str[] = {"java","apple","selenium","c#","java","apple"};

         Set<String> store= new HashSet<String>();

         for(String s:str){
        	 if(store.add(s)==false)
        	 {
        		 System.out.println("duplicate" +s);
        	 }
        	 
         }
        	 
	}
}



