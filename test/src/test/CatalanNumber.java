package test;

public class CatalanNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//catalan();
		System.out.println(catalan(5,0));
		
	}

	public static int catalan(int n,int i)
	{
	
		if(n==0)
		return 1;
		
		
		int c=catalan(n-1)*catalan(n-1-i);
		return c;
	}
}
