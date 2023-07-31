package lesson1_basics;

public class IncrementAndAssignmentOperators {

	public static void main(String[] args) {
		int x = 10;
		x++;
		
		System.out.println("Increment value: " + x);
		System.out.println("Increment value: " + ++x); 		// Pre-incrementation
		
		x += 5;
		System.out.println("Increment value: " + x);
	}
}
