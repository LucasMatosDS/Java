package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Braian Silva
 * @since 12/02/2019
 * @version 1.0
 */
public class ConexaoBanco {
    private static final String DRIVER   = "com.mysql.jdbc.Driver";//informando o meu driver
    private static final String URL = "jdbc:mysql://localhost:3306/gebarber";
    private static final String USUARIO = "root";//no meu caso o usuario é root
    private static final String SENHA = "";
    
    //Método que efetua a conexão com o MySql
    public static Connection getConexao() throws SQLException{
    Connection c = null;
    try{
         c = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException se) {
            throw new SQLException("Erro ao conectar! " + se.getMessage());
        }//fecha catch
        return c;
    }//fecha metodo
    
    
}//fecha classe
