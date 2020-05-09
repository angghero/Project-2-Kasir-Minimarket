/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimarket.Connection;


import java.sql.*;

/**
 *
 * @author Shadam Ramadhan
 */
public class DBConnection {
    public static Connection open()
    {
        Connection con;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            String url= "jdbc:mysql://localhost:3306/kasir_minimarket";
            
            con= DriverManager.getConnection(url, "root", "");
            
            return con;
        }
        catch (Exception e)
        {
            System.err.println(e);
            return null;
        }
    }
}
