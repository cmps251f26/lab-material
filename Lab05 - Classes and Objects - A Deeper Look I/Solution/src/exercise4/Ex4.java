package exercise4;

import javax.swing.JOptionPane;

public class Ex4 {
	public static void main(String[] args) {
		int n1, n2, sum, product, response;
		String firstNumber, secondNumber;

		do {
			firstNumber = JOptionPane.showInputDialog("Enter first integer");
			secondNumber = JOptionPane.showInputDialog("Enter second integer");

			n1 = Integer.parseInt(firstNumber);
			n2 = Integer.parseInt(secondNumber);
			sum = n1 + n2;
			product = n1 * n2;

			JOptionPane.showMessageDialog(null, "Sum = " + sum + "\nProduct = " + product);
			response = JOptionPane.showConfirmDialog(null, "Do you want to continue?",
					"Ex4", JOptionPane.YES_NO_OPTION);
		} while (response == JOptionPane.YES_OPTION);
	}
}
