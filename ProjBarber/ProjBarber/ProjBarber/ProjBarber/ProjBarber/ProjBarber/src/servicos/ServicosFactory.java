/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author Braian Silva
 * @Since 12/02/2019
 * @version 1.0
 */
public class ServicosFactory {
  
   private static ProdutoServicos produtoServicos = new ProdutoServicos();

   public static ProdutoServicos getProdutoServicos(){
       
       return produtoServicos;                                
   }//fecha metodo
  
    private static final HorarioServicos HorarioServicos = new HorarioServicos();
    
    public static final HorarioServicos getHorarioServicos(){
        return HorarioServicos;
    }//fecha metodo
    
    private static final AtendimentoServicos AtendimentoServicos = new AtendimentoServicos();

    public static final AtendimentoServicos getAtendimentoServicos(){
        return AtendimentoServicos;
    }//fecha metodo
    
    private static final MesServicos MesServicos = new MesServicos();

    public static final MesServicos getMesServicos(){
        return MesServicos;
    }//fecha metodo  
}//fecha classe
