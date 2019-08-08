package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable,Comparable<Emp>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empid;
	private String empname;
	
	public Emp(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	
	public Emp() {
		super();
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "\nEmp [empid=" + empid + ", empname=" + empname + "]";
	}

	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		/*if(this.empid<o.empid)
		return 0;
		return -1;*/
		
		if(this.getEmpname().compareTo(o.getEmpname())<0)
			return -1;
		return 0;
	}
	
	
	
}

public class Demo11 {

	private static void readObjectFromFile() throws FileNotFoundException, IOException
	{
		Emp emp=new Emp(56,"hjukkjn");
		ObjectOutputStream stream=new ObjectOutputStream(new FileOutputStream("kii.txt"));
		stream.writeObject(emp);
		stream.close();
		
	}
	private static void writeObjecttoFile() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		Emp emp=new Emp();
		ObjectInputStream stream=new ObjectInputStream(new FileInputStream("kii.txt"));
		emp =(Emp)stream.readObject();
		System.out.println(emp);
		stream.close();
		
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		writeObjecttoFile();
		readObjectFromFile();
		
		
	}

}
