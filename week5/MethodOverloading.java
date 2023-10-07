package fall2023.week5;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading o = new MethodOverloading();
		o.add(45, 67);
		o.add(543, 5, 6);

	}
	
	/** Overloading is same function, diff params **/
	public void add(int a, int b) {
		System.out.println("Sum is " + a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println("Sum is " + (a+b+c));
	}

}
