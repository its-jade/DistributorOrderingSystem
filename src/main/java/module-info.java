module com.example.distributororderingsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.distributororderingsystem to javafx.fxml;
    exports com.example.distributororderingsystem;
}