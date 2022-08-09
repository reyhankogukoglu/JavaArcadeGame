module com.example.arcadegamenew {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.arcadegamenew to javafx.fxml;
    exports com.example.arcadegamenew;
}