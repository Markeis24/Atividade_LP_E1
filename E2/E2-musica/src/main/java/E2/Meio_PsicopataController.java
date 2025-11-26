package E2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import utils.Conexao;

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

    @FXML
    void enviarRespostaCerveja(ActionEvent event) {
        if (txt_quantidadeCerveja.getText().isEmpty() ||
                txt_temperaturaCerveja.getText().isEmpty() ||
                txt_marcaCerveja.getText().isEmpty()) {
            System.out.println("Preencha todos os campos de Cerveja!");
            return;
        }

        try (Connection conn = Conexao.conectar()) {
            String sql = "INSERT INTO cerveja (quantidade, temperatura, marca) VALUES (?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, Integer.parseInt(txt_quantidadeCerveja.getText()));
                ps.setDouble(2, Double.parseDouble(txt_temperaturaCerveja.getText()));
                ps.setString(3, txt_marcaCerveja.getText());
                ps.executeUpdate();
            }

            txt_quantidadeCerveja.clear();
            txt_temperaturaCerveja.clear();
            txt_marcaCerveja.clear();
            System.out.println("Cerveja inserida com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir cerveja: " + e.getMessage());
        }
    }

    @FXML
    void enviarConfusaoCsv(ActionEvent event) {
        if (txt_brigaConfusao.getText().isEmpty() ||
                txt_motivoConfusao.getText().isEmpty() ||
                txt_lugarConfusao.getText().isEmpty()) {
            System.out.println("Preencha todos os campos de Confusão!");
            return;
        }

        try (Connection conn = Conexao.conectar()) {
            String sql = "INSERT INTO confusao (briga, motivo, lugar) VALUES (?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, txt_brigaConfusao.getText());
                ps.setString(2, txt_motivoConfusao.getText());
                ps.setString(3, txt_lugarConfusao.getText());
                ps.executeUpdate();
            }

            txt_brigaConfusao.clear();
            txt_motivoConfusao.clear();
            txt_lugarConfusao.clear();
            System.out.println("Confusão inserida com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir confusão: " + e.getMessage());
        }
    }

    @FXML
    void enviarCsvVaga(ActionEvent event) {
        if (txt_ameacaVaga.getText().isEmpty() ||
                txt_carroVaga.getText().isEmpty() ||
                txt_donoVaga.getText().isEmpty()) {
            System.out.println("Preencha todos os campos da Vaga!");
            return;
        }

        try (Connection conn = Conexao.conectar()) {
            String sql = "INSERT INTO vaga (ameaca, carro, dono) VALUES (?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, txt_ameacaVaga.getText());
                ps.setString(2, txt_carroVaga.getText());
                ps.setString(3, txt_donoVaga.getText());
                ps.executeUpdate();
            }

            txt_ameacaVaga.clear();
            txt_carroVaga.clear();
            txt_donoVaga.clear();
            System.out.println("Vaga inserida com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir vaga: " + e.getMessage());
        }
    }

    public void buscar(ActionEvent actionEvent) {
    }
}
