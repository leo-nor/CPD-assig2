module com.example.cpd2assign {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.cpdassign2 to javafx.fxml;
    exports com.example.cpdassign2;
    exports com.example.cpdassign2.frontend;
    opens com.example.cpdassign2.frontend to javafx.fxml;
}