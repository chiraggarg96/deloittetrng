package test;

public class Demo2 {

	int i=100;
	public Demo2()
	{
		System.out.println(i++);
	}
	public Demo2(int num)
	{
		i=num;
		System.out.println(i++);
	}
	public void display()
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		
	Demo2 d= new Demo2();
	
	d.display();
	
	Demo2 d2= new Demo2(300);
	
	d2.display();


	} 

}
