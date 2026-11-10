package part1.exercise2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RestaurantApp extends Application {

	@Override
	public void start(Stage primaryStage) {
		GridPane root = new GridPane();
		root.setPadding(new Insets(20));
		root.setHgap(25);
		root.setVgap(25);

		TextField costTextField = new TextField();
		ComboBox<ServiceQuality> serviceQualityCBox = new ComboBox<ServiceQuality>();
		serviceQualityCBox.getItems().addAll(ServiceQuality.values());
		serviceQualityCBox.getSelectionModel().selectFirst();

		Button calcBtn = new Button("Calculate Total Cost");
		calcBtn.setMaxWidth(Double.MAX_VALUE);

		Label tipLabel = new Label();
		Label totalLabel = new Label();

		root.addRow(0, new Label("Bill Amount"), costTextField);
		root.addRow(1, new Label("Service Quality"), serviceQualityCBox);
		root.add(calcBtn, 0, 2, 2, 1); // column 0, row 2, spanning 2 columns
		root.addRow(3, new Label("Tip"), tipLabel);
		root.addRow(4, new Label("Total Cost"), totalLabel);

		// The lab's version calls root.addColumn() on every click, which keeps adding
		// new labels under the old ones. Updating two existing labels avoids that.
		calcBtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				double billAmount;
				try {
					billAmount = Double.parseDouble(costTextField.getText());
				} catch (NumberFormatException ex) {
					tipLabel.setText("Enter a number");
					totalLabel.setText("");
					return;
				}
				ServiceQuality serviceQuality = serviceQualityCBox.getSelectionModel().getSelectedItem();
				double tip = billAmount * serviceQuality.getTip();
				tipLabel.setText(String.format("%7.2f", tip));
				totalLabel.setText(String.format("%7.2f", billAmount + tip));
			}
		});

		primaryStage.setTitle("Restaurant App");
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
