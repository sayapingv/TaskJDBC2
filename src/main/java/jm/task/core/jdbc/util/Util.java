package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String HOST_NAME = "localhost";
    private static final String DB_NAME = "myschema";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "Qwert12345";


    public static Connection getMySQLConnection() throws SQLException {
        return getMySQLConnection(HOST_NAME, DB_NAME, USER_NAME, PASSWORD);
    }

    public static Connection getMySQLConnection(String hostName, String dbName,
                                                String userName, String password) throws SQLException {

        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName + "?useSSL=false&amp";
        Connection conn = DriverManager.getConnection(connectionURL, userName, password);
        return conn;
    }
    // реализуйте настройку соеденения с БД
}
