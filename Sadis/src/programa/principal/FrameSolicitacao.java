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
import java.awt.TextArea;
import java.awt.Button;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.border.LineBorder;
import javax.swing.JDesktopPane;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;

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
		setForeground(Color.GRAY);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\thiago\\git\\Sadis\\Sadis\\sadis3.jpg"));
		setTitle("Formulario de Solicitação");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 604);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JButton btnEnviar = new JButton("Enviar");
		nome = new JTextField();
		nome.setBounds(155, 50, 253, 25);
		nome.setColumns(10);

		matricula = new JTextField();
		matricula.setBounds(155, 80, 253, 25);
		matricula.setColumns(10);

		contentPane.setLayout(null);
		contentPane.add(matricula);
		contentPane.add(nome);
		contentPane.add(btnEnviar);

		telefone = new JTextField();
		telefone.setColumns(10);
		telefone.setBounds(155, 110, 253, 25);
		contentPane.add(telefone);

		email = new JTextField();
		email.setColumns(10);
		email.setBounds(155, 140, 253, 25);
		contentPane.add(email);

		btnEnviar.setBounds(35, 436, 87, 23);

		lblInsiraSeuNome = new JLabel("Nome Completo");
		lblInsiraSeuNome.setBounds(25, 55, 99, 14);
		contentPane.add(lblInsiraSeuNome);

		lblInsiraSuaMatricula = new JLabel("Matricula");
		lblInsiraSuaMatricula.setBounds(25, 85, 99, 14);
		contentPane.add(lblInsiraSuaMatricula);

		lblTelefone = new JLabel("Telefone / Celular");
		lblTelefone.setBounds(25, 115, 99, 14);
		contentPane.add(lblTelefone);

		lblEmail = new JLabel("Email");
		lblEmail.setBounds(25, 145, 99, 14);
		contentPane.add(lblEmail);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose(); // fecha o Jframe
			}
		});
		btnCancelar.setBounds(321, 436, 87, 23);
		contentPane.add(btnCancelar);

		codigoMateria = new JTextField();
		codigoMateria.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				codigoMateria.setText(""); // faz com que o campo de codigos seja limpo sempre que clicar nele
				}
			});
		codigoMateria.setBounds(35, 225, 68, 25);
		contentPane.add(codigoMateria);
		codigoMateria.setColumns(10);	
		JLabel lblInsiraOCodigo = new JLabel("Insira o codigo da diciplina");
		lblInsiraOCodigo.setBounds(25, 204, 383, 14);
		contentPane.add(lblInsiraOCodigo);

		btnOk = new JButton("Ok");		
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				// verifica se o campo codigo esta com espa�os em branco
				String codMateria = codigoMateria.getText().toUpperCase().replace(" ", "");
				if (codMateria.length()<1){
					JOptionPane.showMessageDialog(null, "Código disciplina em branco!");
				}
				else {
					// se nao tiver em branco testa para ver se o codigo existe na lista
					if (solicitacao.getDisciplinas().contains(codMateria)) {
						JOptionPane.showMessageDialog(null,"Disciplina " + codMateria + " - já cadastrada!");

					} else {
						// se não existir mostra o codigo que vc acabou de cadastrar e adiciona ele na lista
						String n = codMateria;
						n = curso.VerificaNome(n);
						//Verifica se a Disciplina solicitada está cadastrada
						if (n.contains(codMateria)){
							JOptionPane.showMessageDialog(null, "Disciplina não encontrada");
						} else{
							solicitacao.getDisciplinas().add(codMateria);
							JOptionPane.showMessageDialog(null, "Disciplina " + codMateria + " - " + n + " cadastrada com sucesso");
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
		
		JLabel lblI = new JLabel("Espaço para justificativa do processo de aproveitamento");
		lblI.setBounds(25, 286, 383, 14);
		contentPane.add(lblI);
		
		final TextArea justificativa = new TextArea("",4,30, TextArea.SCROLLBARS_VERTICAL_ONLY);
		justificativa.setBounds(35, 311, 373, 98);
		contentPane.add(justificativa);
		
		dicipsol = new JLabel(" ");
		dicipsol.setForeground(Color.RED);
		dicipsol.setBounds(25, 249, 383, 20);
		contentPane.add(dicipsol);
		
		
		
		JButton btnConsulta = new JButton("Consulta");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String codMateria = codigoMateria.getText().toUpperCase().replace(" ", "");
				codMateria = curso.VerificaNome(codMateria);
				
				//Verifica se a Disciplina solicitada está cadastrada
				if (codMateria.length()<1){
					JOptionPane.showMessageDialog(null, "Código disciplina em branco!");
				}
				else{
					if (codMateria.equals(codigoMateria.getText().toUpperCase().replace(" ", ""))){
						JOptionPane.showMessageDialog(null, "Disciplina não encontrada");
					}
					else{
						dicipsol.setText(codMateria);
					}
				}
			}
			
		});
		btnConsulta.setBounds(213, 225, 89, 23);
		contentPane.add(btnConsulta);
		
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { // EVENTO ao clicar no bot�o enviar verifica se os campos do formulario não estão em branco
				// Validação das informações adicionadas matricula, telefone e email
				int v = 1;
				lblEmail.setForeground(Color.BLACK);
				if ((!email.getText().contains("@")) || (!email.getText().contains("."))){
					JOptionPane.showMessageDialog(null, "Campo e-mail incorreto");
					lblEmail.setForeground(Color.RED);
					v=0;
				}
				lblTelefone.setForeground(Color.BLACK);	
				if ((!telefone.getText().matches("[0-9( )-]*"))){
					JOptionPane.showMessageDialog(null, "Campo telefone incorreto");
					lblTelefone.setForeground(Color.RED);	
					v=0;
				}
				lblInsiraSuaMatricula.setForeground(Color.BLACK);
				if ((!matricula.getText().matches("[0-9]*")) || (matricula.getText().length()>9) || (matricula.getText().length()<9)){
					JOptionPane.showMessageDialog(null, "Campo matricula incorreto");
					lblInsiraSuaMatricula.setForeground(Color.RED);	
					v=0;
				}
				
				else if (v!=0){
					if (nome.getText().equals("") || matricula.getText().equals("") || telefone.getText().equals("") || email.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Verifique os campos em branco no formulario");
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
					
					JOptionPane.showMessageDialog(null, "Solicitação enviada com sucesso");

					//realiza o aproveitamento ou não das disciplinas que o aluno solicitou
					aproveitamento.setDisciplinasAproveitadas(solicitacao, curso);

					// imprime os dados do aluno na tela

					FrameRelatorio frameRelatorio = new FrameRelatorio(solicitacao, aproveitamento,curso);
					dispose();
					}
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
}
