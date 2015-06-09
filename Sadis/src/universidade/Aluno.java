package universidade;
//teste
import javax.swing.JTextField;


public class Aluno {
	
	//atributos de aluno
	
	private String nome;

	private String matricula;
	
	private String telefone;
	
	private String email;
		
	
	//gets and sets do aluno
	

	public void setNome(String nome) {
	
		this.nome = nome;
	
	}

	public void setTelefone(String telefone) {
	
		this.telefone = telefone;
	
	}

	public void setMatricula(String matricula) {
	
		this.matricula = matricula;
	
	}

	public void setEmail(String email) {

		this.email = email;
	
	}	
	
	public String getNome() {
		
		return nome;
	
	}
	
	public String getMatricula() {
	
		return matricula;
	
	}
	
	public String getTelefone() {
	
		return telefone;
	
	}

	public String getEmail() {
		return email;
	}

}

