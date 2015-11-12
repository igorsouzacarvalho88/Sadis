package universidade;

import java.util.ArrayList;
import java.util.List;


public class Solicitacao extends Aluno {

/*	public Aluno aluno = new Aluno();*/

	private String esclarecimentoSolicitacao;

	private List<String> disciplinasTest = new ArrayList<String>();

	
	
	
	public String getEsclarecimentoSolicitacao() {
	
		return esclarecimentoSolicitacao;
	
	}

	public List<String> getDisciplinas() {
	
		return disciplinasTest;
	
	}
	
	

	public void setEsclarecimentoSolicitacao(String esclarecimentoSolicitacao) {
	
		this.esclarecimentoSolicitacao = esclarecimentoSolicitacao;
	
	}

	public void setDisciplinas(List<String> disciplinas) {
	
		this.disciplinasTest = disciplinas;
	
	}

}