public class EnhancedForLoopPractice {
	public static void main(String[] args) {
		// the Enhanced For Loop
		// declare and initialize array
		int[] primes = {2, 3, 5, 7};
		// also known as the For Each loop
		// this iterates over each element of the array
		for (int t: primes) {
			// and this prints out each element in turn
			System.out.println(t);
		}

		// lets try another
		// write a part that receives a list of square sides and print for user the areas of those squares

		// each element of the array is the length of one side of a particular square
		int[] squares = {6, 5, 17, 40};
		// iterate!
		for (int s: squares) {
			int area = s * s;
			for (int i = 1; i < squares.length; i++) {
				
			}
		System.out.println("the area of square " + i + " is " + area );	
		}
		
	}
}