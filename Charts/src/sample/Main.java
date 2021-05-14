package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        ObservableList<PieChart.Data> pieData = FXCollections.observableArrayList(
                new PieChart.Data("Rent", 1000),
                new PieChart.Data("Food", 250),
                new PieChart.Data("Wants", 100),
                new PieChart.Data("Electricity", 50),
                new PieChart.Data("Wifi", 100));

        PieChart budget = new PieChart(pieData);
        budget.setTitle("Monthly Expenses");

        FlowPane root = new FlowPane();
        root.getChildren().add(budget);

        primaryStage.setTitle("Monthly Budget");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
