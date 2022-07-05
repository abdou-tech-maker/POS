module pos.pos {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;


    opens pos.pos to javafx.fxml;
    exports pos.pos;
}