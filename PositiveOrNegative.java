package week1.day1;

public class PositiveOrNegative {
	public static void main(String[] args) {
		int a = 40;
		int b = -30;
		int c = 1;
		if (a > 0) {
			System.out.println("This number is positive");
		} else {
			System.out.println("This number is negative");
		}
		if (b < 0) {
			System.out.println("This number is negative");
		} else {
			System.out.println("This number is positive");
		}
		if (c == 0) {
			System.out.println("This number is neither positive nor negative");
		} else {
			System.out.println("This number is negative");
		}
	}

}
