package universidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class Aproveitamento {

	// atributos do aproveitamento

	private List<String> disciplinasAproveitadas = new ArrayList<String>();

	// metodo set combinado com o aproveitamento em geral
	public void setDisciplinasAproveitadas(Solicitacao solicitacao, Curso curso) {

		// a variavel abaixo serve para a comparacao das disciplinas que o aluno

		for (Disciplina item1 : curso.getDisciplinasDoCurso()) {

			if (solicitacao.getDisciplinas().contains(item1.getCodigo())) {

				if (solicitacao.getDisciplinas().containsAll(item1.getPreRequisitos())) {

					this.disciplinasAproveitadas.add(item1.getCodigo());

				} else {
					// se não tiver os pre-requisitos mensagem de erro!
					JOptionPane
					.showMessageDialog(
							null,
							"Voce nao cursou todos os pre-requisitos da disciplina "
									+ item1.getCodigo()
									+ " por isso ela nao pode ser aproveitada.\n Os pre-requisitos são: "
									+ item1.getPreRequisitos());

				}

			}

			if (this.disciplinasAproveitadas.isEmpty()) {
				JOptionPane
				.showMessageDialog(
						null,
						"Caro aluno, nao ha disciplinas obrigatorias nem optativas "
								+ "a serem aproveitadas dentre as que voce solicitou.");
				break;
			}
		}
	}

	public List<String> getDisciplinasAproveitadas() {

		return this.disciplinasAproveitadas;

	}
}
	
