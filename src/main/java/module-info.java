module com.studies {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.studies.application to javafx.fxml;
    exports com.studies.application;
}
