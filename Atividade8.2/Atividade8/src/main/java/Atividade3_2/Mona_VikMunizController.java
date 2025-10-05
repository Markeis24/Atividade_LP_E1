package Atividade3_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import utils.EscritaCSV;

public class Mona_VikMunizController {

    @FXML private Button btn_enviarGeleia;
    @FXML private Button btn_enviarManteigaAmendoim;
    @FXML private Button btn_enviarMonaLisa;

    @FXML private TextField txt_consistenciaGeleia;
    @FXML private TextField txt_saborGeleia;
    @FXML private TextField txt_corGeleia;

    @FXML private TextField txt_cremosidadeManteigaAmendoim;
    @FXML private TextField txt_quantidadeManteigaAmendoim;
    @FXML private TextField txt_marcaManteigaAmendoim;

    @FXML private TextField txt_expressaoMonaLisa;
    @FXML private TextField txt_tecnicaMonaLisa;
    @FXML private TextField txt_artistaMonaLisa;

    // Instância do utilitário CSV
    private final EscritaCSV csv = new EscritaCSV();

    // ----------------- GELEIA -----------------
    @FXML
    void enviarGeleiaCsv(ActionEvent event) {
        if (txt_consistenciaGeleia.getText().isEmpty() || txt_saborGeleia.getText().isEmpty() || txt_corGeleia.getText().isEmpty()) {
            System.out.println("Preencha todos os campos de Geleia!");
            return;
        }

        String[] cabecalho = { "Consistencia", "Sabor", "Cor" };
        String[][] dados = { { txt_consistenciaGeleia.getText(), txt_saborGeleia.getText(), txt_corGeleia.getText() } };

        csv.escreverCSV("geleia.csv", cabecalho, dados);

        txt_consistenciaGeleia.clear();
        txt_saborGeleia.clear();
        txt_corGeleia.clear();
    }

    // ----------------- MANTEIGA DE AMENDOIM -----------------
    @FXML
    void enviarManteigaAmendoimCsv(ActionEvent event) {
        if (txt_cremosidadeManteigaAmendoim.getText().isEmpty() || txt_quantidadeManteigaAmendoim.getText().isEmpty() || txt_marcaManteigaAmendoim.getText().isEmpty()) {
            System.out.println("Preencha todos os campos de Manteiga de Amendoim!");
            return;
        }

        String[] cabecalho = { "Cremosidade", "Quantidade", "Marca" };
        String[][] dados = { { txt_cremosidadeManteigaAmendoim.getText(), txt_quantidadeManteigaAmendoim.getText(), txt_marcaManteigaAmendoim.getText() } };

        csv.escreverCSV("manteiga_amendoim.csv", cabecalho, dados);

        txt_cremosidadeManteigaAmendoim.clear();
        txt_quantidadeManteigaAmendoim.clear();
        txt_marcaManteigaAmendoim.clear();
    }

    // ----------------- MONA LISA -----------------
    @FXML
    void enviarMonaLisaCsv(ActionEvent event) {
        if (txt_expressaoMonaLisa.getText().isEmpty() || txt_tecnicaMonaLisa.getText().isEmpty() || txt_artistaMonaLisa.getText().isEmpty()) {
            System.out.println("Preencha todos os campos de Mona Lisa!");
            return;
        }

        String[] cabecalho = { "Expressao", "Tecnica", "Artista" };
        String[][] dados = { { txt_expressaoMonaLisa.getText(), txt_tecnicaMonaLisa.getText(), txt_artistaMonaLisa.getText() } };

        csv.escreverCSV("mona_lisa.csv", cabecalho, dados);

        txt_expressaoMonaLisa.clear();
        txt_tecnicaMonaLisa.clear();
        txt_artistaMonaLisa.clear();
    }

    // ----------------- MÉTODOS AUXILIARES (TextFields) -----------------
    @FXML void consistenciaGeleia(ActionEvent event) {}
    @FXML void saborGeleia(ActionEvent event) {}
    @FXML void corGeleia(ActionEvent event) {}
    @FXML void cremosidadeManteigaAmendoim(ActionEvent event) {}
    @FXML void quantidadeManteigaAmendoim(ActionEvent event) {}
    @FXML void marcaManteigaAmendoim(ActionEvent event) {}
    @FXML void expressaoMonaLisa(ActionEvent event) {}
    @FXML void tecnicaMonaLisa(ActionEvent event) {}
    @FXML void artistaMonaLisa(ActionEvent event) {}
}