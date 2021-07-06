
public class Fact_Num {

	int num;
	int fact=1;
	 Fact_Num(int n1)
	 {
		 num=n1;
		 fact=factorial(n1);
	 }
	
	
	 
	static int factorial(int n)
	
	{  int fact=1;
	     
	   for(int i=1;i<=n;i++)
	   {
		   fact=fact*i;
	   }
         return fact;	   
		
	}
	
	void display(){
		System.out.println("Number" + num +" Fcatorial is " + fact);
	}
	
	
	
	public static void main(String[] args) {
		Fact_Num f1=new Fact_Num(5);	
		f1.display();
	}

}
