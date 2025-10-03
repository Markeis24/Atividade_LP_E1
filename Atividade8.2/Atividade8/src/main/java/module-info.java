module org.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens Atividade2 to javafx.fxml;
    opens Atividade3 to javafx.fxml;
    opens Atividade3_2 to javafx.fxml;
    opens Atividade4 to javafx.fxml;

    exports Atividade2;
    exports Atividade3;
    exports Atividade3_2;
    exports Atividade4;
}
