module com.example.aprendendo_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aprendendo_fx to javafx.fxml;
    exports com.example.aprendendo_fx;
}