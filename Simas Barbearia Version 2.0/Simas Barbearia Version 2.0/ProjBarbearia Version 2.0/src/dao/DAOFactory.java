/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author braian
 */
public class DAOFactory {
    private static ProdutoDAO produtoDAO = new ProdutoDAO();
    public static ProdutoDAO getProdutoDAO(){
    return produtoDAO;
    }//fecha metodo
    private static HorarioDAO HorarioDAO = new HorarioDAO();
    public static HorarioDAO getHorarioDAO(){
    return HorarioDAO;
    }//fecha metodo
    
    private static AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
    public static AtendimentoDAO getAtendimentoDAO(){
    return atendimentoDAO;
    }//fecha metodo
    
    private static MesDAO mesDAO = new MesDAO();
    public static MesDAO getMesDAO(){
    return mesDAO;
    }//fecha metodo
    
    private static SemanaDAO semanaDAO = new SemanaDAO();
    public static SemanaDAO getSemanaDAO(){
    return semanaDAO;
    }//fecha metodo
}//fecha classe
