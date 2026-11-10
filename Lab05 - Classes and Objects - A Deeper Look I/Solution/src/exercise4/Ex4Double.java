package exercise4;

import javax.swing.JOptionPane;

// Exercise 4.2: same as Ex4 but with double values.
public class Ex4Double {
	public static void main(String[] args) {
		double n1, n2, sum, product;
		int response;
		String firstNumber, secondNumber;

		do {
			firstNumber = JOptionPane.showInputDialog("Enter first number");
			secondNumber = JOptionPane.showInputDialog("Enter second number");

			n1 = Double.parseDouble(firstNumber);
			n2 = Double.parseDouble(secondNumber);
			sum = n1 + n2;
			product = n1 * n2;

			JOptionPane.showMessageDialog(null, "Sum = " + sum + "\nProduct = " + product);
			response = JOptionPane.showConfirmDialog(null, "Do you want to continue?",
					"Ex4", JOptionPane.YES_NO_OPTION);
		} while (response == JOptionPane.YES_OPTION);
	}
}
