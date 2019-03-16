/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.AtendimentoVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Lucas
 */
public class AtendimentoDAO {
    
    public void cadastrarAtendimento(AtendimentoVO aVO) throws SQLException{
      //Buscando uma conexão com o Banco de Dados
       Connection con = ConexaoBanco.getConexao();
       /* Criando obj capaz de executar instruções SQL no banco de dados */
       Statement stat = con.createStatement();
       
       try {
           //String que recebe instrução SQL
           String sql;
           
          sql = "insert into atendimento(idAtendimento,nomeCli,formaPagamento,valorTotal)" + "values(null,'"+aVO.getNomeCliente()+"','"+aVO.getFPagamento()+"',"+aVO.getValorTotal()+")";

           
           //Executando o sql
           stat.execute(sql);
       } catch (SQLException e) {
           throw new SQLException("Erro ao Cadastrar Atendimento!");
       }finally {
       con.close();
       stat.close();
       }//fecha finally
    }//fecha metodo para inserir dados no BD
  
   //inicio metodo para buscar no BD
   public ArrayList<AtendimentoVO> buscarAtendimento() throws SQLException{
           Connection con = ConexaoBanco.getConexao();
           Statement stat = con.createStatement();
           
           try {
           String sql;
           
           //Montando o sql
           sql = "select * from atendimento";
           
           /*Executando o SQL e armazenando
           o ResultSet em um objeto do tipo ResultSet chamado rs */
           ResultSet rs = stat.executeQuery(sql);
           
           /* Criando Arraylist para armazenar objetos do tipo produto */
           ArrayList<AtendimentoVO> aten = new ArrayList<>();
           
          while(rs.next()) {
          AtendimentoVO a = new AtendimentoVO();
          
          a.setIdAtendimento((rs.getLong("idAtendimento")));
          a.setNomeCliente(rs.getString("nomeCli"));
          a.setFPagamento(rs.getString("formaPagamento"));
          a.setValorTotal(rs.getDouble("ValorTotal"));
        
          aten.add(a);
          }//fecha while
          return aten;
          
       } catch (SQLException e) {
           throw new SQLException("Erro ao buscar Atendimetos! "+e.getMessage());
       }finally{
       con.close();
       stat.close();
       }//fecha finally
    }//fecha metodo buscar no BD
   
       public void deletarAtendimento(long idAtendimento) throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        
        Statement stat = con.createStatement();
        
        try{
            String sql;
            
            sql = "delete from atendimento where idAtendimento="+idAtendimento;
          
            stat.execute(sql);
        }catch (SQLException e){
            throw  new SQLException("Erro ao deletar atendimento! "+e.getMessage());
        }finally{
            stat.close();
            con.close();
        }//fecha finally
       }//fecha metodo deletar no BD
   
     public ArrayList<AtendimentoVO> filtrarAtendimento(String query) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from atendimento " + query;

            ResultSet rs = stat.executeQuery(sql);
            ArrayList<AtendimentoVO> aten = new ArrayList<>();

            while (rs.next()) {
                AtendimentoVO aVO = new AtendimentoVO();
                aVO.setIdAtendimento(rs.getInt("idAtendimento"));
                aVO.setNomeCliente(rs.getString("nomeCli"));
                aVO.setFPagamento(rs.getString("formaPagamento"));
                aVO.setValorTotal(rs.getDouble("valorTotal"));
                
                aten.add(aVO);
            }//Fecha while
            return aten;
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar Atendimento! " + e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método filtrar    
}//fecha classe
