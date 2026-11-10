package part1.exercise1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

	private TextField firstField = new TextField();
	private TextField secondField = new TextField();
	private TextField resultField = new TextField();

	@Override
	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(10));

		Label title = new Label("Calculator");
		BorderPane.setAlignment(title, Pos.CENTER);
		root.setTop(title);

		resultField.setEditable(false);

		GridPane form = new GridPane();
		form.setHgap(10);
		form.setVgap(8);
		form.setPadding(new Insets(10, 0, 10, 0));
		form.addRow(0, new Label("First Number"), firstField);
		form.addRow(1, new Label("Second Number"), secondField);
		form.addRow(2, new Label("Result"), resultField);
		root.setCenter(form);

		Button addBtn = new Button("+");
		Button subBtn = new Button("-");
		Button mulBtn = new Button("*");
		Button divBtn = new Button("/");
		Button clearBtn = new Button("C");

		addBtn.setOnAction(e -> calculate('+'));
		subBtn.setOnAction(e -> calculate('-'));
		mulBtn.setOnAction(e -> calculate('*'));
		divBtn.setOnAction(e -> calculate('/'));
		clearBtn.setOnAction(e -> {
			firstField.clear();
			secondField.clear();
			resultField.clear();
		});

		HBox buttons = new HBox(10, addBtn, subBtn, mulBtn, divBtn, clearBtn);
		for (int i = 0; i < buttons.getChildren().size(); i++)
			((Button) buttons.getChildren().get(i)).setPrefWidth(50);
		buttons.setAlignment(Pos.CENTER);
		root.setBottom(buttons);

		primaryStage.setTitle("Calculator App");
		primaryStage.setScene(new Scene(root, 300, 200));
		primaryStage.show();
	}

	private void calculate(char operator) {
		double first;
		double second;
		try {
			first = Double.parseDouble(firstField.getText());
			second = Double.parseDouble(secondField.getText());
		} catch (NumberFormatException ex) {
			resultField.setText("Invalid input");
			return;
		}

		double result;
		switch (operator) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		default:
			if (second == 0) {
				resultField.setText("Cannot divide by 0");
				return;
			}
			result = first / second;
		}
		resultField.setText(String.valueOf(result));
	}

	public static void main(String[] args) {
		launch(args);
	}
}
