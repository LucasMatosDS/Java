/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.SemanaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.SemanaVO;

/**
 *
 * @author Lucas
 */
public class SemanaServicos {
    
     public void cadastrarSemana(SemanaVO sVO) throws SQLException {
        SemanaDAO sDAO = DAOFactory.getSemanaDAO();
        sDAO.cadastrarSemana(sVO);
    }//fecha método cadastrar produto
    
    
   public ArrayList<SemanaVO> buscarSemana() throws SQLException {
        SemanaDAO sDAO = DAOFactory.getSemanaDAO();
        return sDAO.buscarSemana();
    }//fecha método buscar produto
   
      public void deletarSemana(long idSemana) throws SQLException{
        SemanaDAO sDAO = DAOFactory.getSemanaDAO();
        sDAO.deletarSemana(idSemana);
    }//fecha método deletar atendimento
}
