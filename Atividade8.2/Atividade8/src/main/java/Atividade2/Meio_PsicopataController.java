package Atividade2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import utils.EscritaCSV; // Certifique-se de ter a classe utilitária para escrever CSV

public class Meio_PsicopataController {

    @FXML private Button btnVaga;
    @FXML private Button btn_enviarCerveja;
    @FXML private Button btn_enviarConfusao;

    @FXML private TextField txt_ameacaVaga;
    @FXML private TextField txt_carroVaga;
    @FXML private TextField txt_donoVaga;

    @FXML private TextField txt_brigaConfusao;
    @FXML private TextField txt_motivoConfusao;
    @FXML private TextField txt_lugarConfusao;

    @FXML private TextField txt_quantidadeCerveja;
    @FXML private TextField txt_temperaturaCerveja;
    @FXML private TextField txt_marcaCerveja;

    // Instância do utilitário CSV
    private final EscritaCSV csv = new EscritaCSV();

    // ----------------- CERVEJA -----------------
    @FXML
    void enviarRespostaCerveja(ActionEvent event) {
        if (txt_quantidadeCerveja.getText().isEmpty() || txt_temperaturaCerveja.getText().isEmpty() || txt_marcaCerveja.getText().isEmpty()) {
            System.out.println("Preencha todos os campos de Cerveja!");
            return;
        }

        String[] cabecalho = { "Quantidade", "Temperatura", "Marca" };
        String[][] dados = { { txt_quantidadeCerveja.getText(), txt_temperaturaCerveja.getText(), txt_marcaCerveja.getText() } };

        csv.escreverCSV("Cerveja.csv", cabecalho, dados);

        txt_quantidadeCerveja.clear();
        txt_temperaturaCerveja.clear();
        txt_marcaCerveja.clear();
    }

    // ----------------- CONFUSÃO -----------------
    @FXML
    void enviarConfusaoCsv(ActionEvent event) {
        if (txt_brigaConfusao.getText().isEmpty() || txt_motivoConfusao.getText().isEmpty() || txt_lugarConfusao.getText().isEmpty()) {
            System.out.println("Preencha todos os campos de Confusão!");
            return;
        }

        String[] cabecalho = { "Briga", "Motivo", "Lugar" };
        String[][] dados = { { txt_brigaConfusao.getText(), txt_motivoConfusao.getText(), txt_lugarConfusao.getText() } };

        csv.escreverCSV("Confusao.csv", cabecalho, dados);

        txt_brigaConfusao.clear();
        txt_motivoConfusao.clear();
        txt_lugarConfusao.clear();
    }

    // ----------------- VAGA -----------------
    @FXML
    void enviarCsvVaga(ActionEvent event) {
        if (txt_ameacaVaga.getText().isEmpty() || txt_carroVaga.getText().isEmpty() || txt_donoVaga.getText().isEmpty()) {
            System.out.println("Preencha todos os campos da Vaga!");
            return;
        }

        String[] cabecalho = { "Ameaca", "Carro", "Dono" };
        String[][] dados = { { txt_ameacaVaga.getText(), txt_carroVaga.getText(), txt_donoVaga.getText() } };

        csv.escreverCSV("Vaga.csv", cabecalho, dados);

        txt_ameacaVaga.clear();
        txt_carroVaga.clear();
        txt_donoVaga.clear();
    }
}