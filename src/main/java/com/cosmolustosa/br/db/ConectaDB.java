package com.cosmolustosa.br.db;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Cosmo Lustosa
 */
public class ConectaDB {
    
    static String url = "jdbc:postgresql://localhost:5432/deposito_eletrolar";
    static String usuario = "postgres";
    static String senha = "tocar123";
  
    public static Connection abreConexao(){
        try(Connection conexao = DriverManager.getConnection(url, usuario, senha)){
              
            JOptionPane.showMessageDialog(null, "Conexao bem sucedida", "Conexão", JOptionPane.INFORMATION_MESSAGE);
            //System.out.println("Conexao bem sucedida");
            return conexao;
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    return null;
    }
}   
  
