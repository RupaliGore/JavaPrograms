import java.util.ArrayList;
import java.util.ListIterator;


public class Traversarray {

	public static void main(String[] args) {

      ArrayList list = new  ArrayList();
      list.add("java");
      list.add("selenium");
      list.add("c#");
      list.add("apple");
      
      ListIterator itr= list.listIterator();
      System.out.println("Forword direction");
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
      
      System.out.println("Backword direction");
      
      while(itr.hasPrevious())
      {
    	  System.out.println(itr.previous());
      }
		
		
	}

}
