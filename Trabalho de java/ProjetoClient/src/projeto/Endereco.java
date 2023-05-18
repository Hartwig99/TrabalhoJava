package projeto;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

import EnderecoServer.EnderecoServer;

import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Endereco extends JFrame{
	private JTextField fieldLogradouro;
	private JTextField fieldNumero;
	private JTextField fieldEscolha;
	private JTextField fieldReferencia;
	public Endereco() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new VerticaFlowLayout());
		
		JLabel lblNewLabel = new JLabel("Logradouro");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(lblNewLabel);
		
		fieldLogradouro = new fieldSomenteLetras();
		panel.add(fieldLogradouro);
		fieldLogradouro.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero ");
		lblNumero.setFont(new Font("Arial", Font.PLAIN, 14));
		panel.add(lblNumero);
		
		fieldNumero = new JTextField();
		panel.add(fieldNumero);
		fieldNumero.setColumns(10);
		
		JLabel lblEscolha = new JLabel("Sala ou Apartamento");
		panel.add(lblEscolha);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Sala");
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Apartamento");
		panel.add(rdbtnNewRadioButton_1);
		
		fieldReferencia = new JTextField();
		panel.add(fieldReferencia);
		fieldReferencia.setColumns(10);
		
		JLabel lblReferencia = new JLabel("Referencia");
		panel.add(lblReferencia);
		
		fieldEscolha = new JTextField();
		panel.add(fieldEscolha);
		fieldEscolha.setColumns(10);
		
		Panel panel_1 = new Panel();
		panel.add(panel_1);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}

			
		});
		panel_1.add(btnSalvar);
		
		JButton button_2 = new JButton("Excluir");
		button_2.setEnabled(false);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(button_2);
		
		JButton button_1 = new JButton("Atualizar");
		button_1.setEnabled(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(button_1);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnConsultar);
	}
	
	
}
