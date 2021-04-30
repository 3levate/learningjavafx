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
    private void handleButtonAction(ActionEvent event) {
        actionTarget.setText("asopjdfa;oifgo;adghiopardsjgkl;aejgko;lsdjg");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}