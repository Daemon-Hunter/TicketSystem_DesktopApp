/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contentpanel.events;

import database.DatabaseTable;
import events.IArtist;
import events.IChildEvent;
import events.IParentEvent;
import events.IVenue;
import gui.ObjectSelectDialog;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerDateModel;
import tickets.ITicket;
import wrappers.DesktopWrapper;

/**
 *
 * @author 10512691
 */
public class PnlEditChildEvent extends javax.swing.JFrame {

    private PnlEvents parent;
    private IChildEvent childEvent;
    private final int descLength = 500;
    private IParentEvent parentEvent;
    DefaultListModel lineupListModel;
    DefaultListModel ticketsListModel;
    IVenue venue;
    List<IArtist> lineup;
    List<ITicket> tickets;
    SpinnerDateModel endModel,startModel;
    /**
     * Creates new form PnlEditArtist
     */
    public PnlEditChildEvent() {
        lineupListModel = new DefaultListModel();
        ticketsListModel = new DefaultListModel();
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
    }
    
    public void setChildEvent(IChildEvent event,IParentEvent parentEvent) {
        this.childEvent = event;
        this.parentEvent = parentEvent;
        populateLineup();
        populateTickets();
        initPanel();
    }
    
    public void setParent(PnlEvents parent) {
        this.parent = parent;
    }

    private void initPanel() {
       txtName.setText(childEvent.getName());
       DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.UK);
       txtParentName.setText(parentEvent.getName());
       txtDescription.setText(childEvent.getDescription());
       
                 endModel = (SpinnerDateModel) spnEndTime.getModel();
                 startModel = (SpinnerDateModel) spnStartTime.getModel();
       
                startModel.setValue(childEvent.getStartDateTime());
                endModel.setValue(childEvent.getEndDateTime());
                spnEndTime.setModel(endModel);
                spnStartTime.setModel(startModel);
                

       venue = childEvent.getVenue();
       txtVenue.setText(venue.getName());

       lblDescriptionRemaining.setText((descLength - childEvent.getDescription().length()) + " characters remaining");
          }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        lblDescriptionRemaining = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        lblDetailsTitle = new javax.swing.JLabel();
        btnSelectVenue = new javax.swing.JButton();
        lblName1 = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        lblName3 = new javax.swing.JLabel();
        txtParentName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstLineup = new javax.swing.JList<>();
        lblDetailsTitle1 = new javax.swing.JLabel();
        lblName4 = new javax.swing.JLabel();
        txtVenue = new javax.swing.JTextField();
        btnCancel1 = new javax.swing.JButton();
        lblAddArtist = new javax.swing.JLabel();
        lblRemoveArtist = new javax.swing.JLabel();
        spnStartTime = new javax.swing.JSpinner();
        spnEndTime = new javax.swing.JSpinner();
        btnSave = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstTickets = new javax.swing.JList<>();
        lblDetailsTitle2 = new javax.swing.JLabel();
        lblAddImage2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        pnlBackground.setBackground(new java.awt.Color(51, 51, 51));

        lblName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name:");

        lblDescription.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setText("Description:");

        txtName.setBackground(new java.awt.Color(51, 51, 51));
        txtName.setForeground(new java.awt.Color(250, 250, 250));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(250, 250, 250));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

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
        jScrollPane1.setViewportView(txtDescription);

        lblDescriptionRemaining.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        lblDescriptionRemaining.setForeground(new java.awt.Color(255, 0, 0));
        lblDescriptionRemaining.setText("500 characters remaining");

        jSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator.setToolTipText("");

        lblDetailsTitle.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblDetailsTitle.setForeground(new java.awt.Color(250, 250, 250));
        lblDetailsTitle.setText("Child Event Details");

        btnSelectVenue.setText("Select Venue");
        btnSelectVenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelectVenueMouseClicked(evt);
            }
        });
        btnSelectVenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectVenueActionPerformed(evt);
            }
        });

        lblName1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblName1.setForeground(new java.awt.Color(255, 255, 255));
        lblName1.setText("Parent Event :");

        lblName2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblName2.setForeground(new java.awt.Color(255, 255, 255));
        lblName2.setText("Start Time");

        lblName3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblName3.setForeground(new java.awt.Color(255, 255, 255));
        lblName3.setText("End Time");

        txtParentName.setEditable(false);
        txtParentName.setBackground(new java.awt.Color(51, 51, 51));
        txtParentName.setForeground(new java.awt.Color(250, 250, 250));

        lstLineup.setModel(lineupListModel);
        jScrollPane2.setViewportView(lstLineup);

        lblDetailsTitle1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblDetailsTitle1.setForeground(new java.awt.Color(250, 250, 250));
        lblDetailsTitle1.setText("Lineup");

        lblName4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblName4.setForeground(new java.awt.Color(255, 255, 255));
        lblName4.setText("Event Venue");

        txtVenue.setEditable(false);
        txtVenue.setBackground(new java.awt.Color(51, 51, 51));
        txtVenue.setForeground(new java.awt.Color(250, 250, 250));

        btnCancel1.setText("Cancel");
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });

        lblAddArtist.setForeground(new java.awt.Color(251, 251, 251));
        lblAddArtist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/addIcon.png"))); // NOI18N
        lblAddArtist.setText("Add Artist");
        lblAddArtist.setToolTipText("");
        lblAddArtist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddArtistMouseClicked(evt);
            }
        });

        lblRemoveArtist.setForeground(new java.awt.Color(250, 250, 250));
        lblRemoveArtist.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblRemoveArtist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/removeIcon.png"))); // NOI18N
        lblRemoveArtist.setText(" Remove Artist");
        lblRemoveArtist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRemoveArtistMouseClicked(evt);
            }
        });

        spnStartTime.setModel(new javax.swing.SpinnerDateModel());

        spnEndTime.setModel(new javax.swing.SpinnerDateModel());

        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        lstTickets.setModel(lineupListModel);
        jScrollPane3.setViewportView(lstTickets);

        lblDetailsTitle2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblDetailsTitle2.setForeground(new java.awt.Color(250, 250, 250));
        lblDetailsTitle2.setText("Tickets");

        lblAddImage2.setForeground(new java.awt.Color(251, 251, 251));
        lblAddImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/addIcon.png"))); // NOI18N
        lblAddImage2.setText("Add Tickets");
        lblAddImage2.setToolTipText("");

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(lblDescription)
                                .addGap(318, 318, 318)
                                .addComponent(lblDescriptionRemaining))))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(lblDetailsTitle))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName1)
                            .addComponent(lblName4)
                            .addComponent(lblName2)
                            .addComponent(lblName3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(spnEndTime)
                                .addComponent(spnStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtParentName, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                        .addComponent(btnCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSelectVenue)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lblDetailsTitle1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                        .addComponent(lblAddArtist)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblRemoveArtist))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddImage2))
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(lblDetailsTitle2)
                                .addGap(106, 106, 106))))))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(lblDetailsTitle1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRemoveArtist)
                                    .addComponent(lblAddArtist))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDetailsTitle2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAddImage2)
                        .addGap(3, 3, 3))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDescriptionRemaining)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(lblDetailsTitle)
                                .addGap(21, 21, 21)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblName)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescription)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName1)
                            .addComponent(txtParentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName4)
                            .addComponent(txtVenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelectVenue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName2)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(spnStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spnEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnCancel1))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectVenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectVenueActionPerformed
    
    }//GEN-LAST:event_btnSelectVenueActionPerformed

    private void txtDescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyTyped
        // Allow user to type if the description length is < 500
        if (descLength - txtDescription.getText().length() >= 0) {
            lblDescriptionRemaining.setText((descLength - txtDescription.getText().length()) + " characters remaining");
        } else {
            // else remove any additional characters
            txtDescription.setText(txtDescription.getText().substring(0, txtDescription.getText().length() - 1));
        }
    }//GEN-LAST:event_txtDescriptionKeyTyped

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancel1ActionPerformed

    private void lblAddArtistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddArtistMouseClicked
        ObjectSelectDialog dialog = new ObjectSelectDialog();
            dialog.setTable(DatabaseTable.ARTIST);
            dialog.setVisible(true);
            dialog.setEditParent(this);
            dialog.setAlwaysOnTop(true);
    }//GEN-LAST:event_lblAddArtistMouseClicked

    private void lblRemoveArtistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoveArtistMouseClicked
      // Remove Artist from Lineup Here
    }//GEN-LAST:event_lblRemoveArtistMouseClicked

    private void btnSelectVenueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectVenueMouseClicked
        ObjectSelectDialog dialog = new ObjectSelectDialog();
            dialog.setTable(DatabaseTable.VENUE);
            dialog.setVisible(true);
            dialog.setAlwaysOnTop(true);
            dialog.setEditParent(this);
    }//GEN-LAST:event_btnSelectVenueMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
       int result = JOptionPane.showConfirmDialog(this, "Are you ready to save? Changes will immediately become live.", "Save Artist", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            if(parentEvent !=null)
            {
                if(childEvent.setName(txtName.getText()))
                {
                    if(childEvent.setDescription(txtDescription.getText()))
                    {
                        if(childEvent.setVenue(venue))
                        {
                            Date startDate = startModel.getDate();
                            Date endDate = endModel.getDate();
                            if(startDate.before(endDate))
                            {
                                if(childEvent.setStartDateTime(startDate))
                                {
                                    if(childEvent.setEndDateTime(endDate))
                                    {
                                        try {
                                            DesktopWrapper.getInstance().updateObject(childEvent, DatabaseTable.CHILD_EVENT);
                                            dispose();
                                            parent.displayText("Success! " + childEvent.getName() + " editted!");

                                        } catch (IOException ex) {
                                            System.out.println("Error writing object to the database. Please try again.");
                                        } finally {
                                            parent.refreshParentEventsList();
                                        }
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(this, "Invalid Start Date, please try again");
                                }
                            }else{
                                JOptionPane.showMessageDialog(this, "Start Date must be before the End Date");
                            }
                        
                        }else{
                            JOptionPane.showMessageDialog(this,"Invalid venue, please select a venue again");
                        }
                        
                    }else{
                      JOptionPane.showMessageDialog(this, "Invalid description. Must be between 10 & 100 characters long, "
                            + "and not contain blacklisted words");
                    }
                }else{
                      JOptionPane.showMessageDialog(this, "Invalid name. Must be between 2 & 30 characters, and not "
                        + "contain any blacklisted words.");
                }
                
                
            }else{
                JOptionPane.showMessageDialog(this, "Sorry, events parent hasn't been set."
                        + " Find your nearest developer!");
            }
            
            
            
            
            
            
            
            
        }
    }//GEN-LAST:event_btnSaveMouseClicked
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PnlEditChildEvent().setVisible(true);
            }
        });
    }

    public void addLineup(IArtist artist)
    {
       if(lineup.contains(artist))
        {
            JOptionPane.showMessageDialog(this, "Artist allready is in the lineup");
        }
       else{
        try {
            childEvent.newContract(artist);
            lineupListModel.addElement(artist.getName());
            lineup.add(artist);
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Unable to add to lineup");
        }
       }

    }
    
    public void addTicket(ITicket ticket)
    {
        if(tickets.contains(ticket))
        {
         JOptionPane.showMessageDialog(this, "Ticket allready exists");
        }else{
            try{
                ITicket newTicket;
                newTicket = (ITicket) DesktopWrapper.getInstance().createNewObject(ticket, DatabaseTable.TICKET);
                tickets.add(ticket);
                ticketsListModel.addElement(ticket.getType()+" - " + ticket.getRemaining() +"Remaining");
            }catch(IOException ex)
            {
              JOptionPane.showMessageDialog(this, "Unable to add to ticket");

            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel1;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSelectVenue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JLabel lblAddArtist;
    private javax.swing.JLabel lblAddImage2;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDescriptionRemaining;
    private javax.swing.JLabel lblDetailsTitle;
    private javax.swing.JLabel lblDetailsTitle1;
    private javax.swing.JLabel lblDetailsTitle2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblName4;
    private javax.swing.JLabel lblRemoveArtist;
    private javax.swing.JList<String> lstLineup;
    private javax.swing.JList<String> lstTickets;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JSpinner spnEndTime;
    private javax.swing.JSpinner spnStartTime;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtParentName;
    private javax.swing.JTextField txtVenue;
    // End of variables declaration//GEN-END:variables

 

    private void populateLineup() {
          lineupListModel.clear();
        try {
             DesktopWrapper.getInstance().getParentEvents();
             lineup = childEvent.getArtistList();
            for (IArtist iArtist : lineup) {
                lineupListModel.addElement(iArtist.getName());
            }
        } catch (IOException ex) {
            System.out.println("No Parent Events Found");
        }
    }

    public void setVenue(IVenue venue) {
        if(venue!=null)
        {
            this.venue = venue; 
            txtVenue.setText(venue.getName());
        }else
        {
            throw new NullPointerException();
        }
    }

    private void populateTickets() {
        ticketsListModel.clear();
        try{
            tickets = childEvent.getTickets();
            for (ITicket ticket : tickets) {
                ticketsListModel.addElement(ticket.getType()+" - " + ticket.getRemaining() +"Remaining");
            }
        
        }catch(IOException ex)
        {
            System.out.println("No Parent Events Found");

        }
            
    }
}
    
    
