
package luigi.s_supermercado;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import luigi.s_supermercado.dao.SupermercadoDao;
import luigi.s_supermercado.modelo.Produto;

public class Cadastro_produto extends javax.swing.JFrame {

    public Cadastro_produto() {

        initComponents();
    }
    
    public void Limpar_Campos(){
    TxtIdProduto.setText("");
    TxtDescProduto.setText("");
    TxtLoteProduto.setText("");
    TxtPrecoProduto.setText("");
    TxtQtdEstoqueProduto.setText("");
    TxtValorLucro.setText("");
    TxtdtFabricacao.setText("");
    TxtdtValidade.setText("");
    LblTotal.setText("0");
    TxtIdProduto.requestFocus();
   }
    
SupermercadoDao s = new SupermercadoDao();    
Produto p = new Produto();
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        BtnBuscar = new javax.swing.JButton();
        BtnAtualizar = new javax.swing.JButton();
        BtnDeletar = new javax.swing.JButton();
        BtnSair = new javax.swing.JButton();
        BtnCadastrar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        TxtId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TxtIdProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtDescProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtQtdEstoqueProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtLoteProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtdtFabricacao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtdtValidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtPrecoProduto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtValorLucro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        LblTotal = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        BtnBuscar2 = new javax.swing.JButton();
        BtnAtualizar2 = new javax.swing.JButton();
        BtnDeletar2 = new javax.swing.JButton();
        BtnSair2 = new javax.swing.JButton();
        BtnCadastrar2 = new javax.swing.JButton();
        BtnLimpar2 = new javax.swing.JButton();
        BtnSomar = new javax.swing.JButton();
        BtnVoltar = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(102, 255, 204)));

        BtnBuscar.setBackground(new java.awt.Color(0, 255, 0));
        BtnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnBuscar.setText("Buscar");

        BtnAtualizar.setBackground(new java.awt.Color(0, 0, 255));
        BtnAtualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnAtualizar.setText("Atualizar");

        BtnDeletar.setBackground(new java.awt.Color(255, 0, 0));
        BtnDeletar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnDeletar.setText("Deletar");

        BtnSair.setBackground(new java.awt.Color(255, 0, 0));
        BtnSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnSair.setText("Sair");
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });

        BtnCadastrar.setBackground(new java.awt.Color(51, 255, 51));
        BtnCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnCadastrar.setText("Cadastrar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(BtnCadastrar)
                .addGap(72, 72, 72)
                .addComponent(BtnBuscar)
                .addGap(70, 70, 70)
                .addComponent(BtnAtualizar)
                .addGap(75, 75, 75)
                .addComponent(BtnDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(BtnSair)
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(BtnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(BtnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(BtnSair, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(BtnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("ID");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(0, 153, 153)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Cadastro de Produto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("ID");

        TxtIdProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Descrição Produto");

        TxtDescProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Quantidade no Estoque");

        TxtQtdEstoqueProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Lote");

        TxtLoteProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Data de Fabricação");

        TxtdtFabricacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Data de Validade");

        TxtdtValidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Preço de custo");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Valor do Lucro");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Total:");

        LblTotal.setBackground(new java.awt.Color(255, 255, 255));
        LblTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblTotal.setText("0");
        LblTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(0, 153, 153)));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(0, 153, 153)));

        BtnBuscar2.setBackground(new java.awt.Color(0, 255, 0));
        BtnBuscar2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnBuscar2.setText("Buscar");
        BtnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscar2ActionPerformed(evt);
            }
        });

        BtnAtualizar2.setBackground(new java.awt.Color(0, 51, 255));
        BtnAtualizar2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnAtualizar2.setText("Atualizar");
        BtnAtualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtualizar2ActionPerformed(evt);
            }
        });

        BtnDeletar2.setBackground(new java.awt.Color(255, 0, 0));
        BtnDeletar2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnDeletar2.setText("Deletar");
        BtnDeletar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeletar2ActionPerformed(evt);
            }
        });

        BtnSair2.setBackground(new java.awt.Color(255, 0, 0));
        BtnSair2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnSair2.setText("Sair");
        BtnSair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSair2ActionPerformed(evt);
            }
        });

        BtnCadastrar2.setBackground(new java.awt.Color(51, 255, 51));
        BtnCadastrar2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnCadastrar2.setText("Cadastrar");
        BtnCadastrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrar2ActionPerformed(evt);
            }
        });

        BtnLimpar2.setBackground(new java.awt.Color(0, 0, 255));
        BtnLimpar2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnLimpar2.setText("Limpar");
        BtnLimpar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(BtnCadastrar2)
                .addGap(40, 40, 40)
                .addComponent(BtnBuscar2)
                .addGap(39, 39, 39)
                .addComponent(BtnAtualizar2)
                .addGap(45, 45, 45)
                .addComponent(BtnLimpar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(BtnDeletar2)
                .addGap(51, 51, 51)
                .addComponent(BtnSair2)
                .addGap(34, 34, 34))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnAtualizar2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(BtnBuscar2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(BtnLimpar2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnDeletar2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                        .addComponent(BtnSair2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                        .addComponent(BtnCadastrar2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
        );

        BtnSomar.setBackground(new java.awt.Color(0, 153, 153));
        BtnSomar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnSomar.setText("Somar");
        BtnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSomarActionPerformed(evt);
            }
        });

        BtnVoltar.setBackground(new java.awt.Color(255, 102, 0));
        BtnVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnVoltar.setText("Voltar para a Home");
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(312, 312, 312)
                                .addComponent(LblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(363, 363, 363)
                                .addComponent(jLabel9)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtQtdEstoqueProduto))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtPrecoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                            .addComponent(TxtdtFabricacao))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtLoteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtValorLucro, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(TxtdtValidade))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtnSomar)
                                        .addGap(14, 14, 14))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtDescProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(264, 264, 264)
                                        .addComponent(jLabel8)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(BtnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(TxtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TxtDescProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtQtdEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TxtLoteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtdtFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(TxtdtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(TxtValorLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSomar))
                .addGap(33, 33, 33)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(LblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(BtnVoltar)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        
    }//GEN-LAST:event_BtnSairActionPerformed

    private void BtnSair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSair2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSair2ActionPerformed

    private void BtnLimpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpar2ActionPerformed
        Limpar_Campos();
    }//GEN-LAST:event_BtnLimpar2ActionPerformed

    private void BtnCadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrar2ActionPerformed
        int Id;
        try { 
            Id = Integer.parseInt(TxtIdProduto.getText());
        } 
        catch (NumberFormatException erro) { 
            JOptionPane.showMessageDialog(null, "Favor informar O ID válido para o produto !!!"); 
            TxtIdProduto.requestFocus();
            return; 
        } 
        
        if(TxtDescProduto.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Favor informar a descrição do produto !!!");
            TxtDescProduto.requestFocus();
            return;
        }

        int Q;
        try { 
            Q = Integer.parseInt(TxtQtdEstoqueProduto.getText());
        } 
        catch (NumberFormatException erro) { 
            JOptionPane.showMessageDialog(null, "Favor informar uma quantidade estocada válida para o produto !!!"); 
            TxtQtdEstoqueProduto.requestFocus();
            return; 
        } 
       
        if(TxtLoteProduto.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Favor informar o lote do produto !!!");
            TxtLoteProduto.requestFocus();
            return;
        }
        
        if(TxtdtFabricacao.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Favor informar a data de fabricação do produto !!!");
            TxtdtFabricacao.requestFocus();
            return;
        }
        
        if(TxtdtValidade.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Favor informar a data de validade do produto !!!");
            TxtdtValidade.requestFocus();
            return;
        }
        
        Double P;
        try { 
            P = Double.parseDouble(TxtPrecoProduto.getText());
        } 
        catch (NumberFormatException erro) { 
            JOptionPane.showMessageDialog(null, "Favor informar o valor do produto !!!"); 
            TxtPrecoProduto.requestFocus();
            return; 
        } 
        
        Double V;
        try { 
            V = Double.parseDouble(TxtValorLucro.getText());
        } 
        catch (NumberFormatException erro) { 
            JOptionPane.showMessageDialog(null, "Favor informar o valor de lucro do produto !!!"); 
            TxtValorLucro.requestFocus();
            return; 
        } 
        
        int IDP;
        IDP = Integer.parseInt(TxtIdProduto.getText());
        p.setId_produto(IDP);
        
        String DP;
        DP = TxtDescProduto.getText();
        p.setDescricao(DP);
        
        double QP;
        QP = Double.parseDouble(TxtQtdEstoqueProduto.getText());
        p.setQtddisponivel(QP);
        
        String LP;
        LP = TxtLoteProduto.getText();
        p.setLote(LP);
        
        String DFP;
        DFP = TxtdtFabricacao.getText();
        p.setDtfabricacao(DFP);
        
        String DVP;
        DVP = TxtdtValidade.getText();
        p.setDtvalidade(DVP);
        
        double PCP;
        PCP = Double.parseDouble(TxtPrecoProduto.getText());
        p.setPreco_custo(PCP);
        
        double VLP;
        VLP = Double.parseDouble(TxtValorLucro.getText());
        p.setValor_lucro(VLP);
        
        double VTP;
        VTP = Double.parseDouble(LblTotal.getText());
        p.setValor_total(VTP);
        
                try {
            s.adicionarp(p);
            JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso !!!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao adicionar produto !!!");
            Logger.getLogger(Cadastro_funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BtnCadastrar2ActionPerformed

    private void BtnSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSomarActionPerformed
        Double x,y,z,i;
        x = Double.parseDouble(TxtPrecoProduto.getText());  
        y = Double.parseDouble(TxtValorLucro.getText());
        i = Double.parseDouble(LblTotal.getText());
        z = x + y + i;
        LblTotal.setText(String.valueOf(z));

    }//GEN-LAST:event_BtnSomarActionPerformed

    private void BtnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscar2ActionPerformed
        try {
            p = s.buscarp(Long.parseLong(TxtIdProduto.getText().toString()));
        } catch (Exception ex) {
            Logger.getLogger(Cadastro_funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        TxtIdProduto.setText(String.valueOf(p.getId_produto()));
        TxtDescProduto.setText(p.getDescricao());
        TxtQtdEstoqueProduto.setText(String.valueOf(p.getQtddisponivel()));
        TxtLoteProduto.setText(p.getLote());
        TxtdtFabricacao.setText(p.getDtfabricacao());
        TxtdtValidade.setText(p.getDtvalidade());
        TxtPrecoProduto.setText(String.valueOf(p.getPreco_custo()));
        TxtValorLucro.setText(String.valueOf(p.getValor_lucro()));
        LblTotal.setText(String.valueOf(p.getValor_total()));
        
       
    }//GEN-LAST:event_BtnBuscar2ActionPerformed

    private void BtnDeletar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeletar2ActionPerformed
        Produto ProdutoRemover = new Produto();
        long id = Long.valueOf( TxtIdProduto.getText());
        ProdutoRemover.setId_produto(id);
        try {
            s.removerp(ProdutoRemover);
            JOptionPane.showMessageDialog(null, "Produto Deletado com sucesso !!!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao Deletar !!!");
            Logger.getLogger(Cadastro_funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnDeletar2ActionPerformed

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        new Home().setVisible(true); this.dispose();
    }//GEN-LAST:event_BtnVoltarActionPerformed

    private void BtnAtualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtualizar2ActionPerformed
        long IDPA;
        IDPA = Integer.parseInt(TxtIdProduto.getText());
        p.setId_produto(IDPA);
        
        String DPA;
        DPA = TxtDescProduto.getText();
        p.setDescricao(DPA);
        
        double QPA;
        QPA = Double.parseDouble(TxtQtdEstoqueProduto.getText());
        p.setQtddisponivel(QPA);
        
        String LPA;
        LPA = TxtLoteProduto.getText();
        p.setLote(LPA);
        
        String DFPA;
        DFPA = TxtdtFabricacao.getText();
        p.setDtfabricacao(DFPA);
        
        String DVPA;
        DVPA = TxtdtValidade.getText();
        p.setDtvalidade(DVPA);
        
        double PCPA;
        PCPA = Double.parseDouble(TxtPrecoProduto.getText());
        p.setPreco_custo(PCPA);
        
        double VLPA;
        VLPA = Double.parseDouble(TxtValorLucro.getText());
        p.setValor_lucro(VLPA);
        
        double VTPA;
        VTPA = Double.parseDouble(LblTotal.getText());
        p.setValor_total(VTPA);
        
        try {
            s.atualizarp(p);
             JOptionPane.showMessageDialog(null, "Produto Atualizado com sucesso !!!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar !!!");
            Logger.getLogger(Cadastro_funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnAtualizar2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtualizar;
    private javax.swing.JButton BtnAtualizar2;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnBuscar2;
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.JButton BtnCadastrar2;
    private javax.swing.JButton BtnDeletar;
    private javax.swing.JButton BtnDeletar2;
    private javax.swing.JButton BtnLimpar2;
    private javax.swing.JButton BtnSair;
    private javax.swing.JButton BtnSair2;
    private javax.swing.JButton BtnSomar;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JLabel LblTotal;
    private javax.swing.JTextField TxtDescProduto;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField TxtIdProduto;
    private javax.swing.JTextField TxtLoteProduto;
    private javax.swing.JTextField TxtPrecoProduto;
    private javax.swing.JTextField TxtQtdEstoqueProduto;
    private javax.swing.JTextField TxtValorLucro;
    private javax.swing.JTextField TxtdtFabricacao;
    private javax.swing.JTextField TxtdtValidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
