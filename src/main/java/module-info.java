module com.example.aprendendo_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens basico to javafx.fxml;
    exports basico;
}