package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();

        Scene scene = new Scene(root, 400, 400);


        primaryStage.setTitle("Challenge 2");
        primaryStage.setScene(scene);
        primaryStage.show();

        int[] randRectX = new int[400];
        int[] randRectY = new int[400];

        for(int i = 0; i < randRectX.length; i++) {
            numbers[i] = (int)(Math.random()*400 + 1);
        }

        Rectangle r = new Rectangle(randRectX, randRectY, 80, 70);
        r.setStroke(Color.GREEN);
        r.setFill(Color.TAN);
        r.setStrokeWidth(5);

        Circle c = new Circle(70, 280, 40);
        c.setStroke(Color.BLUE);
        c.setFill(Color.BLUEVIOLET);
        c.setStrokeWidth(5);

        root.getChildren().addAll(r, c);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
