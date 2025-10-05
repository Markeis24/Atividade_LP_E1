package Atividade3_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class App3 extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Verifica se o arquivo FXML está sendo encontrado no classpath
        URL fxmlPath = getClass().getResource("/Atividade3_2/fxml/Mona_VikMuniz.fxml");
        System.out.println("🔎 Caminho encontrado: " + fxmlPath);

        // Se não encontrou, lança um erro mais claro
        if (fxmlPath == null) {
            throw new IOException("❌ Arquivo FXML não encontrado! Verifique se está em 'resources/Atividade3/fxml/Che_VikMunizController.fxml'");
        }

        // Carrega o FXML
        FXMLLoader fxmlLoader = new FXMLLoader(fxmlPath);
        Parent root = fxmlLoader.load();

        // Cria a cena
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Tela Mona Che VikMuniz");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
