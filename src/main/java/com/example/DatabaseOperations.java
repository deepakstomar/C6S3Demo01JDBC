package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseOperations {
    // TODO: create method for getting connection
    // TODO: Define method for creating table

    // connection
    public Connection getDbConnection() {
        Connection connection = null;
        try {
            // Register driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/salesdata";
            String user = "root";
            String password = "root@123";
            // Get the connection using DriverManager
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
