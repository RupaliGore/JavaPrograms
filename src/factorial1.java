
public class factorial1 {
	
	static int numFact(int n){
		if(n==0)
			return 1;
		else
			return (n*numFact(n-1));
		
	}

	public static void main(String[] args) {

		int fact=1, num=5;
		fact=numFact(num);	
		System.out.println(fact);

	}

}
