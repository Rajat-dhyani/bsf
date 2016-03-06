

package bsf.conn;

/**
 *
 * @author rajat_000
 */
import java.sql.*;
import javax.swing.*;

public class JavaConnector 
{
     private static Connection con = null;
    
    public static Connection connectionDb()
    {
    
    try{
        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:D:\\BSF\\Bsf.sqlite");
       JOptionPane.showMessageDialog(null, "Connection Enstablished");
        return con;
    }   
    catch (Exception ex)
    {
        JOptionPane.showMessageDialog(null, ex);
         return null;
    }
    }
}
    

