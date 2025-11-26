package E2.dao;

import utils.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CervejaDAO {
    public void inserir(String quantidade, String temperatura, String marca) {
        String sql = "INSERT INTO cerveja (quantidade, temperatura, marca) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, Integer.parseInt(quantidade));
            stmt.setDouble(2, Double.parseDouble(temperatura));
            stmt.setString(3, marca);
            stmt.executeUpdate();
            System.out.println("Cerveja cadastrada!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar cerveja: " + e.getMessage());
        }
    }
}
