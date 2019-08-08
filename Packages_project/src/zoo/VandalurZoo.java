package zoo;
import org.animals.*;


public class VandalurZoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion= new Lion();
		Elephant elephant= new Elephant();
		Monkey monkey= new Monkey();
		System.out.println("lion Details");
		System.out.println(lion.color);
		System.out.println(lion.weight);
		System.out.println(lion.age);
		lion.isVegetarian();
		lion.canClimb();
		lion.getSound();
		
		System.out.println("\nElephant Details");
		System.out.println(elephant.color);
		System.out.println(elephant.weight);
		System.out.println(elephant.age);
		elephant.isVegetarian();
		elephant.canClimb();
		elephant.getSound();
		
		System.out.println("\nMonkey Details");
		System.out.println(monkey.color);
		System.out.println(monkey.weight);
		System.out.println(monkey.age);
		monkey.isVegetarian();
		monkey.canClimb();
		monkey.getSound();

	}

}
