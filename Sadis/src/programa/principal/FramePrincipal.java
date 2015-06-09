package programa.principal;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import universidade.*;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Toolkit;
//oi

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\thiago\\git\\Sadis\\Sadis\\sadis3.jpg"));
		setTitle("Sadis - Sistema de aproveitamento de disciplinas");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
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
				if(escolha==3){
					Curso curso = new Curso("Licenciatura da Computação", 3);
					FrameSolicitacao frame = new FrameSolicitacao(curso);
					frame.setVisible(true);
				}
				if (escolha == 0) {
					JOptionPane.showMessageDialog(null,
							"Escolha o curso de destino antes de começar");
				}
			}
		});
		btnIniciar.setBounds(20, 228, 89, 23);
		contentPane.add(btnIniciar);

		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFechar.setBounds(145, 228, 89, 23);
		contentPane.add(btnFechar);

		JLabel lblEscolhaOCurso = new JLabel("Escolha o curso pretendido");
		lblEscolhaOCurso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEscolhaOCurso.setBounds(59, 164, 237, 14);
		contentPane.add(lblEscolhaOCurso);

		JLabel status = new JLabel();
		// status.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		status.setBounds(83, 11, 118, 131);
		status.setIcon(new ImageIcon("img/sadis3.jpg"));
		contentPane.add(status);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Ciencias da Computação", "Sistemas de Informação","Licenciatura da Computação"}));
		comboBox.setBounds(60, 189, 174, 20);
		contentPane.add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedItem()==""){
					escolha=0;
					
				}if(comboBox.getSelectedItem()=="Ciencias da Computação"){
					escolha=1;
					
				}if(comboBox.getSelectedItem()=="Sistemas de Informação"){
					escolha=2;
					
				}if(comboBox.getSelectedItem()=="Licenciatura da Computação"){
					escolha=3;
					
				}
			}
		});

	}
}
