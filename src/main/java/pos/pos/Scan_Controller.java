package pos.pos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Scan_Controller implements Initializable {

    @FXML
    private ComboBox comb;
    @FXML
    private BorderPane borderpane;
    @FXML
    void SetContent(ActionEvent event) throws IOException {


            int selectedIndex = comb.getSelectionModel().getSelectedIndex();
        if (selectedIndex == 1){
            BorderPane view = FXMLLoader.load(getClass().getResource("Scan_Content.fxml"));
            borderpane.setCenter(view);
        } else if (selectedIndex == 0) {
            BorderPane view = FXMLLoader.load(getClass().getResource("Select_Content.fxml"));
            borderpane.setCenter(view);
        }

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> list = FXCollections.observableArrayList("SelectMode","ScanMode");
        comb.setItems(list);
    }
}
