package Postgress;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


import Conexao.Conexao;

public class Postgres {

    private static Postgres conectado = null;
    private Connection conexao;
    private Postgres(){
        try {
            conexao = Conexao.getConexao();
        } catch (FileNotFoundException e) {
            Logger.getLogger(Postgres.class.getName()).log(Level.SEVERE, null, e);
		} catch (IOException e) {
            Logger.getLogger(Postgres.class.getName()).log(Level.SEVERE, null, e);
		} catch (ExcRepositorio.ExcRepositorio e) {
            Logger.getLogger(Postgres.class.getName()).log(Level.SEVERE, null, e);
		}
    }

    public static Postgres getInstance(){

        if(conectado == null){
            conectado = new  Postgres();
            return conectado;
        }else{
            return conectado;
        }
    }

    public Connection getConnection(){
        return conexao;
    }

    public void mySqlDisconnect(){
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Postgres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 }