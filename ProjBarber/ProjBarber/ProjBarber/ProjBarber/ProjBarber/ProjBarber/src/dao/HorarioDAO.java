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
import modelo.HorarioVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Braian Silva
 */
public class HorarioDAO {
    public void cadHorario (HorarioVO A) throws SQLException{
    Connection con = ConexaoBanco.getConexao();
    Statement stat = con.createStatement();
        try {
            String sql = "insert into horario(idhorario,nomecli,telefone,hora,minuto)" + "values(null,'"+A.getNomecli()+"',"+A.getTelefone()+","+A.getHora()+","+A.getMinuto()+")";
            stat.execute(sql);
        } catch (Exception e) {
            throw new  SQLException("Erro ao marcar horário");
        }finally{
        con.close();
        stat.close();
        }//fecha finally
    }//fecha metodo
    
    public ArrayList<HorarioVO>buscaHorario() throws SQLException{
    Connection con = ConexaoBanco.getConexao();
    Statement stat = con.createStatement();
    
        try {
            String sql = "select * from horario";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<HorarioVO> AH = new ArrayList<HorarioVO>();
            
            while (rs.next()) {
                HorarioVO ho = new HorarioVO();
                ho.setIdhorario(rs.getInt("idhorario"));
                ho.setNomecli(rs.getString("nomecli"));
                ho.setTelefone(rs.getInt("telefone"));
                ho.setHora(rs.getInt("hora"));
                ho.setMinuto(rs.getInt("minuto"));
                AH.add(ho);
            }
            return AH;
        } catch (Exception e) {
            throw new SQLException("Erro ao buscar hora marcada! ");
        }finally{
            stat.close();
            con.close();
        }//fecha finally
    }//fecha metodo
    
        public ArrayList<HorarioVO>filtrarHorario(String query) throws SQLException{
        Connection conn = ConexaoBanco.getConexao();
        Statement stat = conn.createStatement();
        
        try {
            String sql = "select * from horario " + query;
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<HorarioVO> aAr = new ArrayList<>();
            
            while(rs.next()){
                HorarioVO a = new HorarioVO();
                a.setIdhorario(rs.getInt("idhorario"));
                a.setNomecli(rs.getString("nomecli"));
                a.setTelefone(rs.getInt("telefone"));
                a.setHora(rs.getInt("hora"));
                a.setMinuto(rs.getInt("minuto"));
                aAr.add(a);
            }
            return aAr;
        } catch (Exception e) {
            throw new SQLException("Erro ao filtrar horas marcadas! " +e.getMessage());     
        }finally{
            stat.close();
            conn.close();
        }//fecha finally
    }//fecha metodo
        
            
        public void deletarHorario(int idHorario) throws SQLException{
        Connection conn = ConexaoBanco.getConexao();
        Statement stat = conn.createStatement();
        
        try {
            String sql = "delete from horario where idhorario=" +idHorario;
            stat.execute(sql);
        }catch (SQLException se) {
            throw new SQLException("Erro ao deletar hora marcada! "+ se.getMessage());
        }finally{
            stat.close();
            conn.close();
        }//fecha finally
    }//fecha metodo
        public void deletar(int id) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql="delete from horario where idhorario="+id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar hora marcada!" +e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha metodo
}//fecha classe
