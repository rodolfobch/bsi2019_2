/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobsi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Laboratorio
 */
public class Conexao {
    protected Connection conn;
    public Conexao(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://127.0.0.1:3306/aula?serverTimezone=UTC";
            String user = "root";
            String passwd = "";
            
            conn = DriverManager.getConnection(url, user, passwd);
            
/*
            //TODO: colocar no lugar correto
            String comando = "INSERT INTO cliente "
                    + "(nome,endereco,datanasc) VALUES "
                    + "('Joao','Rua X','2010-05-20')";
            
            Statement stmt = conn.createStatement();
            int linhas = stmt.executeUpdate(comando);
            System.out.printf("%d linhas atualizadas no banco\n",linhas);
*/
        }catch(ClassNotFoundException e){
            System.out.printf("Erro no driver: %s\n",
                    e.getMessage());
        }catch(SQLException e){
            System.out.printf("Erro no banco: %s\n",
                    e.getMessage());
        }
    }
    
    
    public static void main(String args[]){
        Conexao c = new Conexao();
    }
}
