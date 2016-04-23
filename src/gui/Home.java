/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.contentpanel.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import wrappers.DesktopWrapper;


/**
 *
 * @author 10512691
 * @author 10467841
 */
public class Home extends javax.swing.JFrame {
    
    private Pages page = null;
    private CardLayout cards = null;
    
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        initSidebar();
        initContent();
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlSidebar = new javax.swing.JPanel();
        pnlContent = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Function Junction - ADMIN");
        setBackground(new java.awt.Color(1, 3, 14));
        setMaximumSize(new java.awt.Dimension(1080, 600));
        setMinimumSize(new java.awt.Dimension(1080, 600));
        setName("desktopFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1080, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 600));

        pnlBackground.setBackground(new java.awt.Color(51, 51, 51));

        pnlSidebar.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout pnlSidebarLayout = new javax.swing.GroupLayout(pnlSidebar);
        pnlSidebar.setLayout(pnlSidebarLayout);
        pnlSidebarLayout.setHorizontalGroup(
            pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        pnlSidebarLayout.setVerticalGroup(
            pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        pnlContent.setBackground(new java.awt.Color(51, 51, 51));
        pnlContent.setPreferredSize(new java.awt.Dimension(870, 578));

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addComponent(pnlSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void initSidebar() {
        // Create a box layout for the sidebar panel.
        // This is in order to set the logo to be on top of the 'sidebar'
        BoxLayout boxLayout = new BoxLayout(pnlSidebar, BoxLayout.Y_AXIS);
        pnlSidebar.setLayout(boxLayout);

        // Create a panel
        JPanel pnlLogo = new JPanel();                                                
        Dimension logoSize = new Dimension(205, 95);                                  
        pnlLogo.setPreferredSize(logoSize);                                           
        pnlLogo.setMaximumSize(logoSize);                                             
        pnlLogo.setBackground(new Color(51,51,51)); // <- same color as background    
                                                                                      
        // Create a label to put the logo onto                                        
        JLabel lblLogo = new JLabel();                                               
        Icon logo = new ImageIcon(getClass().getResource("/images/LogoWhite.png"));   
        lblLogo.setIcon(logo);  
        
        // Add the label to the panel
        pnlLogo.add(lblLogo);              

        // Add logo to the sidebar
        pnlSidebar.add(pnlLogo);
        
        // Give sidebar access to 'this' frame. Allows the sidebar to call public
        // methods contained in this class - specifically setContent(JPanel content)
        PnlSidebar sidebar = new PnlSidebar();
        sidebar.setParent(this);
        pnlSidebar.add(sidebar);
    }
    
    public Pages getPage() {
        return page;
    }
    
    public void setPage(Pages newPage) {
        cards.show(pnlContent, newPage.toString());
        page = newPage;
    }
    
    /**
     * Initialises the background into its startup state
     */
    private void initContent() {
        
        // Allows the background panel to be swapped for other JPanel objects
        pnlContent.setLayout(new CardLayout());
        
        // Creates a new insrtance of the content panels
        JPanel home = new PnlHome();
        JPanel users = new PnlUsers();
        JPanel artists = new PnlArtists(this);
        
        // Sets the size of the content panels to match the 'container' panel
        home.setMinimumSize(pnlContent.getSize());
        users.setMinimumSize(pnlContent.getSize());
        artists.setMinimumSize(pnlContent.getSize());
        
        // Add the panels to the 'container' panel, with specified indexes
        pnlContent.add(home, Pages.HOME.toString());
        pnlContent.add(users, Pages.USERS.toString());
        pnlContent.add(artists, Pages.ARTISTS.toString());
        
        cards = (CardLayout)(pnlContent.getLayout());
        
        // Show the home panel on startup. Sidebar initializes with 
        setPage(Pages.HOME);
    }
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlSidebar;
    // End of variables declaration//GEN-END:variables
}
