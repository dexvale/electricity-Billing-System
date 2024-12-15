/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billingsystem;
import java.sql.*;
/**
 *
 * @author dexte
 */
public class connection {
    
    
        
        connection(){
       String sUrl, sUser, sPass;
        
        Connection c ;
        Statement st;
            
        try{
        sUrl = "jdbc:MYSQL://localhost:3306/ewb";
        sUser = "root";
        sPass = "";
        

            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(sUrl, sUser, sPass);
            st = c.createStatement();
}catch(Exception e){
    e.printStackTrace();
}
        } 
    
}
