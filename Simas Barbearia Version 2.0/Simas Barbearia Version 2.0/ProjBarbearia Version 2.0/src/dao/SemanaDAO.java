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
import modelo.SemanaVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Lucas
 */
public class SemanaDAO {
    
    
        public void cadastrarSemana(SemanaVO sVO) throws SQLException{

       Connection con = ConexaoBanco.getConexao();
    
       Statement stat = con.createStatement();
       
       try {

           String sql;
         
           sql = "insert into semana(idSemana,semana,vTotal)"+"values(null, '"+ sVO.getSemana()+"', "+sVO.getvTotal()+")";
           

           stat.execute(sql);
       } catch (SQLException e) {
           throw new SQLException("Erro ao inserir Semana!");
       }finally {
       con.close();
       stat.close();
       }//fecha finally
    }//fecha metodo para inserir dados no BD
  
  
   public ArrayList<SemanaVO> buscarSemana() throws SQLException{
           Connection con = ConexaoBanco.getConexao();
           Statement stat = con.createStatement();
           
           try {
           String sql;
           
       
           sql = "select * from semana";
           
 
           ResultSet rs = stat.executeQuery(sql);
           
          
           ArrayList<SemanaVO> semana = new ArrayList<>();
           
          while(rs.next()) {
          SemanaVO s = new SemanaVO();
          
          s.setIdSemana((rs.getLong("idSemana")));
          s.setSemana(rs.getString("semana"));     
          s.setvTotal(rs.getDouble("vTotal"));
          
          semana.add(s);
          }//fecha while
          return semana;
          
       } catch (SQLException e) {
           throw new SQLException("Erro ao buscar Semana! "+e.getMessage());
       }finally{
       con.close();
       stat.close();
       }//fecha finally
    }//fecha metodo buscar no BD
   
   public void deletarSemana(long idSemana) throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        
        Statement stat = con.createStatement();
        
        try{
            String sql;
            
            sql = "delete from semana where idSemana=" +idSemana;
          
            stat.execute(sql);
        }catch (SQLException e){
            throw  new SQLException("Erro ao deletar Semana! "+e.getMessage());
        }finally{
            stat.close();
            con.close();
        }//fecha finally
       }//fecha metodo deletar no BD
    
}
