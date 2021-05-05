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

        int[] randRectX = new int[6];
        int[] randRectY = new int[6];

        int[] randCirX = new int[6];
        int[] randCirY = new int[6];

        for(int i = 0; i < randRectX.length; i++) {
            randRectX[i] = (int)(Math.random()*400 + 1);
            randRectY[i] = (int)(Math.random()*400 + 1);
            randCirX[i] = (int)(Math.random()*400 + 1);
            randCirY[i] = (int)(Math.random()*400 + 1);
            System.out.println(randRectX[i]);
            System.out.println(randRectY[i]);
        }

        Rectangle r = new Rectangle(randRectX[5], randRectY[5], 80, 70);
        r.setStroke(Color.GREEN);
        r.setFill(Color.TAN);
        r.setStrokeWidth(5);

        Rectangle r2 = new Rectangle(randRectX[1], randRectY[1], 80, 70);
        r2.setStroke(Color.GREEN);
        r2.setFill(Color.TAN);
        r2.setStrokeWidth(5);

        Rectangle r3 = new Rectangle(randRectX[2], randRectY[2], 80, 70);
        r3.setStroke(Color.GREEN);
        r3.setFill(Color.TAN);
        r3.setStrokeWidth(5);

        Rectangle r4 = new Rectangle(randRectX[3], randRectY[3], 80, 70);
        r4.setStroke(Color.GREEN);
        r4.setFill(Color.TAN);
        r4.setStrokeWidth(5);

        Rectangle r5 = new Rectangle(randRectX[4], randRectY[4], 80, 70);
        r5.setStroke(Color.GREEN);
        r5.setFill(Color.TAN);
        r5.setStrokeWidth(5);

        Circle c = new Circle(randCirX[5], randCirY[5], 40);
        c.setStroke(Color.BLUE);
        c.setFill(Color.BLUEVIOLET);
        c.setStrokeWidth(5);

        Circle c2 = new Circle(randCirX[1], randCirY[1], 40);
        c2.setStroke(Color.BLUE);
        c2.setFill(Color.BLUEVIOLET);
        c2.setStrokeWidth(5);

        Circle c3 = new Circle(randCirX[2], randCirY[2], 40);
        c3.setStroke(Color.BLUE);
        c3.setFill(Color.BLUEVIOLET);
        c3.setStrokeWidth(5);

        Circle c4 = new Circle(randCirX[3], randCirY[3], 40);
        c4.setStroke(Color.BLUE);
        c4.setFill(Color.BLUEVIOLET);
        c4.setStrokeWidth(5);

        Circle c5 = new Circle(randCirX[4], randCirY[4], 40);
        c5.setStroke(Color.BLUE);
        c5.setFill(Color.BLUEVIOLET);
        c5.setStrokeWidth(5);

        root.getChildren().addAll(r, r2, r3, r4, c, c2, c3, c4, c5);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
