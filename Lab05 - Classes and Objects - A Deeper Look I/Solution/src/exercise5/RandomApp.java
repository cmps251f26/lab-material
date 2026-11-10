package exercise5;

import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class RandomApp {
	private SecureRandom random = new SecureRandom();

	public int generateRandom() {
		// nextInt(9) gives 0..8, so adding 2 gives 2..10
		return 2 + random.nextInt(9);
	}

	public boolean generateQuestion() {
		int a = generateRandom();
		int b = generateRandom();

		String input = JOptionPane.showInputDialog(null, "How much is " + a + " times " + b + "?");
		if (input == null) {
			return false; // user pressed Cancel
		}

		int answer = Integer.parseInt(input.trim());
		return answer == a * b;
	}
}
