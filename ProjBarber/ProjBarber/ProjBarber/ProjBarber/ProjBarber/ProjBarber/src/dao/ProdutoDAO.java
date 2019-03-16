/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import persistencia.ConexaoBanco;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.ProdutoVO;

/**
 *
 * @author Braian Silva
 * @since 12/02/2019
 * @version 1.0
 */
public class ProdutoDAO {
 
    
//inicio metodo para inserir dados no BD
   public void cadastrarProduto(ProdutoVO pVO) throws SQLException{
      //Buscando uma conexão com o Banco de Dados
       Connection con = ConexaoBanco.getConexao();
       /* Criando obj capaz de executar instruções SQL no banco de dados */
       Statement stat = con.createStatement();
       
       try {
           //String que recebe instrução SQL
           String sql;
           /*Montando instrução INSERT para inserir um objeto pVO no banco MySQL*/
           sql = "insert into produto(idproduto,nomeproduto,valorcusto)"+"values(null, '"+ pVO.getNomeProduto()+"', "+pVO.getValorCusto()+")";
           
           //Executando o sql
           stat.execute(sql);
       } catch (SQLException e) {
           throw new SQLException("Erro ao inserir produto!");
       }finally {
       con.close();
       stat.close();
       }//fecha finally
    }//fecha metodo para inserir dados no BD
  
   //inicio metodo para buscar no BD
   public ArrayList<ProdutoVO> buscarProdutos() throws SQLException{
           Connection con = ConexaoBanco.getConexao();
           Statement stat = con.createStatement();
           
           try {
           String sql;
           
           //Montando o sql
           sql = "select * from produto";
           
           /*Executando o SQL e armazenando
           o ResultSet em um objeto do tipo ResultSet chamado rs */
           ResultSet rs = stat.executeQuery(sql);
           
           /* Criando Arraylist para armazenar objetos do tipo produto */
           ArrayList<ProdutoVO> prod = new ArrayList<>();
           
          while(rs.next()) {
          ProdutoVO p = new ProdutoVO();
          
          p.setIdProduto((rs.getLong("idproduto")));
          p.setNomeProduto(rs.getString("nomeproduto"));
          p.setValorCusto(rs.getDouble("valorcusto"));
          
          prod.add(p);
          }//fecha while
          return prod;
       } catch (SQLException e) {
           throw new SQLException("Erro ao buscar produtos! "+e.getMessage());
       }finally{
       con.close();
       stat.close();
       }//fecha finally
    }//fecha metodo buscar no BD
   
   
   //inicio método para alterar no BD
        public void alterarProduto(ProdutoVO pVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;    
   
            sql = "update produto set "
                    + "nomeproduto='" + pVO.getNomeProduto()+ "', valorcusto=" + pVO.getValorCusto() +" "
                    + "where idproduto=" + pVO.getIdProduto() + "";

            stat.executeUpdate(sql);

        } catch (SQLException se) {
            throw new SQLException("Erro ao alterar "
                    + "produto! " + se.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha metodo alterar no BD
   
   
    public void deletarProduto(long idProduto) throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        
        Statement stat = con.createStatement();
        
        try{
            String sql;
            
            sql = "delete from produto where idproduto="+idProduto;
          
            stat.execute(sql);
        }catch (SQLException se){
            throw  new SQLException("Erro ao deletar produto! "+se.getMessage());
        }finally{
            stat.close();
            con.close();
        }//fecha finally
       }//fecha metodo deletar no BD

      //filtrar produto
      public ArrayList<ProdutoVO>filtrarProduto(String query) throws SQLException{
        Connection conn = ConexaoBanco.getConexao();
        Statement stat = conn.createStatement();
        
        try {
            String sql = "select * from produto " + query;
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<ProdutoVO> aAr = new ArrayList<>();
            
            while(rs.next()){
                ProdutoVO a = new ProdutoVO();
                a.setIdProduto(rs.getInt("idproduto"));
                a.setNomeProduto(rs.getString("nomeproduto"));
                a.setValorCusto(rs.getInt("valorcusto"));
                aAr.add(a);
            }
            return aAr;
        } catch (Exception e) {
            throw new SQLException("Erro ao filtrar produtos! " +e.getMessage());     
        }finally{
            stat.close();
            conn.close();
        }//fecha finally
    }//fecha metodo    
    
}//fecha classe
