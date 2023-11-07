package sr.bitdynamics.personalinfodb.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private static final String url = "jdbc:mysql://localhost:3306/PersonalInfoDB";
    private static final String username = "root";
    private static final String password = "";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to connect to the database.", e);
        }
    }

    public static void closeConnection (Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
