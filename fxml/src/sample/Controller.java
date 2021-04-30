package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class Controller implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Text actionTarget;


    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {
        actionTarget.setText("Sign in button was pressed");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}