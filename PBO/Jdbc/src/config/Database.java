package config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Connection connection;
    public static Connection DBConnection() {
        String dbUrl = "jdbc:mysql://localhost:3308/db_praktikum";
        String user = "root";
        String password = "";
        
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = (Connection) DriverManager.getConnection(dbUrl, user, password);
        }catch (SQLException exc) {
            System.out.println("Koneksi Eror : " + exc.getMessage());
        }
        return connection;
    }
    
    public static void closeConnection() {
        try {
            connection.close();
        }catch (SQLException exc) {
            System.out.println("FAILDE TO CLOSE DATABASE CONNECTIN : " + exc.getMessage());
        }
    }
}
