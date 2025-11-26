module E2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens E2 to javafx.fxml;
    exports E2;
}
