import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Addarray {

	public static void main(String[] args) {

     List<String> list= new ArrayList<String>();
     
     list.add("Rupali");
     list.add("Nitin");
     list.add("Ruhi");
//     
//     Iterator itr = list.iterator();
//     while(itr.hasNext())
//     {
//    	 System.out.println(itr.next());
//     }
     for(String s: list)
     {
    	 System.out.println(s);
     }
     
		
	}

}
