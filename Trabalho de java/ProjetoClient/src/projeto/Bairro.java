package projeto;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bairro extends JFrame {
	private JTextField fieldBairro;
	public Bairro() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel labelBairro = new JLabel("Bairro");
		labelBairro.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(labelBairro, BorderLayout.NORTH);
		
		fieldBairro = new fieldSomenteLetras();
		panel.add(fieldBairro, BorderLayout.SOUTH);
		fieldBairro.setColumns(10);
		
		Panel panel_1 = new Panel();
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnSalvar);
		
		JButton button = new JButton("Excluir");
		button.setEnabled(false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(button);
		
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
