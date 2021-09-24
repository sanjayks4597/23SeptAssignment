package Problems;

public class CallbyValue {

	public static void main(String[] args) {
		
		int val1=10;
		int val2=34;
		
		int v=multiply(val1,val2);
		System.out.println("x:"+val1);
		System.out.println("y:"+val2);
		

	}
	public static int multiply(int x,int y) {
		
		x+=x;
		y+=y;
		System.out.println("Inner prints...");
		
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
		System.out.println("=================================================");
		return x*y;
		
		
		
	}

}
