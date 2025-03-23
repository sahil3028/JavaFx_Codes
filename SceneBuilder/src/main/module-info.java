module uiBasic {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens uiBasic to javafx.fxml;
    exports uiBasic;
}