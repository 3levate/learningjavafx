package sample;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));

        Scene scene = new Scene(grid, 300, 275);
        Text scenetitle = new Text("Login");
        scenetitle.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
        Label username = new Label("Username");
        TextField userTextField = new TextField();
        Label password = new Label("Password");
        PasswordField passwordBox = new PasswordField();

        grid.add(scenetitle, 0, 0, 2, 1);
        grid.add(username, 0, 1);
        grid.add(userTextField, 1, 1);
        grid.add(password, 0, 2);
        grid.add(passwordBox, 1, 2);

        grid.setGridLinesVisible(false);

        Button button = new Button("Sign in");
        HBox hbButton = new HBox(10);
        hbButton.setAlignment(Pos.BOTTOM_RIGHT);
        hbButton.getChildren().add(button);
        grid.add(hbButton, 1, 4);

        final Text actionTarget = new Text();
        grid.add(actionTarget, 1, 6);

        button.setOnAction(event ->
        {
            actionTarget.setFill(Color.FIREBRICK);
            actionTarget.setText("Sign in pressed");
        });
        scene.getStylesheets().add(Main.class.getResource("Login.css").toExternalForm());
        primaryStage.setTitle("JavaFX login form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
        //goo.gl/1rkzka
    }
}
