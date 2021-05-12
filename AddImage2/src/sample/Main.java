package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane root = new BorderPane();
        Text title = new Text("Hello my people");
        title.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
        title.setFill(Color.FIREBRICK);

        Image hamburger = new Image("/sample/sea.png");
        ImageView IV = new ImageView(hamburger);

        root.setTop(title);
        root.setCenter(IV);

        primaryStage.setTitle("Image");
        primaryStage.setScene(new Scene(root, 1920, 1080));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
