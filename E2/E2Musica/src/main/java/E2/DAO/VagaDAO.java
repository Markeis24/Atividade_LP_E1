package E2.DAO;

import E2.Database.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VagaDAO {

    public ResultSet listar() throws SQLException {
        Connection conn = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM vaga";
        return conn.createStatement().executeQuery(sql);
    }

    public void inserir(String ameaca, String carro, String dono) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO vaga (ameaca, carro, dono) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, ameaca);
            stmt.setString(2, carro);
            stmt.setString(3, dono);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(int id, String ameaca, String carro, String dono) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "UPDATE vaga SET ameaca=?, carro=?, dono=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, ameaca);
            stmt.setString(2, carro);
            stmt.setString(3, dono);
            stmt.setInt(4, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluir(int id) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "DELETE FROM vaga WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet buscarPorAmeaca(String ameaca) throws SQLException {
        Connection conn = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM vaga WHERE ameaca LIKE ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, "%" + ameaca + "%");
        return stmt.executeQuery();
    }
}
