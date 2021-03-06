/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contentpanel;

import bookings.IBooking;
import classes.CustomListBox;
import classes.SwingInterop;
import events.IChildEvent;
import gui.MainJFrame;
import gui.contentpanel.admins.AdminTableModel;
import gui.contentpanel.admins.PnlEditAdmin;
import gui.contentpanel.admins.PnlNewAdmin;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import javax.swing.SwingWorker;
import javax.swing.Timer;
import people.IAdmin;
import wrappers.DesktopWrapper;

/**
 *
 * @author 10512691
 */
public class PnlHome extends javax.swing.JPanel {

    private final MainJFrame parent;
    private List<IAdmin> allAdmins;
    private IAdmin currAdmin;
    /**
     * Creates new form PnlHome
     * @param parent
     */
    public PnlHome(MainJFrame parent) {
        initComponents();
        this.parent = parent;
        initPanel();
    }
    
    private void initPanel() {
        lblWelcome.setText("Welcome " + DesktopWrapper.getInstance().getCurrentAdmin().getEmail() + ",");
        lblLoadingIcon.setVisible(false);
        populateAdminTable();
        
        try {
            // Populate Monthly sales label.
            List<IBooking> monthlyBookings = DesktopWrapper.getInstance().getThisMonthsSales();
            lblSales.setText(Integer.toString(monthlyBookings.size()));
            
            // Set a date reference.
            Calendar yesterday = Calendar.getInstance();
            yesterday.add(Calendar.DATE, -1);
            
            // Total the number of sales made today.
            int noSales = 0;
            for (IBooking booking : monthlyBookings) {
                if (booking.getBookingTime().after(yesterday.getTime())) {
                    noSales += booking.getQuantity();
                }
            }
            lblDailySales.setText(Integer.toString(noSales));
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error getting this months bookings from the database.");
            lblSales.setText("0");
        }
        
        try {
            // Populate 'Sold Out Events' name & venue tables with data.
            List<IChildEvent> events = DesktopWrapper.getInstance().getSoldOutEvents();
            DefaultListModel eventModel = new DefaultListModel();
            DefaultListModel venueModel = new DefaultListModel();
            for (IChildEvent e : events) {
                eventModel.addElement(e.getName());
                venueModel.addElement(e.getVenue().getName());
            }
            
            listSoldOutEvent.setCellRenderer(new CustomListBox());
            listSoldOutVenue.setCellRenderer(new CustomListBox());
            
            listSoldOutEvent.setModel(eventModel);
            listSoldOutVenue.setModel(venueModel);
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error getting this months bookings from the database.");
        }
    }
    
    public final void populateAdminTable() {
  
        try {
            allAdmins = DesktopWrapper.getInstance().getAdmins();

            
            if(allAdmins.size() > 0) {
                AdminTableModel adminData = new AdminTableModel(allAdmins, allAdmins.size());
                tableAdmins.setModel(adminData);
            }
        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error connecting to the database. Please try again.");
        }
        catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
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
        t.setInitialDelay(3000);
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

        pnlBackground = new javax.swing.JPanel();
        pnlDailySalesBackground = new javax.swing.JPanel();
        pnlDailySalesTitle = new javax.swing.JPanel();
        lblDailySalesTitle = new javax.swing.JLabel();
        lblDailySales = new javax.swing.JLabel();
        pnlSalesBackground2 = new javax.swing.JPanel();
        pnlSalesTitle2 = new javax.swing.JPanel();
        lblSalesTitle1 = new javax.swing.JLabel();
        lblSales = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        iconAdminSettings = new javax.swing.JLabel();
        lblAdminSettings = new javax.swing.JLabel();
        tableScrollPane = new javax.swing.JScrollPane();
        tableAdmins = new javax.swing.JTable();
        btnNewAdmin = new javax.swing.JButton();
        btnEditAdmin = new javax.swing.JButton();
        bntLoadMore = new javax.swing.JButton();
        lblLoadingIcon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTextBox = new javax.swing.JTextArea();
        lblWelcome = new javax.swing.JLabel();
        lblWhatsBeenOn = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listSoldOutEvent = new javax.swing.JList<>();
        pnlActiveTitle2 = new javax.swing.JPanel();
        lblSoldOutEvents = new javax.swing.JLabel();
        lblSoldOutEventName = new javax.swing.JLabel();
        lblSoldOutEventsVenue = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listSoldOutVenue = new javax.swing.JList<>();

        setMaximumSize(new java.awt.Dimension(873, 32767));
        setMinimumSize(new java.awt.Dimension(873, 0));
        setPreferredSize(new java.awt.Dimension(873, 1043));

        pnlBackground.setBackground(new java.awt.Color(51, 51, 51));

        pnlDailySalesBackground.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 28, 53), 1, true));

        pnlDailySalesTitle.setBackground(new java.awt.Color(170, 170, 170));

        lblDailySalesTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblDailySalesTitle.setText("Daily Sales");

        javax.swing.GroupLayout pnlDailySalesTitleLayout = new javax.swing.GroupLayout(pnlDailySalesTitle);
        pnlDailySalesTitle.setLayout(pnlDailySalesTitleLayout);
        pnlDailySalesTitleLayout.setHorizontalGroup(
            pnlDailySalesTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDailySalesTitleLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(lblDailySalesTitle)
                .addGap(35, 35, 35))
        );
        pnlDailySalesTitleLayout.setVerticalGroup(
            pnlDailySalesTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDailySalesTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDailySalesTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblDailySales.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblDailySales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDailySales.setText("14");
        lblDailySales.setToolTipText("");

        javax.swing.GroupLayout pnlDailySalesBackgroundLayout = new javax.swing.GroupLayout(pnlDailySalesBackground);
        pnlDailySalesBackground.setLayout(pnlDailySalesBackgroundLayout);
        pnlDailySalesBackgroundLayout.setHorizontalGroup(
            pnlDailySalesBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDailySalesTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDailySalesBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDailySales)
                .addGap(55, 55, 55))
        );
        pnlDailySalesBackgroundLayout.setVerticalGroup(
            pnlDailySalesBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDailySalesBackgroundLayout.createSequentialGroup()
                .addComponent(pnlDailySalesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDailySales)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnlSalesBackground2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 28, 53), 1, true));

        pnlSalesTitle2.setBackground(new java.awt.Color(170, 170, 170));

        lblSalesTitle1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblSalesTitle1.setText("Monthly Sales");

        javax.swing.GroupLayout pnlSalesTitle2Layout = new javax.swing.GroupLayout(pnlSalesTitle2);
        pnlSalesTitle2.setLayout(pnlSalesTitle2Layout);
        pnlSalesTitle2Layout.setHorizontalGroup(
            pnlSalesTitle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalesTitle2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblSalesTitle1)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pnlSalesTitle2Layout.setVerticalGroup(
            pnlSalesTitle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalesTitle2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSalesTitle1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblSales.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblSales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSales.setText("0");
        lblSales.setToolTipText("");

        javax.swing.GroupLayout pnlSalesBackground2Layout = new javax.swing.GroupLayout(pnlSalesBackground2);
        pnlSalesBackground2.setLayout(pnlSalesBackground2Layout);
        pnlSalesBackground2Layout.setHorizontalGroup(
            pnlSalesBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSalesTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlSalesBackground2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblSales)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSalesBackground2Layout.setVerticalGroup(
            pnlSalesBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalesBackground2Layout.createSequentialGroup()
                .addComponent(pnlSalesTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSales)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        iconAdminSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings_icon.png"))); // NOI18N

        lblAdminSettings.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblAdminSettings.setForeground(new java.awt.Color(251, 251, 251));
        lblAdminSettings.setText("Admin Accounts");

        tableAdmins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableAdmins.setRowHeight(24);
        tableAdmins.getTableHeader().setReorderingAllowed(false);
        tableAdmins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAdminsMouseClicked(evt);
            }
        });
        tableScrollPane.setViewportView(tableAdmins);

        btnNewAdmin.setText("New");
        btnNewAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAdminActionPerformed(evt);
            }
        });

        btnEditAdmin.setText("Edit Password");
        btnEditAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAdminActionPerformed(evt);
            }
        });

        bntLoadMore.setText("Load More");
        bntLoadMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLoadMoreActionPerformed(evt);
            }
        });

        lblLoadingIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loading_icon.gif"))); // NOI18N

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

        lblWelcome.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(251, 251, 251));
        lblWelcome.setText("Welcome,");

        lblWhatsBeenOn.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblWhatsBeenOn.setForeground(new java.awt.Color(251, 251, 251));
        lblWhatsBeenOn.setText("This is what's been going on since you left...");

        listSoldOutEvent.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listSoldOutEvent);

        pnlActiveTitle2.setBackground(new java.awt.Color(170, 170, 170));

        lblSoldOutEvents.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblSoldOutEvents.setText("Sold Out Events");

        lblSoldOutEventName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblSoldOutEventName.setText("Event Name");

        lblSoldOutEventsVenue.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblSoldOutEventsVenue.setText("Venue");

        javax.swing.GroupLayout pnlActiveTitle2Layout = new javax.swing.GroupLayout(pnlActiveTitle2);
        pnlActiveTitle2.setLayout(pnlActiveTitle2Layout);
        pnlActiveTitle2Layout.setHorizontalGroup(
            pnlActiveTitle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlActiveTitle2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSoldOutEvents)
                .addGap(92, 92, 92))
            .addGroup(pnlActiveTitle2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblSoldOutEventName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSoldOutEventsVenue)
                .addGap(54, 54, 54))
        );
        pnlActiveTitle2Layout.setVerticalGroup(
            pnlActiveTitle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActiveTitle2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSoldOutEvents)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(pnlActiveTitle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoldOutEventName)
                    .addComponent(lblSoldOutEventsVenue)))
        );

        listSoldOutVenue.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listSoldOutVenue);

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWelcome)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(pnlSalesBackground2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(pnlDailySalesBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lblWhatsBeenOn))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlActiveTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnNewAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bntLoadMore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEditAdmin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(lblLoadingIcon))))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(lblAdminSettings)
                        .addGap(18, 18, 18)
                        .addComponent(iconAdminSettings)))
                .addGap(36, 36, 36))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWhatsBeenOn)
                .addGap(35, 35, 35)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDailySalesBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSalesBackground2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addComponent(pnlActiveTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconAdminSettings)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblAdminSettings)))
                .addGap(18, 18, 18)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(btnNewAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntLoadMore)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblLoadingIcon)
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pnlAdminSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAdminSettingsMouseClicked
        
    }//GEN-LAST:event_pnlAdminSettingsMouseClicked

    private void tableAdminsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAdminsMouseClicked
        // User can double click to open 'Edit' dialog.
        // Clicking once sets the current artist
        if (currAdmin == null) {
            if (allAdmins != null) {
                currAdmin = allAdmins.get(tableAdmins.getSelectedRow());
            }
        }
        // Clicking the same artist twice opens the dialog.
        else if (currAdmin.equals(allAdmins.get(tableAdmins.getSelectedRow()))) {
            PnlEditAdmin editPnl = new PnlEditAdmin(this, currAdmin);
            editPnl.setVisible(true);
            editPnl.setAlwaysOnTop(true);
            currAdmin = null;
        } else {
            // Clicking a different artist sets the current artist.
            if (allAdmins != null) {
                currAdmin = allAdmins.get(tableAdmins.getSelectedRow());
            } else {
                currAdmin = null;
            }
        }
    }//GEN-LAST:event_tableAdminsMouseClicked

    private void btnNewAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAdminActionPerformed
        PnlNewAdmin newPnl = new PnlNewAdmin(this);
        newPnl.setVisible(true);
        newPnl.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnNewAdminActionPerformed

    private void btnEditAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAdminActionPerformed
        if (currAdmin == null)
        JOptionPane.showMessageDialog(this, "No admin selected!");
        else {
            PnlEditAdmin editPnl = new PnlEditAdmin(this, currAdmin);
            editPnl.setVisible(true);
            editPnl.setAlwaysOnTop(true);
        }
    }//GEN-LAST:event_btnEditAdminActionPerformed

    private void bntLoadMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLoadMoreActionPerformed
        lblLoadingIcon.setVisible(true);
        
        SwingWorker worker = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                try {
                    DesktopWrapper.getInstance().loadMoreAdmins();
                    allAdmins = DesktopWrapper.getInstance().getAdmins();
                    AdminTableModel adminData = new AdminTableModel(allAdmins, allAdmins.size());
                    tableAdmins.setModel(adminData);
                    lblLoadingIcon.setVisible(false);

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(PnlHome.this, "Unable To Load More Admins");
                    lblLoadingIcon.setVisible(false);
                }
                return "";
            }
        };
        
        worker.execute();
    }//GEN-LAST:event_bntLoadMoreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntLoadMore;
    private javax.swing.JButton btnEditAdmin;
    private javax.swing.JButton btnNewAdmin;
    private javax.swing.JLabel iconAdminSettings;
    private javax.swing.JTextArea infoTextBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAdminSettings;
    private javax.swing.JLabel lblDailySales;
    private javax.swing.JLabel lblDailySalesTitle;
    private javax.swing.JLabel lblLoadingIcon;
    private javax.swing.JLabel lblSales;
    private javax.swing.JLabel lblSalesTitle1;
    private javax.swing.JLabel lblSoldOutEventName;
    private javax.swing.JLabel lblSoldOutEvents;
    private javax.swing.JLabel lblSoldOutEventsVenue;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblWhatsBeenOn;
    private javax.swing.JList<String> listSoldOutEvent;
    private javax.swing.JList<String> listSoldOutVenue;
    private javax.swing.JPanel pnlActiveTitle2;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlDailySalesBackground;
    private javax.swing.JPanel pnlDailySalesTitle;
    private javax.swing.JPanel pnlSalesBackground2;
    private javax.swing.JPanel pnlSalesTitle2;
    private javax.swing.JTable tableAdmins;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables
}
