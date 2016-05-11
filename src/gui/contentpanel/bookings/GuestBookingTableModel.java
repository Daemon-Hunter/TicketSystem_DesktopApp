/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contentpanel.bookings;

import bookings.GuestBooking;
import bookings.IBooking;
import java.util.LinkedList;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import wrappers.DesktopWrapper;

/**
 *
 * @author 10512691
 */
class GuestBookingTableModel extends DefaultTableModel {
    
    // Should include ticket name / type
    private final String[] headers = { "Booking ID", "Ticket ID", "Email", "Address", "Postcode", "Date", "Quantity"};

    public GuestBookingTableModel(LinkedList<GuestBooking> bookings, int rows) {
        super(rows, 7);
        GuestBooking currBooking;        
        
        for (int i = 0; i < bookings.size(); i++) {
            currBooking = bookings.get(i);
            //String time  = currBooking.getBookingTime().toString().substring(0,10);
           // time+= " - " + currBooking.getBookingTime().toString().substring(10,19);

            
            setValueAt(currBooking.getBookingID(), i, 0);
            setValueAt(currBooking.getTicketID(), i, 1);
            setValueAt(currBooking.getGuest().getEmail(),i,2);
            setValueAt(currBooking.getGuest().getAddress(),i,3);
            setValueAt(currBooking.getGuest().getPostcode(),i,4);
            setValueAt("Time",i,5);
            setValueAt(currBooking.getQuantity(),i,6);
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return headers[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
}
