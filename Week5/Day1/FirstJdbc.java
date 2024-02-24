import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class FirstJdbc {



        // JDBC URL, username, and password of MySQL server
        private static final String JDBC_URL = "jdbc:mysql://localhost/";
        private static final String USER = "root";
        private static final String PASSWORD = "pass";

        public static void main(String[] args) {
            try {
                // Register MySQL JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Open a connection
                Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

                // Execute create database query
                Statement statement = connection.createStatement();
                String sql = "CREATE DATABASE IF NOT EXISTS mydatabasetoday";
                statement.executeUpdate(sql);
                System.out.println("Database created successfully");

                // Clean-up environment
                statement.close();
                connection.close();
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

