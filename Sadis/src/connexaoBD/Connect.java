package connexaoBD;

import java.sql.*;

public class Connect
{
    public static void main (String[] args){
        
    	Connection conn = null;

        try
        {
            String userName = "root";
            
            String password = "";
            
            String url = "jdbc:mysql://localhost/sadis";
            
            Class.forName ("com.mysql.jdbc.Driver");  
            
            conn = DriverManager. 
            		getConnection (url, userName, password);
            
            System.out.println ("Conex�o com o BD estabelecida!");
        }
        catch (Exception e)
        {
            System.err.println ("N�o foi poss�vel estabelecer conex�o com o BD");
        }
        finally
        {
            if (conn != null)
            {
                try
                {
                    conn.close ();
                    System.out.println ("Conex�o finalizada");
                }
                catch (Exception e) { /* ignore close errors */ }
            }
        }
    }
}
