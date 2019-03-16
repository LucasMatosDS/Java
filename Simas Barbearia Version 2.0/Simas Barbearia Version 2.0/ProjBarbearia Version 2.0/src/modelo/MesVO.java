/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Lucas
 */
public class MesVO {
    
    private long idMes;
    private String Mes;
    private double vTotal;

    public MesVO() {
    }

    public MesVO(long idMes, String Mes, double vTotal) {
        this.idMes = idMes;
        this.Mes = Mes;
        this.vTotal = vTotal;
    }

    public long getIdMes() {
        return idMes;
    }

    public void setIdMes(long idMes) {
        this.idMes = idMes;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public double getvTotal() {
        return vTotal;
    }

    public void setvTotal(double vTotal) {
        this.vTotal = vTotal;
    }

    @Override
    public String toString() {
        return "MesVO{" + "idMes=" + idMes + ", Mes=" + Mes + ", vTotal=" + vTotal + '}';
    }

  
}//fecha classe
