
//import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class now {

    public static void main(String[] args) throws SQLException {
        String sil = "root";
        String pass = "root";
        String connection = "jdbc:mysql://localhost/user";
        Connection con = null;
try{
        con = DriverManager.getConnection(connection, sil, pass);
         String query = "select * from account";
         Statement stmt=null;
        stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(query);
         rs.next();
         String s =rs.getString("price");
         System.out.println(s);
}catch(Exception e){
System.out.println("exception");
}
        
    }

}
