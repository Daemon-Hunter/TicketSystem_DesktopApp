/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contentpanel.bookings;

import gui.contentpanel.artists.*;
import classes.ArtistTableModel;
import events.IArtist;
import gui.Home;
import gui.RoundedBorder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;
import wrappers.DesktopWrapper;

/**
 *
 * @author 10512691
 */
public class PnlBookings extends javax.swing.JPanel {
    
    private Home parent = null;
    

    /**
     * Creates new Artist panel
     * @param parent
     */
    public PnlBookings(Home parent) {
        
        initComponents();
        this.parent = parent;
        
        txtSearchbar.setBorder(new RoundedBorder());
        
//        populateTable();
        
    }
    
//    public final void populateTable() {
//        try {
//            allArtists = new ArrayList (DesktopWrapper.getInstance().getArtists());
//
//            if (allArtists.size() > 0) {
//
//                // Creates a table model
//                TableModel artistData = new ArtistTableModel(allArtists, allArtists.size());
//
//                tableArtists.setModel(artistData);
//            }
//        } catch (IOException e) {
//            //Handle exception ----------------------------------------------------------------------------------------------------------------------
//        }
//    }
    
    public void setParent(Home parent) {
        this.parent = parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        txtSearchbar = new javax.swing.JTextField();
        tableScrollPane = new javax.swing.JScrollPane();
        tableArtists = new javax.swing.JTable();
        searchPnl = new javax.swing.JPanel();
        searchPnlLbl = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(51, 51, 51));

        txtSearchbar.setText("Search Artists...");
        txtSearchbar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSearchbar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchbarFocusLost(evt);
            }
        });
        txtSearchbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchbarMouseClicked(evt);
            }
        });

        tableArtists.setModel(new javax.swing.table.DefaultTableModel(
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
        tableArtists.getTableHeader().setReorderingAllowed(false);
        tableArtists.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tableArtistsFocusLost(evt);
            }
        });
        tableArtists.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableArtistsMouseClicked(evt);
            }
        });
        tableScrollPane.setViewportView(tableArtists);
        if (tableArtists.getColumnModel().getColumnCount() > 0) {
            tableArtists.getColumnModel().getColumn(0).setPreferredWidth(20);
            tableArtists.getColumnModel().getColumn(3).setHeaderValue("More");
        }

        searchPnl.setBackground(new java.awt.Color(51, 51, 51));

        searchPnlLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/search.png"))); // NOI18N

        javax.swing.GroupLayout searchPnlLayout = new javax.swing.GroupLayout(searchPnl);
        searchPnl.setLayout(searchPnlLayout);
        searchPnlLayout.setHorizontalGroup(
            searchPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchPnlLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchPnlLayout.setVerticalGroup(
            searchPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchPnlLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchbar))
                .addGap(47, 47, 47)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchbarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchbarFocusLost
        txtSearchbar.setText("Search Artists...");
    }//GEN-LAST:event_txtSearchbarFocusLost

    private void txtSearchbarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchbarMouseClicked
        if (txtSearchbar.getText().contains("Search Artists...")) {
            txtSearchbar.setText("");
        }
    }//GEN-LAST:event_txtSearchbarMouseClicked

    private void tableArtistsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableArtistsMouseClicked
    }//GEN-LAST:event_tableArtistsMouseClicked

    private void tableArtistsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableArtistsFocusLost
    }//GEN-LAST:event_tableArtistsFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel searchPnl;
    private javax.swing.JLabel searchPnlLbl;
    private javax.swing.JTable tableArtists;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JTextField txtSearchbar;
    // End of variables declaration//GEN-END:variables

}
