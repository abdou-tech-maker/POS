package pos.pos;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Side_Controller implements Initializable {
    @FXML
    private JFXCheckBox checkbox;
    @FXML
    private JFXButton Adr_btn;
    @FXML
    void Enablize(ActionEvent e) {
        if(checkbox.isSelected())
         Adr_btn.setDisable(false) ;
        else{
            Adr_btn.setDisable(true) ;

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
