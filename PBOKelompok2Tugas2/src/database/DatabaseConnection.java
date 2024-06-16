/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author yedij
 */

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/StatistikTebu2022";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database", e);
        }
    }
    public boolean verifyCredentials(String username, char[] password) {
        String query = "SELECT * FROM user WHERE username = ? AND password = ?";
        try (Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, username);
            statement.setString(2, new String(password));
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next(); // Returns true if a matching record is found
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public String getNamaPetugas(String username) {
        String namaPetugas = null;
        String query = "SELECT name FROM user WHERE username = ?";
        
        try (Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(query)) {
            
            statement.setString(1, username);
            
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    namaPetugas = resultSet.getString("name");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return namaPetugas;
    }
}

