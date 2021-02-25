public class LoopControl {

	public static void main(String[] args) {
		// using Break in a While loop
		System.out.println("using Break in a While loop");
		int w = 1;

		while(w > 0) {
			System.out.println(w);
			if(w == 4) {
				break;
			}
			w++;
		}

		// using Continue in a For loop
		System.out.println("using Continue in a For loop");
		for(int x=10; x<=40; x=x+10) {
			if(x == 30) {
				continue;
			}
			System.out.println(x);
		}
	}
}