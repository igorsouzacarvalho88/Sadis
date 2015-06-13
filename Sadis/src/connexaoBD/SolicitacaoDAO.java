package connexaoBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import universidade.Solicitacao;



public class SolicitacaoDAO implements ISolicitacaoDAO{

	private Connection conn;
   
    public  SolicitacaoDAO() {
    	conn = DatabaseHelper.getConnection();
	}

	public void addSolicitacao(String solicitacao) {
		String insert = "INSERT into solicitacao (justificativa) value ('"+solicitacao+"')";
		try {
			PreparedStatement stm = conn.prepareStatement(insert); 
		
			
			stm.executeUpdate();
		} catch (SQLException e) {
			System.out.println("solicitacaoDAO.enclosing_method()"+e.getMessage());
		}
		
	}

	
}
