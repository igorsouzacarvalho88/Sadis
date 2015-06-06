package universidade;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	// atributos
	private String nome;

	private int codigo;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	// construtor com carregamento das disciplinas em memoria a partir da
	// setagem do curso
	public Curso(String nome, int codigo) {

		this.setNome(nome);

		this.setCodigo(codigo);

		if (codigo == 1) {

			carregarDisciplinas1();

		} else {

			carregarDisciplinas2();
		}

	}

	public List<Disciplina> getDisciplinasDoCurso() {

		return disciplinas;

	}

	public void setDisciplinasDoCurso(List<Disciplina> disciplinasDoCurso) {

		this.disciplinas = disciplinasDoCurso;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public void setCodigo(int codigo) {

		this.codigo = codigo;

	}

	public String getNome() {

		return nome;

	}

	public int getCodigo() {

		return codigo;

	}

	// metodos de processamento
	// public void imprimeDisciplinas() {
	//
	// System.out.println("As Disciplinas Cadastradas Do Curso de "+this.nome+" são\n");
	//
	// for (Disciplina item : this.disciplinas) {
	//
	// System.out.println(item.getNome());
	//
	// }
	//
	// }

	// metodo para carregamento das disciplinas para teste em memória
	public void carregarDisciplinas1() {

		// instanciando disciplinas

		Disciplina disciplina1 = new Disciplina(
				"Introdução a Linguagem de Programação", "MATA01", (short) 68);

		Disciplina disciplina2 = new Disciplina(
				"Estrutura de Dados e Algoritmos", "MATA02", (short) 68);

		Disciplina disciplina3 = new Disciplina(
				"Programação Orientada a Obejtos", "MATA03", (short) 68);

		Disciplina disciplina4 = new Disciplina(
				"Programação de Software Basico", "MATA04", (short) 68);

		// adicionando disciplinas como pre-requisitos para a lista de
		// pre-requisitos da disciplina2

		disciplina2.setPreRequisitos(disciplina1.getCodigo());
		disciplina3.setPreRequisitos(disciplina1.getCodigo());
		disciplina3.setPreRequisitos(disciplina2.getCodigo());
		disciplina4.setPreRequisitos(disciplina3.getCodigo());
		// adicionando disciplinas na lista de disciplinas

		disciplinas.add(disciplina1);
		disciplinas.add(disciplina2);
		disciplinas.add(disciplina3);
		disciplinas.add(disciplina4);

	}

	public void carregarDisciplinas2() {

		// instanciando disciplinas

		Disciplina disciplina1 = new Disciplina("Sistemas Operacionais",
				"MATA01", (short) 68);

		Disciplina disciplina2 = new Disciplina(
				"Empreendedores em Informatica", "MATA02", (short) 68);

		Disciplina disciplina3 = new Disciplina("Fundamentos de Economia",
				"MATA03", (short) 68);

		Disciplina disciplina4 = new Disciplina(
				"Programação de Software Basico", "MATA04", (short) 68);
		
		// adicionando disciplinas como pre-requisitos para a lista de
		// pre-requisitos da disciplina2

		disciplina2.setPreRequisitos(disciplina1.getCodigo());
		disciplina3.setPreRequisitos(disciplina1.getCodigo());
		disciplina3.setPreRequisitos(disciplina2.getCodigo());
		disciplina4.setPreRequisitos(disciplina3.getCodigo());
		
		// adicionando disciplinas na lista de disciplinas

		disciplinas.add(disciplina1);
		disciplinas.add(disciplina2);
		disciplinas.add(disciplina3);
		disciplinas.add(disciplina4);
	}

	// public static void imprimeCursos(List<Curso> cursos) {
	//
	//
	// System.out.println("Os Cursos Cadastrados São\n");
	//
	// for (Curso item : cursos) {
	//
	// System.out.println(item.nome);
	//
	// }
	// }
}
