module com.example.reisedauerzummond {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.reisedauerzummond to javafx.fxml;
    exports com.example.reisedauerzummond;
}