/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contentpanel.events;

import events.IChildEvent;
import events.IParentEvent;
import gui.Home;
import gui.RoundedBorder;
import gui.contentpanel.artists.ArtistTableModel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import wrappers.DesktopWrapper;

/**
 *
 * @author 10512691
 */
public class PnlEvents extends javax.swing.JPanel {
    
    private Home parent = null;
    List<IParentEvent> allParentEvents;
    List<IParentEvent> originalAllParentEvents;
    private DefaultListModel listParentEventModel;
    IParentEvent currParentEvent;
    IChildEvent currChildEvent;
    List<IChildEvent> currParentEvents_ChildEvents;

    /**
     * Creates new Artist panel
     * @param parent
     */
    public PnlEvents(Home parent) {
        listParentEventModel = new DefaultListModel();
        initComponents();
        this.parent = parent;
        txtSearchBar.setBorder(new RoundedBorder());
        refreshParentEventsList();       
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
        txtSearchBar = new javax.swing.JTextField();
        tableScrollPane = new javax.swing.JScrollPane();
        tableChildEvents = new javax.swing.JTable();
        searchPnl = new javax.swing.JPanel();
        searchPnlLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        listParentEvents = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        lblDescriptionRemaining = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        infoTextBox = new javax.swing.JTextArea();
        btnNewParentEvent = new javax.swing.JButton();
        btnEditEvent1 = new javax.swing.JButton();
        lblAddImage = new javax.swing.JLabel();
        lblAddImage1 = new javax.swing.JLabel();

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

        txtSearchBar.setText("Search Events");
        txtSearchBar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSearchBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchBarFocusLost(evt);
            }
        });
        txtSearchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchBarMouseClicked(evt);
            }
        });
        txtSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBarActionPerformed(evt);
            }
        });

        tableChildEvents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Venue", "Start Time", "End Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableChildEvents.getTableHeader().setReorderingAllowed(false);
        tableChildEvents.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tableChildEventsFocusLost(evt);
            }
        });
        tableChildEvents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableChildEventsMouseClicked(evt);
            }
        });
        tableScrollPane.setViewportView(tableChildEvents);
        if (tableChildEvents.getColumnModel().getColumnCount() > 0) {
            tableChildEvents.getColumnModel().getColumn(0).setPreferredWidth(20);
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

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");

        listParentEvents.setModel(listParentEventModel);
        listParentEvents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listParentEventsMouseClicked(evt);
            }
        });
        listParentEvents.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listParentEventsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listParentEvents);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Parent Events");

        jScrollPane2.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setForeground(new java.awt.Color(250, 250, 250));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtDescription.setEditable(false);
        txtDescription.setBackground(new java.awt.Color(51, 51, 51));
        txtDescription.setColumns(1);
        txtDescription.setForeground(new java.awt.Color(250, 250, 250));
        txtDescription.setLineWrap(true);
        txtDescription.setRows(5);
        txtDescription.setWrapStyleWord(true);
        txtDescription.setCaretColor(new java.awt.Color(250, 250, 250));
        txtDescription.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDescription.setSelectedTextColor(new java.awt.Color(250, 250, 250));
        txtDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescriptionKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtDescription);

        lblDescriptionRemaining.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        lblDescriptionRemaining.setForeground(new java.awt.Color(255, 0, 0));
        lblDescriptionRemaining.setText("500 characters remaining");

        lblDescription.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setText("Description");

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        infoTextBox.setEditable(false);
        infoTextBox.setBackground(new java.awt.Color(51, 51, 51));
        infoTextBox.setColumns(20);
        infoTextBox.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        infoTextBox.setLineWrap(true);
        infoTextBox.setRows(5);
        infoTextBox.setWrapStyleWord(true);
        infoTextBox.setAutoscrolls(false);
        infoTextBox.setDragEnabled(false);
        jScrollPane3.setViewportView(infoTextBox);

        btnNewParentEvent.setText("New Parent Event");
        btnNewParentEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewParentEventMouseClicked(evt);
            }
        });

        btnEditEvent1.setText("Edit/View Event");
        btnEditEvent1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditEvent1MouseClicked(evt);
            }
        });

        lblAddImage.setForeground(new java.awt.Color(251, 251, 251));
        lblAddImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/addIcon.png"))); // NOI18N
        lblAddImage.setText(" Add Image");
        lblAddImage.setToolTipText("");

        lblAddImage1.setForeground(new java.awt.Color(251, 251, 251));
        lblAddImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/addIcon.png"))); // NOI18N
        lblAddImage1.setText("Add Child Event");
        lblAddImage1.setToolTipText("");
        lblAddImage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddImage1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescriptionRemaining)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEditEvent1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewParentEvent))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(96, 96, 96)
                        .addComponent(lblDescription)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAddImage1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblAddImage)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblDescription))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescriptionRemaining))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewParentEvent)
                    .addComponent(btnEditEvent1))
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSearchBar))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddImage1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 280, Short.MAX_VALUE)
                    .addComponent(lblAddImage)
                    .addGap(0, 281, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchBarFocusLost
        txtSearchBar.setText("Search Artists...");
    }//GEN-LAST:event_txtSearchBarFocusLost

    private void txtSearchBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchBarMouseClicked
        if (txtSearchBar.getText().contains("Search Artists...")) {
            txtSearchBar.setText("");
        }
    }//GEN-LAST:event_txtSearchBarMouseClicked

    private void tableChildEventsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableChildEventsMouseClicked
           if(currChildEvent == null)
       {
           if(currParentEvents_ChildEvents != null)
           {
              currChildEvent = currParentEvents_ChildEvents.get(tableChildEvents.getSelectedRow());
           }
       } else if(currChildEvent.equals(currParentEvents_ChildEvents.get(tableChildEvents.getSelectedRow())));
       {
            PnlEditChildEvent editPnl = new PnlEditChildEvent();
               try {
                   System.out.println(currParentEvent.getName());
                   editPnl.setChildEvent(currChildEvent,currChildEvent.getParentEvent());
               } catch (IOException ex) {
                   Logger.getLogger(PnlEvents.class.getName()).log(Level.SEVERE, null, ex);
               }
            editPnl.setParent(this);
            editPnl.setVisible(true);
            editPnl.setAlwaysOnTop(true);
            EventTableModel model = new EventTableModel();
            tableChildEvents.setModel(model);
            listParentEvents.setSelectedIndex(-1);
            currParentEvent = null;
            currChildEvent = null;

       }
       
       
    }//GEN-LAST:event_tableChildEventsMouseClicked

    private void tableChildEventsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableChildEventsFocusLost
    }//GEN-LAST:event_tableChildEventsFocusLost

    private void txtDescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyTyped
        // Allow user to type if the description length is < 500
//        if (descLength - txtDescription.getText().length() >= 0) {
//            lblDescriptionRemaining.setText((descLength - txtDescription.getText().length()) + " characters remaining");
//        } else {
//            // else remove any additional characters
//            txtDescription.setText(txtDescription.getText().substring(0, txtDescription.getText().length() - 1));
//        }
    }//GEN-LAST:event_txtDescriptionKeyTyped

    private void listParentEventsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listParentEventsValueChanged
        populateChildEvents();
    }//GEN-LAST:event_listParentEventsValueChanged

    private void listParentEventsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listParentEventsMouseClicked
                    currParentEvent = allParentEvents.get(listParentEvents.getSelectedIndex());

    }//GEN-LAST:event_listParentEventsMouseClicked

    private void btnNewParentEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewParentEventMouseClicked
            PnlNewParentEvent pnl = new PnlNewParentEvent();
            pnl.setParent(this);
            pnl.setVisible(true);
            pnl.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnNewParentEventMouseClicked

    private void btnEditEvent1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditEvent1MouseClicked
        if(currParentEvent != null)
        {
            PnlEditParentEvent panel = new PnlEditParentEvent();
            panel.setParentEvent(currParentEvent);
            panel.setParent(this);
            panel.setVisible(true);
            panel.setAlwaysOnTop(true);

        }else{
            JOptionPane.showMessageDialog(this, "Please select a parent event to edit");
        }
    }//GEN-LAST:event_btnEditEvent1MouseClicked

    private void lblAddImage1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddImage1MouseClicked
        if(currParentEvent != null)
        {
            PnlNewChildEvent panel = new PnlNewChildEvent();
            panel.setParentEvent(currParentEvent);
            panel.setParent(this);
            panel.setVisible(true);
            panel.setAlwaysOnTop(true);

        }else{
            JOptionPane.showMessageDialog(this, "Please select a parent add a child"
                    + "event to");
        }

    }//GEN-LAST:event_lblAddImage1MouseClicked

    private void txtSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBarActionPerformed
        String textToSearch = txtSearchBar.getText();        
        if(!textToSearch.equals(""))
        {
            listParentEventModel.clear();
            try {
              allParentEvents =  DesktopWrapper.getInstance().searchParentEvents(textToSearch);
                for (IParentEvent event : allParentEvents) {
                    
                    listParentEventModel.addElement(event.getName());
                }
            } catch (IOException ex) {
              System.out.println("Nah");

                allParentEvents = originalAllParentEvents;
                for (IParentEvent event : allParentEvents) {
                    listParentEventModel.addElement(event.getName());
                }

            }
        }
        else
        {
                listParentEventModel.clear();
                allParentEvents = originalAllParentEvents;
                for (IParentEvent event : allParentEvents) {
                    listParentEventModel.addElement(event.getName());
                }
        }
    }//GEN-LAST:event_txtSearchBarActionPerformed
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
        t.setInitialDelay(5000);
        t.start();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditEvent1;
    private javax.swing.JButton btnNewParentEvent;
    private javax.swing.JTextArea infoTextBox;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddImage;
    private javax.swing.JLabel lblAddImage1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDescriptionRemaining;
    private javax.swing.JList<String> listParentEvents;
    private javax.swing.JPanel searchPnl;
    private javax.swing.JLabel searchPnlLbl;
    private javax.swing.JTable tableChildEvents;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtSearchBar;
    // End of variables declaration//GEN-END:variables

    public void refreshParentEventsList() {
        EventTableModel childEventsModel = new EventTableModel();
        tableChildEvents.setModel(childEventsModel);
        listParentEventModel.clear();

        try {
             allParentEvents = DesktopWrapper.getInstance().refreshParentEvents();
             originalAllParentEvents = allParentEvents;
           for (IParentEvent currEvent : allParentEvents)
            {
                listParentEventModel.addElement(currEvent.getName());
            }
    
        } catch (IOException ex) {
         listParentEventModel.addElement("No Events Found");
        }
    }

    private void populateChildEvents() {
     if(listParentEvents.getSelectedIndex() != -1)
     {
        IParentEvent currParentEvent = allParentEvents.get(listParentEvents.getSelectedIndex());
        txtDescription.setText(currParentEvent.getDescription());
        try {
            currParentEvents_ChildEvents = currParentEvent.getChildEvents();
            EventTableModel childEventsModel = new EventTableModel(currParentEvents_ChildEvents, currParentEvents_ChildEvents.size());
            tableChildEvents.setModel(childEventsModel);
        } catch (IOException ex) {
            Logger.getLogger(PnlEvents.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
    

}
