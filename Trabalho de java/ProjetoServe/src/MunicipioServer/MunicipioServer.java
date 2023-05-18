package MunicipioServer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Conexao.Conexao;
import ExcRepositorio.ExcRepositorio;

public class MunicipioServer {
	private static Connection con;
	 private static Statement st, st1;
	 private static ResultSet rs;
		
	 public static void salvar(String cidade) throws ExcRepositorio {
			int id;
			try {
				con = Conexao.getConexao();
				st = con.createStatement();
				
				ResultSet rsLocal1 = st.executeQuery("select * from estado" + "where Cidade = '" + cidade +"'");
			}
			
				catch (Exception e) {
					
				}
	 }
			 public static void exluir(String cidade)throws ExcRepositorio{
				 int id;
					try {
						con = Conexao.getConexao();
						st = con.createStatement();
						
					
						ResultSet rsLocal1 = st.executeQuery("select * from Estado" + "where cidade = '" + cidade +"'");
						
					
						if(rsLocal1.next()){
							JOptionPane.showMessageDialog(null, "deseja realmente excluir  ? ");
						}
						else{
							
							st.executeUpdate("DELETE FROM ESTADO " + " WHERE cidade = '"  + cidade + "'");
						}
					} catch (Exception e) {
						// TODO: handle exception
					} {
						
					}		
			 }
					public static void Consultar(String cidade)throws ExcRepositorio{
						 int id;
							try {
						    con = Conexao.getConexao();
							st = con.createStatement();
							
							ResultSet rsLocal1 = st.executeQuery("select * from Estado" + "where cidade = '" + cidade +"'");
							
							if(rsLocal1.next()){
								throw new ExcRepositorio("descriçao já cadastrado");
							}
							else{
								
							     st.executeUpdate("select * from Estado" + "where bairro = '" + cidade +"'");
							}	 
								
							} catch (Exception e) {
								// TODO: handle exception
							} {	
								
					 }

					}
	 
					public static void Alterar(String cidade)throws ExcRepositorio{
						 int id;
							try {
						    con = Conexao.getConexao();
							st = con.createStatement();	
							
							ResultSet rsLocal1 = st.executeQuery("select * from Estado" + "where cidade = '" + cidade +"'");
							
							if(rsLocal1.next()){
								throw new ExcRepositorio("cidade já cadastrado");
							}
							else{	
							     st.executeUpdate("UPDATE Estado" + "where cidade = '" + cidade +"'");
							}
								 	
							} catch (Exception e) {
								// TODO: handle exception
							} {
								
								
					 }
		}
		
}
