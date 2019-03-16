/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Braian Silva
 */
public class AtendimentoVO {
    private long idAtendimento;
    private String NomeCliente;
    private String FPagamento;
    private double ValorTotal;

    public AtendimentoVO() {
    }

    public AtendimentoVO(long idAtendimento, String NomeCliente, String FPagamento, double ValorTotal) {
        this.idAtendimento = idAtendimento;
        this.NomeCliente = NomeCliente;
        this.FPagamento = FPagamento;
        this.ValorTotal = ValorTotal;
    }

    public long getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(long idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public String getFPagamento() {
        return FPagamento;
    }

    public void setFPagamento(String FPagamento) {
        this.FPagamento = FPagamento;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    @Override
    public String toString() {
        return "AtendimentoVO{" + "idAtendimento=" + idAtendimento + ", NomeCliente=" + NomeCliente + ", FPagamento=" + FPagamento + ", ValorTotal=" + ValorTotal + '}';
    }
    
    
}
