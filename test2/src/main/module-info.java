module test2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;

    opens test2 to javafx.fxml;
    exports test2;
}