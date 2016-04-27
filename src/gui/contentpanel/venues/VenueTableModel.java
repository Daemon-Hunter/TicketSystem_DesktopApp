/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contentpanel.venues;

import events.IVenue;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import people.IUser;

/**
 *
 * @author Dominic
 */
public class VenueTableModel extends DefaultTableModel {

    List<IVenue> allVenues;
       private final String[] headers = { "Name", "Email", "Address", "Postcode","Phone No.","Total Capacity", "More"};

    VenueTableModel(List<IVenue> allVenues, int size) {
        super(size,7);
        this.allVenues = allVenues;
        
           for (int i = 0; i < 20 && i < allVenues.size(); i++) {
              Integer totalCapacity;
              IVenue currVenue = allVenues.get(i);

              totalCapacity = currVenue.getStandingCapacity()  + currVenue.getSeatingCapacity();

              this.setValueAt(currVenue.getName(), i, 0);
              this.setValueAt(currVenue.getEmail(),i,1);
              this.setValueAt(currVenue.getAddress(),i,2);
              this.setValueAt(currVenue.getPostcode(), i, 3);
              this.setValueAt(currVenue.getPhoneNumber(), i, 4);
              this.setValueAt(totalCapacity, i, 5);
              this.setValueAt("...",i,6);

       }

       
   }
    
        @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    
    @Override
    public String getColumnName(int columnIndex) {
        return headers[columnIndex];
    }

    
}
