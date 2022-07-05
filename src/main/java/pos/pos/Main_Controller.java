package pos.pos;


import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class Main_Controller implements Initializable {

 @FXML
 private ImageView Basket;

 @FXML
 private ImageView Report;

 @FXML
 private ImageView Scan;

 @FXML
 private ImageView Statistics;

 @FXML
 private ImageView User;

 @FXML
 private ImageView notify;

 @FXML
 private ImageView settings;
 @FXML
 private JFXButton btnScan;
 @FXML
 private BorderPane borderpane;
 @FXML
 private JFXButton BtnCatalogue;

//barcode changer************************************************************************************
 @FXML
 void Change(MouseEvent event) {
  Image image = new Image(getClass().getResourceAsStream("/pos/pos/Images/Barcode2.png"));
  Scan.setImage(image);
 }
 @FXML
 void Reset(MouseEvent event) {
  Image image = new Image(getClass().getResourceAsStream("/pos/pos/Images/Barcode.png"));
  Scan.setImage(image);
 }
 //Basket changer*******************************************************************************
 @FXML
 void Change1(MouseEvent event) {
  Image image = new Image(getClass().getResourceAsStream("/pos/pos/Images/Basket2.png"));
  Basket.setImage(image);

 }
 @FXML
 void Reset1(MouseEvent event) {
  Image image = new Image(getClass().getResourceAsStream("/pos/pos/Images/Basket.png"));
  Basket.setImage(image);
 }
 //Report Changer*******************************************************************
 @FXML
 void Change2(MouseEvent event) {
  Image image = new Image(getClass().getResourceAsStream("/pos/pos/Images/Report2.png"));
  Report.setImage(image);
 }
 @FXML
 void Reset2(MouseEvent event) {
  Image image = new Image(getClass().getResourceAsStream("/pos/pos/Images/Report.png"));
  Report.setImage(image);
 }
// User changer**********************************************************************************
@FXML
void Change3(MouseEvent event) {
 Image image = new Image(getClass().getResourceAsStream("/pos/pos/Images/User2.png"));
 User.setImage(image);
}
 @FXML
 void Reset3(MouseEvent event) {
  Image image = new Image(getClass().getResourceAsStream("/pos/pos/Images/User.png"));
  User.setImage(image);
 }
// Statistics changer******************************************************************************
@FXML
void Change4(MouseEvent event) {
 Image image = new Image(getClass().getResourceAsStream("/pos/pos/Images/Statistics2.png"));
 Statistics.setImage(image);
}
 @FXML
 void Reset4(MouseEvent event) {
  Image image = new Image(getClass().getResourceAsStream("/pos/pos/Images/Statistics.png"));
  Statistics.setImage(image);
 }
 // notify Changer********************************************************************************
 @FXML
 void Change5(MouseEvent event) {
  Image image = new Image(getClass().getResourceAsStream("/pos/pos/Images/Notify2.png"));
  notify.setImage(image);
 }
 @FXML
 void Reset5(MouseEvent event) {
  Image image = new Image(getClass().getResourceAsStream("/pos/pos/Images/Notify.png"));
  notify.setImage(image);
 }
 // Settings Changer***************************************************************************
 @FXML
 void Change6(MouseEvent event) {
  Image image = new Image(getClass().getResourceAsStream("/pos/pos/Images/Settings2.png"));
  settings.setImage(image);
 }
 @FXML
 void Reset6(MouseEvent event) {
  Image image = new Image(getClass().getResourceAsStream("/pos/pos/Images/Settings.png"));
  settings.setImage(image);
 }
 @FXML
private void setBtnScan (ActionEvent event )throws IOException{
  BorderPane view = FXMLLoader.load(getClass().getResource("Scan.fxml"));
 Pane view1 = FXMLLoader.load(getClass().getResource("Side.fxml"));

  borderpane.setCenter(view);
 borderpane.setRight(view1);
 }
 @FXML
 void SetBtnCatalogue(ActionEvent event) throws IOException {
  BorderPane view = FXMLLoader.load(getClass().getResource("Catalogue.fxml"));
  borderpane.setCenter(view);

 }


 @Override
    public void initialize (URL url , ResourceBundle rb ){






 }


}