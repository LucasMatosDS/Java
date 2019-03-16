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
import modelo.MesVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Lucas
 */
public class MesDAO {
    
        public void cadastrarMes(MesVO mVO) throws SQLException{

       Connection con = ConexaoBanco.getConexao();
    
       Statement stat = con.createStatement();
       
       try {

           String sql;
         
           sql = "insert into mes(idMes,mes,vTotal)"+"values(null, '"+ mVO.getMes()+"', "+mVO.getvTotal()+")";
           

           stat.execute(sql);
       } catch (SQLException e) {
           throw new SQLException("Erro ao inserir Mes!");
       }finally {
       con.close();
       stat.close();
       }//fecha finally
    }//fecha metodo para inserir dados no BD
  
  
   public ArrayList<MesVO> buscarMes() throws SQLException{
           Connection con = ConexaoBanco.getConexao();
           Statement stat = con.createStatement();
           
           try {
           String sql;
           
       
           sql = "select * from mes";
           
 
           ResultSet rs = stat.executeQuery(sql);
           
          
           ArrayList<MesVO> mes = new ArrayList<>();
           
          while(rs.next()) {
          MesVO m = new MesVO();
          
          m.setIdMes((rs.getLong("idMes")));
          m.setMes(rs.getString("mes"));
          m.setvTotal(rs.getDouble("vTotal"));
          
          mes.add(m);
          }//fecha while
          return mes;
          
       } catch (SQLException e) {
           throw new SQLException("Erro ao buscar mes! "+e.getMessage());
       }finally{
       con.close();
       stat.close();
       }//fecha finally
    }//fecha metodo buscar no BD
   
   public void deletarMes(long idMes) throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        
        Statement stat = con.createStatement();
        
        try{
            String sql;
            
            sql = "delete from mes where idMes=" +idMes;
          
            stat.execute(sql);
        }catch (SQLException e){
            throw  new SQLException("Erro ao deletar Mes! "+e.getMessage());
        }finally{
            stat.close();
            con.close();
        }//fecha finally
       }//fecha metodo deletar no BD

}//fecha classe
