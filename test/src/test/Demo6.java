package test;

import java.util.StringTokenizer;

class Employee
{

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
		System.out.println("Employee finalize called");
	}
	
}
public class Demo6 {

	public static void main(String[] args) {
		
	/*	Employee e1=new Employee();
		e1=new Employee();
		System.out.println("Employee object created");
		  String name ="Harish";
	        String name1 = new String("Harish");
	        name = "Riya";
	        name.concat(" Sharma");
	        System.out.println(name);
	       
	        System.out.println(name.substring(2,4));
	        System.out.println(name);
	        System.out.println(name.equals(name1)); //comparing values
	        System.out.println(name==name1); //comparing reference
	        System.out.println(name.endsWith("sh"));
	        System.gc();*/
		
		
	        String qoute="Harish:chirag:parth:ishita:harshit";
	        //StringTokenizer tokenizer=new StringTokenizer(qoute,":");
	        //System.out.println(typeof(tokenizer));
	        //String s=tokenizer.toString();
	        String[] tokens=qoute.split(":");
	        for (int i = tokens.length-1; i>=0;i--) {
	            System.out.println(tokens [i]);
	        }
	        
	        /*while(tokenizer.hasMoreTokens())
	        {
	        	System.out.println();
	        	tokenizer.toString
	        }*/
	        
			//System.gc();
		// TODO Auto-generated method stub

	}

}
