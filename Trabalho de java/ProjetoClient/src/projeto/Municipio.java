package projeto;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Municipio extends JFrame{
	private JTextField textField;
	public Municipio() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new VerticaFlowLayout());
		
		JLabel lblNewLabel = new JLabel("Cidade");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblNewLabel);
		
		textField = new fieldSomenteLetras();
		panel.add(textField);
		textField.setColumns(10);
		
		Panel panel_1 = new Panel();
		panel.add(panel_1);
		
		JButton button_1 = new JButton("Salvar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(button_1);
		
		JButton button = new JButton("Excluir");
		button.setEnabled(false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(button);
		
		JButton button_2 = new JButton("Atualizar");
		button_2.setEnabled(false);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(button_2);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnConsultar);
	}

}
