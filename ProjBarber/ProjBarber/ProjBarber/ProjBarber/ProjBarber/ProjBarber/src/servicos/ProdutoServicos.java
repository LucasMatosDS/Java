/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;
import dao.DAOFactory;
import dao.ProdutoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ProdutoVO;
/**
 *
 * @author Braian Silva
 * @Since 12/02/2019
 * @version 1.0
 */
public class ProdutoServicos {
    
    public void cadastrarProduto(ProdutoVO pVO) throws SQLException {
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        pDAO.cadastrarProduto(pVO);
    }//fecha método cadastrar produto
    
    
   public ArrayList<ProdutoVO> buscarProdutos() throws SQLException {
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        return pDAO.buscarProdutos();
    }//fecha método buscar produto
   
   public void alterarProduto(ProdutoVO pVO) throws SQLException {
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        pDAO.alterarProduto(pVO);
    }//fecha método alterar produto
   
  public ArrayList<ProdutoVO> filtrarProduto(String query)throws SQLException{
        ProdutoDAO aDAO = DAOFactory.getProdutoDAO();
        return aDAO.filtrarProduto(query);
    }
  
    public void deletarProduto(long idProduto) throws SQLException{
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        pDAO.deletarProduto(idProduto);
    }//fecha método deletar produto
   }//fecha classe
