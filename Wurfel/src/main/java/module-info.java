module com.example.wurfel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wurfel to javafx.fxml;
    exports com.example.wurfel;
}