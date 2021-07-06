
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int r, sum=0,  temp ,n=454;
       temp=n;
        
       while(n>0)
       {
    	   r = n%10;
    	   sum= (sum*10)+r;
 
    	   n=n/10;		   
       }
	if(temp==sum)
		System.out.println("Palindrome" + " " +sum);
	else
		System.out.println("Not a palindrome" +sum);
		
		
	
	}
	

}
