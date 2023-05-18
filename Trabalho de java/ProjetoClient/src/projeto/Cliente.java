package projeto;

import java.io.IOException;

import Conexao.Conexao;
import ExcRepositorio.ExcRepositorio;

public class Cliente {
    public static void main(String[] args) {
		try {
			Conexao.getConexao();
		} catch (IOException | ExcRepositorio e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   
}
