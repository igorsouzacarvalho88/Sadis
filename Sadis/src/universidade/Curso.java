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
		
		}if(codigo == 3){
			
			carregarDisciplinas3();
		
		}if(codigo == 4){
			
			carregarDisciplinas4();
			
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

	// Retorna o nome da materia atraves do codigo dela
	public String VerificaNome(String cod) {
		for (Disciplina item : this.disciplinas) {
				if (cod.contains(item.getCodigo())){
					cod =  item.getNome();
						
				}
		}
		return cod;
	
	}

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
		// pre-requisitos da disciplina1

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

	//Sistemas de Informação, cursos obrigatorios colocados
	public void carregarDisciplinas2() {

		// instanciando disciplinas

		Disciplina disciplina1 = new Disciplina("Computador, Ética e Sociedade ","MATA68", (short) 51);

		Disciplina disciplina2 = new Disciplina("Introdução à Lógica de Programação", "MATA37", (short) 68);

		Disciplina disciplina3 = new Disciplina("Matemática Discreta I", "MATA42", (short) 68);

		Disciplina disciplina4 = new Disciplina("Cálculo A", "MATA02", (short) 102);
		
		Disciplina disciplina5 = new Disciplina("Seminários de Introdução ao Curso", "MATA39", (short) 51);
		
		Disciplina disciplina6 = new Disciplina("Circuitos Digitais e Arquitetura de Computadores ", "MATC90", (short) 68);
		
		Disciplina disciplina7 = new Disciplina("Estruturas de Dados", "MATD04", (short) 68);
		
		Disciplina disciplina8 = new Disciplina("Introdução a Lógica Matemática", "MATC73", (short) 68);
		
		Disciplina disciplina9 = new Disciplina("Fundamentos de Sistemas de Informação", "MATC92", (short) 68);
		
		Disciplina disciplina10 = new Disciplina("Economia da Inovação", "ADME99", (short) 68);
		
		Disciplina disciplina11 = new Disciplina("Sistemas Operacionais", "MATA58", (short) 68);
		
		Disciplina disciplina12 = new Disciplina("Programação Orientada a Objetos", "MATA55", (short) 68);
		
		Disciplina disciplina13 = new Disciplina("Introdução as Linguagens Formais e Teoria da Computação ", "MATC94", (short) 68);	
		
		Disciplina disciplina14 = new Disciplina("Álgebra Linear A", "MATA07", (short) 68);
		
		Disciplina disciplina15 = new Disciplina("Introdução à Administração", "ADM001", (short) 68);
		
		Disciplina disciplina16 = new Disciplina("Oficina de Leitura e Produção de Textos", "LETA09", (short) 68);
		
		Disciplina disciplina17 = new Disciplina("Redes de Computadores I", "MATA59", (short) 68);
		
		Disciplina disciplina18 = new Disciplina("Engenharia de Software I", "MATA62", (short) 68);
		
		Disciplina disciplina19 = new Disciplina("Métodos Estatísticos", "MAT236", (short) 68);
		
		Disciplina disciplina20 = new Disciplina("Sistemas Web", "MATC82", (short) 68);
		
		Disciplina disciplina21 = new Disciplina("Banco de Dados", "MATA60", (short) 68);
		
		Disciplina disciplina22 = new Disciplina("Paradigmas de Linguagens de Programação", "MATA56", (short) 68);
		
		Disciplina disciplina23 = new Disciplina("Engenharia de Software II", "MATA63", (short) 68);
		
		Disciplina disciplina24 = new Disciplina("Métodos Quantitativos", "ADM211", (short) 68);
		
		Disciplina disciplina25 = new Disciplina("Laboratório de Programação Web ", "MATC84", (short) 51);
		
		Disciplina disciplina26 = new Disciplina("Laboratório de Banco de Dados", "MATB09", (short) 51);
		
		Disciplina disciplina27 = new Disciplina("Linguagens para Aplicação Comercial ", "MATA76", (short) 51);
		
		Disciplina disciplina28 = new Disciplina("Aplicações para Dispositivos Móveis", "MATC89", (short) 68);
		
		Disciplina disciplina29 = new Disciplina("Sistemas de Apoio à Decisão", "ADMF01", (short) 85);
		
		Disciplina disciplina30 = new Disciplina("Empreendedores em Informática", "MAT220", (short) 68);
		
		Disciplina disciplina31 = new Disciplina("Interação Humano Computador", "MATC72", (short) 68);
		
		Disciplina disciplina32 = new Disciplina("Sistemas Multimídia", "MATB19", (short) 68);
		
		Disciplina disciplina33 = new Disciplina("Qualidade de Software", "MATB02", (short) 51);
		
		Disciplina disciplina34 = new Disciplina("Inteligência Artificial", "MATA64", (short) 68);
		
		Disciplina disciplina35 = new Disciplina("Segurança e Auditoria de Sistemas de Informação", "MATC99", (short) 68);
		
		Disciplina disciplina36 = new Disciplina("Trabalho de Conclusão de Curso BSI I", "MATC97", (short) 51);
		
		Disciplina disciplina37 = new Disciplina("Trabalho de Conclusão de Curso BSI II", "MATC98", (short) 136);
		
		// adicionando disciplinas como pre-requisitos para a lista de
		// pre-requisitos da disciplina2

		disciplina7.setPreRequisitos(disciplina2.getCodigo());
		disciplina7.setPreRequisitos(disciplina3.getCodigo());
		disciplina8.setPreRequisitos(disciplina3.getCodigo());
		disciplina11.setPreRequisitos(disciplina6.getCodigo());
		disciplina12.setPreRequisitos(disciplina7.getCodigo());
		disciplina13.setPreRequisitos(disciplina3.getCodigo());
		disciplina17.setPreRequisitos(disciplina6.getCodigo());
		disciplina18.setPreRequisitos(disciplina12.getCodigo());
		disciplina19.setPreRequisitos(disciplina4.getCodigo());
		disciplina19.setPreRequisitos(disciplina14.getCodigo());
		disciplina20.setPreRequisitos(disciplina9.getCodigo());
		disciplina20.setPreRequisitos(disciplina11.getCodigo());
		disciplina21.setPreRequisitos(disciplina7.getCodigo());
		disciplina22.setPreRequisitos(disciplina12.getCodigo());
		disciplina23.setPreRequisitos(disciplina18.getCodigo());
		disciplina24.setPreRequisitos(disciplina15.getCodigo());
		disciplina24.setPreRequisitos(disciplina19.getCodigo());
		disciplina25.setPreRequisitos(disciplina12.getCodigo());
		disciplina26.setPreRequisitos(disciplina21.getCodigo());
		disciplina27.setPreRequisitos(disciplina7.getCodigo());
		disciplina28.setPreRequisitos(disciplina17.getCodigo());
		disciplina28.setPreRequisitos(disciplina12.getCodigo());
		disciplina29.setPreRequisitos(disciplina24.getCodigo());
		disciplina31.setPreRequisitos(disciplina18.getCodigo());
		disciplina32.setPreRequisitos(disciplina12.getCodigo());
		disciplina33.setPreRequisitos(disciplina23.getCodigo());
		disciplina34.setPreRequisitos(disciplina8.getCodigo());
		disciplina34.setPreRequisitos(disciplina7.getCodigo());
		disciplina35.setPreRequisitos(disciplina14.getCodigo());
		disciplina35.setPreRequisitos(disciplina29.getCodigo());
		disciplina36.setPreRequisitos(disciplina16.getCodigo());
		disciplina37.setPreRequisitos(disciplina36.getCodigo());
		
		
		
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
		disciplinas.add(disciplina37);
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
				"Estágio Supervisionado 1","MATC68", (short) 68);
			
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
		
	//Matematica todos os cursos colocados.
	public void carregarDisciplinas4() {

		// instanciando disciplinas

		Disciplina disciplina1 = new Disciplina(
				"DESENHO GEOMETRICO I","ARQ005", (short) 68);

		Disciplina disciplina2 = new Disciplina(
				"MATEMATICA FINANCEIRA ", "MAT191", (short) 68);

		Disciplina disciplina3 = new Disciplina(
				"FUNDAMENTOS DE MATEMATICA ELEMENTAR I","MAT198", (short) 68);

		Disciplina disciplina4 = new Disciplina(
				"FUNDAMENTOS DE MATEMATICA ELEMENTAR II", "MAT199", (short) 68);
		
		Disciplina disciplina5 = new Disciplina(
				"PROCESSAMENTO DE DADOS ", "MAT045", (short) 68);
		
		Disciplina disciplina6 = new Disciplina(
				"INTRODUÇÃO À TEORIA DOS NÚMEROS ", "MATB32", (short) 68);
		
		Disciplina disciplina7 = new Disciplina(
				"LIMITES E DERIVADAS ", "MATB33", (short) 68);
		
		Disciplina disciplina8 = new Disciplina(
				"GEOMETRIA ANALÍTICA E ÁLGEBRA VETORIAL ", "MATB34", (short) 68);
		
		Disciplina disciplina9 = new Disciplina(
				"ESTATÍSTICA BÁSICA A ", "MATB59", (short) 68);
		
		Disciplina disciplina10 = new Disciplina(
				"FISICA GERAL E EXPERIMENTAL I", "FIS121", (short) 68);
		
		Disciplina disciplina11 = new Disciplina(
				"INTRODUÇÃO À ANÁLISE COMBINATÓRIA ", "MATB31", (short) 68);
		
		Disciplina disciplina12 = new Disciplina(
				"GRUPOS E ANÉIS I ", "MATB35", (short) 68);
		
		Disciplina disciplina13 = new Disciplina(
				"INTEGRAIS E FUNÇÕES DE VÁRIAS VARIÁVEIS ", "MATB37", (short) 68);
		
		Disciplina disciplina14 = new Disciplina(
				"ÁLGEBRA LINEAR I", "MATB38", (short) 68);
		
		Disciplina disciplina15 = new Disciplina(
				"FISICA GERAL E EXPERIMENTAL II", "FIS122", (short) 68);
		
		Disciplina disciplina16 = new Disciplina(
				"GRUPOS E ANÉIS II ", "MATB36", (short) 68);
		
		Disciplina disciplina17 = new Disciplina(
				"SEQUÊNCIAS, SÉRIES E EDO ", "MATB40", (short) 68);
		
		Disciplina disciplina18 = new Disciplina(
				"ÁLGEBRA LINEAR II", "MATB41", (short) 68);
		
		Disciplina disciplina19 = new Disciplina(
				"FISICA GERAL E EXPERIMENTAL III", "FIS123", (short) 68);
		
		Disciplina disciplina20 = new Disciplina(
				"CALCULO NUMÉRICO I ", "MAT174", (short) 68);
		
		Disciplina disciplina21 = new Disciplina(
				"CÁLCULO DIFERENCIAL VETORIAL ", "MATB43", (short) 68);
		
		Disciplina disciplina22 = new Disciplina(
				"ANÁLISE I ", "MATB44", (short) 68);
		
		Disciplina disciplina23 = new Disciplina(
				"ALGEBRA III - INTRODUCAO À TEORIA DE GALOIS ", "MAT205", (short) 68);
		
		Disciplina disciplina24 = new Disciplina(
				"TOPOLOGIA E ESPAÇOS MÉTRICOS ", "MATB50", (short) 68);
		
		Disciplina disciplina25 = new Disciplina(
				"TEORIA DAS EQUAÇÕES DIFERENCIAIS ORDINÁRIAS ", "MATB51", (short) 68);
		
		Disciplina disciplina26 = new Disciplina(
				"ANÁLISE II ", "MATB52", (short) 68);
		
		Disciplina disciplina27 = new Disciplina(
				"ESTATISTICA III", "MAT028", (short) 68);
		
		Disciplina disciplina28 = new Disciplina(
				"GEOMETRIA DIFERENCIAL ", "MAT208", (short) 68);
		
		Disciplina disciplina29 = new Disciplina(
				"FUNÇÕES HOLOMORFAS ", "MATB46", (short) 68);
		
		Disciplina disciplina30 = new Disciplina(
				"ANÁLISE III ", "MATB53", (short) 68);
		
		Disciplina disciplina31 = new Disciplina(
				"ESTÁGIO SUPERVISIONADO ", "MATB54", (short) 68);
		
		Disciplina disciplina32 = new Disciplina(
				"SEMINÁRIOS TEMÁTICOS ", "MATB49", (short) 68);
		
		Disciplina disciplina33 = new Disciplina(
				"MONOGRAFIA ", "MATB55", (short) 68);
		
		
		// adicionando disciplinas como pre-requisitos para a lista de
		// pre-requisitos da disciplina4

		disciplina10.setPreRequisitos(disciplina7.getCodigo());
		disciplina10.setPreRequisitos(disciplina8.getCodigo());
		disciplina13.setPreRequisitos(disciplina7.getCodigo());
		disciplina13.setPreRequisitos(disciplina8.getCodigo());
		disciplina14.setPreRequisitos(disciplina8.getCodigo());
		disciplina15.setPreRequisitos(disciplina10.getCodigo());
		disciplina16.setPreRequisitos(disciplina12.getCodigo());
		disciplina17.setPreRequisitos(disciplina13.getCodigo());
		disciplina18.setPreRequisitos(disciplina14.getCodigo());
		disciplina19.setPreRequisitos(disciplina13.getCodigo());
		disciplina19.setPreRequisitos(disciplina15.getCodigo());
		disciplina20.setPreRequisitos(disciplina5.getCodigo());
		disciplina20.setPreRequisitos(disciplina14.getCodigo());
		disciplina20.setPreRequisitos(disciplina17.getCodigo());
		disciplina21.setPreRequisitos(disciplina13.getCodigo());
		disciplina22.setPreRequisitos(disciplina17.getCodigo());
		disciplina23.setPreRequisitos(disciplina12.getCodigo());
		disciplina24.setPreRequisitos(disciplina22.getCodigo());
		disciplina25.setPreRequisitos(disciplina14.getCodigo());
		disciplina25.setPreRequisitos(disciplina17.getCodigo());
		disciplina26.setPreRequisitos(disciplina22.getCodigo());
		disciplina27.setPreRequisitos(disciplina17.getCodigo());
		disciplina28.setPreRequisitos(disciplina18.getCodigo());
		disciplina28.setPreRequisitos(disciplina21.getCodigo());
		disciplina29.setPreRequisitos(disciplina13.getCodigo());
		disciplina30.setPreRequisitos(disciplina21.getCodigo());
		disciplina31.setPreRequisitos(disciplina26.getCodigo());
		disciplina32.setPreRequisitos(disciplina13.getCodigo());
		disciplina33.setPreRequisitos(disciplina23.getCodigo());
		disciplina33.setPreRequisitos(disciplina28.getCodigo());
		disciplina33.setPreRequisitos(disciplina30.getCodigo());
		
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
		
	}
	
	
	
	//Estatistica todos os cursos colocados.
		public void carregarDisciplinas5() {

			// instanciando disciplinas

			Disciplina disciplina1 = new Disciplina(
					"FUNDAMENTOS DE MATEMATICA ELEMENTAR","MAT198", (short) 68);

			Disciplina disciplina2 = new Disciplina(
					"Geometria Analitica", "MATA01", (short) 68);
			
			Disciplina disciplina3 = new Disciplina(
					"Calculo A", "MATA02", (short) 102);
				
			Disciplina disciplina4 = new Disciplina(
					"ESTATÍSTICA BÁSICA A ", "MATB59", (short) 68);
			
			Disciplina disciplina5 = new Disciplina(
					"PROBABILIDADE I", "MAT223", (short) 68);
			
			Disciplina disciplina6 = new Disciplina(
					"CÁLCULO B", "MATA03", (short) 68);
			
			Disciplina disciplina7 = new Disciplina(
					"ÁLGEBRA LINEAR A", "MATA07", (short) 68);
			
			Disciplina disciplina8 = new Disciplina(
					"ESTATISTICA BASICA B", "MATD38", (short) 68);
			
			Disciplina disciplina9 = new Disciplina(
					"ANALISE DESCRITIVA E EXPLORATORIA DE DADOS A", "MATD39", (short) 68);
			
			Disciplina disciplina10 = new Disciplina(
					"METODOLOGIA E EXPRESSÃO TÉCNICO-CIENTÍFICA", "FCHC45", (short) 68);
			
			Disciplina disciplina11 = new Disciplina(
					"PROCESSAMENTO DE DADOS", "MAT045", (short) 68);
			
			Disciplina disciplina12 = new Disciplina(
					"PROBABILIDADE II", "MAT224", (short) 68);
			
			Disciplina disciplina13 = new Disciplina(
					"CÁLCULO C", "MATA04", (short) 68);
			
			Disciplina disciplina14 = new Disciplina(
					"INTRODUÇÃO AOS MODELOS LINEARES", "MATD41", (short) 68);
			
			Disciplina disciplina15 = new Disciplina(
					"OFICINA DE LEITURA E PRODUÇÃO DE TEXTOS", "LETA09", (short) 68);
			
			Disciplina disciplina16 = new Disciplina(
					"CALCULO NUMÉRICO I", "MAT174", (short) 68);
			
			Disciplina disciplina17 = new Disciplina(
					"ELEMENTOS DE PROCESSOS ESTOCÁSTICOS", "MAT186", (short) 68);
			
			Disciplina disciplina18 = new Disciplina(
					"ANALISE DE DADOS", "MATD40", (short) 68);
			
			Disciplina disciplina19 = new Disciplina(
					"INFERENCIA A", "MATD42", (short) 68);
			
			Disciplina disciplina20 = new Disciplina(
					"ANALISE DE REGRESSAO", "MAT229", (short) 68);
			
			Disciplina disciplina21 = new Disciplina(
					"INFERENCIA B", "MATD43", (short) 68);
			
			Disciplina disciplina22 = new Disciplina(
					"AMOSTRAGEM A", "MATD44", (short) 68);
			
			Disciplina disciplina23 = new Disciplina(
					"ESTATISTICA COMPUTACIONAL A", "MATD46", (short) 68);
			
			Disciplina disciplina24 = new Disciplina(
					"METODOS MULTIVARIADOS A", "MATD47", (short) 68);
			
			Disciplina disciplina25 = new Disciplina(
					"PLANEJAMENTO DE EXPERIMENTOS A", "MATD48", (short) 68);
			
			Disciplina disciplina26 = new Disciplina(
					"MODELOS LINEARES GENERALIZADOS A", "MATD50", (short) 68);
			
			Disciplina disciplina27 = new Disciplina(
					"ANALISE DAS SERIES TEMPORAIS A", "MATD51", (short) 68);
			
			Disciplina disciplina28 = new Disciplina(
					"INTRODUCAO À ADMINISTRACAO", "ADM001", (short) 68);
			
			Disciplina disciplina29 = new Disciplina(
					"SISTEMAS DE INFORMAÇÕES E A PROFISSÃO DO ESTATÍSTICO", "MATD45", (short) 68);
			
			Disciplina disciplina30 = new Disciplina(
					"ESTATISTICA NÃO PARAMETRICA", "MATD49", (short) 68);
			
			Disciplina disciplina31 = new Disciplina(
					"TRABALHO DE CONCLUSÃO DE CURSO I", "MATD52", (short) 68);
			
			Disciplina disciplina32 = new Disciplina(
					"TRABLHO DE CONCLUSÃO DE CURSO II", "MATD53", (short) 68);
					
			
			// adicionando disciplinas como pre-requisitos para a lista de
			// pre-requisitos da disciplina4

			disciplina5.setPreRequisitos(disciplina3.getCodigo());
			disciplina6.setPreRequisitos(disciplina2.getCodigo());
			disciplina6.setPreRequisitos(disciplina3.getCodigo());
			disciplina7.setPreRequisitos(disciplina2.getCodigo());
			disciplina8.setPreRequisitos(disciplina4.getCodigo());
			disciplina11.setPreRequisitos(disciplina6.getCodigo());
			disciplina12.setPreRequisitos(disciplina5.getCodigo());
			disciplina12.setPreRequisitos(disciplina6.getCodigo());
			disciplina13.setPreRequisitos(disciplina6.getCodigo());
			disciplina13.setPreRequisitos(disciplina7.getCodigo());
			disciplina14.setPreRequisitos(disciplina7.getCodigo());
			disciplina16.setPreRequisitos(disciplina11.getCodigo());
			disciplina18.setPreRequisitos(disciplina8.getCodigo());
			disciplina19.setPreRequisitos(disciplina12.getCodigo());
			disciplina19.setPreRequisitos(disciplina13.getCodigo());
			disciplina20.setPreRequisitos(disciplina14.getCodigo());
			disciplina20.setPreRequisitos(disciplina19.getCodigo());
			disciplina21.setPreRequisitos(disciplina19.getCodigo());
			disciplina22.setPreRequisitos(disciplina19.getCodigo());
			disciplina23.setPreRequisitos(disciplina16.getCodigo());
			disciplina23.setPreRequisitos(disciplina19.getCodigo());
			disciplina24.setPreRequisitos(disciplina7.getCodigo());
			disciplina24.setPreRequisitos(disciplina19.getCodigo());
			disciplina25.setPreRequisitos(disciplina14.getCodigo());
			disciplina25.setPreRequisitos(disciplina21.getCodigo());
			disciplina26.setPreRequisitos(disciplina20.getCodigo());
			disciplina26.setPreRequisitos(disciplina21.getCodigo());
			disciplina27.setPreRequisitos(disciplina20.getCodigo());
			disciplina30.setPreRequisitos(disciplina21.getCodigo());
			disciplina31.setPreRequisitos(disciplina10.getCodigo());
			disciplina31.setPreRequisitos(disciplina21.getCodigo());
			disciplina32.setPreRequisitos(disciplina31.getCodigo());
			
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
