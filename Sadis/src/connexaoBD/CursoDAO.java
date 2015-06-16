package connexaoBD;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;



import universidade.Curso;
import universidade.Solicitacao;

public class CursoDAO implements ICursoDAO{
	 private Connection conn;
	 
	public CursoDAO(){
		conn = DatabaseHelper.getConnection();
	}
	
	public void addCurso(Curso curso,Solicitacao solicitacao) {
		String insert = "INSERT into curso (nome,codigo,matricula) values (?,?,?)";
		try {
			PreparedStatement stm = conn.prepareStatement(insert); 
			stm.setString(1, curso.getNome());
			stm.setInt(2, curso.getCodigo());
			stm.setString(3, solicitacao.getMatricula());
			stm.executeUpdate();
		} catch (SQLException e) {
			System.out.println("CursoDAO.enclosing_method()"+e.getMessage());
		}
		
	}

}
