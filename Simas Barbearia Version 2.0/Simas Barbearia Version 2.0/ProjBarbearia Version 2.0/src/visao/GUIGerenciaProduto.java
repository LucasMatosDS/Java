/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import com.placeholder.PlaceHolder;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ProdutoVO;
import servicos.ProdutoServicos;
import servicos.ServicosFactory;

/**
 *
 * @author braia
 */
public class GUIGerenciaProduto extends javax.swing.JInternalFrame {
    PlaceHolder holder;
    
    DefaultTableModel dtm = new DefaultTableModel(
    new Object[][]{},
    new Object[]{"Código","Nome","Valor"});
    
    
    
    
    public GUIGerenciaProduto() { //construtor
        initComponents();
        prencherTabela();
        IconeTela();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProduto = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jlValor = new javax.swing.JLabel();
        jtValor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbAlterarDados = new javax.swing.JButton();
        jbconfirmarAlteracao = new javax.swing.JButton();
        jlcodigo = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtCodigo = new javax.swing.JTextField();
        jlNome = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbRemoverProduto = new javax.swing.JButton();

        jButton3.setText("jButton3");

        jButton1.setText("jButton1");

        setClosable(true);
        setResizable(true);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Valor"
            }
        ));
        jtProduto.setFocusable(false);
        jtProduto = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtProduto.getTableHeader().setResizingAllowed(false);
        jtProduto.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtProduto);

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlValor.setText("Valor:");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbAlterarDados.setText("Alterar");
        jbAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarDadosActionPerformed(evt);
            }
        });

        jbconfirmarAlteracao.setText("Confirmar Alteração");
        jbconfirmarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbconfirmarAlteracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbconfirmarAlteracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAlterarDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbAlterarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbconfirmarAlteracao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlcodigo.setText("Codigo:");

        jtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeActionPerformed(evt);
            }
        });

        jtCodigo.setEnabled(false);
        jtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCodigoActionPerformed(evt);
            }
        });

        jlNome.setText("Nome:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlcodigo)
                                .addGap(24, 24, 24)
                                .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNome)
                                    .addComponent(jlValor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtValor)
                                    .addComponent(jtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlcodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbRemoverProduto.setText("Remover Produto");
        jbRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbRemoverProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbRemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      private void IconeTela(){
       String URL = "/icones/icon_title2.png";
       setFrameIcon(new ImageIcon(this.getClass().getResource(URL)));
    }
    
       private void limparTabela(){
           dtm.setNumRows(0);
      }
       
      private void prencherTabela(){
        try {
            ProdutoServicos ps = ServicosFactory.getProdutoServicos();
           
            ArrayList<ProdutoVO> prod = new ArrayList<>();
            
            prod = ps.buscarProdutos();
            NumberFormat nf = NumberFormat.getCurrencyInstance();
            for(int i = 0; i < prod.size(); i++){
               dtm.addRow(new String[]{
                  String.valueOf(prod.get(i).getIdProduto()),
                  String.valueOf(prod.get(i).getNomeProduto()),
                  nf.format(prod.get(i).getValorCusto())
               });
            }//fecha for
            
            
            jtProduto.setModel(dtm);
            
        } catch (Exception e) {
               JOptionPane.showMessageDialog(
                        null,
                        "Erro ao Prencher tabela!",
                        "Mensagem de Erro",
                        JOptionPane.ERROR_MESSAGE);
        }//fecha catch
    }//fecha prencher tabela
      
    private void jbRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverProdutoActionPerformed
         deletar();
         limparTabela();
         prencherTabela();
    }//GEN-LAST:event_jbRemoverProdutoActionPerformed

    private void jbAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarDadosActionPerformed
            alterar();
            holder = new PlaceHolder(jtValor,"Digite o novo valor");
    }//GEN-LAST:event_jbAlterarDadosActionPerformed

    private void jbconfirmarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbconfirmarAlteracaoActionPerformed
            confirmarAlteracao();
            limparTabela();
            prencherTabela();
            
        
    }//GEN-LAST:event_jbconfirmarAlteracaoActionPerformed

    private void jtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeActionPerformed

    private void jtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCodigoActionPerformed

      private void confirmarAlteracao(){
        try {
            ProdutoVO pVO = new ProdutoVO();
            //Buscando dados alterados pelo usuário nos JTextFields
            
            pVO.setIdProduto(Long.parseLong(jtCodigo.getText()));
            pVO.setNomeProduto(jtNome.getText());
            pVO.setValorCusto(Double.parseDouble(jtValor.getText()));
            
            ProdutoServicos ps = ServicosFactory.getProdutoServicos();
            //Enviando o objeto para ser alterado
            ps.alterarProduto(pVO);
                        
            JOptionPane.showMessageDialog(
                    this, 
                    "Produto Alterado com sucesso!");
            
        } catch (Exception e) {
                 JOptionPane.showMessageDialog(
                        null,
                        "Erro ao confirmar alteração!\n Tente o valor com ponto ao invés de virgula!!",
                        "Mensagem de Erro",
                        JOptionPane.ERROR_MESSAGE);
        }//fecha catch
    }//fecha método confirmarAlteração
    
         private void limpar(){
        jtCodigo.setText("");
        jtNome.setText("");
        jtValor.setText("");
    }

      private void alterar(){
        int linha = jtProduto.getSelectedRow();
        if(linha != -1){
            /* Buscando valores da linha selecionada na tabela como Objeto e 
               transformando os mesmos para String */
            jtCodigo.setText((String)jtProduto.getValueAt(linha, 0));
            jtNome.setText((String)jtProduto.getValueAt(linha, 1));
           // NumberFormat nf = NumberFormat.getCurrencyInstance();
         
           
           NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		jtValor.setText(
			(String) nf.parseObject((String) jtProduto.getValueAt(linha, 2), 
			new ParsePosition(2))
		);
        }else{
             JOptionPane.showMessageDialog(
                        null,
                        "você não selecionou nenhuma linha!",
                        "Mensagem de atenção",
                        JOptionPane.INFORMATION_MESSAGE);          
        }//fecha else
    }//fecha método alterar
 
      private void deletar() {
        try {
            /* Buscando a linha que o usuário clicou */
            int linha = jtProduto.getSelectedRow();
            
            /* Testando se o usuário selecionou alguma linha. */
            if (linha == -1) {
     JOptionPane.showMessageDialog(
                        null,
                        "você não selecionou nenhuma linha!",
                        "Mensagem de atenção",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                ProdutoServicos ps = ServicosFactory.getProdutoServicos();
                
                /* Buscando o idProduto da linha selecionada. O zero(0) indica
                   que vamos buscar o valor da primeira coluna. */
                String idProduto = (String) jtProduto.getValueAt(linha, 0);
                
                /* Enviando o idProduto para ser excluido. */
                ps.deletarProduto(Long.parseLong(idProduto));

                //Mensagem de sucesso para o usuário!
        JOptionPane.showMessageDialog(
                        null,
                        "Produto excluido com sucesso!",
                        "Mensagem de confirmação",
                        JOptionPane.INFORMATION_MESSAGE);
            }//fecha else
        } catch (Exception e) {
                 JOptionPane.showMessageDialog(
                        null,
                        "erro ao deletar!!",
                        "Mensagem de erro",
                        JOptionPane.ERROR_MESSAGE);
        }//fecha catch        
    }//fecha deletar

      
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterarDados;
    private javax.swing.JButton jbRemoverProduto;
    private javax.swing.JButton jbconfirmarAlteracao;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlValor;
    private javax.swing.JLabel jlcodigo;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTable jtProduto;
    private javax.swing.JTextField jtValor;
    // End of variables declaration//GEN-END:variables
}
