/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 *@author Braian Silva
 *@since 16/02/2019
 *@version 1.0
 */
public class HorarioVO {
    private long idhorario;
    private String nomecli;
    private int telefone;
    private int hora;
    private int minuto;

    public HorarioVO() {
    }

    public HorarioVO(long idhorario, String nomecli, int telefone, int hora, int minuto) {
        this.idhorario = idhorario;
        this.nomecli = nomecli;
        this.telefone = telefone;
        this.hora = hora;
        this.minuto = minuto;
    }

    public long getIdhorario() {
        return idhorario;
    }

    public void setIdhorario(long idhorario) {
        this.idhorario = idhorario;
    }

    public String getNomecli() {
        return nomecli;
    }

    public void setNomecli(String nomecli) {
        this.nomecli = nomecli;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        return "HorarioVO{" + "idhorario=" + idhorario + ", nomecli=" + nomecli + ", telefone=" + telefone + ", hora=" + hora + ", minuto=" + minuto + '}';
    }
}
