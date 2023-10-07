package fall2023.week5;

public class Week5 {
	/**
	 * Find the sum of integers from 1 to 10, from 20 to 30, and from 35 to 45, respectively.
	 * @param a
	 * @param b
	 * @return sum
	 */
	public int total(int a, int b) {
		int sum = 0;
		for(int i=a; i <= b; i++) {
			sum += i;
			
		}
		
		return sum;
	}
	
	/**
	 * Function without return value
	 * @param a
	 * @param b
	 */
	public void sum(int a, int b) {
		int sum = 0;
		for(int i=a; i <= b; i++) {
			
			sum += i;
			
		}
		System.out.println("sum from " + a + " to " + b + " is: " + sum);
	}
	


	public static void main(String[] args) {
		Week5 w = new Week5();
		w.sum(1, 10);
		System.out.println("total from 1-10 is: " + w.total(1, 10));
		w.sum(20, 30);
		System.out.println("total from 1-10 is: " + w.total(20, 30));
		w.sum(35, 45);
		System.out.println("total from 1-10 is: " + w.total(35, 45));

	}
	

}
