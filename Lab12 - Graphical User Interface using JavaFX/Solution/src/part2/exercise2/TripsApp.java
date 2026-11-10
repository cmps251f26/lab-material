package part2.exercise2;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TripsApp extends Application {

	private TableView<Trip> root = new TableView<>();
	private ObservableList<Trip> tripsdata;

	@Override
	public void start(Stage primaryStage) {
		TableColumn<Trip, String> countryColumn = new TableColumn<>("Country");
		countryColumn.setCellValueFactory(new PropertyValueFactory<>("country"));
		TableColumn<Trip, String> typeColumn = new TableColumn<>("Trip Type");
		typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
		TableColumn<Trip, LocalDate> fromColumn = new TableColumn<>("From");
		fromColumn.setCellValueFactory(new PropertyValueFactory<>("from"));
		TableColumn<Trip, LocalDate> toColumn = new TableColumn<>("To");
		toColumn.setCellValueFactory(new PropertyValueFactory<>("to"));
		TableColumn<Trip, String> ratingColumn = new TableColumn<>("Rating");
		ratingColumn.setCellValueFactory(new PropertyValueFactory<>("rating"));

		root.getColumns().addAll(countryColumn, typeColumn, fromColumn, toColumn, ratingColumn);

		tripsdata = FXCollections.observableArrayList(TripRepository.getTrips());
		root.setItems(tripsdata);

		Button addBtn = new Button("Add Trip");
		Button deleteBtn = new Button("Delete Trip");
		addBtn.setMaxWidth(Double.MAX_VALUE);
		deleteBtn.setMaxWidth(Double.MAX_VALUE);
		HBox.setHgrow(addBtn, Priority.ALWAYS);
		HBox.setHgrow(deleteBtn, Priority.ALWAYS);
		HBox buttons = new HBox(20, addBtn, deleteBtn);

		addBtn.setOnAction(e -> showAddTripStage());

		deleteBtn.setOnAction(e -> {
			Trip selectedTrip = root.getSelectionModel().getSelectedItem();
			if (selectedTrip != null)
				tripsdata.remove(selectedTrip);
		});

		primaryStage.setTitle("Trips App");
		primaryStage.setScene(new Scene(new VBox(buttons, root), 400, 400));
		primaryStage.show();
	}

	private void showAddTripStage() {
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(20);
		grid.setPadding(new Insets(20));

		ComboBox<String> countryComboBox = new ComboBox<>(
				FXCollections.observableArrayList(TripRepository.getCountries()));
		ComboBox<String> ratingComboBox = new ComboBox<>(
				FXCollections.observableArrayList(TripRepository.getRatings()));
		countryComboBox.setPrefWidth(200);
		ratingComboBox.setPrefWidth(200);

		RadioButton radioButton1 = new RadioButton("Business");
		RadioButton radioButton2 = new RadioButton("Leisure");

		// a toggle group makes the two radio buttons mutually exclusive
		ToggleGroup toggleGroup = new ToggleGroup();
		radioButton1.setToggleGroup(toggleGroup);
		radioButton2.setToggleGroup(toggleGroup);

		HBox radioHBox = new HBox(10);
		radioHBox.getChildren().addAll(radioButton1, radioButton2);

		DatePicker fromDatePicker = new DatePicker();
		DatePicker toDatePicker = new DatePicker();

		Button okBtn = new Button("Ok");
		Button cancelBtn = new Button("Cancel");

		grid.addRow(0, new Label("Country"), countryComboBox);
		grid.addRow(1, new Label("Trip Type"), radioHBox);
		grid.addRow(2, new Label("From"), fromDatePicker);
		grid.addRow(3, new Label("To"), toDatePicker);
		grid.addRow(4, new Label("Rating"), ratingComboBox);
		grid.addRow(5, okBtn, cancelBtn);

		Stage stage2 = new Stage();
		stage2.setTitle("Add a Trip");
		stage2.setScene(new Scene(grid, 350, 250));
		stage2.show();

		okBtn.setOnAction(e -> {
			String country = countryComboBox.getSelectionModel().getSelectedItem();
			LocalDate from = fromDatePicker.getValue();
			LocalDate to = toDatePicker.getValue();
			String rating = ratingComboBox.getSelectionModel().getSelectedItem();

			// without this check, a missing field throws a NullPointerException on getText()
			if (country == null || toggleGroup.getSelectedToggle() == null
					|| from == null || to == null || rating == null) {
				new Alert(Alert.AlertType.WARNING, "Please fill in all the fields.").showAndWait();
				return;
			}
			if (to.isBefore(from)) {
				new Alert(Alert.AlertType.WARNING, "The 'To' date is before the 'From' date.").showAndWait();
				return;
			}

			String type = ((RadioButton) toggleGroup.getSelectedToggle()).getText();
			Trip t = new Trip(country, type, from, to, rating);
			tripsdata.add(t);
			stage2.close();
		});

		cancelBtn.setOnAction(e -> stage2.close());
	}

	public static void main(String[] args) {
		launch(args);
	}
}
