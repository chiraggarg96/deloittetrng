package test;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="The quick brown fox jumps over the lazy dog";
		
		System.out.println(s.charAt(12));
		System.out.println(s.contains("is"));
		s.concat("and killet it");
		System.out.println(s.endsWith("dogs."));
		System.out.println(s.compareTo("The quick brown Fox jumps over the lazy Dog"));
		System.out.println(s.compareTo("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		System.out.println(s.length());
		System.out.println(s.matches("The quick brown Fox jumps over the lazy Dog"));
		
		//9
		String[] s1 = s.split(" ");
		
		for (int i=0;i<s1.length;i++)
		{
			if(s1[i].equals("The"))
				s1[i]="A";
		}
		
		//10
		String[] s3 =s.split("jumps");
		
		
		//11
		
		
		for(int i=0;i<s1.length;i++)
		{
			if (s1[i].equals("dog"))
				System.out.println((s1[i]));
			if (s1[i].equals("fox"))
				System.out.println(s1[i]);
		}
		// 12
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.indexOf("a"));
		System.out.println(s.lastIndexOf("e"));
		
		
	}

}
