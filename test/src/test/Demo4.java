package test;

class Student
{
	private int studentId;
	private String studentName;
	private int marks;

	
	public Student()
	{
		studentId=100;
		studentName="bfi";
		marks=50;
		
	}

	public Student(int studentId, String studentName, int marks) {
		this();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}

	public Student(int studentId, int marks) {
		this();
		this.studentId = studentId;
		this.marks = marks;
	}
	public void display() {
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(marks);
	}
	
	
}
public class Demo4 {

	public static void main(String[] args) {
		
		Student s1= new Student();
		Student s2= new Student(150,"gbglob",88);
		Student s3= new Student(256,89);
		
		s1.display();
		s2.display();
		s3.display();
	}

}
