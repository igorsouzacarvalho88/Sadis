package test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import universidade.Aproveitamento;
import universidade.Curso;
import universidade.Solicitacao;

import org.junit.Test;

public class AproveitamentoTest {

	@Test
	public void testSetDisciplinasAproveitadas() {
		try {
			
			List <String> disciplinasTest = new ArrayList<String>();
			

			disciplinasTest.add("MATA01");
			disciplinasTest.add("MATA02");
//			disciplinasTest.add("MATA04");
//			disciplinasTest.add("MATA24");

			Solicitacao solicitacao = new Solicitacao();	
			
			solicitacao.setDisciplinas(disciplinasTest);
			
			Curso curso = new Curso("Ciencias da Computação", 1);
			

			Aproveitamento aproveitamento = new Aproveitamento();
			aproveitamento.setDisciplinasAproveitadas(solicitacao, curso);

			System.out.println("disciplinas aproveitadas: " + aproveitamento.getDisciplinasAproveitadas());
			System.out.println("lista disciplinas: " + solicitacao.getDisciplinas());
			
			List<String> listaExpected = new ArrayList<String>();
			
			listaExpected.add("MATA01");
			listaExpected.add("MATA02");
		//	listaExpected.add("MATA03");

			if (listaExpected.contains(aproveitamento.getDisciplinasAproveitadas()) 
					|| listaExpected.size() == aproveitamento.getDisciplinasAproveitadas().size()) {
				System.out.println("AS LISTAS SAO IGUAIS");
			} else{
				System.out.println("AS LISTAS SAO DIFERENTES!");
				fail();
			}

		} catch (Exception e) {
			fail("encontrou um erro");
			e.printStackTrace();
		}
	}

	
	 

}
