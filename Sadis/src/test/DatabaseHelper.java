package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseHelper {
	
	 private static Connection conn;

	    private DatabaseHelper() {
	    }
	    
	    public static Connection getConnection() {  
	        try {  
	            // Carregando o JDBC Driver padr�o  
	            String driverName = "com.mysql.jdbc.Driver";                          
	            Class.forName(driverName); // Instancia o driver utilizado para conex�o com o MYSQL
	            String novaUrl = "jdbc:mysql://localhost:3306/sadis";
	            String url = "jdbc:mysql://localhost/sadis";  
	            String username = "root";        //nome de um usu�rio de seu BD        
	            String password = "";      //sua senha de acesso  
	            
	            conn = (Connection) DriverManager.getConnection(novaUrl, username, password);  
	        
	            
	        }  catch (ClassNotFoundException e) {  //Driver n�o encontrado  
	            System.out.println("O driver expecificado nao foi encontrado.");  
	            return null;  
	        } catch (SQLException e) {  
	            //N�o conseguindo se conectar ao banco  
	            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
	            System.out.println(e.getMessage());

	            return null;  
	        } 
	 
	        return conn;
	    }
	    
	    public static void closeConnection(Connection connection){
	    	try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
}
