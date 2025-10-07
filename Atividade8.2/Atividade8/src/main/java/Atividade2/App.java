package Atividade2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Caminho correto para o FXML dentro de resources/Atividade2/fxml
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Atividade2/fxml/Meio_Psicopata.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root, 600, 400); // ajuste o tamanho da janela
        stage.setTitle("Tela Meio Psicopata");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}