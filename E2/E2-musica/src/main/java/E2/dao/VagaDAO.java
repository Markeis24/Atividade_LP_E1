package E2.dao;

import utils.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class VagaDAO {
    public void inserir(String ameaca, String carro, String dono) {
        String sql = "INSERT INTO vaga (ameaca, carro, dono) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, ameaca);
            stmt.setString(2, carro);
            stmt.setString(3, dono);
            stmt.executeUpdate();
            System.out.println("Vaga cadastrada!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar vaga: " + e.getMessage());
        }
    }
}
