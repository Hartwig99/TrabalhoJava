package Conexao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import ExcRepositorio.ExcRepositorio;

public class Conexao {
	
		private static Connection con;

		public static Connection getConexao() throws FileNotFoundException, IOException, ExcRepositorio {
			Properties configuracao = null;
			configuracao = new Properties();
			File name = new File("src/config/config.ini");
			String vsCaminho = (name.getAbsolutePath());
			configuracao.load(new FileInputStream(vsCaminho));

			String driver = configuracao.getProperty("banco_driver").trim();
			String url = configuracao.getProperty("banco_url_ODBC").trim();
			String login = configuracao.getProperty("banco_usuario").trim();
			String senha = configuracao.getProperty("banco_senha").trim();

			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, login, senha);
			} catch (ClassNotFoundException e) {
				throw new ExcRepositorio("Driver não encontrado: " + e.getMessage());
			} catch (SQLException e) {
				throw new ExcRepositorio("Erro abrindo conexão: " + e.getMessage());
			}
			return con;
		}
	}

