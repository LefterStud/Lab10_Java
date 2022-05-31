module com.example.lab10_java {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.lab10_java to javafx.fxml;
    exports com.example.lab10_java;
}