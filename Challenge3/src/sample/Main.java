package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.w3c.dom.Text;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400, 400, Color.WHITE);
        Text midtext = new Text();
        MenuBar menuBar = new MenuBar();
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        root.setTop(menuBar);

        Menu theme = new Menu("Theme");
        theme.getItems().addAll(
                new MenuItem("Dark"),
                new MenuItem("Light"),
                new MenuItem("Contrast"));
        Menu file = new Menu("File");
        file.getItems().addAll(
                new MenuItem("Save"),
                new MenuItem("New"),
                new MenuItem("Export"));

        VBox tips = new VBox();
        root.setLeft(tips);
        Button tip1 = new Button("Tip One");
        tip1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });
        Button tip2 = new Button("Tip Two");
        Button tip3 = new Button("Tip Three");
        tips.getChildren().addAll(tip1, tip2, tip3);

        menuBar.getMenus().addAll(theme, file);

        primaryStage.setTitle("Challenge 3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
