package universidade;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

	
	// atributos de disciplina
	
	private String nome;
	
	private String codigo;

	private short cargaHoraria;
	
	private List<String> preRequisitos = new ArrayList<String>();
	
	// construtor de uma disciplina com elementos essenciais
	public Disciplina(String nome, String codigo, short cargaHoraria) {
		
		super();
		
		this.setNome(nome);
		
		this.setCodigo(codigo);
		
		this.setCargaHoraria(cargaHoraria);
	
	}
		
	public String getNome() {
		
		return nome;
	
	}

	public void setNome(String nome) {
	
		this.nome = nome;
	
	}

	
	public void setCodigo(String codigo) {
	
		this.codigo = codigo;

	}
	
	public String getCodigo() {
	
		return codigo;
	
	}

	
	public int getCargaHoraria() {
	
		return cargaHoraria;
	
	}

	public void setCargaHoraria(short cargaHoraria) {
	
		this.cargaHoraria = cargaHoraria;
	
	}

		//set especial para adicionar uma disciplina a lista de pre-requisitos
	public void setPreRequisitos(String disciplina) {
		
		this.preRequisitos.add(disciplina);
	
	}
	
	
	public List<String> getPreRequisitos() {
	
		return preRequisitos;
	
	}

	
	
}
