/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kyrab
 */
public class DatabaseManager {

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://102.120.115.69/kyrabDB";
    private static final String user = "root";
    private static final String pass = "Reddam2021";
    private PreparedStatement statement;
    private ResultSet resultSet;
    private Connection conn;

    public DatabaseManager() {
        /**
         * Note: the following was added to the pom.xml:
         * <dependencies>
         * <dependency>
         * <groupId>mysql</groupId>
         * <artifactId>mysql-connector-java</artifactId>
         * <version>8.0.25</version>
         * </dependency>
         * </dependencies>
         */
        try {
            Class.forName(driver);
            System.out.println("Driver found");
        } catch (ClassNotFoundException e) {
            System.out.println("Unable to load driver");
        }

        try {
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Database connected");
        } catch (SQLException e) {
            System.out.println("Unable to load database");
        }
    }

    //INSERT, UPDATE or DELETE
    public void update(String update) throws SQLException {
        statement = conn.prepareStatement(update);
        statement.executeUpdate();
        statement.close();
    }

    //SELECT
    public ResultSet query(String stmt) throws SQLException {
        statement = conn.prepareStatement(stmt);
        resultSet = statement.executeQuery();

        return resultSet;
    }

    


}
