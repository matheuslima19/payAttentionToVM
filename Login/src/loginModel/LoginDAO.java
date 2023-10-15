/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginModel;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
public class LoginDAO {
    
    public void Login(String email, String senha) throws SQLException{
        Connection conexao = new Conexao().getConnection();
        String sql = "SELECT email, senha FROM UsuarioAluno WHERE email = '"+email+"' AND senha = '"+senha+"'";
        System.out.println("sql");
        PreparedStatement statment = conexao.prepareStatement(sql);
        ResultSet rs = statment.executeQuery();
        
        if (rs.next()) {
            System.out.println("Possui");
        }else{
            System.out.println("Não possui");
        }
        conexao.close();
    }
    
}
