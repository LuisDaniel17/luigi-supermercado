
package luigi.s_supermercado;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import luigi.s_supermercado.dao.SupermercadoDao;
import luigi.s_supermercado.modelo.Funcionario;


public class Cadastro_funcionario extends javax.swing.JFrame {


    public Cadastro_funcionario() {
        initComponents();
    }
    
    public void Limpar_Campos(){
    TxtIdFuncionario.setText("");
    TxtNomeFuncionario.setText("");
    TxtBairroFuncionario.setText("");
    TxtCargoFuncionario.setText("");
    TxtCelularFuncionario.setText("");
    TxtCepFuncionario.setText("");
    TxtCidadeFuncionario.setText("");
    TxtComplementoFuncionario.setText("");
    TxtCpfFuncionario.setText("");
    TxtEmailFuncionario.setText("");
    TxtLogradouroFuncionario.setText("");
    TxtNumeroFuncionario.setText("");
    TxtRgFuncionario.setText("");
    TxtSalarioFuncionario.setText("");
    TxtSetorFuncionario.setText("");
    TxtTelefoneFuncionario.setText("");
    TxtdtNascimentoFuncionario.setText("");
    CboEstadoFuncionario.setSelectedIndex(-1);
    GrpSexoFuncionario.clearSelection();
    TxtIdFuncionario.requestFocus();
    }
    
         SupermercadoDao s = new SupermercadoDao();
         Funcionario f = new Funcionario();


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrpSexoFuncionario = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TxtIdFuncionario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtNomeFuncionario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtLogradouroFuncionario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtNumeroFuncionario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtComplementoFuncionario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtBairroFuncionario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtCidadeFuncionario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CboEstadoFuncionario = new javax.swing.JComboBox<>();
        TxtCepFuncionario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        RBmasculino = new javax.swing.JRadioButton();
        RBfeminino = new javax.swing.JRadioButton();
        RBnaoEspecificado = new javax.swing.JRadioButton();
        TxtCpfFuncionario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TxtRgFuncionario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TxtdtNascimentoFuncionario = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TxtEmailFuncionario = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        BtnBuscar = new javax.swing.JButton();
        BtnAtualizar = new javax.swing.JButton();
        BtnDeletar = new javax.swing.JButton();
        BtnSair = new javax.swing.JButton();
        BtnCadastrar = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        TxtSalarioFuncionario = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TxtCargoFuncionario = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        TxtSetorFuncionario = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TxtTelefoneFuncionario = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TxtCelularFuncionario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(0, 255, 204)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 204));
        jLabel1.setText("Cadastro de Funcionário");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("ID");

        TxtIdFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nome");

        TxtNomeFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Endereço:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Logradouro");

        TxtLogradouroFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Número");

        TxtNumeroFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Complemento");

        TxtComplementoFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Bairro");

        TxtBairroFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Cidade");

        TxtCidadeFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Estado");

        CboEstadoFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CboEstadoFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        CboEstadoFuncionario.setSelectedIndex(-1);

        TxtCepFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("C.E.P.");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(0, 255, 204)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Sexo:");

        GrpSexoFuncionario.add(RBmasculino);
        RBmasculino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RBmasculino.setText("M");

        GrpSexoFuncionario.add(RBfeminino);
        RBfeminino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RBfeminino.setText("F");
        RBfeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBfemininoActionPerformed(evt);
            }
        });

        GrpSexoFuncionario.add(RBnaoEspecificado);
        RBnaoEspecificado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RBnaoEspecificado.setText("NE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(RBmasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RBfeminino))
                .addGap(93, 93, 93)
                .addComponent(RBnaoEspecificado)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBmasculino)
                    .addComponent(RBfeminino)
                    .addComponent(RBnaoEspecificado))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        TxtCpfFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtCpfFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCpfFuncionarioActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("C.P.F.");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("R.G.");

        TxtRgFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtRgFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRgFuncionarioActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Data de Nascimento");

        TxtdtNascimentoFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("E-mail");

        TxtEmailFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(0, 255, 204)));

        BtnBuscar.setBackground(new java.awt.Color(0, 255, 0));
        BtnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnAtualizar.setBackground(new java.awt.Color(0, 0, 255));
        BtnAtualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnAtualizar.setText("Atualizar");

        BtnDeletar.setBackground(new java.awt.Color(255, 0, 0));
        BtnDeletar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnDeletar.setText("Deletar");
        BtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeletarActionPerformed(evt);
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
        BtnCadastrar.setText("Cadastrar");
        BtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarActionPerformed(evt);
            }
        });

        BtnLimpar.setBackground(new java.awt.Color(0, 0, 255));
        BtnLimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnLimpar.setText("Limpar");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(BtnCadastrar)
                .addGap(40, 40, 40)
                .addComponent(BtnBuscar)
                .addGap(39, 39, 39)
                .addComponent(BtnAtualizar)
                .addGap(62, 62, 62)
                .addComponent(BtnLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnDeletar)
                .addGap(51, 51, 51)
                .addComponent(BtnSair)
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(BtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(BtnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                        .addComponent(BtnSair, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                        .addComponent(BtnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
        );

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("Salário");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("Cargo");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("Setor");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setText("Telefone");

        TxtTelefoneFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("Celular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(TxtTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(TxtCelularFuncionario))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtEmailFuncionario))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtRgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtdtNascimentoFuncionario))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtComplementoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtCidadeFuncionario)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CboEstadoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtCepFuncionario))
                                    .addComponent(TxtBairroFuncionario)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtLogradouroFuncionario)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtNumeroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtIdFuncionario)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(TxtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtCargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(TxtSetorFuncionario))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(343, 343, 343)
                                        .addComponent(jLabel3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(187, 187, 187)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(22, 22, 22)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(TxtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtLogradouroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TxtNumeroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtComplementoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(TxtBairroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtCidadeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(CboEstadoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(TxtCepFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TxtCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(TxtRgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(TxtdtNascimentoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(TxtEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(TxtTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(TxtCelularFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(TxtSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(TxtCargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(TxtSetorFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBfemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBfemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBfemininoActionPerformed

    private void TxtCpfFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCpfFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCpfFuncionarioActionPerformed

    private void TxtRgFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRgFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRgFuncionarioActionPerformed

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSairActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        Limpar_Campos();
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void BtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarActionPerformed
     int Id;
        try { 
            Id = Integer.parseInt(TxtIdFuncionario.getText());
        } 
        catch (NumberFormatException erro) { 
            JOptionPane.showMessageDialog(null, "Favor informar O ID válido para o funcionário !!!"); 
            TxtIdFuncionario.requestFocus();
            return; 
        } 
             
        if(TxtNomeFuncionario.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Favor informar o nome do funcionario !!!");
            TxtNomeFuncionario.requestFocus();
            return;
        }
        if(TxtLogradouroFuncionario.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Favor informar o logradouro do funcionario !!!");
            TxtLogradouroFuncionario.requestFocus();
            return;
        }
        if(TxtNumeroFuncionario.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Favor informar o numero do funcionario !!!");
            TxtNumeroFuncionario.requestFocus();
            return;
        }
        if(TxtBairroFuncionario.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Favor informar o bairro do funcionario !!!");
            TxtBairroFuncionario.requestFocus();
            return;
        }
        if(TxtCidadeFuncionario.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Favor informar a cidade do funcionario !!!");
            TxtCidadeFuncionario.requestFocus();
            return;
        }
                
        if(TxtCepFuncionario.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Favor informar o cep do funcionario !!!");
            TxtCepFuncionario.requestFocus();
            return;
        }
       
        if(TxtCpfFuncionario.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Favor informar o cpf do funcionario !!!");
            TxtCpfFuncionario.requestFocus();
            return;
        }
        
       if(TxtRgFuncionario.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Favor informar o rg do funcionario !!!");
            TxtRgFuncionario.requestFocus();
            return;
        }
         
        if(TxtdtNascimentoFuncionario.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Favor informar a data de nascimento do funcionario !!!");
            TxtdtNascimentoFuncionario.requestFocus();
            return;
        }
        if(TxtEmailFuncionario.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Favor informar o email do funcionario !!!");
            TxtEmailFuncionario.requestFocus();
            return;
        }
        if(TxtTelefoneFuncionario.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Favor informar o telefone do funcionario !!!");
            TxtTelefoneFuncionario.requestFocus();
            return;
        }
        if(TxtCelularFuncionario.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Favor informar o celular do funcionario !!!");
            TxtCelularFuncionario.requestFocus();
            return;
        }
        if(TxtCargoFuncionario.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Favor informar o cargo do funcionario !!!");
            TxtCargoFuncionario.requestFocus();
            return;
        }
        if(TxtSetorFuncionario.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Favor informar o setor do funcionario !!!");
            TxtSetorFuncionario.requestFocus();
            return;
        }
        int S;
        try { 
            S = Integer.parseInt(TxtSalarioFuncionario.getText());
        } 
        catch (NumberFormatException erro) { 
            JOptionPane.showMessageDialog(null, "Favor informar um salário válido para o funcionário !!!"); 
            TxtSalarioFuncionario.requestFocus();
            return; 
        } 
     
        
         
         

         
         int IDF;
         IDF = Integer.parseInt(TxtIdFuncionario.getText());
         f.setId_funcionario(IDF);
         
         String NF;
         NF = TxtNomeFuncionario.getText();
         f.setNome(NF);
         
         String LF;
         LF = TxtLogradouroFuncionario.getText();
         f.setLogradouro(LF);
         
         String NUMF;
         NUMF = TxtNumeroFuncionario.getText();
         f.setNumero(NUMF);
         
         String CF;
         CF = TxtComplementoFuncionario.getText();
         f.setComplemento(CF);
         
         String BF;
         BF = TxtBairroFuncionario.getText();
         f.setBairro(BF);
         
         String CIDF;
         CIDF = TxtCidadeFuncionario.getText();
         f.setCidade(CIDF);
         
         String EF;
         EF = (String) CboEstadoFuncionario.getSelectedItem().toString();
         f.setEstado(EF);
         
         String CEPF;
         CEPF = TxtCepFuncionario.getText();
         f.setCpf(CEPF);
         
         String SMF, SFF, SNEF;
         SMF = RBmasculino.getSelectedIcon().toString();
         SFF = RBfeminino.getSelectedIcon().toString();
         SNEF = RBnaoEspecificado.getSelectedIcon().toString();
         f.setSexo(SMF);
         f.setSexo(SFF);
         f.setSexo(SNEF);
         
         String CPFF;
         CPFF = TxtCpfFuncionario.getText();
         f.setCpf(CPFF);
         
         String RGF;
         RGF = TxtRgFuncionario.getText();
         f.setRg(RGF);
         
         String DF;
         DF = TxtdtNascimentoFuncionario.getText();
         f.setDatadenascimento(DF);
         
         String EMF;
         EMF = TxtEmailFuncionario.getText();
         f.setEmail(EMF);
         
         String TF;
         TF = TxtTelefoneFuncionario.getText();
         f.setTelefone(TF);
         
         String CELF;
         CELF = TxtCelularFuncionario.getText();
         f.setCelular(CELF);
         
         Double SAF;
         SAF = Double.parseDouble(TxtSalarioFuncionario.getText());
         f.setSalario(SAF);
         
         String CAF;
         CAF = TxtCelularFuncionario.getText();
         f.setCargo(CAF);
         
         String SEF;
         SEF = TxtSetorFuncionario.getText();
         f.setSetor(SEF);
         
         
         
        try {
            s.adicionarf(f);
             JOptionPane.showMessageDialog(null, "Funcionario adicionado com sucesso !!!");
            
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "Falha ao adicionar funcionario !!!");
            Logger.getLogger(Cadastro_funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_BtnCadastrarActionPerformed

    private void BtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeletarActionPerformed
 Funcionario FuncionarioRemover = new Funcionario();
   FuncionarioRemover.setId_funcionario(20);
        try {        
            s.removerf(FuncionarioRemover);
        } catch (Exception ex) {
            Logger.getLogger(Cadastro_funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnDeletarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        try {
            for(Funcionario f : s.buscarTodosf()){
                JOptionPane.showMessageDialog(f);
            }
        } catch (Exception ex) {
            Logger.getLogger(Cadastro_funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_funcionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtualizar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.JButton BtnDeletar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnSair;
    private javax.swing.JComboBox<String> CboEstadoFuncionario;
    private javax.swing.ButtonGroup GrpSexoFuncionario;
    private javax.swing.JRadioButton RBfeminino;
    private javax.swing.JRadioButton RBmasculino;
    private javax.swing.JRadioButton RBnaoEspecificado;
    private javax.swing.JTextField TxtBairroFuncionario;
    private javax.swing.JTextField TxtCargoFuncionario;
    private javax.swing.JTextField TxtCelularFuncionario;
    private javax.swing.JTextField TxtCepFuncionario;
    private javax.swing.JTextField TxtCidadeFuncionario;
    private javax.swing.JTextField TxtComplementoFuncionario;
    private javax.swing.JTextField TxtCpfFuncionario;
    private javax.swing.JTextField TxtEmailFuncionario;
    private javax.swing.JTextField TxtIdFuncionario;
    private javax.swing.JTextField TxtLogradouroFuncionario;
    private javax.swing.JTextField TxtNomeFuncionario;
    private javax.swing.JTextField TxtNumeroFuncionario;
    private javax.swing.JTextField TxtRgFuncionario;
    private javax.swing.JTextField TxtSalarioFuncionario;
    private javax.swing.JTextField TxtSetorFuncionario;
    private javax.swing.JTextField TxtTelefoneFuncionario;
    private javax.swing.JTextField TxtdtNascimentoFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
