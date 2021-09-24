package Problems;

public class Varargs {

	public static void main(String[] args) {
		
		int a=5;
		int b=9;
		Varargs va=new Varargs();
		int sum=va.varArg(a,b,1,2,4,5,6,7);
		System.out.print("Sum of varible is :"+sum);
		
		
		

	}
	public int varArg(int x,int y,int ...z) {
		int s=0;
		for(int i=0 ;i<z.length;i++) {
			s=s+z[i];
			
		}
		
		return s+x+y;
	}
	

}
