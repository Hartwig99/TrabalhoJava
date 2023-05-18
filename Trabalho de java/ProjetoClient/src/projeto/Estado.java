package projeto;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

import Conexao.Conexao;
import ExcRepositorio.ExcRepositorio;
import ProjetoServer.EstadoServer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Estado extends JFrame{
	public JTextField fieldUf;
	public  JTextField fieldDescricao;
	public Estado() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new VerticaFlowLayout());
		
		JLabel label = new JLabel("");
		panel.add(label);
		
		JLabel lblNewLabel = new JLabel("UF");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panel.add(lblNewLabel);
		
		fieldUf = new fieldSomenteLetras(2);
		panel.add(fieldUf);
		fieldUf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Descri\u00E7ao");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panel.add(lblNewLabel_1);
		
		fieldDescricao = new JTextField();
		panel.add(fieldDescricao);
		fieldDescricao.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					salvar();
					
				} catch (ExcRepositorio e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		

			
		});
		panel_1.add(btnNewButton);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setEnabled(false);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					excluir();
					
				} catch (ExcRepositorio e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		panel_1.add(btnExcluir);
		
		JButton btnAtualizar = new JButton("Atualizar") ;
		btnAtualizar.setEnabled(false);
		btnAtualizar.addActionListener(new ActionListener()  {
			
			public void actionPerformed(ActionEvent e) {
				try {
					atualizar();
				} catch (ExcRepositorio e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
			}

			
		});
		panel_1.add(btnAtualizar);
		
		JButton btnLimparDados = new JButton("Consultar");
		btnLimparDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					consultar();
				} catch (ExcRepositorio e2) {
					e2.printStackTrace();
				}
				btnExcluir.setEnabled(true);
				btnAtualizar.setEnabled(true);
				
			}
		});
		panel_1.add(btnLimparDados);
	}
	
	private void salvar() throws ExcRepositorio {
		EstadoServer.salvar(fieldUf.getText(), fieldDescricao.getText());
		
	}
	private void excluir() throws ExcRepositorio {
			EstadoServer.exluir(fieldUf.getText(), fieldDescricao.getText());
			
	
	}
	private  void consultar() throws ExcRepositorio{
		
		    EstadoServer.consultar(fieldUf.getText(), fieldDescricao.getText());
		    fieldDescricao.setText(EstadoServer.getDescricao());
		    fieldUf.setText(EstadoServer.getUf());
	}
	private void atualizar() throws ExcRepositorio {
		 EstadoServer.alterar(fieldUf.getText(), fieldDescricao.getText());
		
	}
	/*private void instanciarObjetos(){
		ImageIcon ImagemIncluir = new ImageIcon(getClass().getResource("/img/add.png"));
		ImageIcon ImagemAlterar = new ImageIcon(getClass().getResource("/img/edit.png"));
		ImageIcon ImagemExcluir = new ImageIcon(getClass().getResource("/img/remove.png"));
		ImageIcon ImagemLimpar = new ImageIcon(getClass().getResource("/img/consulta.png"));
		ImageIcon ImagemRelatorio = new ImageIcon(getClass().getResource("/img/relatorio.png"));
		ImageIcon ImagemSalvar = new ImageIcon(getClass().getResource("/img/save.png"));
		
		*/
		
	}

