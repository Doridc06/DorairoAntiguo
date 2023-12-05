module application {
    requires javafx.controls;
    requires javafx.fxml;

    opens application to javafx.fxml;
    exports application to javafx.graphics;
    opens controller to javafx.fxml;
}
