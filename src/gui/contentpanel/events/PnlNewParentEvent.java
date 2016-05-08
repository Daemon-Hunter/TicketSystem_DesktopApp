/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contentpanel.events;

import utilities.ImageAssist;
import database.DatabaseTable;
import events.IParentEvent;
import events.ParentEvent;
import events.SocialMedia;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import wrappers.DesktopWrapper;

/**
 *
 * @author 10512691
 */
public class PnlNewParentEvent extends javax.swing.JFrame {

    private PnlEvents parent;
    private final int descLength = 500;
    List<BufferedImage> images;

    /**
     * Creates new form PnlEditArtist
     */
    public PnlNewParentEvent() {
        images = new ArrayList<>();
        initComponents();
        initHelpDialog();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        initPanel();
    }

    public void setParent(PnlEvents parent) {
        this.parent = parent;
    }

    private void initHelpDialog() {
        helpImage.setToolTipText("Add or remove an image. A default image is given if none specified.");
        lblAddImage.setToolTipText("add");
        helpName.setToolTipText("Enter the Event name.");
        helpDescription.setToolTipText("Maximum 500 character description.");
        helpLinks.setToolTipText("Enter official social media links. Must start with 'https://'.");
    }

    private void initPanel() {

        lblDescriptionRemaining.setText(" 500 characters remaining");
        txtFacebook.setText("https://");
        txtTwitter.setText("https://");
        txtInstagram.setText("https://");
        txtSoundcloud.setText("https://");
        txtSpotify.setText("https://");
        txtWebsite.setText("https://");

        try {
            images = ImageAssist.createDefaults();
            lblImage.setIcon(new ImageIcon(images.get(1)));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "There was a problem setting a default image,"
                    + " please try again.");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
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
        pnlImage = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        txtFacebook = new javax.swing.JTextField();
        txtTwitter = new javax.swing.JTextField();
        txtInstagram = new javax.swing.JTextField();
        txtSoundcloud = new javax.swing.JTextField();
        txtSpotify = new javax.swing.JTextField();
        txtWebsite = new javax.swing.JTextField();
        lblName1 = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        lblName3 = new javax.swing.JLabel();
        lblName4 = new javax.swing.JLabel();
        lblName5 = new javax.swing.JLabel();
        lblName6 = new javax.swing.JLabel();
        lblDetailsTitle = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblAddImage = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        helpName = new javax.swing.JLabel();
        helpDescription = new javax.swing.JLabel();
        helpImage = new javax.swing.JLabel();
        helpLinks = new javax.swing.JLabel();

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

        javax.swing.GroupLayout pnlImageLayout = new javax.swing.GroupLayout(pnlImage);
        pnlImage.setLayout(pnlImageLayout);
        pnlImageLayout.setHorizontalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlImageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlImageLayout.setVerticalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImageLayout.createSequentialGroup()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtFacebook.setBackground(new java.awt.Color(51, 51, 51));
        txtFacebook.setForeground(new java.awt.Color(250, 250, 250));
        txtFacebook.setMaximumSize(new java.awt.Dimension(14, 28));

        txtTwitter.setBackground(new java.awt.Color(51, 51, 51));
        txtTwitter.setForeground(new java.awt.Color(250, 250, 250));
        txtTwitter.setMaximumSize(new java.awt.Dimension(14, 28));

        txtInstagram.setBackground(new java.awt.Color(51, 51, 51));
        txtInstagram.setForeground(new java.awt.Color(250, 250, 250));
        txtInstagram.setMaximumSize(new java.awt.Dimension(14, 28));

        txtSoundcloud.setBackground(new java.awt.Color(51, 51, 51));
        txtSoundcloud.setForeground(new java.awt.Color(250, 250, 250));
        txtSoundcloud.setMaximumSize(new java.awt.Dimension(14, 28));

        txtSpotify.setBackground(new java.awt.Color(51, 51, 51));
        txtSpotify.setForeground(new java.awt.Color(250, 250, 250));
        txtSpotify.setMaximumSize(new java.awt.Dimension(14, 28));

        txtWebsite.setBackground(new java.awt.Color(51, 51, 51));
        txtWebsite.setForeground(new java.awt.Color(250, 250, 250));
        txtWebsite.setMaximumSize(new java.awt.Dimension(14, 28));

        lblName1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblName1.setForeground(new java.awt.Color(255, 255, 255));
        lblName1.setText("Facebook:");

        lblName2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblName2.setForeground(new java.awt.Color(255, 255, 255));
        lblName2.setText("Twitter:");

        lblName3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblName3.setForeground(new java.awt.Color(255, 255, 255));
        lblName3.setText("Instagram:");

        lblName4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblName4.setForeground(new java.awt.Color(255, 255, 255));
        lblName4.setText("Soundcloud:");

        lblName5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblName5.setForeground(new java.awt.Color(255, 255, 255));
        lblName5.setText("Spotify:");

        lblName6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblName6.setForeground(new java.awt.Color(255, 255, 255));
        lblName6.setText("Website:");

        lblDetailsTitle.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblDetailsTitle.setForeground(new java.awt.Color(250, 250, 250));
        lblDetailsTitle.setText("Parent Event Details");

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSave.setText("Add");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblAddImage.setForeground(new java.awt.Color(251, 251, 251));
        lblAddImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/addIcon.png"))); // NOI18N
        lblAddImage.setText(" Add Image");
        lblAddImage.setToolTipText("");
        lblAddImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddImageMouseClicked(evt);
            }
        });

        helpName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/helpIconNew.png"))); // NOI18N

        helpDescription.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/helpIconNew.png"))); // NOI18N

        helpImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/helpIconNew.png"))); // NOI18N

        helpLinks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/helpIconNew.png"))); // NOI18N

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(lblDescription)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(helpName))
                                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(helpDescription))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(lblName)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDescriptionRemaining)
                        .addGap(91, 91, 91))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(lblDetailsTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                                        .addComponent(lblName5)
                                        .addGap(46, 46, 46))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                                        .addComponent(lblName6)
                                        .addGap(40, 40, 40))
                                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblName4)
                                            .addComponent(lblName3)
                                            .addComponent(lblName2)
                                            .addComponent(lblName1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFacebook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(txtTwitter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSoundcloud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtInstagram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSpotify, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtWebsite, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(helpLinks))
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(pnlImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddImage, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(91, 91, 91)
                                .addComponent(helpImage))))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(helpImage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnlImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(lblAddImage)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(helpLinks)
                            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblName1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTwitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoundcloud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSpotify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName6))
                        .addGap(41, 41, 41))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(lblDetailsTitle)
                                .addGap(21, 21, 21)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(helpName)
                                    .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblName)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescription)
                                    .addComponent(helpDescription)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDescriptionRemaining))
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)))
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnSave))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        int dialog = JOptionPane.showConfirmDialog(this, "Are you sure you want to cancel?", "Confirm", JOptionPane.OK_CANCEL_OPTION);
        if (dialog == JOptionPane.OK_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtDescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyTyped
        // Allow user to type if the description length is < 500
        if (descLength - txtDescription.getText().length() >= 0) {
            lblDescriptionRemaining.setText((descLength - txtDescription.getText().length()) + " characters remaining");
        } else {
            // else remove any additional characters
            txtDescription.setText(txtDescription.getText().substring(0, txtDescription.getText().length() - 1));
        }
    }//GEN-LAST:event_txtDescriptionKeyTyped

    private void lblAddImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddImageMouseClicked
        // Create filter so only image files are shown in dialog
        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter(
                "Image files", ImageIO.getReaderFileSuffixes());

        final JFileChooser fc = new JFileChooser();
        fc.setFileFilter(imgFilter);

        int returnedValue = fc.showOpenDialog(this);

        if (returnedValue == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();

            try {
                // Read the selected image, and create 5 scaled images from this.
                BufferedImage img = ImageIO.read(file);
                images = ImageAssist.duplicate(img);
                lblImage.setIcon(new ImageIcon(images.get(1)));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "There was a problem reading the file you selected,"
                        + " please try again.");
            }
        }
    }//GEN-LAST:event_lblAddImageMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Are you ready to add this parent Event? Changes will immediately become live.", "Add Event", JOptionPane.OK_CANCEL_OPTION);

        String name = txtName.getText();
        String desc = txtDescription.getText();
        
        String facebook   = null;
        String twitter    = null;
        String instagram  = null;
        String soundcloud = null;
        String spotify    = null;
        String website    = null;

        if (!txtFacebook.getText().equals("https://"))
            facebook = txtFacebook.getText();

        if (!txtTwitter.getText().equals("https://"))
            twitter = txtTwitter.getText();

        if (!txtInstagram.getText().equals("https://"))
            instagram = txtInstagram.getText();

        if (!txtSoundcloud.getText().equals("https://"))
            soundcloud = txtSoundcloud.getText();

        if (!txtSpotify.getText().equals("https://"))
            spotify = txtSpotify.getText();

        if (!txtWebsite.getText().equals("https://"))
            website = txtWebsite.getText();

        // social.setImages(images);

        try 
        {
            SocialMedia social = new SocialMedia(images, facebook, twitter, instagram, soundcloud, website, spotify);
            DesktopWrapper.getInstance().createNewObject(social, DatabaseTable.SOCIAL_MEDIA);

            try 
            {
                IParentEvent event = new ParentEvent(social.getSocialId(), name, desc);
                event.setSocialMedia(social);
                DesktopWrapper.getInstance().createNewObject(event, DatabaseTable.PARENT_EVENT);
                dispose();
                parent.displayText("Succss! " + event.getName() + " added!");
                parent.refreshParentEventsList();
            } 

            catch (IOException ex) {
                System.out.println("Error writing object to the database. Please try again.");
            }
            catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }

        catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error writing object to the database. Please try again.");
        } 
        catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PnlNewParentEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel helpDescription;
    private javax.swing.JLabel helpImage;
    private javax.swing.JLabel helpLinks;
    private javax.swing.JLabel helpName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddImage;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDescriptionRemaining;
    private javax.swing.JLabel lblDetailsTitle;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblName4;
    private javax.swing.JLabel lblName5;
    private javax.swing.JLabel lblName6;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlImage;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtFacebook;
    private javax.swing.JTextField txtInstagram;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSoundcloud;
    private javax.swing.JTextField txtSpotify;
    private javax.swing.JTextField txtTwitter;
    private javax.swing.JTextField txtWebsite;
    // End of variables declaration//GEN-END:variables

}
