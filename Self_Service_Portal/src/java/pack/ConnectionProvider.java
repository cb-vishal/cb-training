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

    static String DRIVER = "com.mysql.jdbc.Driver";
    static String CONNECTION_URL = "jdbc:mysql://localhost:3306/directory";
    static String USERNAME = "root";
    static String PASSWORD = "";

    
    

    public static Connection getCon() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
            con = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
        return con;
    }

}
