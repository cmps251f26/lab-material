package exercise3;

public class IntNumbers {
	// Returns the number of digits in x. n was a double in the lab's version,
	// which does not compile because a double cannot be returned as an int.
	public static int digits(int x) {
		int n = 0;
		while (x != 0) {
			x = x / 10;
			n++;
		}
		return n;
	}
}
