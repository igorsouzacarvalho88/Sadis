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

		} if(codigo == 2) {

			carregarDisciplinas2();
		}if(codigo ==3){
			carregarDisciplinas3();
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
	//Ciencias da ComputaÃ§Ã£o, cursos obrigatorios colocados
	public void carregarDisciplinas1() {

		// instanciando disciplinas

		Disciplina disciplina1 = new Disciplina(
				"Projeto de Circuitos LÃ³gicos", "MATA38", (short) 68);
			
		Disciplina disciplina2 = new Disciplina(
				"IntroduÃ§Ã£o a Linguagem de ProgramaÃ§Ã£o", "MATA37", (short) 68);
		
		Disciplina disciplina3 = new Disciplina(
				"Seminarios em ComputaÃ§Ã£o", "MATA39", (short) 51);
			
		Disciplina disciplina4 = new Disciplina(
				"Matematica Discreta I", "MATA42", (short) 68);
			
		Disciplina disciplina5 = new Disciplina(
				"Calculo A", "MATA02", (short) 102);
			
		Disciplina disciplina6 = new Disciplina(
				"Geometria Analitica", "MATA01", (short) 68);
			
		Disciplina disciplina7 = new Disciplina(
				"Arquitetura de Computador", "MATA48", (short) 68);

		Disciplina disciplina8 = new Disciplina(
				"Estrutura de Dados e Algoritmos I", "MATA40", (short) 68);
			
		Disciplina disciplina9 = new Disciplina(
				"Laboratorio de ProgramaÃ§Ã£o I", "MATA57", (short) 51);
			
		Disciplina disciplina10 = new Disciplina(
				"Matematica Discreta II", "MATA97", (short) 68);
			
		Disciplina disciplina11 = new Disciplina(
				"Complemento de Calculo", "MATA95", (short) 102);

		Disciplina disciplina12 = new Disciplina(
				"Algebra Linear", "MATA07", (short) 68);
			
		Disciplina disciplina13 = new Disciplina(
				"ProgramaÃ§Ã£o Orientada a Obejtos", "MATA55", (short) 68);

		Disciplina disciplina14 = new Disciplina(
				"ProgramaÃ§Ã£o de Software Basico", "MATA49", (short) 68);
			
		Disciplina disciplina15 = new Disciplina(
				"Linguagem Formais e Automatos", "MATA50", (short) 68);
			
		Disciplina disciplina16 = new Disciplina(
				"Logica para ComputaÃ§Ã£o", "MATA47", (short) 68);
			
		Disciplina disciplina17 = new Disciplina(
				"Metodos Estatisticos", "MATA236", (short) 68);

		Disciplina disciplina18 = new Disciplina(
				"ELEMENTOS DO ELETROMAGNETISMO E DE CIRCUITOS ELÃ‰TRICOS", "FISA75", (short) 102);
			
		Disciplina disciplina19 = new Disciplina(
				"Compiladores", "MATA61", (short) 68);
			
		Disciplina disciplina20 = new Disciplina(
				"Analise e Projeto de Algoritmos", "MATA52", (short) 68);
			
		Disciplina disciplina21 = new Disciplina(
				"Sistemas Operacionais", "MATA58", (short) 68);
			
		Disciplina disciplina22 = new Disciplina(
				"Teoria da ComputaÃ§Ã£o", "MATA51", (short) 68);
			
		Disciplina disciplina23 = new Disciplina(
				"Computador, Etica e Sociedade", "MATA68", (short) 51);
			
		Disciplina disciplina24 = new Disciplina(
				"METODOLOGIA E EXPRESSÃƒO TÃ‰CNICO-CIENTÃ�FICA", "FCHC45", (short) 68);
			
		Disciplina disciplina25 = new Disciplina(
				"PARADIGMAS DE LINGUAGENS DE PROGRAMAÃ‡ÃƒO", "MATA56", (short) 68);
			
		Disciplina disciplina26 = new Disciplina(
				"ESTRUTURAS DE DADOS E ALGORITMOS II", "MATA54", (short) 68);
			
		Disciplina disciplina27 = new Disciplina(
				"REDES DE COMPUTADORES", "MATA59", (short) 68);
			
		Disciplina disciplina28 = new Disciplina(
				"Teoria dos Grafos", "MATA53", (short) 68);
			
		Disciplina disciplina29 = new Disciplina(
				"ENGENHARIA DE SOFTWARE I", "MATA62", (short) 68);
			
		Disciplina disciplina30 = new Disciplina(
				"Banco de Dados", "MATA60", (short) 68);
			
		Disciplina disciplina31 = new Disciplina(
				"Inteligencia Artificial", "MATA64", (short) 68);
			
		Disciplina disciplina32 = new Disciplina(
				"FUNDAMENTOS DE SISTEMAS DISTRIBUIDOS", "MATA88", (short) 68);
			
		Disciplina disciplina33 = new Disciplina(
				"ENGENHARIA DE SOFTWARE II", "MATA11", (short) 68);
			
		Disciplina disciplina34 = new Disciplina(
				"ComputaÃ§Ã£o Grafica", "MATA65", (short) 68);
			
		Disciplina disciplina35 = new Disciplina(
				"Projeto Final do Curso I", "MATA66", (short) 51);
			
		Disciplina disciplina36 = new Disciplina(
				"Projeto Final do Curso II", "MATA67", (short) 136);
			
		// adicionando disciplinas como pre-requisitos para a lista de
		// pre-requisitos da disciplina2

		disciplina7.setPreRequisitos(disciplina1.getCodigo());
		disciplina8.setPreRequisitos(disciplina2.getCodigo());
		disciplina8.setPreRequisitos(disciplina4.getCodigo());
		disciplina9.setPreRequisitos(disciplina2.getCodigo());
		disciplina10.setPreRequisitos(disciplina4.getCodigo());
		disciplina11.setPreRequisitos(disciplina5.getCodigo());
		disciplina11.setPreRequisitos(disciplina6.getCodigo());
		disciplina12.setPreRequisitos(disciplina6.getCodigo());
		disciplina13.setPreRequisitos(disciplina8.getCodigo());
		disciplina14.setPreRequisitos(disciplina7.getCodigo());
		disciplina14.setPreRequisitos(disciplina8.getCodigo());
		disciplina14.setPreRequisitos(disciplina9.getCodigo());
		disciplina15.setPreRequisitos(disciplina4.getCodigo());
		disciplina16.setPreRequisitos(disciplina10.getCodigo());
		disciplina17.setPreRequisitos(disciplina4.getCodigo());
		disciplina17.setPreRequisitos(disciplina11.getCodigo());
		disciplina18.setPreRequisitos(disciplina11.getCodigo());
		disciplina19.setPreRequisitos(disciplina14.getCodigo());
		disciplina19.setPreRequisitos(disciplina15.getCodigo());
		disciplina20.setPreRequisitos(disciplina8.getCodigo());
		disciplina21.setPreRequisitos(disciplina14.getCodigo());
		disciplina22.setPreRequisitos(disciplina15.getCodigo());
		disciplina22.setPreRequisitos(disciplina16.getCodigo());
		disciplina25.setPreRequisitos(disciplina13.getCodigo());
		disciplina26.setPreRequisitos(disciplina20.getCodigo());
		disciplina27.setPreRequisitos(disciplina14.getCodigo());
		disciplina28.setPreRequisitos(disciplina20.getCodigo());
		disciplina29.setPreRequisitos(disciplina13.getCodigo());
		disciplina29.setPreRequisitos(disciplina16.getCodigo());
		disciplina30.setPreRequisitos(disciplina26.getCodigo());
		disciplina31.setPreRequisitos(disciplina25.getCodigo());
		disciplina31.setPreRequisitos(disciplina28.getCodigo());
		disciplina31.setPreRequisitos(disciplina16.getCodigo());
		disciplina32.setPreRequisitos(disciplina21.getCodigo());
		disciplina32.setPreRequisitos(disciplina28.getCodigo());
		disciplina33.setPreRequisitos(disciplina29.getCodigo());
		disciplina34.setPreRequisitos(disciplina11.getCodigo());
		disciplina34.setPreRequisitos(disciplina12.getCodigo());
		disciplina34.setPreRequisitos(disciplina9.getCodigo());
		disciplina35.setPreRequisitos(disciplina24.getCodigo());
		disciplina36.setPreRequisitos(disciplina35.getCodigo());
			
		// adicionando disciplinas na lista de disciplinas

		disciplinas.add(disciplina1);
		disciplinas.add(disciplina2);
		disciplinas.add(disciplina3);
		disciplinas.add(disciplina4);
		disciplinas.add(disciplina5);
		disciplinas.add(disciplina6);
		disciplinas.add(disciplina7);
		disciplinas.add(disciplina8);
		disciplinas.add(disciplina9);
		disciplinas.add(disciplina10);
		disciplinas.add(disciplina11);
		disciplinas.add(disciplina12);
		disciplinas.add(disciplina13);
		disciplinas.add(disciplina14);
		disciplinas.add(disciplina15);
		disciplinas.add(disciplina16);
		disciplinas.add(disciplina17);
		disciplinas.add(disciplina18);
		disciplinas.add(disciplina19);
		disciplinas.add(disciplina20);
		disciplinas.add(disciplina21);
		disciplinas.add(disciplina22);
		disciplinas.add(disciplina23);
		disciplinas.add(disciplina24);
		disciplinas.add(disciplina25);
		disciplinas.add(disciplina26);
		disciplinas.add(disciplina27);
		disciplinas.add(disciplina28);
		disciplinas.add(disciplina29);
		disciplinas.add(disciplina30);
		disciplinas.add(disciplina31);
		disciplinas.add(disciplina32);
		disciplinas.add(disciplina33);
		disciplinas.add(disciplina34);
		disciplinas.add(disciplina35);
		disciplinas.add(disciplina36);
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
	
	//Licenciatura da Computação todos os cursos colocados.
	public void carregarDisciplinas3() {

		// instanciando disciplinas
			
		Disciplina disciplina1 = new Disciplina(
				"Filosofia da Educação","EDCB80", (short) 68);

		Disciplina disciplina2 = new Disciplina(
				"introdução a Lógica de programação","MATA37", (short) 68);

		Disciplina disciplina3 = new Disciplina(
				"Seminário de Introdução ao Curso", "MATA39", (short) 51);
			
		Disciplina disciplina4 = new Disciplina(
				"Geometria Analitica", "MATA01", (short) 68);
			
		Disciplina disciplina5 = new Disciplina(
				"Matematica discreta 1", "MATA42", (short) 68);
			
		Disciplina disciplina6 = new Disciplina(
				"Educação e Tecnologias Contemporâneas", "EDC287", (short) 68);
			
		Disciplina disciplina7 = new Disciplina(
				"Estrutura de Dados", "MATD04", (short) 68);
			
		Disciplina disciplina8 = new Disciplina(
				"Sistemas Básicos de Computação: Arquitetura e Software", "MATC81", (short) 68);
			
		Disciplina disciplina9 = new Disciplina(
				"Introdução Lógica de Matemática", "MATC73", (short) 68);
			
		Disciplina disciplina10 = new Disciplina(
				"Computador,Ética e Sociedade","MATA68", (short) 51);
			
		Disciplina disciplina11 = new Disciplina(
				"Fundamentos Psicológicos da Educação","EDCA", (short) 68);
		
		Disciplina disciplina12 = new Disciplina(
				"Programação Orientado a Objeto","MATA55", (short) 68);
			
		Disciplina disciplina13 = new Disciplina(
				"Métodos Estatísticos","MAT236", (short) 68);
			
		Disciplina disciplina14 = new Disciplina(
				"Introdução a Linguagem Formais e Teoria da Computação","MATC74", (short) 68);
			
		Disciplina disciplina15 = new Disciplina(
				"Didática e Práxis Pedagógica 1","EDCA11", (short) 68);
			
		Disciplina disciplina16 = new Disciplina(
				"Engenharia de Software 1","MATA69", (short) 68);
		
		Disciplina disciplina17 = new Disciplina(
				" Sistema Web","MATC82", (short) 68);
		
		Disciplina disciplina18 = new Disciplina(
				"Redes de computadores","MATA59", (short) 68);
			
		Disciplina disciplina19 = new Disciplina(
				"Informatica na Educação","MATA41", (short) 68);
			
		Disciplina disciplina20 = new Disciplina(
				"Didática e Práxis Pedagógica 2 ","EDCA12", (short) 68);
			
		Disciplina disciplina21 = new Disciplina(
				"Sistemas Multimídia","MATB05", (short) 68);
			
		Disciplina disciplina22 = new Disciplina(
				"Banco de Dados e Aplicações","MATD05", (short) 68);
			
		Disciplina disciplina23 = new Disciplina(
				"Ambientes Interativos de Aprendizagem","MATB21", (short) 68);
			
		Disciplina disciplina24 = new Disciplina(
				"Avalção de Apredizagem","EDC286", (short) 68);
			
		Disciplina disciplina25 = new Disciplina(
				"Estágio Supervisionado 1","MATC68,", (short) 68);
			
		Disciplina disciplina26= new Disciplina(
				"Interação Humano-Computador","MATC72", (short) 68);
			
		Disciplina disciplina27 = new Disciplina(
				"Projeto de Software Educativo","MATC78", (short) 68);
			
		Disciplina disciplina28 = new Disciplina(
				"Laboratório de Informática na Educação","MATB22", (short) 51);
			
		Disciplina disciplina29 = new Disciplina(
				"Prática de Ensino de Computação 1","MATC76", (short) 51);
			
		Disciplina disciplina30 = new Disciplina(
				"Estágio Supervisionado 2","MATC69", (short) 68);
		
		Disciplina disciplina31 = new Disciplina(
				"Projeto Interdiciplinares:Concepção e Prática","MATC79", (short) 68);
			
		Disciplina disciplina32 = new Disciplina(
				"Inteligencia Artificial","MATB20", (short) 68);
			
		Disciplina disciplina33 = new Disciplina(
				"Prática de Ensino de Computação 2","MATC77", (short) 68);
			
		Disciplina disciplina34 = new Disciplina(
				"Estágio Supervisionado 3","MATC70", (short) 68);
			
		Disciplina disciplina35 = new Disciplina(
				"Libras-Lingua Brasileira de Sinais","LETE46", (short) 34);
			
		Disciplina disciplina36 = new Disciplina(
				"Estágio Supervisionado 4","MATC71", (short) 170);
		
		// adicionando disciplinas como pre-requisitos para a lista de
		// pre-requisitos da disciplina3

			
		disciplina8.setPreRequisitos(disciplina1.getCodigo());
		disciplina9.setPreRequisitos(disciplina5.getCodigo());
		disciplina12.setPreRequisitos(disciplina7.getCodigo());
		disciplina13.setPreRequisitos(disciplina5.getCodigo());
		disciplina14.setPreRequisitos(disciplina5.getCodigo());
		disciplina16.setPreRequisitos(disciplina12.getCodigo());
		disciplina17.setPreRequisitos(disciplina12.getCodigo());
		disciplina18.setPreRequisitos(disciplina8.getCodigo());
		disciplina20.setPreRequisitos(disciplina15.getCodigo());
		disciplina21.setPreRequisitos(disciplina12.getCodigo());
		disciplina22.setPreRequisitos(disciplina7.getCodigo());
		disciplina23.setPreRequisitos(disciplina19.getCodigo());
		disciplina23.setPreRequisitos(disciplina2.getCodigo());
		disciplina25.setPreRequisitos(disciplina15.getCodigo());
		disciplina27.setPreRequisitos(disciplina16.getCodigo());
		disciplina28.setPreRequisitos(disciplina23.getCodigo());
		disciplina29.setPreRequisitos(disciplina15.getCodigo());
		disciplina30.setPreRequisitos(disciplina25.getCodigo());
		disciplina31.setPreRequisitos(disciplina19.getCodigo());
		disciplina31.setPreRequisitos(disciplina15.getCodigo());
		disciplina32.setPreRequisitos(disciplina19.getCodigo());
		disciplina32.setPreRequisitos(disciplina9.getCodigo());
		disciplina33.setPreRequisitos(disciplina29.getCodigo());
		disciplina34.setPreRequisitos(disciplina30.getCodigo());
		disciplina36.setPreRequisitos(disciplina34.getCodigo());
			
		// adicionando disciplinas na lista de disciplinas

		disciplinas.add(disciplina1);
		disciplinas.add(disciplina2);
		disciplinas.add(disciplina3);
		disciplinas.add(disciplina4);
		disciplinas.add(disciplina5);
		disciplinas.add(disciplina6);
		disciplinas.add(disciplina7);
		disciplinas.add(disciplina8);
		disciplinas.add(disciplina9);
		disciplinas.add(disciplina10);
		disciplinas.add(disciplina11);
		disciplinas.add(disciplina12);
		disciplinas.add(disciplina13);
		disciplinas.add(disciplina14);
		disciplinas.add(disciplina15);
		disciplinas.add(disciplina16);
		disciplinas.add(disciplina17);
		disciplinas.add(disciplina18);
		disciplinas.add(disciplina19);
		disciplinas.add(disciplina20);
		disciplinas.add(disciplina21);
		disciplinas.add(disciplina22);
		disciplinas.add(disciplina23);
		disciplinas.add(disciplina24);
		disciplinas.add(disciplina25);
		disciplinas.add(disciplina26);
		disciplinas.add(disciplina27);
		disciplinas.add(disciplina28);
		disciplinas.add(disciplina29);
		disciplinas.add(disciplina30);
		disciplinas.add(disciplina31);
		disciplinas.add(disciplina32);
		disciplinas.add(disciplina33);
		disciplinas.add(disciplina34);
		disciplinas.add(disciplina35);
		disciplinas.add(disciplina36);
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
