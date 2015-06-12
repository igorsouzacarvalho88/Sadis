package connexaoBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;




import java.sql.Statement;

import universidade.Aluno;

public class AlunoDAO implements IAlunoDAO {
    private Connection conn;
    
    public AlunoDAO() {
    	conn = DatabaseHelper.getConnection();
	}
	
	
	@Override
	public void addAluno(Aluno aluno) {
				String insert = "INSERT into aluno (nome,matricula,email,telefone) values (?,?,?,?)";
				try {
					PreparedStatement stm = conn.prepareStatement(insert); 
					stm.setString(1, aluno.getNome());
					stm.setString(2, aluno.getMatricula());
					stm.setString(3, aluno.getEmail());
					stm.setString(4,aluno.getTelefone());
					
					stm.executeUpdate();
				} catch (SQLException e) {
					System.out.println("AlunoDAO.enclosing_method()"+e.getMessage());
				}
		}
		
		

	@Override//deletar aluno do BD.
	public void deleteAluno(String matricula) {
		// TODO Auto-generated method stub
		 Statement stm;
		try {
			stm = (Statement) conn.createStatement();
			 stm.executeQuery("DELETE FROM aluno  WHERE matricula = '"+matricula+"'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Não foi possivel deletar aluno!");
			e.printStackTrace();
		}
        
	}

	@Override//Atualização de aluno no DB.
	public void updateAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		  
		
		
	
		
		
	}

}



