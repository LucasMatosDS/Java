/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;
import dao.HorarioDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.HorarioVO;

/**
 *
 * @author braia
 */
public class HorarioServicos {
    public void cadastrarHorario(HorarioVO A) throws SQLException{
        HorarioDAO hDAO = DAOFactory.getHorarioDAO();
        hDAO.cadHorario(A);
    }
    public ArrayList<HorarioVO> buscarHorario()throws SQLException{
        HorarioDAO hDAO = DAOFactory.getHorarioDAO();
        return hDAO.buscaHorario();
    }
     public ArrayList<HorarioVO> filtrarHorario(String query)throws SQLException{
        HorarioDAO aDAO = DAOFactory.getHorarioDAO();
        return aDAO.filtrarHorario(query);
    }
     public void deletar(int id) throws SQLException{
        HorarioDAO aDAO = DAOFactory.getHorarioDAO();
        aDAO.deletar(id);
    }
}
