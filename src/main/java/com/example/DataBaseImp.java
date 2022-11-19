package com.example;

import java.sql.Connection;

public class DataBaseImp {
    public static void main(String[] args) {
        DatabaseOperations databaseOperations = new DatabaseOperations();

        Connection connection = databaseOperations.getDbConnection();
        if (connection != null){
            System.out.println("Connection Established");
        } else {
            System.out.println("Connection Failed");
        }
    }
}
