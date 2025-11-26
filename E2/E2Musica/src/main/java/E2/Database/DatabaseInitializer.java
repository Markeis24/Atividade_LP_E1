package E2.Database;

import java.sql.Connection;
import java.sql.Statement;

public class DatabaseInitializer {
    public static void init() {
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {

            String sqlCerveja = "CREATE TABLE IF NOT EXISTS cerveja (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "quantidade INT," +
                    "temperatura VARCHAR(50)," +
                    "marca VARCHAR(50))";
            stmt.execute(sqlCerveja);

            String sqlConfusao = "CREATE TABLE IF NOT EXISTS confusao (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "briga VARCHAR(100)," +
                    "motivo VARCHAR(100)," +
                    "lugar VARCHAR(100))";
            stmt.execute(sqlConfusao);

            String sqlVaga = "CREATE TABLE IF NOT EXISTS vaga (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "ameaca VARCHAR(100)," +
                    "carro VARCHAR(100)," +
                    "dono VARCHAR(100))";
            stmt.execute(sqlVaga);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
