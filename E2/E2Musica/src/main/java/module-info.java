module E2Musica {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens E2.Controller to javafx.fxml;
    opens E2.APP to javafx.fxml;
    opens E2.Database to javafx.fxml;
    opens E2.DAO to javafx.fxml;

    exports E2.Controller;
    exports E2.APP;
    exports E2.Database;
    exports E2.DAO;
}
