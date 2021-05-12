package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {
    double angle = 0.0;
    @Override
    public void start(Stage primaryStage) throws Exception{

        Rotate rotate = new Rotate();
        Button btn = new Button("Rotate");
        btn.getTransforms().add(rotate);

        btn.setOnAction((ActionEvent e) -> {
            angle += 15;
            rotate.setAngle(angle);
            rotate.setPivotX(btn.getWidth()/2);
            rotate.setPivotY(btn.getHeight()/2);
        });

        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(25,25,25,25));
        root.getChildren().add(btn);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
