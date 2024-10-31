import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EmployeeGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Employee Payroll");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        // Labels
        Label nameLabel = new Label("Name:");
        Label salaryLabel = new Label("Salary:");
        Label hoursLabel = new Label("Hours:");
        Label deductionLabel = new Label("Deduction Percentage:");

        // Text fields
        TextField nameField = new TextField();
        TextField salaryField = new TextField();
        TextField hoursField = new TextField();
        TextField deductionField = new TextField();

        // Button
        Button calculateButton = new Button("Calculate");

        // Add labels and text fields to grid
        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(salaryLabel, 0, 1);
        grid.add(salaryField, 1, 1);
        grid.add(hoursLabel, 0, 2);
        grid.add(hoursField, 1, 2);
        grid.add(deductionLabel, 0, 3);
        grid.add(deductionField, 1, 3);
        grid.add(calculateButton, 1, 4);

        // Set up event handler for calculate button
        calculateButton.setOnAction(event -> {
            // Calculate payroll data here (similar to your console-based code)
            // Display results in a label or a new window
        });

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
