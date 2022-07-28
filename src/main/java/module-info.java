module com.java.simple_game_oop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.java.simple_game_oop to javafx.fxml;
    exports com.java.simple_game_oop;
}