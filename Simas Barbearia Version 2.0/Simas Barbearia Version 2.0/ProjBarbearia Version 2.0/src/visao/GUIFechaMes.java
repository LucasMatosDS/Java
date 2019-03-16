/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.MesVO;
import servicos.MesServicos;
import servicos.ServicosFactory;

/**
 *
 * @author Lucas
 */
public class GUIFechaMes extends javax.swing.JInternalFrame {
DefaultTableModel dtm = new DefaultTableModel(
    new Object[][]{},
    new Object[]{"Código", "Mês", "Valor Total"});


    public GUIFechaMes(){
        initComponents();
        prencherTabelaMes();
        IconeTela();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtMes = new javax.swing.JTable();
        jbAtualizar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();

        setClosable(true);

        jtMes.setFocusable(false);
        jtMes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtMes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Mês", "Valor Total"
            }
        ));
        jtMes.getTableHeader().setResizingAllowed(false);
        jtMes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtMes);

        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jbAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtualizar)
                    .addComponent(jbExcluir))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
              limparTabela();
              prencherTabelaMes();
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
              deletarMes();
              limparTabela();
              prencherTabelaMes();
    }//GEN-LAST:event_jbExcluirActionPerformed

      private void IconeTela(){
       String URL = "/icones/icon_title2.png";
       setFrameIcon(new ImageIcon(this.getClass().getResource(URL)));
    }
    
     private void limparTabela(){
           dtm.setNumRows(0);
        }
     
        private void prencherTabelaMes(){
        try {
            MesServicos ms = ServicosFactory.getMesServicos();
           
            ArrayList<MesVO> mes = new ArrayList<>();
            
            mes = ms.buscarMes();
            
            NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));            
             
              
            for(int i = 0; i < mes.size(); i++){
               dtm.addRow(new String[]{
                  String.valueOf(mes.get(i).getIdMes()),
                  String.valueOf(mes.get(i).getMes()),                  
                   nf.format(mes.get(i).getvTotal())
               });
            }//fecha for
            
            
            jtMes.setModel(dtm);
            
        } catch (Exception e) {
               JOptionPane.showMessageDialog(
                        null,
                        "Erro ao Prencher tabela do Mes!",
                        "Mensagem de Erro",
                        JOptionPane.ERROR_MESSAGE);
        }//fecha catch
    }//fecha prencher tabela
  
        private void deletarMes() {
        try {
            
            int linha = jtMes.getSelectedRow();
            
            
            if (linha == -1) {
     JOptionPane.showMessageDialog(
                        null,
                        "você não selecionou nenhuma linha!",
                        "Mensagem de atenção",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                MesServicos ms = ServicosFactory.getMesServicos();
                
                String idMes = (String) jtMes.getValueAt(linha, 0);
                
                ms.deletarMes(Long.parseLong(idMes));

                
        JOptionPane.showMessageDialog(
                        null,
                        "Mes excluido com sucesso!",
                        "Mensagem de confirmação",
                        JOptionPane.INFORMATION_MESSAGE);
            }//fecha else
        } catch (Exception e) {
                 JOptionPane.showMessageDialog(
                        null,
                        "erro ao deletar!",
                        "Mensagem de erro",
                        JOptionPane.ERROR_MESSAGE);
        }//fecha catch        
    }//fecha deletar
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JTable jtMes;
    // End of variables declaration//GEN-END:variables
}
