/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import bean.AddressBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author cb-vishal
 */
public class AddressDao {

    public static int addAddress(AddressBean address) throws SQLException, ClassNotFoundException {
        
        String sql="insert into address(add_line,city,state,country,zip) values(?,?,?,?,?)";
        Connection con = ConnectionProvider.getCon();
        PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, address.getAddLine1() + " " + address.getAddLine2());
        ps.setString(2, address.getCity());
        ps.setString(3, address.getState());
        ps.setString(4, address.getCountry());
        ps.setInt(5, address.getZip());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        rs.next();
        int id = rs.getInt(1);
        con.close();
        return id;
    }
    
    public static int addUserAddress(String email,int id) throws SQLException, ClassNotFoundException
    {
        String sql1="insert into user_address values(?,?)";
        String sql2="select * from users where email=?";
        Connection con = ConnectionProvider.getCon();
        PreparedStatement ps1 = con.prepareStatement(sql1);
        PreparedStatement ps2 = con.prepareStatement(sql2);
       ps2.setString(1, email);
        ResultSet rs=ps2.executeQuery();
        rs.next();
        ps1.setInt(1,rs.getInt(1));
        ps1.setInt(2, id);
        int status=ps1.executeUpdate();
        con.close();
        return status;
    }
 
    
}
