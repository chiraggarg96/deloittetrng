package test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw= new FileWriter("demo8.txt");
		fw.write("Hello world! how r u");
		fw.close();
		
		FileReader fr=new FileReader("demo8.txt");
		int i;
		while ((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		
	}

}
