package universidade;

import java.util.ArrayList;
import java.util.List;


public class Solicitacao extends Aluno {

/*	public Aluno aluno = new Aluno();*/

	private String esclarecimentoSolicitacao;

	private List<String> disciplinasTest = new ArrayList<String>();

	
	// metodos getters and setters para as
	/*public String getAlunoNome() {
	
		return getNome();
	
	}
	
	public String getAlunoEmail() {
	
		return getEmail();
	
	}

	public String getAlunoTelefone() {
	
		return getTelefone();
	
	}

	public String getAlunoMatricula() {
	
		return getMatricula();
	
	}
	
	public void setAlunoNome(String nome) {
	
		this.setNome(nome);
	
	}*/
	
	public String getEsclarecimentoSolicitacao() {
	
		return esclarecimentoSolicitacao;
	
	}

	public List<String> getDisciplinas() {
	
		return disciplinasTest;
	
	}
	
	/*public void setAlunoMatricula(String matricula) {
	
		this.setMatricula(matricula);
	
	}
	
	public void setAlunoTelefone(String telefone) {
	
		this.setTelefone(telefone);
	
	}
	
	public void setAlunoEmail(String email) {
	
		this.setEmail(email);
	
	}
	
	public void setAluno(Aluno aluno) {
	
		this.aluno = aluno;
	
	}
*/

	public void setEsclarecimentoSolicitacao(String esclarecimentoSolicitacao) {
	
		this.esclarecimentoSolicitacao = esclarecimentoSolicitacao;
	
	}

	public void setDisciplinas(List<String> disciplinas) {
	
		this.disciplinasTest = disciplinas;
	
	}

}