package pack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cb-vishal
 */
import java.sql.*;

public class ConnectionProvider {

    private static Connection con = null;

    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/phone";
    static final String USERNAME = "root";
    static final String PASSWORD = "";

    public static Connection getCon() throws ClassNotFoundException, SQLException {
             Class.forName(DRIVER);
                 con = DriverManager.getConnection(CONNECTION_URL, USERNAME,PASSWORD);
            return con;
    }

}
