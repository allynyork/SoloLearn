public class ForLoopPractice {
	public static void main(String[] args) {
		/* for (initialization; condition; increment/decrement) {
			statement(s)
		}
		*/
		for (int x = 1; x <= 5; x++) {
			System.out.println(x);
			System.out.println("counting up");
		}

		// mucking about
		for (int i = 10; i >= 0; i = i-2) {
			System.out.println(i);
			System.out.println("counting down by 2s");
		}

		for (int y = 2; y < 10; y = y*y) {
			System.out.println(y);
		}
	}
}