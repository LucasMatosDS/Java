/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * @author Braian Silva
 * @version 1.0
 * @since 12/02/2019
 */
public class ProdutoVO {
    
    //Atributos da classe
    private long idProduto;
    private String NomeProduto;
    private double valorCusto;
    
    public  ProdutoVO(){
    }

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return NomeProduto;
    }

    public void setNomeProduto(String NomeProduto) {
        this.NomeProduto = NomeProduto;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    @Override
    public String toString() {
        return "ProdutoVO{" + "idProduto=" + idProduto + ", NomeProduto=" + NomeProduto + ", valorCusto=" + valorCusto +'}';
    }
    
    
}
