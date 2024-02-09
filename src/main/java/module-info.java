module com.studies {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.studies.application to javafx.fxml;
    opens com.studies.gui to javafx.fxml;
    exports com.studies.application;
}
