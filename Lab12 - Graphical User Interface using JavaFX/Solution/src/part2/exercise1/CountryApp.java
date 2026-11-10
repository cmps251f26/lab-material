package part2.exercise1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CountryApp extends Application {

	@Override
	public void start(Stage primaryStage) {
		TableView<Country> root = new TableView<>();

		TableColumn<Country, String> codeColumn = new TableColumn<>("Code");
		codeColumn.setCellValueFactory(new PropertyValueFactory<>("code"));
		TableColumn<Country, String> nameColumn = new TableColumn<>("Name");
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		TableColumn<Country, String> capitalColumn = new TableColumn<>("Capital");
		capitalColumn.setCellValueFactory(new PropertyValueFactory<>("capital"));
		TableColumn<Country, String> continentColumn = new TableColumn<>("Continent");
		continentColumn.setCellValueFactory(new PropertyValueFactory<>("continent"));
		TableColumn<Country, String> regionColumn = new TableColumn<>("Region");
		regionColumn.setCellValueFactory(new PropertyValueFactory<>("region"));
		TableColumn<Country, Long> populationColumn = new TableColumn<>("Population");
		populationColumn.setCellValueFactory(new PropertyValueFactory<>("population"));
		TableColumn<Country, Double> areaColumn = new TableColumn<>("Area");
		areaColumn.setCellValueFactory(new PropertyValueFactory<>("area"));

		root.getColumns().addAll(codeColumn, nameColumn, capitalColumn, continentColumn,
				regionColumn, populationColumn, areaColumn);

		CountryRepository.loadCountries();
		ObservableList<Country> data = FXCollections.observableList(CountryRepository.countries);
		root.setItems(data);

		ComboBox<String> continentComboBox = new ComboBox<>();
		ObservableList<String> continentData = FXCollections.observableList(CountryRepository.getContinents());
		continentComboBox.setItems(continentData);
		continentComboBox.setPrefWidth(200);

		ComboBox<String> regionComboBox = new ComboBox<>();
		regionComboBox.setPrefWidth(200);

		continentComboBox.setOnAction(e -> {
			String selectedContinent = continentComboBox.getSelectionModel().getSelectedItem();
			regionComboBox.setItems(FXCollections.observableList(CountryRepository.getRegions(selectedContinent)));
		});

		regionComboBox.setOnAction(e -> {
			String selectedRegion = regionComboBox.getSelectionModel().getSelectedItem();
			// changing the continent empties the region list, which fires this with null
			if (selectedRegion != null)
				root.setItems(FXCollections.observableList(CountryRepository.getCountriesByRegion(selectedRegion)));
		});

		HBox hBox = new HBox();
		hBox.getChildren().addAll(new Label("Continent"), continentComboBox,
				new Label("Region"), regionComboBox);
		hBox.setSpacing(50);
		hBox.setPadding(new Insets(5));

		Scene scene = new Scene(new VBox(hBox, root), 800, 400);
		primaryStage.setTitle("Country App");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
