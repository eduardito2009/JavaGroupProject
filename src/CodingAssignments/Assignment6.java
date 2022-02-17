package CodingAssignments;

public class Assignment6 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?
		int x = 38;
		int y = 18;

		System.out.println("Before swapping a = " + x + " and b = " + y );

		x = x + y; //a = 38 + 18 = 56
		y = x - y; //b = 56 - 18 = 38
		x = x - y; //a = 56 - 38 = 18

		System.out.println("After swapping a = " + x + " and b = " + y);

	}

}
