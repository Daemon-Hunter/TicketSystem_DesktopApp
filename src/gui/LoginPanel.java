package gui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import wrappers.DesktopWrapper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dominic
 */
public class LoginPanel extends javax.swing.JFrame {
    
    private Boolean passloggedIn = false;

    /**
     * Creates new form LoginPanel
     */
    public LoginPanel() {
        initComponents();
        setResizable(false);
        loading_icon_lbl.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContent = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        pnlContent1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtError = new javax.swing.JLabel();
        txtUsernameError = new javax.swing.JLabel();
        JPassword = new javax.swing.JPasswordField();
        loading_icon_lbl = new javax.swing.JLabel();

        pnlContent.setBackground(new java.awt.Color(51, 51, 51));
        pnlContent.setPreferredSize(new java.awt.Dimension(870, 578));

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );

        txtName.setBackground(new java.awt.Color(51, 51, 51));
        txtName.setForeground(new java.awt.Color(250, 250, 250));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlContent1.setBackground(new java.awt.Color(51, 51, 51));
        pnlContent1.setPreferredSize(new java.awt.Dimension(870, 578));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fj-logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username : ");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password :");

        txtUsername.setBackground(new java.awt.Color(51, 51, 51));
        txtUsername.setForeground(new java.awt.Color(250, 250, 250));
        txtUsername.setText("domgarbett@gmail.com");

        jButton1.setText("Log In");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        txtError.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        txtError.setForeground(new java.awt.Color(255, 51, 102));

        txtUsernameError.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        txtUsernameError.setForeground(new java.awt.Color(255, 51, 102));

        JPassword.setText("password");
        JPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPasswordMouseClicked(evt);
            }
        });

        loading_icon_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loading_icon.gif"))); // NOI18N

        javax.swing.GroupLayout pnlContent1Layout = new javax.swing.GroupLayout(pnlContent1);
        pnlContent1.setLayout(pnlContent1Layout);
        pnlContent1Layout.setHorizontalGroup(
            pnlContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContent1Layout.createSequentialGroup()
                .addGroup(pnlContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContent1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnlContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(pnlContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(538, 538, 538)
                        .addGroup(pnlContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsernameError)
                            .addComponent(txtError)))
                    .addGroup(pnlContent1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1))
                    .addGroup(pnlContent1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jButton1)
                        .addGap(130, 130, 130)
                        .addComponent(loading_icon_lbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlContent1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JPassword, txtUsername});

        pnlContent1Layout.setVerticalGroup(
            pnlContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContent1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlContent1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(loading_icon_lbl))
                    .addGroup(pnlContent1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsernameError))
                        .addGap(43, 43, 43)
                        .addGroup(pnlContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(JPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(txtError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContent1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContent1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
   
        loading_icon_lbl.setVisible(true);
        
        txtUsername.setEditable(false);
        JPassword.setEditable(false);
        jButton1.setEnabled(false);
        
        txtError.setText("");
        
        SwingWorker<String, Object> sWorker = new SwingWorker() {
            @Override
            public String doInBackground() {
                try {
                    passloggedIn = DesktopWrapper.getInstance().loginAdmin(txtUsername.getText(), JPassword.getText());
                    
                    if (passloggedIn == true) {
                        Home pnl = new Home();
                        pnl.setVisible(true);
                        LoginPanel.this.dispose();
                    }
                    done();
                } 
                catch (IOException ex) 
                {
                    JOptionPane.showMessageDialog(LoginPanel.this, "IOException  " +  ex.getMessage());
                    done();
                }
                catch (IllegalArgumentException ex) 
                {
                    JOptionPane.showMessageDialog(LoginPanel.this, ex.getMessage());
                    done();
                }
                
                return "";
            }

            @Override
            protected void done() {
                loading_icon_lbl.setVisible(false);
                txtUsername.setEditable(true);
                JPassword.setEditable(true);
                jButton1.setEnabled(true);
            }
        };

        sWorker.execute();
        
//        Thread loginThread = new Thread() {
//            
//            @Override
//            public void run() {
//                txtError.setText("");
//                try {
//                    passloggedIn = DesktopWrapper.getInstance().loginAdmin(txtUsername.getText(), JPassword.getText());
//                } 
//                catch (IOException ex) 
//                {
//                    JOptionPane.showMessageDialog(LoginPanel.this, "IOException  " +  ex.getMessage());
//                }
//                catch (IllegalArgumentException ex) 
//                {
//                JOptionPane.showMessageDialog(LoginPanel.this, ex.getMessage());
//                } 
//                
//                if (passloggedIn == true) {
//                    Home pnl = new Home();
//                    pnl.setVisible(true);
//                    LoginPanel.this.dispose();
//                }
//            }
//        };
//        
//        loading_icon_lbl.setVisible(true);
//        
//        loginThread.start();
//        
//        loading_icon_lbl.setVisible(false);
        
//        Boolean passloggedIn = false;
//        txtError.setText("");
//
//        try {
//            passloggedIn = DesktopWrapper.getInstance().loginAdmin(txtUsername.getText(), JPassword.getText());
//        } catch (IOException ex) {
//            JOptionPane.showMessageDialog(this, "IOException  " +  ex.getMessage());
//        }
//            catch (IllegalArgumentException ex) {
//            JOptionPane.showMessageDialog(this, ex.getMessage());
//        } 
//        if(passloggedIn == true)
//        {
//            Home pnl = new Home();
//            pnl.setVisible(true);
//            this.dispose();
//        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void JPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPasswordMouseClicked
    }//GEN-LAST:event_JPasswordMouseClicked

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
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel loading_icon_lbl;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlContent1;
    private javax.swing.JLabel txtError;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel txtUsernameError;
    // End of variables declaration//GEN-END:variables
}
