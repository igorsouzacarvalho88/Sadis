package programa.principal;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import connexaoBD.AlunoDAO;
import connexaoBD.IAlunoDAO;
import connexaoBD.ISolicitacaoDAO;
import connexaoBD.SolicitacaoDAO;
import universidade.Aproveitamento;
import universidade.Curso;
import universidade.Solicitacao;

import java.awt.Toolkit;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Label;
import java.awt.Color;

public class FrameSolicitacao extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nome;
	private JTextField matricula;
	private JTextField telefone;
	private JTextField email;
	private JLabel lblInsiraSeuNome;
	private JLabel lblInsiraSuaMatricula;
	private JLabel lblTelefone;
	private JLabel lblEmail;
	private JTextField codigoMateria;
	private JButton btnOk;
	private JButton btnConsulta;
	private JLabel dicipsol;

	public FrameSolicitacao(final Curso curso) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\thiago\\git\\Sadis\\Sadis\\sadis3.jpg"));
		setTitle("Formulario de Solicitação");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 604);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JButton btnEnviar = new JButton("Enviar");
		nome = new JTextField();
		nome.setBounds(155, 57, 253, 20);
		nome.setColumns(10);

		matricula = new JTextField();
		matricula.setBounds(155, 88, 253, 20);
		matricula.setColumns(10);

		contentPane.setLayout(null);
		contentPane.add(matricula);
		contentPane.add(nome);
		contentPane.add(btnEnviar);

		telefone = new JTextField();
		telefone.setColumns(10);
		telefone.setBounds(155, 119, 253, 20);
		contentPane.add(telefone);

		email = new JTextField();
		email.setColumns(10);
		email.setBounds(155, 150, 253, 20);
		contentPane.add(email);

		btnEnviar.setBounds(60, 532, 87, 23);

		lblInsiraSeuNome = new JLabel("Nome Completo");
		lblInsiraSeuNome.setBounds(25, 60, 99, 14);
		contentPane.add(lblInsiraSeuNome);

		lblInsiraSuaMatricula = new JLabel("Matricula");
		lblInsiraSuaMatricula.setBounds(25, 91, 99, 14);
		contentPane.add(lblInsiraSuaMatricula);

		lblTelefone = new JLabel("Telefone / Celular");
		lblTelefone.setBounds(25, 122, 99, 14);
		contentPane.add(lblTelefone);

		lblEmail = new JLabel("Email");
		lblEmail.setBounds(25, 157, 99, 14);
		contentPane.add(lblEmail);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose(); // fecha o Jframe
			}
		});
		btnCancelar.setBounds(341, 532, 89, 23);
		contentPane.add(btnCancelar);

		codigoMateria = new JTextField();
		codigoMateria.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent arg0) {
				codigoMateria.setText(""); // faz com que o campo de codigos
				// seja limpo sempre que clicar nele
			}
		});
		codigoMateria.setBounds(35, 225, 68, 20);
		contentPane.add(codigoMateria);
		codigoMateria.setColumns(10);
		
		JLabel lblInsiraOCodigo = new JLabel(
				"Insira o codigo das diciplinas, uma a uma e clique em Ok");
		lblInsiraOCodigo.setBounds(25, 204, 383, 14);
		contentPane.add(lblInsiraOCodigo);

		btnOk = new JButton("Ok");		
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// verifica se o campo codigo esta com espa�os em branco
				if (codigoMateria.getText().equals("")
						|| codigoMateria.getText().equals(" ")) {

					JOptionPane.showMessageDialog(null,
							"Campo código esta em branco!");

				} else {
					// se nao tiver em branco testa para ver se o codigo
					// existe na lista
					if (solicitacao.getDisciplinas().contains(codigoMateria
							.getText().toUpperCase())) {

						JOptionPane.showMessageDialog(null,
								"Disciplina " + codigoMateria.getText().toUpperCase() + " - já cadastrada!");

					} else {
						// se não existir mostra o codigo que vc acabou de
						// cadastrar e adiciona ele na lista
						String n = codigoMateria.getText().toUpperCase();
						n = curso.VerificaNome(n);
						//Verifica se a Disciplina solicitada está cadastrada
						if (n.contains(codigoMateria.getText().toUpperCase())){
							JOptionPane.showMessageDialog(null, "Disciplina não encontrada");
						} else{
							solicitacao.getDisciplinas().add(codigoMateria.getText().toUpperCase());
							JOptionPane.showMessageDialog(null, "Disciplina " + codigoMateria.getText().toUpperCase() + " - " + n + " cadastrada com sucesso");
						}
					}
				}
			}
		});
		btnOk.setBounds(113, 225, 89, 23);
		contentPane.add(btnOk);
		JLabel lblFormulrioDeSolicitao;
		lblFormulrioDeSolicitao = new JLabel(
				"Formul\u00E1rio de solicita\u00E7\u00E3o");
		lblFormulrioDeSolicitao.setBounds(178, 11, 196, 14);
		contentPane.add(lblFormulrioDeSolicitao);

		lblExMata = new JLabel(
				"Ex: MATA01 ( Clique em ok ) MATA02 ( Clique em ok )...");
		lblExMata.setBounds(25, 275, 383, 14);
		contentPane.add(lblExMata);

		lblAoAdicionarTodas = new JLabel(
				"Ao adicionar todas as matérias clique em Enviar.");
		lblAoAdicionarTodas.setBounds(25, 325, 383, 14);
		contentPane.add(lblAoAdicionarTodas);
		
		JLabel lblI = new JLabel("Espaço para justificativa do processo de aproveitamento");
		lblI.setBounds(25, 369, 383, 14);
		contentPane.add(lblI);
		
		final JEditorPane justificativa = new JEditorPane();
		justificativa.setBounds(35, 394, 373, 98);
		contentPane.add(justificativa);
		
		dicipsol = new JLabel(" ");
		dicipsol.setForeground(Color.RED);
		dicipsol.setBounds(25, 249, 224, 20);
		contentPane.add(dicipsol);
		
		JLabel lblConsultaVerificaA = new JLabel("Consulta: verifica o nome da matéria.");
		lblConsultaVerificaA.setBounds(25, 300, 187, 14);
		contentPane.add(lblConsultaVerificaA);
		
		JButton btnConsulta = new JButton("Consulta");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String m = codigoMateria.getText().toUpperCase();
				m = curso.VerificaNome(m);
				//Verifica se a Disciplina solicitada está cadastrada
				if (m.contains(codigoMateria.getText().toUpperCase())){
					JOptionPane.showMessageDialog(null, "Disciplina não encontrada");
				} else{
					dicipsol.setText(m);
				}
			}
		});
		btnConsulta.setBounds(213, 225, 89, 23);
		contentPane.add(btnConsulta);
		
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { // EVENTO ao clicar
				// no bot�o enviar
				//verifica se os campos do formulario não estão em branco
				if (nome.getText().equals("") || matricula.getText().equals("")
						|| telefone.getText().equals("")
						|| email.getText().equals("")) {

					JOptionPane.showMessageDialog(null,
							"Verifique os campos em branco no formulario");
				} else {
					//se não tiver em branco ele seta todos os atributos
					
					solicitacao.setNome(nome.getText().toUpperCase());
					solicitacao.setMatricula(matricula.getText());
					solicitacao.setTelefone(telefone.getText());
					solicitacao.setEmail(email.getText().toUpperCase());
					solicitacao.setEsclarecimentoSolicitacao(justificativa.getText());
					
					//SALVA O ALUNO NO BANCO DE DADOS
					//daoAluno.addAluno(solicitacao);
					
					//SAlLVAR SOLICITACAO NO BANCO DE DADOS
					//daoSolicitacao.addSolicitacao(solicitacao);
					
					JOptionPane.showMessageDialog(null,
							"Solicitação enviada com sucesso");

					//realiza o aproveitamento ou não das disciplinas que o aluno solicitou
					aproveitamento.setDisciplinasAproveitadas(solicitacao,
							curso);

					// imprime os dados do aluno na tela

					FrameRelatorio frameRelatorio = new FrameRelatorio(
							solicitacao, aproveitamento);
					dispose();

				}

				// Aproveitamento.comparaSolicitacaoGrade(solicitacao, curso2);

				// a fun��o acima vai receber a solicitacao, e o curso no qual o
				// cara quer ir eu ainda vou fazer ele escolher
				// entre 2 cursos, mas preciso ver qq essa comparacao vai
				// usar... gogogo
			}
		});

	}

	// instancia solicitação e aproveitamento

	Solicitacao solicitacao = new Solicitacao();
	//private IAlunoDAO daoAluno = new AlunoDAO();
	//private ISolicitacaoDAO daoSolicitacao = new SolicitacaoDAO();
	Aproveitamento aproveitamento = new Aproveitamento();

	private JLabel lblExMata;
	private JLabel lblAoAdicionarTodas;
}
