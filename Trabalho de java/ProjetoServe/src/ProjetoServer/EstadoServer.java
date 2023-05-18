package ProjetoServer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Conexao.Conexao;
import ExcRepositorio.ExcRepositorio;

public class EstadoServer {
	private static Connection con;
	private static Statement st, st1;
	private static ResultSet rs;
	private static String uf;
	private static String descricao;

	public static void salvar(String uf, String descricao) throws ExcRepositorio {
	  try {
			con = Conexao.getConexao();
			st = con.createStatement();
			st1 = con.createStatement();

			ResultSet rsLocal = st1.executeQuery("select * from Estado " + "where Uf = '" + uf + "'");
			ResultSet rsLocal1 = st.executeQuery("select * from Estado " + "where Descricao = '" + descricao + "'");

			if (rsLocal.next()) {
				throw new ExcRepositorio("uf já cadastrado");
			}
			if (rsLocal1.next()) {
				throw new ExcRepositorio("descriçao já cadastrado");
			} else {
				/*
				 * rsLocal.moveToInsertRow(); rsLocal.updateString(id, uf);
				 * rsLocal.insertRow(); rsLocal.moveToCurrentRow();
				 */
				
				st1.executeUpdate("INSERT INTO estado(idestado,uf, descricao) VALUES ((select max(idestado)+1 from estado),'"
				            + uf + "','"
						+ descricao + "')");
				JOptionPane.showMessageDialog(null, "Dados foram salvos com sucesso !");

			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void exluir(String uf, String descricao) throws ExcRepositorio {
		
		try {
			con = Conexao.getConexao();
			st = con.createStatement();
			st1 = con.createStatement();

			/*ResultSet rsLocal = st1.executeQuery("select * from Estado " + " where Uf = '" + uf + "'");
			ResultSet rsLocal1 = st.executeQuery("select * from Estado " + " where Descricao = '" + descricao + "'");*/

		JOptionPane.showMessageDialog(null, "deseja realmente excluir ?");
				st1.executeUpdate("DELETE FROM estado "+"where uf ='"+uf+"'");
				st.executeUpdate("DELETE FROM estado " + "where descricao ='"+descricao+"'");
				JOptionPane.showMessageDialog(null, "Dados Excluido com sucesso");
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		{

		}
	}

	public static void consultar(String uf, String descricao) throws ExcRepositorio {
		int id;
		
	
		try { 
			con = Conexao.getConexao();
			st = con.createStatement();
			st1 = con.createStatement();
	
			
			ResultSet rs =st1.executeQuery("select * from Estado " + "where Uf = '" + uf + "'");
			ResultSet rs1 =st.executeQuery("select * from Estado " + "where Descricao = '" + descricao + "'");
        
			rs.next();
			rs1.next();
			setUf(rs.getString( uf ));
			setDescricao(rs1.getString(descricao));
			
			
			
			JOptionPane.showMessageDialog(null, "Dados  com sucesso !");
		}
		catch (Exception e2) {
			e2.printStackTrace();
		}

	}


	public static void alterar(String uf, String descricao) throws ExcRepositorio {
		
		try {
			con = Conexao.getConexao();
			st = con.createStatement();
			st1 = con.createStatement();

			ResultSet rsLocal = st1.executeQuery("select * from estado " + "where uf = '" + uf + "'");
			ResultSet rsLocal1 = st.executeQuery("select * from estado " + "where descricao = '" + descricao + "'");

			if (rsLocal.next()) {
				throw new ExcRepositorio("deseja alterar o campo uf e descricao");
			}
			if (rsLocal1.next()) {
				throw new ExcRepositorio("descriçao já cadastrado");
			} else {

				st1.executeUpdate("UPDATE estado "+" set uf ='" +uf+ "'");
				st.executeUpdate("UPDATE  estado "+" set descricao ='" +descricao + "'");
				JOptionPane.showMessageDialog(null, "Dados Atualizado com sucesso !");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		{

		}
	}

	public static String getUf() {
		return uf;
	}

	public static void setUf(String uf) {
		EstadoServer.uf = uf;
	}

	public static String getDescricao() {
		return descricao;
	}

	public static void setDescricao(String descricao) {
		EstadoServer.descricao = descricao;
	}
}
