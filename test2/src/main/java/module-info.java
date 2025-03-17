module com.example.test2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.test2 to javafx.fxml;
    exports com.example.test2;
}