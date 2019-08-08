package test;

import java.io.File;
import java.io.IOException;

public class Demo7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("BatchMates.txt");
		File f1=new File("Batch");
		
		f1.mkdirs();
		f.createNewFile();
		
		System.out.println(f1.isDirectory());
		String[] s=f1.list();
		for(int i=0; i<s.length;i++)
		{
			
			File f3=new File(s[i]);
			if (f3.isDirectory())
			System.out.println(s[i]+" is folder");
			else
				System.out.println(s[i]+" is file");
		}
	}

}
