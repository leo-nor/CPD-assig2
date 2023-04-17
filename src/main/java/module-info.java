module com.example.cpdassign2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    exports com.example.cpdassign2;
    opens com.example.cpdassign2 to javafx.fxml;
    exports com.example.cpdassign2.user;
    opens com.example.cpdassign2.user to javafx.fxml;
}