package E2.DAO;

import E2.Database.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CervejaDAO {

    public ResultSet listar() throws SQLException {
        Connection conn = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM cerveja";
        return conn.createStatement().executeQuery(sql);
    }

    public void inserir(int quantidade, double temperatura, String marca) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO cerveja (quantidade, temperatura, marca) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, quantidade);
            stmt.setDouble(2, temperatura);
            stmt.setString(3, marca);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(int id, int quantidade, double temperatura, String marca) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "UPDATE cerveja SET quantidade=?, temperatura=?, marca=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, quantidade);
            stmt.setDouble(2, temperatura);
            stmt.setString(3, marca);
            stmt.setInt(4, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluir(int id) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "DELETE FROM cerveja WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet buscarPorMarca(String marca) throws SQLException {
        Connection conn = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM cerveja WHERE marca LIKE ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, "%" + marca + "%");
        return stmt.executeQuery();
    }
}
