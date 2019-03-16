/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.AtendimentoDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.AtendimentoVO;

/**
 *
 * @author Lucas
 */
public class AtendimentoServicos {
    
    public void cadastrarAtendimento(AtendimentoVO aVO) throws SQLException {
       AtendimentoDAO aDAO = DAOFactory.getAtendimentoDAO();
       aDAO.cadastrarAtendimento(aVO);
    }//fecha método cadastrar Atendimento
    
    
   public ArrayList<AtendimentoVO> buscarAtendimento() throws SQLException {
       AtendimentoDAO aDAO = DAOFactory.getAtendimentoDAO();
       return aDAO.buscarAtendimento();
    }//fecha método buscar Atendimento
   
     public ArrayList<AtendimentoVO> filtrarAtendimento(String query)throws SQLException{
        AtendimentoDAO aDAO = DAOFactory.getAtendimentoDAO();
        return aDAO.filtrarAtendimento(query);
     }
     
      public void deletarAtenidmento(long idAtendimento) throws SQLException{
        AtendimentoDAO aDAO = DAOFactory.getAtendimentoDAO();
        aDAO.deletarAtendimento(idAtendimento);
    }//fecha método deletar atendimento
   
}//fecha classe
