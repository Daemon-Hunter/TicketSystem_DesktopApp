/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import classes.ArtistTableModel;
import datamodel.Artist;
import java.util.ArrayList;
import javax.swing.table.TableModel;

/**
 *
 * @author 10512691
 */
public class PnlArtists extends javax.swing.JPanel {
    
    private Home parent = null;

    /**
     * Creates new Artist panel
     * @param parent
     */
    public PnlArtists(Home parent) {
        
        initComponents();
        this.parent = parent;
        
        txtSearchbar.setBorder(new RoundedBorder());
        
        populateTable();
        
        tableArtists.addMouseListener(new java.awt.event.MouseAdapter() {
            
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tableArtists.rowAtPoint(evt.getPoint());
                int col = tableArtists.rowAtPoint(evt.getPoint());
                
                if (col == 4) {
                    if (parent.getWrapper().getArtists().get(row) != null) {
                        System.out.println(parent.getWrapper().getArtists().get(row));
                    }
                }
            }
        });
    }
    
    public final void populateTable() {
        if (parent.getWrapper().getArtists() != null) {
            ArrayList<Artist> allArtists = new ArrayList (parent.getWrapper().getArtists());
            
            if (allArtists.size() > 0) {
                Artist currArtist;
                
                // Creates a table model with 20 rows & 4 columns.
                TableModel artistData = new ArtistTableModel(allArtists.size(), 4);

                for (int i = 0; i < 20 && i < allArtists.size(); i++) {
                    currArtist = allArtists.get(i);
                    String artistTags = "";

                    artistData.setValueAt(currArtist.getArtistName(), i, 0);

                    artistData.setValueAt(currArtist.getDescription(), i, 1);

                    for (String tag : currArtist.getArtistTags()) {
                        artistTags += tag + ", ";
                    }
                    if (artistTags.length() > 2) {
                        artistTags = artistTags.substring(0, artistTags.length() - 2);
                    }
                    artistData.setValueAt(artistTags, i, 2);

                    artistData.setValueAt("More...", i, 3);
                }
                
                tableArtists.setModel(artistData);
            }
        }
    }
    
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
        tableScrollPane.setViewportView(tableArtists);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchbar))
                .addGap(65, 65, 65)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel searchPnl;
    private javax.swing.JLabel searchPnlLbl;
    private javax.swing.JTable tableArtists;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JTextField txtSearchbar;
    // End of variables declaration//GEN-END:variables

}
