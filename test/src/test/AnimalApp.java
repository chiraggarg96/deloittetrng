package test;

class Animal
{
	public void sound()
	{
		System.out.println("animal Sound");
	}
	public void eat()
	{
		System.out.println("vegetarian");
	}
}
class Cat extends Animal
{
	int k=0;
	public void sound()
	{
		System.out.println("meow");
		super.sound();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + k;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (k != other.k)
			return false;
		return true;
	}
	
	
}

public class AnimalApp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1= new Cat();
		Cat c2 = new Cat();
		Cat c3= c2;
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		System.out.println(c2);
		c1.sound();
		c1.eat();
	}

}
