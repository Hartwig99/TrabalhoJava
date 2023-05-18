package BairroServer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Conexao.Conexao;
import ExcRepositorio.ExcRepositorio;

public class BairroServer {
	private static Connection con;
	 private static Statement st, st1;
	 private static ResultSet rs;
		
	 public static void salvar(String bairro) throws ExcRepositorio {
			int id;
			try {
				con = Conexao.getConexao();
				st = con.createStatement();
				
				
				ResultSet rsLocal = st.executeQuery("select * from estado" + "where Bairro = '" + bairro +"'");
				if(rsLocal.next()){
					throw new ExcRepositorio("bairro já cadastrado");
				}
				
				else{	
				     st.executeUpdate("UPDATE Estado" + "where Descricao = '" + bairro +"'");
				}
			}
				catch (Exception e) {
					
				}
			
	 }
	 public static void exluir(String bairro)throws ExcRepositorio{
		 int id;
			try {
				con = Conexao.getConexao();
				st = con.createStatement();
				
			
				ResultSet rsLocal1 = st.executeQuery("select * from Estado" + "where bairro = '" + bairro +"'");
				
			
				if(rsLocal1.next()){
					JOptionPane.showMessageDialog(null, "deseja realmente excluir  ? ");
				}
				else{
					
					st.executeUpdate("DELETE FROM ESTADO " + " WHERE bairro = '"  + bairro + "'");
				}
			} catch (Exception e) {
				// TODO: handle exception
			} {
				
			}		
	 }
			public static void Consultar(String bairro)throws ExcRepositorio{
				 int id;
					try {
				    con = Conexao.getConexao();
					st = con.createStatement();
					
					ResultSet rsLocal1 = st.executeQuery("select * from Estado" + "where bairro = '" + bairro +"'");
					
					if(rsLocal1.next()){
						throw new ExcRepositorio("descriçao já cadastrado");
					}
					else{
						
					     st.executeUpdate("select * from Estado" + "where bairro = '" + bairro +"'");
					}	 
						
					} catch (Exception e) {
						// TODO: handle exception
					} {	
						
			 }

			}
			public static void Alterar(String bairro)throws ExcRepositorio{
				 int id;
					try {
				    con = Conexao.getConexao();
					st = con.createStatement();	
					
					ResultSet rsLocal1 = st.executeQuery("select * from Estado" + "where bairro = '" + bairro +"'");
					
					if(rsLocal1.next()){
						throw new ExcRepositorio("bairro já cadastrado");
					}
					else{	
					     st.executeUpdate("UPDATE Estado" + "where bairro = '" + bairro +"'");
					}
						 	
					} catch (Exception e) {
						// TODO: handle exception
					} {
						
						
			 }
}
}
	 