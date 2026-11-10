package exercise4;

public class Experiment1 {
	public static void main(String args[]) {
		int counter = 10;
		for (int i = 0; i <= 4; i++) {
			counter = counter + i; // put the breakpoint here and watch i and counter
		}
		System.out.println("Counter = " + counter);
	}
}
