package E2.DAO;

import E2.Database.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConfusaoDAO {

    public ResultSet listar() throws SQLException {
        Connection conn = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM confusao";
        return conn.createStatement().executeQuery(sql);
    }

    public void inserir(String briga, String motivo, String lugar) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO confusao (briga, motivo, lugar) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, briga);
            stmt.setString(2, motivo);
            stmt.setString(3, lugar);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(int id, String briga, String motivo, String lugar) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "UPDATE confusao SET briga=?, motivo=?, lugar=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, briga);
            stmt.setString(2, motivo);
            stmt.setString(3, lugar);
            stmt.setInt(4, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluir(int id) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "DELETE FROM confusao WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet buscarPorBriga(String briga) throws SQLException {
        Connection conn = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM confusao WHERE briga LIKE ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, "%" + briga + "%");
        return stmt.executeQuery();
    }
}
