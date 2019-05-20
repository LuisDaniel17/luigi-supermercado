package luigi.s_supermercado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import luigi.s_supermercado.dao.SupermercadoDao;
import luigi.s_supermercado.modelo.Funcionario;
import luigi.s_supermercado.modelo.Produto;
import luigi.s_supermercado.modelo.Caixaa;


public class Caixa extends javax.swing.JFrame {

    public Caixa() {
        initComponents();
    } 
    
    public void Limpar_Campos(){
    TxtIdVenda.setText("");
    TxtIdProduto.setText("");
    TxtDescProduto.setText("");
    TxtIdFuncionario.setText("");
    TxtNomeDoFuncionario.setText("");
    TxtPrecoProduto.setText("");
    LBLtotalcompra.setText("0");
    TxtPagamento.setText("");
    LBLtroco.setText("0");
    TxtIdVenda.requestFocus();
    }
    SupermercadoDao s = new SupermercadoDao();
    Produto p = new Produto();
    Funcionario f = new Funcionario();
    Caixaa c = new Caixaa();
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        BtnBuscarVenda = new javax.swing.JButton();
        BtnSair = new javax.swing.JButton();
        BtnCadastrar = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();
        BtnBuscarFunc = new javax.swing.JButton();
        BtnAtualizar = new javax.swing.JButton();
        BtnDeletar = new javax.swing.JButton();
        BtnBuscarProd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtIdVenda = new javax.swing.JTextField();
        TxtDescProduto = new javax.swing.JTextField();
        TxtNomeDoFuncionario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtPagamento = new javax.swing.JTextField();
        Troco = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtIdProduto = new javax.swing.JTextField();
        TxtPrecoProduto = new javax.swing.JTextField();
        BtnAdicionar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        TxtIdFuncionario = new javax.swing.JTextField();
        BtnVoltar = new javax.swing.JButton();
        LBLtotalcompra = new javax.swing.JLabel();
        LBLtroco = new javax.swing.JLabel();
        Btnsubtrair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(0, 255, 255)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Caixa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(366, 366, 366))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(0, 255, 255)));

        BtnBuscarVenda.setBackground(new java.awt.Color(51, 51, 255));
        BtnBuscarVenda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnBuscarVenda.setText("Buscar Venda");
        BtnBuscarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarVendaActionPerformed(evt);
            }
        });

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
        BtnCadastrar.setText("Cadastrar Venda");
        BtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarActionPerformed(evt);
            }
        });

        BtnLimpar.setBackground(new java.awt.Color(51, 255, 51));
        BtnLimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnLimpar.setText("Limpar");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        BtnBuscarFunc.setBackground(new java.awt.Color(0, 51, 255));
        BtnBuscarFunc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnBuscarFunc.setText("Buscar Funcionario");
        BtnBuscarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarFuncActionPerformed(evt);
            }
        });

        BtnAtualizar.setBackground(new java.awt.Color(0, 51, 255));
        BtnAtualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnAtualizar.setText("Atualizar Venda");
        BtnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtualizarActionPerformed(evt);
            }
        });

        BtnDeletar.setBackground(new java.awt.Color(255, 0, 0));
        BtnDeletar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnDeletar.setText("Deletar");
        BtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeletarActionPerformed(evt);
            }
        });

        BtnBuscarProd.setBackground(new java.awt.Color(0, 255, 0));
        BtnBuscarProd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnBuscarProd.setText("Buscar Produto");
        BtnBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnBuscarFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(BtnBuscarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(BtnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBuscarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(BtnBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnBuscarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnBuscarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Id_Venda");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Descrição Produto");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Nome Funcionário");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Total Compra");

        TxtIdVenda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        TxtDescProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtDescProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDescProdutoActionPerformed(evt);
            }
        });

        TxtNomeDoFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtNomeDoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeDoFuncionarioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Id_Produto");

        TxtPagamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        Troco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Troco.setText("Troco");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Preço Produto");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Pagamento");

        TxtIdProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtIdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdProdutoActionPerformed(evt);
            }
        });

        TxtPrecoProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        BtnAdicionar.setBackground(new java.awt.Color(0, 255, 255));
        BtnAdicionar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnAdicionar.setText("Adicionar");
        BtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdicionarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Id_Funcionario");

        TxtIdFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        BtnVoltar.setBackground(new java.awt.Color(255, 102, 0));
        BtnVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnVoltar.setText("Voltar para a Home");
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });

        LBLtotalcompra.setText("0");
        LBLtotalcompra.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(0, 255, 255)));

        LBLtroco.setText("0");
        LBLtroco.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(0, 255, 255)));

        Btnsubtrair.setBackground(new java.awt.Color(0, 255, 255));
        Btnsubtrair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btnsubtrair.setText("Subtrair");
        Btnsubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsubtrairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtDescProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TxtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(TxtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel7)
                                                .addGap(53, 53, 53))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(99, 99, 99)
                                                .addComponent(Troco)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtPrecoProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(TxtPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(LBLtotalcompra, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                                    .addComponent(LBLtroco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Btnsubtrair)
                                            .addComponent(BtnAdicionar))
                                        .addGap(155, 155, 155))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtNomeDoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(TxtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 315, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnVoltar)
                .addGap(360, 360, 360))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(TxtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDescProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomeDoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LBLtotalcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btnsubtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(Troco)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LBLtroco, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(BtnVoltar)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSairActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        Limpar_Campos();
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void TxtNomeDoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeDoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeDoFuncionarioActionPerformed

    private void BtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarActionPerformed
        int Idv;
        try { 
            Idv = Integer.parseInt(TxtIdVenda.getText());
        } 
        catch (NumberFormatException erro) { 
            JOptionPane.showMessageDialog(null, "Favor informar O ID válido para a venda !!!"); 
            TxtIdVenda.requestFocus();
            return; 
        } 
         int Idp;
        try { 
            Idp = Integer.parseInt(TxtIdProduto.getText());
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
         int Idf;
        try { 
            Idf = Integer.parseInt(TxtIdFuncionario.getText());
        } 
        catch (NumberFormatException erro) { 
            JOptionPane.showMessageDialog(null, "Favor informar O ID válido para o funcionário !!!"); 
            TxtIdFuncionario.requestFocus();
            return; 
        } 
        if(TxtNomeDoFuncionario.getText().equals("") ){
        JOptionPane.showMessageDialog(null, "Favor informar o nome do funcionário !!!");
        TxtNomeDoFuncionario.requestFocus();
        return;
        }
        double pp;
        try { 
            pp = Double.parseDouble(TxtPrecoProduto.getText());
        } 
        catch (NumberFormatException erro) { 
            JOptionPane.showMessageDialog(null, "Favor informar um preço válido para o produto !!!"); 
            TxtPrecoProduto.requestFocus();
            return; 
        } 
        double t;
        try { 
            t = Double.parseDouble(LBLtotalcompra.getText());
        } 
        catch (NumberFormatException erro) { 
            JOptionPane.showMessageDialog(null, "Favor fazer a soma do total da compra !!!"); 
            return; 
        } 
        double pa;
        try { 
            pa = Double.parseDouble(TxtPagamento.getText());
        } 
        catch (NumberFormatException erro) { 
            JOptionPane.showMessageDialog(null, "Favor informar um pagamento válido !!!"); 
            TxtPagamento.requestFocus();
            return; 
        
        } 
        double tr;
        try { 
            tr = Double.parseDouble(LBLtroco.getText());
        } 
        catch (NumberFormatException erro) { 
            JOptionPane.showMessageDialog(null, "Favor fazer a subtração do troco !!!"); 
            return; 
        } 
             
        long IDV;
        IDV = Integer.parseInt(TxtIdVenda.getText());
        c.setId_venda(IDV);
        
        long IDP;
        IDP = Integer.parseInt(TxtIdProduto.getText());
        c.setId_produto(IDP);
        
        String DP;
        DP = TxtDescProduto.getText();
        c.setDescricao_produto(DP);
        
        long IDF;
        IDF = Integer.parseInt(TxtIdFuncionario.getText());
        c.setId_funcionario(IDF);
        
        String NF;
        NF = TxtNomeDoFuncionario.getText();
        c.setNome_funcionario(NF);
        
        double PP;
        PP = Double.parseDouble(TxtPrecoProduto.getText());
        c.setPreco_produto(PP);
        
        double TC;
        TC = Double.parseDouble(LBLtotalcompra.getText());
        c.setTotal_compra(TC);
        
        double PA;
        PA = Double.parseDouble(TxtPagamento.getText());
        c.setPagamento(PA);
        
        double T;
        T = Double.parseDouble(LBLtroco.getText());
        c.setTroco(T);
        
        try {
            s.adicionarv(c);
            JOptionPane.showMessageDialog(null, "Venda adicionada com sucesso !!!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao adicionar venda !!!");
            Logger.getLogger(Cadastro_funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_BtnCadastrarActionPerformed

    private void TxtDescProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDescProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDescProdutoActionPerformed

    private void BtnBuscarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarVendaActionPerformed
     
        try {
            c = s.buscarv(Long.parseLong(TxtIdVenda.getText().toString()));
        } catch (Exception ex) {
            Logger.getLogger(Caixa.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        TxtIdVenda.setText(String.valueOf(c.getId_venda()));
        TxtIdProduto.setText(String.valueOf(c.getId_produto()));
        TxtDescProduto.setText(c.getDescricao_produto());
        TxtIdFuncionario.setText(String.valueOf(c.getId_funcionario()));
        TxtNomeDoFuncionario.setText(c.getNome_funcionario());
        TxtPrecoProduto.setText(String.valueOf(c.getPreco_produto()));
        LBLtotalcompra.setText(String.valueOf(c.getTotal_compra()));
        TxtPagamento.setText(String.valueOf(c.getPagamento()));
        LBLtroco.setText(String.valueOf(c.getTroco()));
    }//GEN-LAST:event_BtnBuscarVendaActionPerformed

    private void BtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeletarActionPerformed
        Caixaa VendaRemover = new Caixaa();
        long id = Long.valueOf( TxtIdVenda.getText() );
        VendaRemover.setId_venda(id);
        try {
            s.removerv(VendaRemover);
            JOptionPane.showMessageDialog(null, "Venda Deletada com sucesso !!!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao Deletar !!!");
            Logger.getLogger(Cadastro_funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnDeletarActionPerformed

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        new Home().setVisible(true);  this.dispose();
    }//GEN-LAST:event_BtnVoltarActionPerformed

    private void TxtIdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdProdutoActionPerformed

    private void BtnBuscarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarFuncActionPerformed
        try {
            f = s.buscarFuncionarioCaixa(Long.parseLong(TxtIdFuncionario.getText().toString()));
        } catch (Exception ex) {
            Logger.getLogger(Cadastro_funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
                       
        TxtIdFuncionario.setText(String.valueOf(f.getId_funcionario()));
        TxtNomeDoFuncionario.setText(f.getNome());

    }//GEN-LAST:event_BtnBuscarFuncActionPerformed

    private void BtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdicionarActionPerformed

        double x,y,z;
        x = Double.parseDouble(TxtPrecoProduto.getText());   
        y = Double.parseDouble(LBLtotalcompra.getText());
        z =x + y ;
        LBLtotalcompra.setText(String.valueOf(z)); 

                
    }//GEN-LAST:event_BtnAdicionarActionPerformed

    private void BtnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarProdActionPerformed
        try {
            p = s.buscarProdutoCaixa(Long.parseLong(TxtIdProduto.getText().toString()));
        } catch (Exception ex) {
            Logger.getLogger(Cadastro_funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        TxtIdProduto.setText(String.valueOf(p.getId_produto()));
        TxtDescProduto.setText(p.getDescricao());
        TxtPrecoProduto.setText(String.valueOf(p.getValor_total()));

    }//GEN-LAST:event_BtnBuscarProdActionPerformed

    private void BtnsubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsubtrairActionPerformed
               
        double a, b, c;
         a = Double.parseDouble(LBLtotalcompra.getText());
        b =Double.parseDouble(TxtPagamento.getText());
        c = b - a;
        LBLtroco.setText(String.valueOf(c)); 
        
    }//GEN-LAST:event_BtnsubtrairActionPerformed

    private void BtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtualizarActionPerformed
                long IDVA;
        IDVA = Integer.parseInt(TxtIdVenda.getText());
        c.setId_venda(IDVA);
        
        long IDPA;
        IDPA = Integer.parseInt(TxtIdProduto.getText());
        c.setId_produto(IDPA);
        
        String DPA;
        DPA = TxtDescProduto.getText();
        c.setDescricao_produto(DPA);
        
        long IDFA;
        IDFA = Integer.parseInt(TxtIdFuncionario.getText());
        c.setId_funcionario(IDFA);
        
        String NFA;
        NFA= TxtNomeDoFuncionario.getText();
        c.setNome_funcionario(NFA);
        
        double PPA;
        PPA = Double.parseDouble(TxtPrecoProduto.getText());
        c.setPreco_produto(PPA);
        
        double TCA;
        TCA = Double.parseDouble(LBLtotalcompra.getText());
        c.setTotal_compra(TCA);
        
        double PAA;
        PAA = Double.parseDouble(TxtPagamento.getText());
        c.setPagamento(PAA);
        
        double TA;
        TA = Double.parseDouble(LBLtroco.getText());
        c.setTroco(TA);
        
        try {
            s.atualizarv(c);
            JOptionPane.showMessageDialog(null, "Venda adicionada com sucesso !!!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao adicionar venda !!!");
            Logger.getLogger(Cadastro_funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdicionar;
    private javax.swing.JButton BtnAtualizar;
    private javax.swing.JButton BtnBuscarFunc;
    private javax.swing.JButton BtnBuscarProd;
    private javax.swing.JButton BtnBuscarVenda;
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.JButton BtnDeletar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnSair;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JButton Btnsubtrair;
    private javax.swing.JLabel LBLtotalcompra;
    private javax.swing.JLabel LBLtroco;
    private javax.swing.JLabel Troco;
    private javax.swing.JTextField TxtDescProduto;
    private javax.swing.JTextField TxtIdFuncionario;
    private javax.swing.JTextField TxtIdProduto;
    private javax.swing.JTextField TxtIdVenda;
    private javax.swing.JTextField TxtNomeDoFuncionario;
    private javax.swing.JTextField TxtPagamento;
    private javax.swing.JTextField TxtPrecoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
