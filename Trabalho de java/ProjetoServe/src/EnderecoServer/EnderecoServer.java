package EnderecoServer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Conexao.Conexao;
import ExcRepositorio.ExcRepositorio;

public class EnderecoServer {
	private static Connection con;
	 private static Statement st, st1;
	 private static ResultSet rs;
		
	 public static void salvar(String logradouro, String escolha, int Numero, String descricao ) throws ExcRepositorio {
			int id;
			try {
				con = Conexao.getConexao();
				st = con.createStatement();
				st1 = con.createStatement();
				
				ResultSet rsLocal = st1.executeQuery("select * from estado" + "where logradouro = '" + logradouro +"'");
				ResultSet rsLocal1 = st.executeQuery("select * from estado" + "where Descricao = '" + descricao +"'");
				
				if(rsLocal.next()){
					throw new ExcRepositorio("logradouro já cadastrado");
				}
				if(rsLocal1.next()){
					throw new ExcRepositorio("descriçao já cadastrado");
				}
				else{
					
					st1.executeUpdate("INSERT INTO ENDERECO (logradouro, descricao) VALUES ('" + logradouro + "','" + descricao + "')");
				}
			
		} catch (Exception e) {
			
		}
	 }
		
public static void exluir(String logradouro, String escolha, int Numero, String descricao)throws ExcRepositorio{
	 int id;
		try {
			con = Conexao.getConexao();
			st = con.createStatement();
			st1 = con.createStatement();
			
			ResultSet rsLocal = st1.executeQuery("select * from Estado" + "where Uf = '" + logradouro +"'");
			ResultSet rsLocal1 = st.executeQuery("select * from Estado" + "where Descricao = '" + descricao +"'");
			
			if(rsLocal.next()){
				JOptionPane.showMessageDialog(null, "deseja realmente excluir ? ");
			}
			if(rsLocal1.next()){
				JOptionPane.showMessageDialog(null, "deseja realmente excluir  ? ");
			}
			else{
				st1.executeUpdate("DELETE FROM ESTADO " + " WHERE uf = '"  + logradouro + "'");
				st.executeUpdate("DELETE FROM ESTADO " + " WHERE descricao = '"  + descricao + "'");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} {
			
		}		
 }
		public static void Consultar(String logradouro, String escolha, int Numero, String descricao)throws ExcRepositorio{
			 int id;
				try {
			    con = Conexao.getConexao();
				st = con.createStatement();
				st1 = con.createStatement();
				
				ResultSet rsLocal = st1.executeQuery("select * from Estado" + "where logradouro = '" + logradouro +"'");
				ResultSet rsLocal1 = st.executeQuery("select * from Estado" + "where Descricao = '" + descricao +"'");
				
				if(rsLocal.next()){
					throw new ExcRepositorio("logradouro já cadastrado");
				}
				if(rsLocal1.next()){
					throw new ExcRepositorio("descriçao já cadastrado");
				}
				else{
					
					st1.executeUpdate("select * from Estado" + "where logradouro = '" + logradouro +"'");
				     st.executeUpdate("select * from Estado" + "where Descricao = '" + descricao +"'");
				}
					 
					
				} catch (Exception e) {
					// TODO: handle exception
				} {
					
					
		 }

		}
		public static void Alterar(String logradouro, String escolha, int Numero, String descricao)throws ExcRepositorio{
			 int id;
				try {
			    con = Conexao.getConexao();
				st = con.createStatement();
				st1 = con.createStatement();
				
				ResultSet rsLocal = st1.executeQuery("select * from Estado" + "where logradouro = '" + logradouro +"'");
				ResultSet rsLocal1 = st.executeQuery("select * from Estado" + "where Descricao = '" + descricao +"'");
				
				if(rsLocal.next()){
					throw new ExcRepositorio("uf já cadastrado");
				}
				if(rsLocal1.next()){
					throw new ExcRepositorio("descriçao já cadastrado");
				}
				else{
					
					st1.executeUpdate("UPDATE Estado" + "where logradouro = '" + logradouro +"'");
				     st.executeUpdate("UPDATE Estado" + "where Descricao = '" + descricao +"'");
				}
					 
					
				} catch (Exception e) {
					// TODO: handle exception
				} {
					
					
		 }
}
}