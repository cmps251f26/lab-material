package exercise1;

public class NameDoWhile {
	public static void main(String args[]) {
		String name = "Ahmed";
		int count = 1;

		do {
			System.out.print(name + "\t");
			count++;
		} while (count <= 6);
		System.out.println();
	}
}
