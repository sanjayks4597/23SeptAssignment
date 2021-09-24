package Problems;

public class Callbyvalue2 {

	public static void main(String[] args) {
		int[] x= {15,25,26,35,65,89,78};
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
		change(x);
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		

	}
	public static void change(int [] x) {
		
		x[0]=x[0]+10;
	}

}
