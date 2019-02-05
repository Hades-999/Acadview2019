/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class UserDAO 
{
    public boolean checkUser(User u) throws SQLException
    {
        boolean flag=false;
        try
        {
            String url="jdbc:mysql://localhost:3306/acadview";
            String uname="root";
            String pwd="";
            Connection con=DriverManager.getConnection(url,uname,pwd);
            Statement stm=con.createStatement();
            String q="Select * from Collage where password='"+u.getPassword()+"'and username='"+u.getUsername()+"';";
            ResultSet rs=stm.executeQuery(q);
            flag=rs.next();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
}
