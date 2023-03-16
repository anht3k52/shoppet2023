/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nopbaitap;
import java.sql.*;
/**
 *
 * @author huynx
 */
public class connect {
   public Connection getConnection(){
       Connection conn = null;
       try{
           //Class.forName("com.microsoft.sqlsever.jdbc.SQLServerDriver");
           String url = "jdbc:sqlserver://localhost:1433;databaseName=CNPM";
           String user ="sa";
           String pwd ="sa123";
           conn = DriverManager.getConnection(url,user,pwd);
           if(conn != null)
               System.out.print("ket noi thanh cong");
       }catch(Exception e){ 
           System.out.print(e.toString());
       }
       return conn;
   }
}