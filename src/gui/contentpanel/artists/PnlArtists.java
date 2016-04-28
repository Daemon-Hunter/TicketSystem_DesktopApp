/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contentpanel.artists;

import events.IArtist;
import gui.Home;
import gui.RoundedBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Timeline;
import javax.swing.Timer;
import javax.swing.table.TableModel;
import wrappers.DesktopWrapper;

/**
 *
 * @author 10512691
 */
public class PnlArtists extends javax.swing.JPanel {
    
    private Home parent = null;
    
    private ArrayList<IArtist> allArtists;
    private IArtist curArtist;

    /**
     * Creates new Artist panel
     * @param parent
     */
    public PnlArtists(Home parent) {
        this.parent = parent;
        
        initComponents();
        initButtons();
        populateTable();
        
        txtSearchbar.setBorder(new RoundedBorder());
    }
    
    private void initButtons() {
        btnAddArtist.setMaximumSize(new Dimension(75, 29));
        btnDeleteArtist.setMaximumSize(new Dimension(75, 29));
        btnEditArtist.setMaximumSize(new Dimension(75, 29));
    }
    
    private void populateTable() {
        try {
            allArtists = new ArrayList (DesktopWrapper.getInstance().getArtists());

            if (allArtists.size() > 0) {

                // Creates a table model
                TableModel artistData = new ArtistTableModel(allArtists, allArtists.size());

                tableArtists.setModel(artistData);
            }
        } catch (IOException e) {
            //Handle exception ----------------------------------------------------------------------------------------------------------------------
        }
    }
    
    public void setParent(Home parent) {
        this.parent = parent;
    }
    
    /**
     * Displays a message that fades out after 2 seconds.
     * Use for notifying user.
     * @param text Must be less than 30 characters.
     */
    public void displayText(String text) {
        infoTextBox.setForeground(new Color(251,251,251));
        infoTextBox.setText(text);

        Timer t = new Timer(50, null);

        ActionListener fadeDown = new ActionListener() {

            Color c = infoTextBox.getForeground();
            int rgb = c.getBlue();

            @Override
            public void actionPerformed(ActionEvent e) {
                if (rgb > 51) {
                    rgb -= 5;
                    infoTextBox.setForeground(new Color(rgb, rgb, rgb));
                }
                else {
                    infoTextBox.setText("");
                    t.stop();
                }
            }
        };
        t.addActionListener(fadeDown);
        t.setInitialDelay(2000);
        t.start();
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
        btnAddArtist = new javax.swing.JButton();
        btnEditArtist = new javax.swing.JButton();
        btnDeleteArtist = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTextBox = new javax.swing.JTextArea();

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
        txtSearchbar.setAutoscrolls(false);
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
        tableArtists.setRowHeight(24);
        tableArtists.setShowVerticalLines(false);
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

        btnAddArtist.setText("New");
        btnAddArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddArtistActionPerformed(evt);
            }
        });

        btnEditArtist.setText("Edit");

        btnDeleteArtist.setText("Delete");
        btnDeleteArtist.setMaximumSize(new java.awt.Dimension(75, 29));
        btnDeleteArtist.setMinimumSize(new java.awt.Dimension(75, 29));
        btnDeleteArtist.setPreferredSize(new java.awt.Dimension(75, 29));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        infoTextBox.setEditable(false);
        infoTextBox.setBackground(new java.awt.Color(51, 51, 51));
        infoTextBox.setColumns(20);
        infoTextBox.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        infoTextBox.setLineWrap(true);
        infoTextBox.setRows(5);
        infoTextBox.setWrapStyleWord(true);
        infoTextBox.setAutoscrolls(false);
        infoTextBox.setDragEnabled(false);
        jScrollPane1.setViewportView(infoTextBox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(btnAddArtist)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(btnDeleteArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(searchPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchbar)
                        .addComponent(btnAddArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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
        if (curArtist == null) {
            if (allArtists != null) {
                curArtist = allArtists.get(tableArtists.getSelectedRow());
                System.out.println(curArtist.getName());
            }
        } 
        else if (curArtist.equals(allArtists.get(tableArtists.getSelectedRow()))) {
            PnlEditArtist editPnl = new PnlEditArtist();
            editPnl.setArtist(curArtist);
            editPnl.setParent(this);
            editPnl.setVisible(true);
            editPnl.setAlwaysOnTop(true);
            curArtist = null;
        } else {
            if (allArtists != null) {
                curArtist = allArtists.get(tableArtists.getSelectedRow());
                System.out.println(curArtist.getName());
            }
        }
    }//GEN-LAST:event_tableArtistsMouseClicked

    private void tableArtistsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableArtistsFocusLost
        curArtist = null;
    }//GEN-LAST:event_tableArtistsFocusLost

    private void btnAddArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddArtistActionPerformed
        
        displayText("Successfully added Micheal McIntyre.... Isn't it crazy! wohoooSuccessfully added Micheal McIntyre.... Isn't it crazy! wohooo");
    }//GEN-LAST:event_btnAddArtistActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddArtist;
    private javax.swing.JButton btnDeleteArtist;
    private javax.swing.JButton btnEditArtist;
    private javax.swing.JTextArea infoTextBox;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel searchPnl;
    private javax.swing.JLabel searchPnlLbl;
    private javax.swing.JTable tableArtists;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JTextField txtSearchbar;
    // End of variables declaration//GEN-END:variables

}
