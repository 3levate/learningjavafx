package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();

        Line seesaw = new Line(60, 340, 340, 140);
        seesaw.setStroke(Color.BLACK);
        seesaw.setStrokeWidth(15);

        Circle c = new Circle(70, 280, 40);
        c.setStroke(Color.BLUE);
        c.setFill(Color.BLUEVIOLET);
        c.setStrokeWidth(5);

        Circle sun = new Circle(-50, -50, 140);
        sun.setStrokeWidth(5);
        sun.setFill(Color.LIGHTYELLOW);
        sun.setStroke(Color.YELLOW);

        Rectangle r = new Rectangle(240, 90, 80, 70);
        r.setStroke(Color.GREEN);
        r.setFill(Color.TAN);
        r.setStrokeWidth(5);

        Line one = new Line(200, 140, 160, 340);
        one.setStrokeWidth(5);

        Line two = new Line(200, 140, 240, 340);
        two.setStrokeWidth(5);

        root.getChildren().addAll(seesaw, c, r, one, two, sun);

        Scene scene = new Scene(root, 400, 400, Color.SKYBLUE);

        primaryStage.setTitle("Drawing");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
