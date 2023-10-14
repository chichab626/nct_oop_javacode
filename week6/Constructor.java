package oop.week6;

public class Constructor {
	
	int age;
	String name;

	public Constructor() {
		// this is a constructor
		System.out.println("You have entered the DEFAULT constructor");
	}
	
	public Constructor(String name) {
		// this is a constructor
		System.out.println("You have entered the constructor with String param");
		System.out.println(name);
	}
	
	public Constructor(int inAge, String inName) {
		// this is a constructor
		System.out.println("This constructor changes the age and name");
		age = inAge;
		name = inName;
	}
	
	double marks;
	String course;
	
	public Constructor(int inAge, String inName, double inMarks, String inCourse) {
		this(inAge, inName);
		System.out.println("This constructor calls another constructor");
		marks = inMarks;
		course = inCourse;
	}

	public static void main(String[] args) {

		Constructor c = new Constructor();
		Constructor c2 = new Constructor("Hello");
		
		Constructor c3 = new Constructor(12, "Boy");
		System.out.println("Hello " + c3.name + ". You are " + c3.age);
		
		Constructor c4 = new Constructor(23, "Maria", 70.6, "MATH");
		System.out.println("Hello " + c4.name + ". You are " + c4.age);
		System.out.println("And your " + c4.course + " grade is " + c4.marks);

	}

}
