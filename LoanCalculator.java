import java.util.Scanner;

public class LoanCalculator {

	// main method
	public static void main(String[] args) {
		// take user input
		System.out.println("what is the loan amount?");
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();

		System.out.println("intitial loan amount is $" + amount);
		System.out.println("for the sake of practice we're going to just do six payments at 10% of balance each payment");
		// For loop to calculate and print payments
		for (int x = 1; x <= 6; x++) {
			// testing how many times this loops
			System.out.println("payment " + x);
			int payment = (int) (amount * .1);
			amount = amount - payment;

			System.out.println("is $" + payment);
			System.out.println("leaving a balance of $" + amount);
		}
	}
}