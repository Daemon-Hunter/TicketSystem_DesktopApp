/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contentpanel;

import gui.RoundedBorder;

/**
 *
 * @author 10512691
 */
public class PnlUsers extends javax.swing.JPanel {

    /**
     * Creates new Users panel
     */
    public PnlUsers() {
        initComponents();
        initPanel();

    }

    /**
    * Initializes the panels components
    **/
    private void initPanel() {
        txtSearchbar.setBorder(new RoundedBorder());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearchbar = new javax.swing.JTextField();
        pnlSearch = new javax.swing.JPanel();
        lblSearch = new javax.swing.JLabel();
        tableScrollPane = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 51, 51));

        txtSearchbar.setText("Search Users...");
        txtSearchbar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSearchbar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchbarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchbarFocusLost(evt);
            }
        });
        txtSearchbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchbarMouseClicked(evt);
            }
        });
        txtSearchbar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchbarKeyPressed(evt);
            }
        });

        pnlSearch.setBackground(new java.awt.Color(51, 51, 51));

        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/search.png"))); // NOI18N

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Tags", "More"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUsers.getTableHeader().setReorderingAllowed(false);
        tableScrollPane.setViewportView(tableUsers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearchbar)
                    .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchbarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchbarKeyPressed
        
        
    }//GEN-LAST:event_txtSearchbarKeyPressed

    private void txtSearchbarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchbarFocusLost
        txtSearchbar.setText("Search Users...");
    }//GEN-LAST:event_txtSearchbarFocusLost

    private void txtSearchbarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchbarMouseClicked
        
    }//GEN-LAST:event_txtSearchbarMouseClicked

    private void txtSearchbarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchbarFocusGained
        if (txtSearchbar.getText().contains("Search Users...")) {
            txtSearchbar.setText("");
        }
    }//GEN-LAST:event_txtSearchbarFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblSearch;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JTable tableUsers;
    private javax.swing.JTextField txtSearchbar;
    // End of variables declaration//GEN-END:variables
}
