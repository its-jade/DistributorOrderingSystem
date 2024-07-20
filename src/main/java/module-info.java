module com.example.distributororderingsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.desktop;
    requires com.fasterxml.jackson.databind;

    opens com.example.distributororderingsystem to javafx.fxml;
    exports com.example.distributororderingsystem;
}