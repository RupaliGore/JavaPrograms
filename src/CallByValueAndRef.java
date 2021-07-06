
public class CallByValueAndRef {
        int p=50;
        int q=60;
	
	public int sum(int a,int b){
		int c;
		c=a+b;
		return c;
		
		
	}
	
	
	public void swap(CallByValueAndRef a1){
		int temp;
		temp = a1.p;
		a1.p=a1.q;
		a1.q=temp;
	}
	

	
	public static void main(String[] args) {
		
		int x=10,y=20;
		CallByValueAndRef obj = new CallByValueAndRef();
		obj.sum(x,y);
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}

}
