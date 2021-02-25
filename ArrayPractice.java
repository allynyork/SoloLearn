public class ArrayPractice {
	public static void main(String [] args) {
		String[] myNames = {"A", "B", "C", "D"};
		System.out.println(myNames[2]);

		// initialize an array with a length of 5
		int[] intArr = new int[5];
		// print length of array
		System.out.println(intArr.length);

		// use a For loop to get a sum of all the elements in an array
		int[] myArr = {6, 42, 3, 7};
		int sum = 0;
		// we're going to iterate through each element of the array by setting our For condition to be less than the array length
		for(int x = 0; x < myArr.length; x++) {
			// each time through the loop we add the next element of the array to the growing total
			sum += myArr[x];
		}
		System.out.println(sum);
		
	}
}