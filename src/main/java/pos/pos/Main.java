package pos.pos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("POS.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("POS");
        stage.setScene(scene);
        Image icon = new Image(getClass().getResourceAsStream ("/pos/pos/Images/POS.png"));
        stage.getIcons().add(icon);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}