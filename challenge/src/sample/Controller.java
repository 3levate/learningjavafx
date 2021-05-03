package sample;

import java.net.URL;
import java.util.Random;
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
    int whatText2;
    int whatText1 = 0;


    @FXML
    private void handleButtonAction(ActionEvent event) {
        Random random = new Random();
        whatText2 = random.nextInt(4 - 1 + 1) + 1;
        if (Integer.compare(whatText1, whatText2) != 0) {
            whatText1 = whatText2;
        }
        else {
            whatText2 = random.nextInt(4 - 1 + 1) + 1;
        }
        System.out.println(whatText1);
        System.out.println(whatText2);
        switch (whatText1) {
            case 1:
                actionTarget.setText("What is your name?");
                System.out.println("case 1");
                break;
            case 2:
                actionTarget.setText("How are you doing?");
                System.out.println("case 2");
                break;
            case 3:
                actionTarget.setText("Favourite food?");
                System.out.println("case 3");
                break;
            case 4:
                actionTarget.setText("What are you having for dinner today?");
                System.out.println("case 4");
                break;
        }
        whatText1 = whatText1;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}