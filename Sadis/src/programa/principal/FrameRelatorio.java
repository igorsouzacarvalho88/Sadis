package programa.principal;

import java.awt.BorderLayout;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import universidade.Aproveitamento;
import universidade.Solicitacao;

public class FrameRelatorio extends JFrame {
	private int protocolo;
	private JPanel contentPane;
	private Date dataAtual = new Date();

	public FrameRelatorio(Solicitacao solicitacao, Aproveitamento aproveitamento) {
		setTitle("Relatorio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		// impressão na tela com os dados da solicitação
		protocolo = 1 + (int) (Math.random() * 999999999);
		JOptionPane
				.showMessageDialog(
						null,
						FrameRelatorio.obterDataPorExtenso(dataAtual)
								+ "\nOs dados do aluno são:\n\n\n Número de protocolo: "
								+ protocolo + "\n\nNome: "
								+ solicitacao.getNome()
								+ " \n\nMatricula: "
								+ solicitacao.getMatricula()
								+ " \n\nTelefone: "
								+ solicitacao.getTelefone()
								+ " \n\nEmail: " + solicitacao.getEmail()
								+ "\nAs disciplinas aproveitas foram:\n "
								+ aproveitamento.getDisciplinasAproveitadas());

		// impressão em txt os dados da solicitação
		FileWriter relatorio;
		try {
			relatorio = new FileWriter("Relatorio.txt",true);
			PrintWriter gravarArq = new PrintWriter(relatorio);
			gravarArq.printf(FrameRelatorio.obterDataPorExtenso(dataAtual)
					+ "%n%nRelatorio %n%n");

			gravarArq.printf("Número de protocolo: " + protocolo + "%n%nNome: "
					+ solicitacao.getNome() + "%n%nMatricula: "
					+ solicitacao.getMatricula() + "%n%nTelefone: "
					+ solicitacao.getTelefone() + "%n%nEmail: "
					+ solicitacao.getEmail()
					+ "%n%njustificativa do processo de aproveitamento" + "%n"
					+ solicitacao.getEsclarecimentoSolicitacao()
					+ "%n%n As disciplinas aproveitas foram:%n "
					+ aproveitamento.getDisciplinasAproveitadas()+"%n%n");
			relatorio.close();
		} catch (IOException e) {
			System.out.println("Ocorreu um erro na criação do relatorio");
			e.printStackTrace();
		} finally {
			JOptionPane
					.showMessageDialog(null,
							"Uma relatorio com os dados da solicitação foi criado em workspace/Sadis");
		}

	}

	public static String obterDataPorExtenso(Date dataAtual) {
		DateFormat dfmt = new SimpleDateFormat("EEEE, d 'de' MMMM 'de' yyyy");
		return dfmt.format(dataAtual);
	}
}
