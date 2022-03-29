package Connect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//quan li kho hàng
public  class Ketnoi {
    private static String driver;
    private static String dburl;
    private static String user;
    private static String pass;
    public Connection cn;
    static{
        try {
            BufferedReader out = new BufferedReader(new FileReader("change.txt"));
            driver = out.readLine();
            dburl = out.readLine();
            user = out.readLine();
            pass = out.readLine(); 
            Class.forName(driver);
        } catch (Exception e) {
        }
    }
    public void connect(){
        try {
            cn = DriverManager.getConnection(dburl,user,pass);
            System.out.println("Kết nối thành công");
        } catch (SQLException ex) {
            System.out.println("Không thể kết nối");
        }
    }
    
    public void disconnect(){
        try {
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Không thể ngắt kết nối");
        }
        
    }
    public static void main(String[] args) {
        
        
    }
}
