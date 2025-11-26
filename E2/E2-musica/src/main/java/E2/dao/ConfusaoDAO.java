package E2.dao;

import utils.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ConfusaoDAO {
    public void inserir(String briga, String motivo, String lugar) {
        String sql = "INSERT INTO confusao (briga, motivo, lugar) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, briga);
            stmt.setString(2, motivo);
            stmt.setString(3, lugar);
            stmt.executeUpdate();
            System.out.println("Confusão cadastrada!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar confusão: " + e.getMessage());
        }
    }
}
