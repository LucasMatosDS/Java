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
public class SemanaVO {
    
    private long idSemana;
    private String semana;
    private double vTotal;

    public SemanaVO() {
    }

    public SemanaVO(long idSemana, String semana, double vTotal) {
        this.idSemana = idSemana;
        this.semana = semana;
        this.vTotal = vTotal;
    }

    public long getIdSemana() {
        return idSemana;
    }

    public void setIdSemana(long idSemana) {
        this.idSemana = idSemana;
    }

    public String getSemana() {
        return semana;
    }

    public void setSemana(String semana) {
        this.semana = semana;
    }

    public double getvTotal() {
        return vTotal;
    }

    public void setvTotal(double vTotal) {
        this.vTotal = vTotal;
    }

    @Override
    public String toString() {
        return "SemanaVO{" + "idSemana=" + idSemana + ", semana=" + semana + ", vTotal=" + vTotal + '}';
    }
    
    
    
    
}//fecha classe
