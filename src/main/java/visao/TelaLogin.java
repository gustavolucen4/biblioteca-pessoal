/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package visao;

import bibliotecaDAO.UsuarioDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Usuario;

/**
 *
 * @author gusta
 */
public class TelaLogin extends javax.swing.JPanel {

    private static TelaLogin instancia;
    
    private TelaLogin() {
        initComponents();
        painelErro.setVisible(false);
    }

    public static TelaLogin getTelaLogin(){
        if(instancia == null){
            instancia = new TelaLogin();
        }
        return instancia;
    }

    public void limparCampos(){
    
        txfEmail.setText("");
        txfSenha.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btEntrar = new javax.swing.JButton();
        btTelaCadastrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        painelErro = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txfSenha = new javax.swing.JPasswordField();
        cbMostrarSenha = new javax.swing.JCheckBox();

        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Login:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("e-mail:");

        txfEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfEmailActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("senha:");

        btEntrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btEntrar.setText("Entrar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        btTelaCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btTelaCadastrar.setText("Cadastrar-se");
        btTelaCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTelaCadastrarActionPerformed(evt);
            }
        });

        jLabel4.setText("ou");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 0, 0));
        jLabel5.setText("e-mail ou senha incorretos");

        javax.swing.GroupLayout painelErroLayout = new javax.swing.GroupLayout(painelErro);
        painelErro.setLayout(painelErroLayout);
        painelErroLayout.setHorizontalGroup(
            painelErroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelErroLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        painelErroLayout.setVerticalGroup(
            painelErroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelErroLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        txfSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cbMostrarSenha.setText("Mostrar senha");
        cbMostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMostrarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMostrarSenha)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(btEntrar)
                            .addGap(35, 35, 35)
                            .addComponent(jLabel4)
                            .addGap(31, 31, 31)
                            .addComponent(btTelaCadastrar))
                        .addComponent(jLabel3)
                        .addComponent(txfEmail)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                            .addComponent(painelErro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)
                        .addComponent(txfSenha)))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(painelErro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMostrarSenha)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEntrar)
                    .addComponent(btTelaCadastrar)
                    .addComponent(jLabel4))
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfEmailActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
            
        Usuario usuario = new Usuario();
        usuario.setEmail(txfEmail.getText());
        usuario.setSenha(txfSenha.getText());
        
        try {
            if((!txfEmail.getText().equals("") && !txfSenha.getText().equals("") && txfEmail.getText().contains("@")) && UsuarioDAO.login(usuario)){
        
            TelaDinamica.login.setVisible(false);
            TelaDinamica.home.setVisible(true);
            
        }else{
            painelErro.setVisible(true);
            limparCampos();
        }
        } catch (Exception ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btEntrarActionPerformed

    private void btTelaCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTelaCadastrarActionPerformed
        TelaDinamica.login.setVisible(false);
        TelaDinamica.cadastro.setVisible(true);
    }//GEN-LAST:event_btTelaCadastrarActionPerformed

    private void cbMostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMostrarSenhaActionPerformed
        if(cbMostrarSenha.isSelected()){
            txfSenha.setEchoChar((char)0);
        }else{
            txfSenha.setEchoChar('•');
        }
    }//GEN-LAST:event_cbMostrarSenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btTelaCadastrar;
    private javax.swing.JCheckBox cbMostrarSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel painelErro;
    private javax.swing.JTextField txfEmail;
    private javax.swing.JPasswordField txfSenha;
    // End of variables declaration//GEN-END:variables
}
