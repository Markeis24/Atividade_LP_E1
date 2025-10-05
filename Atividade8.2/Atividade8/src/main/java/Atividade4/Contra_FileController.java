package Atividade4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import utils.EscritaCSV;

public class Contra_FileController {

    @FXML private Button btn_enviarAcougueiro;
    @FXML private Button btn_enviarPersonagem;
    @FXML private Button btn_enviarTelefone;

    @FXML private TextField txt_nomeAcougueiro;
    @FXML private TextField txt_tipoCarneAcougeuiro;

    @FXML private TextField txt_nomePersonagem;
    @FXML private TextField txt_tempoRestantePersonagem;

    @FXML private TextField txt_tipoTelefone;
    @FXML private TextField txt_corTelefone;

    @FXML private ToggleGroup cortando;
    @FXML private ToggleGroup fuga;
    @FXML private ToggleGroup conectado;

    // CSV utility
    private final EscritaCSV csv = new EscritaCSV();

    // ----------------- AÇOUGUEIRO -----------------
    @FXML
    void enviarAcougueiroCsv(ActionEvent event) {
        if (txt_nomeAcougueiro.getText().isEmpty() || txt_tipoCarneAcougeuiro.getText().isEmpty()) {
            System.out.println("Preencha todos os campos do Açougueiro!");
            return;
        }

        RadioButton selecionado = (RadioButton) cortando.getSelectedToggle();
        boolean cortandoValor = selecionado != null && selecionado.getText().equalsIgnoreCase("Sim");
        String cortandoStr = cortandoValor ? "Sim" : "Não";

        Acougueiro acougueiro = new Acougueiro(txt_nomeAcougueiro.getText(), txt_tipoCarneAcougeuiro.getText(), cortandoValor);

        String[] cabecalho = { "Nome", "TipoCarne", "Cortando" };
        String[][] dados = { { acougueiro.getNome(), acougueiro.getTipoCarne(), cortandoStr } };

        csv.escreverCSV("acougueiro.csv", cabecalho, dados);

        txt_nomeAcougueiro.clear();
        txt_tipoCarneAcougeuiro.clear();
        cortando.selectToggle(null);
    }

    // ----------------- PERSONAGEM -----------------
    @FXML
    void enviarPersonagemCsv(ActionEvent event) {
        if (txt_nomePersonagem.getText().isEmpty() || txt_tempoRestantePersonagem.getText().isEmpty()) {
            System.out.println("Preencha todos os campos do Personagem!");
            return;
        }

        RadioButton selecionado = (RadioButton) fuga.getSelectedToggle();
        boolean fugaValor = selecionado != null && selecionado.getText().equalsIgnoreCase("Sim");
        String fugaStr = fugaValor ? "Sim" : "Não";

        Personagem personagem = new Personagem(txt_nomePersonagem.getText(), txt_tempoRestantePersonagem.getText(), fugaValor);

        String[] cabecalho = { "Nome", "TempoRestante", "Fuga" };
        String[][] dados = { { personagem.getNome(), personagem.getTempoRestante(), fugaStr } };

        csv.escreverCSV("personagem.csv", cabecalho, dados);

        txt_nomePersonagem.clear();
        txt_tempoRestantePersonagem.clear();
        fuga.selectToggle(null);
    }

    // ----------------- TELEFONE -----------------
    @FXML
    void enviarTelefoneCsv(ActionEvent event) {
        if (txt_tipoTelefone.getText().isEmpty() || txt_corTelefone.getText().isEmpty()) {
            System.out.println("Preencha todos os campos do Telefone!");
            return;
        }

        RadioButton selecionado = (RadioButton) conectado.getSelectedToggle();
        boolean conectadoValor = selecionado != null && selecionado.getText().equalsIgnoreCase("Sim");
        String conectadoStr = conectadoValor ? "Sim" : "Não";

        Telefone telefone = new Telefone(txt_tipoTelefone.getText(), txt_corTelefone.getText(), conectadoValor);

        String[] cabecalho = { "Tipo", "Cor", "Conectado" };
        String[][] dados = { { telefone.getTipo(), telefone.getCor(), conectadoStr } };

        csv.escreverCSV("telefone.csv", cabecalho, dados);

        txt_tipoTelefone.clear();
        txt_corTelefone.clear();
        conectado.selectToggle(null);
    }
}
