package projeto;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastros = new JMenu("Cadastros");
		menuBar.add(mnCadastros);
		
		JMenuItem mntmEstado = new JMenuItem("Estado");
		mntmEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Estado frame = new Estado();
				frame.setVisible(true);
				frame.setSize(400,400);
			}
		});
		mnCadastros.add(mntmEstado);
		
		JMenuItem mntmMunicipio = new JMenuItem("Municipio");
		mntmMunicipio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Municipio frame = new Municipio();
				frame.setVisible(true);
				frame.setSize(400,400);
			}
		});
		mnCadastros.add(mntmMunicipio);
		
		JMenuItem mntmBairro = new JMenuItem("Bairro");
		mntmBairro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Bairro frame = new Bairro();
				frame.setVisible(true);
				frame.setSize(400,400);
			}
		});
		mnCadastros.add(mntmBairro);
		
		JMenuItem mntmEndereo = new JMenuItem("Endere\u00E7o");
		mntmEndereo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Endereco frame = new Endereco();
				frame.setVisible(true);
				frame.setSize(400,400);
			}
		});
		mnCadastros.add(mntmEndereo);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sair();
			}

			private void Sair() {
				System.exit(0);
				
			}
		});
		mnCadastros.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	}
	

}
