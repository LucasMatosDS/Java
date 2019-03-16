/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.MesDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.MesVO;

/**
 *
 * @author Lucas
 */
public class MesServicos {
    
     public void cadastrarMes(MesVO mVO) throws SQLException {
        MesDAO mDAO = DAOFactory.getMesDAO();
        mDAO.cadastrarMes(mVO);
    }//fecha método cadastrar produto
    
    
   public ArrayList<MesVO> buscarMes() throws SQLException {
        MesDAO mDAO = DAOFactory.getMesDAO();
        return mDAO.buscarMes();
    }//fecha método buscar produto
   
      public void deletarMes(long idMes) throws SQLException{
        MesDAO mDAO = DAOFactory.getMesDAO();
        mDAO.deletarMes(idMes);
    }//fecha método deletar atendimento
}//fecha classe
