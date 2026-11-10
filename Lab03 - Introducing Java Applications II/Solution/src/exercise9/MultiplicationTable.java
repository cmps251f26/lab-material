package exercise9;

public class MultiplicationTable {
	public static void main(String[] args) {
		for (int i = 0; i <= 12; i++)
			for (int j = 0; j <= 12; j++)
				System.out.println(i + " X " + j + " = " + (i * j));
	}
}
