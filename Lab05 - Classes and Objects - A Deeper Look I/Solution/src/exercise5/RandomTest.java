package exercise5;

import javax.swing.JOptionPane;

public class RandomTest {
	public static void main(String[] args) {
		RandomApp app = new RandomApp();
		int choice;

		do {
			if (app.generateQuestion()) {
				JOptionPane.showMessageDialog(null, "Well done. Correct answer");
			} else {
				JOptionPane.showMessageDialog(null, "Sorry. Try again.");
			}
			choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?",
					"RandomApp", JOptionPane.YES_NO_OPTION);
		} while (choice == JOptionPane.YES_OPTION);
	}
}
