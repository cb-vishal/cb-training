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
import bean.User;
import java.sql.*;  
  
public class RegisterDao {  
    
  
public static int register(User u) throws SQLException, ClassNotFoundException{  
int status=0;  

Connection con=ConnectionProvider.getCon();
PreparedStatement ps=con.prepareStatement("insert into users(fname,lname,email,pass,status) values(?,?,?,?,?)");  
ps.setString(1,u.getFname());
ps.setString(2, u.getLname());
ps.setString(3,u.getUemail());  
ps.setString(4,u.getUpass()); 
ps.setInt(5,1);
status=ps.executeUpdate();    
return status;  
}  

  
}  