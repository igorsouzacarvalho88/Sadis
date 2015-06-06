package programa.principal;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import universidade.*;


public class FramePrincipal extends JFrame {
	private short escolha = 0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipal frame = new FramePrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FramePrincipal() {
		setTitle("Sadis - Sistema de aproveitamento de disciplinas");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// a depender do checkbox que foi marcado

				if (escolha == 1) {
					Curso curso = new Curso("Ciencias da Computação", 1);
					FrameSolicitacao frame = new FrameSolicitacao(curso);
					frame.setVisible(true);
				}
				if (escolha == 2) {
					Curso curso = new Curso("Sistemas de Informação", 2);
					FrameSolicitacao frame = new FrameSolicitacao(curso);
					frame.setVisible(true);
				}
				if (escolha == 0) {
					JOptionPane.showMessageDialog(null,
							"Escolha o curso de destino antes de começar");
				}
			}
		});
		btnIniciar.setBounds(61, 228, 89, 23);
		contentPane.add(btnIniciar);

		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFechar.setBounds(284, 228, 89, 23);
		contentPane.add(btnFechar);

		final JCheckBox checkCiencias = new JCheckBox(
				"Ciencias da Computa\u00E7\u00E3o");

		checkCiencias.setBounds(252, 152, 176, 23);
		contentPane.add(checkCiencias);

		final JCheckBox checkSistemas = new JCheckBox(
				"Sistemas de Informa\u00E7\u00E3o");
		checkSistemas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// se clicar em sistemas de informação faz com que tire o clique
				// de ciencias da computação e poe a variavel escolha como 2
				escolha = 2;
				checkCiencias.setSelected(false);
			}
		});

		checkCiencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// se clicar em ciencias da computação faz com que tire o clique
				// de sistemas e poe a variavel escolha como 1
				escolha = 1;
				checkSistemas.setSelected(false);
			}
		});
		checkSistemas.setBounds(252, 188, 167, 23);
		contentPane.add(checkSistemas);

		JLabel lblEscolhaOCurso = new JLabel("Escolha o curso pretendido");
		lblEscolhaOCurso.setBounds(20, 172, 160, 14);
		contentPane.add(lblEscolhaOCurso);

		JLabel status = new JLabel();
		// status.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		status.setBounds(159, 0, 118, 131);
		status.setIcon(new ImageIcon("img/sadis3.jpg"));
		contentPane.add(status);

	}
}
