package part1.exercise3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {

	private TextField display = new TextField();

	private String firstNumber = "";
	private String secondNumber = "";
	private String operator = "";
	private boolean showingResult = false;

	@Override
	public void start(Stage primaryStage) {
		display.setEditable(false);
		display.setAlignment(Pos.CENTER);

		String[][] labels = {
				{ "7", "8", "9", "/" },
				{ "4", "5", "6", "*" },
				{ "1", "2", "3", "-" },
				{ "0", "C", "=", "+" } };

		GridPane keys = new GridPane();
		keys.setHgap(15);
		keys.setVgap(15);
		keys.setPadding(new Insets(30));
		keys.setAlignment(Pos.CENTER);

		for (int row = 0; row < labels.length; row++) {
			for (int col = 0; col < labels[row].length; col++) {
				String text = labels[row][col];
				Button button = new Button(text);
				button.setPrefSize(60, 60);
				button.setOnAction(e -> handleKey(text));
				keys.add(button, col, row);
			}
		}

		BorderPane root = new BorderPane();
		root.setTop(display);
		root.setCenter(keys);

		primaryStage.setTitle("Simple Calculator");
		primaryStage.setScene(new Scene(root, 330, 360));
		primaryStage.show();
	}

	private void handleKey(String key) {
		if (key.equals("C")) {
			clear();
		} else if (key.equals("=")) {
			if (!operator.isEmpty() && !secondNumber.isEmpty())
				showResult();
		} else if (Character.isDigit(key.charAt(0))) {
			if (showingResult)
				clear();
			if (operator.isEmpty())
				firstNumber += key;
			else
				secondNumber += key;
		} else if (!firstNumber.isEmpty() && secondNumber.isEmpty()) {
			// an operator key; pressing another one before the second number just replaces it
			if (showingResult)
				showingResult = false;
			operator = key;
		}

		if (!showingResult)
			display.setText((firstNumber + " " + operator + " " + secondNumber).trim());
	}

	private void showResult() {
		double a = Double.parseDouble(firstNumber);
		double b = Double.parseDouble(secondNumber);
		String expression = firstNumber + " " + operator + " " + secondNumber;

		if (operator.equals("/") && b == 0) {
			display.setText("Cannot divide by 0");
			firstNumber = "";
		} else {
			double result = calculate(a, b, operator);
			display.setText(expression + " = " + format(result));
			// keep the result so the user can continue, e.g. "= 40" then "* 2"
			firstNumber = format(result);
		}
		secondNumber = "";
		operator = "";
		showingResult = true;
	}

	private double calculate(double a, double b, String op) {
		switch (op) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		default:
			return a / b;
		}
	}

	// show 40 instead of 40.0, but keep decimals when there are any
	private String format(double value) {
		if (value == (long) value)
			return String.valueOf((long) value);
		return String.valueOf(value);
	}

	private void clear() {
		firstNumber = "";
		secondNumber = "";
		operator = "";
		showingResult = false;
		display.clear();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
