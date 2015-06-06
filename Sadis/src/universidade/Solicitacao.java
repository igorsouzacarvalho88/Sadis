package universidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Solicitacao {

	public Aluno aluno = new Aluno();

	private String esclarecimentoSolicitacao;

	private List<String> disciplinasTest = new ArrayList<String>();

	
	// metodos getters and setters para as
	public String getAlunoNome() {
	
		return aluno.getNome();
	
	}
	
	public String getAlunoEmail() {
	
		return aluno.getEmail();
	
	}

	public String getAlunoTelefone() {
	
		return aluno.getTelefone();
	
	}

	public String getAlunoMatricula() {
	
		return aluno.getMatricula();
	
	}
	
	public void setAlunoNome(String nome) {
	
		this.aluno.setNome(nome);
	
	}
	
	public String getEsclarecimentoSolicitacao() {
	
		return esclarecimentoSolicitacao;
	
	}

	public List<String> getDisciplinas() {
	
		return disciplinasTest;
	
	}
	
	public void setAlunoMatricula(String matricula) {
	
		this.aluno.setMatricula(matricula);
	
	}
	
	public void setAlunoTelefone(String telefone) {
	
		this.aluno.setTelefone(telefone);
	
	}
	
	public void setAlunoEmail(String email) {
	
		this.aluno.setEmail(email);
	
	}
	
	public void setAluno(Aluno aluno) {
	
		this.aluno = aluno;
	
	}


	public void setEsclarecimentoSolicitacao(String esclarecimentoSolicitacao) {
	
		this.esclarecimentoSolicitacao = esclarecimentoSolicitacao;
	
	}

	public void setDisciplinas(List<String> disciplinas) {
	
		this.disciplinasTest = disciplinas;
	
	}

}