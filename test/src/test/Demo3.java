package test;

class Count{
	static int count;
	
	Count()
	{
		count++;
		
	}
	public void display()
	{
		System.out.println(count);
	}

}


public class Demo3 {
	
	public static void main(String[] args)
	{
	
		Count c1= new Count();
		Count c2= new Count();
		Count c3= new Count();
		Count c4= new Count();
		
		c4.display();
	}

}
