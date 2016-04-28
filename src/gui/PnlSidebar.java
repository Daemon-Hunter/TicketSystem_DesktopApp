/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.contentpanel.Pages;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author 10512691
 */
public class PnlSidebar extends javax.swing.JPanel {

    private Home parent = null;
    /**
     * Creates new form PnlSidebar
     */
    public PnlSidebar() {
        initComponents();
        
        lblHome.setForeground(Color.WHITE);
        Icon icon = new ImageIcon(getClass().getResource("/images/icons/homeIconRollover.png"));
        lblHome.setIcon(icon);
    }
    
    public void setParent(Home parent) {
        this.parent = parent;
    }
    
    private void deselectPage(Pages page) {
        switch (page) {
            case HOME:
                lblHome.setForeground(Color.LIGHT_GRAY);
                Icon icon = new ImageIcon(getClass().getResource("/images/icons/homeIcon.png"));
                lblHome.setIcon(icon);
                break;
                
            case USERS:
                lblUsers.setForeground(Color.LIGHT_GRAY);
                icon = new ImageIcon(getClass().getResource("/images/icons/userIcon.png"));
                lblUsers.setIcon(icon);
                break;
                
            case VENUES: 
                lblVenues.setForeground(Color.LIGHT_GRAY);
                icon = new ImageIcon(getClass().getResource("/images/icons/venueIcon.png"));
                lblVenues.setIcon(icon);
                break;
                
            case ARTISTS:
                lblArtists.setForeground(Color.LIGHT_GRAY);
                icon = new ImageIcon(getClass().getResource("/images/icons/artistIcon.png"));
                lblArtists.setIcon(icon);
                break;
                
            case EVENTS:
                lblEvents.setForeground(Color.LIGHT_GRAY);
                icon = new ImageIcon(getClass().getResource("/images/icons/eventIcon.png"));
                lblEvents.setIcon(icon);
                break;
                
            case BOOKINGS:
                lblBookings.setForeground(Color.LIGHT_GRAY);
                icon = new ImageIcon(getClass().getResource("/images/icons/helpIcon.png"));
                lblBookings.setIcon(icon);
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHome = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        pnlUsers = new javax.swing.JPanel();
        lblUsers = new javax.swing.JLabel();
        pnlVenues = new javax.swing.JPanel();
        lblVenues = new javax.swing.JLabel();
        pnlArtists = new javax.swing.JPanel();
        lblArtists = new javax.swing.JLabel();
        pnlEvents = new javax.swing.JPanel();
        lblEvents = new javax.swing.JLabel();
        pnlHelp = new javax.swing.JPanel();
        lblBookings = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        pnlHome.setBackground(new java.awt.Color(51, 51, 51));

        lblHome.setForeground(new java.awt.Color(204, 204, 204));
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/homeIcon.png"))); // NOI18N
        lblHome.setText("     HOME");
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHomeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHomeMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnlUsers.setBackground(new java.awt.Color(51, 51, 51));

        lblUsers.setForeground(new java.awt.Color(204, 204, 204));
        lblUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/userIcon.png"))); // NOI18N
        lblUsers.setText("     USERS");
        lblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsersMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUsersMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUsersMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlUsersLayout = new javax.swing.GroupLayout(pnlUsers);
        pnlUsers.setLayout(pnlUsersLayout);
        pnlUsersLayout.setHorizontalGroup(
            pnlUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUsersLayout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addComponent(lblUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlUsersLayout.setVerticalGroup(
            pnlUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnlVenues.setBackground(new java.awt.Color(51, 51, 51));

        lblVenues.setForeground(new java.awt.Color(204, 204, 204));
        lblVenues.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/venueIcon.png"))); // NOI18N
        lblVenues.setText("     VENUES");
        lblVenues.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVenuesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVenuesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVenuesMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlVenuesLayout = new javax.swing.GroupLayout(pnlVenues);
        pnlVenues.setLayout(pnlVenuesLayout);
        pnlVenuesLayout.setHorizontalGroup(
            pnlVenuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVenuesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblVenues, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlVenuesLayout.setVerticalGroup(
            pnlVenuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVenues, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnlArtists.setBackground(new java.awt.Color(51, 51, 51));

        lblArtists.setForeground(new java.awt.Color(204, 204, 204));
        lblArtists.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/artistIcon.png"))); // NOI18N
        lblArtists.setText("     ARTISTS");
        lblArtists.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblArtistsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblArtistsMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblArtistsMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlArtistsLayout = new javax.swing.GroupLayout(pnlArtists);
        pnlArtists.setLayout(pnlArtistsLayout);
        pnlArtistsLayout.setHorizontalGroup(
            pnlArtistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlArtistsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblArtists, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlArtistsLayout.setVerticalGroup(
            pnlArtistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblArtists, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnlEvents.setBackground(new java.awt.Color(51, 51, 51));

        lblEvents.setForeground(new java.awt.Color(204, 204, 204));
        lblEvents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/eventIcon.png"))); // NOI18N
        lblEvents.setText("     EVENTS");
        lblEvents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEventsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEventsMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEventsMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlEventsLayout = new javax.swing.GroupLayout(pnlEvents);
        pnlEvents.setLayout(pnlEventsLayout);
        pnlEventsLayout.setHorizontalGroup(
            pnlEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEventsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlEventsLayout.setVerticalGroup(
            pnlEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEvents, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnlHelp.setBackground(new java.awt.Color(51, 51, 51));

        lblBookings.setForeground(new java.awt.Color(204, 204, 204));
        lblBookings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/helpIcon.png"))); // NOI18N
        lblBookings.setText("    BOOKINGS");
        lblBookings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBookingsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBookingsMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBookingsMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlHelpLayout = new javax.swing.GroupLayout(pnlHelp);
        pnlHelp.setLayout(pnlHelpLayout);
        pnlHelpLayout.setHorizontalGroup(
            pnlHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHelpLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlHelpLayout.setVerticalGroup(
            pnlHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBookings, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlVenues, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlArtists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlEvents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlVenues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlArtists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseEntered
        // Set the font and image white
        lblHome.setForeground(Color.WHITE);
        Icon icon = new ImageIcon(getClass().getResource("/images/icons/homeIconRollover.png"));
        lblHome.setIcon(icon);
    }//GEN-LAST:event_lblHomeMouseEntered

    private void lblUsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsersMouseEntered
        // Set the font and image white
        lblUsers.setForeground(Color.WHITE);
        Icon icon = new ImageIcon(getClass().getResource("/images/icons/userIconRollover.png"));
        lblUsers.setIcon(icon);
    }//GEN-LAST:event_lblUsersMouseEntered

    private void lblVenuesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVenuesMouseEntered
        // Set the font and image white
        lblVenues.setForeground(Color.WHITE);
        Icon icon = new ImageIcon(getClass().getResource("/images/icons/venueIconRollover.png"));
        lblVenues.setIcon(icon);
    }//GEN-LAST:event_lblVenuesMouseEntered

    private void lblArtistsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArtistsMouseEntered
        // Set the font and image white
        lblArtists.setForeground(Color.WHITE);
        Icon icon = new ImageIcon(getClass().getResource("/images/icons/artistIconRollover.png"));
        lblArtists.setIcon(icon);
    }//GEN-LAST:event_lblArtistsMouseEntered

    private void lblEventsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEventsMouseEntered
        // Set the font and image white
        lblEvents.setForeground(Color.WHITE);
        Icon icon = new ImageIcon(getClass().getResource("/images/icons/eventIconRollover.png"));
        lblEvents.setIcon(icon);
    }//GEN-LAST:event_lblEventsMouseEntered

    private void lblBookingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookingsMouseExited
        if (parent.getPage() != Pages.BOOKINGS) {
            // Set the font and image light grey
            lblBookings.setForeground(Color.LIGHT_GRAY);
            Icon icon = new ImageIcon(getClass().getResource("/images/icons/helpIcon.png"));
            lblBookings.setIcon(icon);
        }
    }//GEN-LAST:event_lblBookingsMouseExited

    private void lblBookingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookingsMouseEntered
        // Set the font and image white
        lblBookings.setForeground(Color.WHITE);
        System.out.println("CHANGE");
        Icon icon = new ImageIcon(getClass().getResource("/images/icons/helpIconRollover.png"));
        lblBookings.setIcon(icon);
    }//GEN-LAST:event_lblBookingsMouseEntered

    private void lblEventsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEventsMouseExited
        if (parent.getPage() != Pages.EVENTS) {
            // Set the font and image light grey
            lblEvents.setForeground(Color.LIGHT_GRAY);
            Icon icon = new ImageIcon(getClass().getResource("/images/icons/eventIcon.png"));
            lblEvents.setIcon(icon);
        }
    }//GEN-LAST:event_lblEventsMouseExited

    private void lblArtistsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArtistsMouseExited
        if (parent.getPage() != Pages.ARTISTS) {
            // Set the font and image light grey
            lblArtists.setForeground(Color.LIGHT_GRAY);
            Icon icon = new ImageIcon(getClass().getResource("/images/icons/artistIcon.png"));
            lblArtists.setIcon(icon);
        }
    }//GEN-LAST:event_lblArtistsMouseExited

    private void lblVenuesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVenuesMouseExited
        if (parent.getPage() != Pages.VENUES) {
            // Set the font and image light grey
            lblVenues.setForeground(Color.LIGHT_GRAY);
            Icon icon = new ImageIcon(getClass().getResource("/images/icons/venueIcon.png"));
            lblVenues.setIcon(icon);
        }
    }//GEN-LAST:event_lblVenuesMouseExited

    private void lblUsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsersMouseExited
        if (parent.getPage() != Pages.USERS) {
            // Set the font and image light grey
            lblUsers.setForeground(Color.LIGHT_GRAY);
            Icon icon = new ImageIcon(getClass().getResource("/images/icons/userIcon.png"));
            lblUsers.setIcon(icon);
        }
    }//GEN-LAST:event_lblUsersMouseExited

    private void lblHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseExited
        if (parent.getPage() != Pages.HOME) {
            // Set the font and image light grey
            lblHome.setForeground(Color.LIGHT_GRAY);
            Icon icon = new ImageIcon(getClass().getResource("/images/icons/homeIcon.png"));
            lblHome.setIcon(icon);
        }
    }//GEN-LAST:event_lblHomeMouseExited

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        if (parent.getPage() != Pages.HOME) {
            deselectPage(parent.getPage());
            parent.setPage(Pages.HOME);
        }
    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsersMouseClicked
        if (parent.getPage() != Pages.USERS) {
            deselectPage(parent.getPage());
            parent.setPage(Pages.USERS);
        }
    }//GEN-LAST:event_lblUsersMouseClicked

    private void lblArtistsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArtistsMouseClicked
        if (parent.getPage() != Pages.ARTISTS) {
            deselectPage(parent.getPage());
            parent.setPage(Pages.ARTISTS);
        }
    }//GEN-LAST:event_lblArtistsMouseClicked

    private void lblBookingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookingsMouseClicked
        if(parent.getPage() != Pages.BOOKINGS){
            deselectPage(parent.getPage());
            parent.setPage(Pages.BOOKINGS);
        }
    }//GEN-LAST:event_lblBookingsMouseClicked

    private void lblEventsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEventsMouseClicked
       if(parent.getPage() != Pages.EVENTS){
            deselectPage(parent.getPage());
            parent.setPage(Pages.EVENTS);
       }
    }//GEN-LAST:event_lblEventsMouseClicked

    private void lblVenuesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVenuesMouseClicked
       if(parent.getPage() != Pages.VENUES){
            deselectPage(parent.getPage());
            parent.setPage(Pages.VENUES);
       }
    }//GEN-LAST:event_lblVenuesMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblArtists;
    private javax.swing.JLabel lblBookings;
    private javax.swing.JLabel lblEvents;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblUsers;
    private javax.swing.JLabel lblVenues;
    private javax.swing.JPanel pnlArtists;
    private javax.swing.JPanel pnlEvents;
    private javax.swing.JPanel pnlHelp;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlUsers;
    private javax.swing.JPanel pnlVenues;
    // End of variables declaration//GEN-END:variables
}
