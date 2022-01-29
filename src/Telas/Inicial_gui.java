/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Conecta.driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane; 
import Telas.Inicial_gui;
import java.sql.Driver;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.SingleSelectionModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author lucas
 */
public class Inicial_gui extends javax.swing.JFrame {
static int cod;
 static String nom;
 static String em;
 static long tel;
    
  String url2 = "jdbc:mysql://localhost/aprender"; // A Adicionar!Endereço do Banco de Dados
  String username = "root";        //nome de um usuário de seu Banco de Dados
  String password = "";  // senha do Banco de Dados

    /**
     * Creates new form Inicial_gui
     */
  public static DefaultTableModel  cliente(ResultSet rs) {
        try {
           ResultSetMetaData metaData = rs.getMetaData();
         int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();
       // AS LINHAS ABAIXO SÃO REFERENTES AOS CAMPOS DA TABELA CLIENTE
            columnNames.addElement("Número");
            columnNames.addElement("Nome");
            columnNames.addElement("E-mail");
            columnNames.addElement("Telefone");
         
            Vector rows = new Vector();
            while (rs.next()) {
                Vector newRow = new Vector();
                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }
                rows.addElement(newRow);
            }
           return new DefaultTableModel(rows, columnNames);
       } catch (Exception e) {

           return null;
        }
        }
    public Inicial_gui() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel3 = new javax.swing.JPanel();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("aprender?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        clienteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cliente c");
        clienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery.getResultList();
        tabela = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        sair = new org.edisoncor.gui.button.ButtonAction();
        nome1 = new javax.swing.JLabel();
        nome2 = new javax.swing.JLabel();
        nome_ = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        cadastro1 = new org.edisoncor.gui.button.ButtonAction();
        jPanel4 = new javax.swing.JPanel();
        tirar = new javax.swing.JButton();
        cod_tela1 = new javax.swing.JTextField();
        painel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Consultar = new org.edisoncor.gui.button.ButtonAction();
        cod_tela = new javax.swing.JTextField();
        nome_tela = new javax.swing.JTextField();
        email_tela = new javax.swing.JTextField();
        Limpar = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Atualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cliente = new javax.swing.JTable();
        tel_tela = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tabela.setForeground(new java.awt.Color(0, 255, 0));

        nome.setForeground(new java.awt.Color(0, 102, 0));
        nome.setText("Nome:");

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        nome1.setForeground(new java.awt.Color(0, 102, 0));
        nome1.setText("Telefone:");

        nome2.setForeground(new java.awt.Color(0, 102, 0));
        nome2.setText("Email:");

        telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneActionPerformed(evt);
            }
        });

        cadastro1.setText("Cadastrar");
        cadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nome1)
                                .addGap(18, 18, 18)
                                .addComponent(telefone, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nome)
                                    .addComponent(nome2))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nome_)
                                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(312, Short.MAX_VALUE)
                    .addComponent(cadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(nome_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome2)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome1)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(216, Short.MAX_VALUE)
                    .addComponent(cadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38)))
        );

        tabela.addTab("Cadastro", jPanel2);

        tirar.setForeground(new java.awt.Color(0, 102, 0));
        tirar.setText("Tirar Cadastro");
        tirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tirarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(cod_tela1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(tirar)
                .addGap(99, 99, 99))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(tirar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(cod_tela1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(203, Short.MAX_VALUE))
        );

        tabela.addTab("Tirar", jPanel4);

        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Código:");

        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Nome:");

        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Telefone:");

        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Email:");

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        Limpar.setForeground(new java.awt.Color(0, 102, 0));
        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        Alterar.setForeground(new java.awt.Color(0, 102, 0));
        Alterar.setText("Alterar");
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        Atualizar.setForeground(new java.awt.Color(0, 102, 0));
        Atualizar.setText("Atualizar");
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarActionPerformed(evt);
            }
        });

        cliente.setForeground(new java.awt.Color(0, 102, 0));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clienteList, cliente);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliCod}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliNome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliEmail}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliTel}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(cliente);

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)))
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(email_tela, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(nome_tela, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cod_tela, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tel_tela))
                        .addGap(106, 106, 106)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                                .addComponent(Limpar)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                                .addComponent(Alterar)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                                .addComponent(Atualizar)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                                .addComponent(Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Atualizar)
                    .addComponent(cod_tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nome_tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addComponent(Limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Alterar)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_tela, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tel_tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tabela.addTab("Consulta", painel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabela)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabela)
        );

        bindingGroup.bind();

        setSize(new java.awt.Dimension(453, 317));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void refresh(){
    
try{
   Connection conn;
          conn = (Connection) DriverManager.getConnection(url2, username, password);
    driver.CarregaDriver();
     
    
    System.out.println("realizado");
            String sql = "SELECT * FROM cliente;";
PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
ResultSet rs = pst.executeQuery();
cliente.setModel(cliente(rs));
                   //? 
}
catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}    
    } 
    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
      System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_sairActionPerformed

    private void tirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tirarActionPerformed
Conecta.driver.CarregaDriver(); // Carregando o driver


       // int codigo = Integer.valueOf(cod_tela1.getText()); // Recebendo o código

                

        try {// Tratamento de erro para a conexao
            // Declarando  a variavel de conexão con
            // e estabelendo a conexão
            Connection con = null;

                try {
                    con = (Connection) DriverManager.getConnection(url2, username, password);
                } catch (SQLException ex) {
                    Logger.getLogger(Inicial_gui.class.getName()).log(Level.SEVERE, null, ex);
                }
           

            // Criando String com comando SQL para exclusão
            String sql = "DELETE FROM cliente WHERE cli_cod = "+cod_tela1.getText();;

           // Tratamento de erros para exclusão
// Criando Variável para executar a ação
            try {
                PreparedStatement excluir = (PreparedStatement) con.prepareStatement(sql);
                excluir.execute();// Executando a exclusão

                JOptionPane.showMessageDialog(null,"\nExclusão realizada com sucesso!!!\n","",-1);
                cod_tela1.setText("");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"\nErro na exclusão!","ERRO!",0);
            }

        } catch(NumberFormatException erro){ // Código digitado com caracteres não numéricos
            JOptionPane.showMessageDialog(null,"Digite o código corretamante","ERRO",0);
            cod_tela1.setText("");

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tirarActionPerformed
    
    private void cadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastro1ActionPerformed
      nom = nome_.getText(); // recebendo o nome
      em = email.getText(); // recebendo o email
      
      
      tel = Long.valueOf(telefone.getText());// recebendo o telefone

       Conecta.driver.CarregaDriver();
       
      try { 
               
                   
               
            Connection con = null;
            
            
    try {
    con = (Connection) DriverManager.getConnection(url2, username, password);
    } catch (SQLException ex) {

    Logger.getLogger(Inicial_gui.class.getName()).log(Level.SEVERE, null, ex);

            
                               }

// Recebendo os dados a serem inseridos na tabela
            String sql = "INSERT INTO cliente(cli_nome,cli_email,cli_tel) values('"+nom+"','"+em+"','"+tel+"')";//Dentro do Banco de Dados o Valores da Tela
     
            try { // Tratamento de Erros para inserção

                // Criando variável que executara a inserção
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute(); // Executando a inserção

  JOptionPane.showMessageDialog(null,"\nInserção realizada com sucesso!!!\n","",-1);
                nome_.setText("");
                email.setText("");
                telefone.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
            }

        }catch(NumberFormatException erro){
            // Tratamento de erro caso o usuario não digite o telefone corretamente
            JOptionPane.showMessageDialog(null,"Digite os dados corretamente","ERRO",0);
            telefone.setText("");
        }

       
              
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastro1ActionPerformed

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        refresh();

        // TODO add your handling code here:
    }//GEN-LAST:event_AtualizarActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        nom = nome_tela.getText(); // recebendo o nome
        em = email_tela.getText(); // recebendo o email
        tel = Long.valueOf(tel_tela.getText());
        Conecta.driver.CarregaDriver();
        try {
            Connection con = null;
            try {
                con = (Connection) DriverManager.getConnection(url2, username, password);
            }catch (SQLException ex) {
                Logger.getLogger(Inicial_gui.class.getName()).log(Level.SEVERE, null, ex);
                //Conecta Incoerente
            }
            String sql = "UPDATE cliente SET cli_nome='"+nom+"',cli_email='"+em+"',cli_tel='"+tel+"' WHERE cli_cod="+cod_tela.getText();

            try {
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute(); // Executando a inserção

                JOptionPane.showMessageDialog(null,"\nAlteração realizada com sucesso!!!\n","",-1);
                nome_tela.setText("");
                email_tela.setText("");
                tel_tela.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"\nErro na alteração!","ERRO!",0);
            }

        }catch(NumberFormatException erro){
            // Tratamento de erro caso o usuario não digite o telefone corretamente
            JOptionPane.showMessageDialog(null,"Digite os dados corretamente","ERRO",0);
            tel_tela.setText("");
        }
        // recebendo o telefone
refresh();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_AlterarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        cod_tela.setText("");
        nome_tela.setText("");
        email_tela.setText("");
        tel_tela.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_LimparActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
try{     //Iniciando o possivel tratamento de erros 

            //Declarando a variavel código 

            int  codigo = Integer.valueOf(cod_tela.getText()); 

            Conecta.driver.CarregaDriver(); // Carregando o driver 

            try {// Tratamento de erro para a conexao 

                // Declarando  a variavel de conexão con 

                // e estabelendo a conexão 

                Connection con = null; 

 

                try { 

                    con = (Connection) DriverManager.getConnection(url2, username, password); 

                } catch (SQLException ex) { 

                    Logger.getLogger(Inicial_gui.class.getName()).log(Level.SEVERE, null, ex); 

                } 

 

                // Declarando uma string com o comando mySQL para consulta 
            
                String sql = "SELECT cli_nome,cli_email, cli_tel FROM cliente where cli_cod = "+codigo; 

                // Criando variavel que executara o comando da string sql 

                Statement stm = (Statement) con.createStatement(); 

                try//Tratamento de erro da consulta 

                { //Criando variavel que exibira os resultados 

                    //Executando o comando da string sql na variavel rs 

                    ResultSet rs = stm.executeQuery(sql); 

 

                    int i=0; // Variavel utilizada para saber se ha dados cadastrados 

 

                    while (rs.next()) {  // Criando variaveis que receberão os valores do banco de dados 

                        String nome = rs.getString("cli_nome"); 

                        String email = rs.getString("cli_email"); 

                        String telefone = rs.getString("cli_tel"); 

 

                        i++; 

 

                        //JOptionPane.showMessageDialog(null,"Nome: " + nome + "\nEmail: " +telefone + "\nTelefone: " +telefone, "Resultado",-1); 

                        nome_tela.setText(String.valueOf(nome)); 

                        email_tela.setText(String.valueOf(email)); 

                        tel_tela.setText(String.valueOf(telefone)); 

 

                    } 

 

                    if(i==0){ // Verificando se ha dados cadastrados atraves da variavel i 

 

                        JOptionPane.showMessageDialog(null,"Dado não cadastrado","Resultado",-1); 

 

                    } 

 

                } catch (Exception ex) { // Consulta mal sucedida 

                    JOptionPane.showMessageDialog(null,"\nFalha ao consultar!","FALHA",0); 

                } 

 

            } catch (SQLException ex) { 

                // Conexão com servidor mal sucedida 

                JOptionPane.showMessageDialog(null,"Erro ao conectar com o servidor","ERRO!",0); 

            } 

 

        }catch(NumberFormatException erro){ 

            // Código fora do formato 

            JOptionPane.showMessageDialog(null,"Digite o código corretamante","ERRO",0); 

            cod_tela.setText(""); 

        }         // TODO add your handling code here:
    }//GEN-LAST:event_ConsultarActionPerformed

    private void telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneActionPerformed

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
            java.util.logging.Logger.getLogger(Inicial_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial_gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Atualizar;
    private org.edisoncor.gui.button.ButtonAction Consultar;
    private javax.swing.JButton Limpar;
    private org.edisoncor.gui.button.ButtonAction cadastro1;
    private javax.swing.JTable cliente;
    private java.util.List<Telas.Cliente> clienteList;
    private javax.persistence.Query clienteQuery;
    private javax.swing.JTextField cod_tela;
    private javax.swing.JTextField cod_tela1;
    private javax.swing.JTextField email;
    private javax.swing.JTextField email_tela;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel nome1;
    private javax.swing.JLabel nome2;
    private javax.swing.JTextField nome_;
    private javax.swing.JTextField nome_tela;
    private javax.swing.JPanel painel;
    private org.edisoncor.gui.button.ButtonAction sair;
    private javax.swing.JTabbedPane tabela;
    private javax.swing.JTextField tel_tela;
    private javax.swing.JTextField telefone;
    private javax.swing.JButton tirar;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
