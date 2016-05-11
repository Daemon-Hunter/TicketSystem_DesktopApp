/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contentpanel.bookings;

import bookings.GuestBooking;
import bookings.IBooking;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private final String[] headers = { "Booking Ref", "Ticket Name","Event", "Email", "Address", "Postcode", "Date", "Quantity"};

    public GuestBookingTableModel(LinkedList<GuestBooking> bookings, int rows) {
        super(rows, 8);
        GuestBooking currBooking;        
        for (int i = 0; i < bookings.size(); i++) {
            currBooking = bookings.get(i);
           String time  = currBooking.getBookingTime().toString().substring(0,10);
           time+= " - " + currBooking.getBookingTime().toString().substring(10,19);

            
            setValueAt(currBooking.getBookingID(), i, 0);
            try {
                setValueAt(currBooking.getTicket().getType(), i, 1);
            } catch (IOException ex) {
                setValueAt("Ticket Name not Found", i, 1);
            }          
            try {
                setValueAt(currBooking.getTicket().getChildEvent().getName(),i,2);
            } catch (IOException ex) {
           setValueAt("Event Name not Found", i, 2);

            }
            setValueAt(currBooking.getGuest().getEmail(),i,3);
            setValueAt(currBooking.getGuest().getAddress(),i,4);
            setValueAt(currBooking.getGuest().getPostcode(),i,5);
            setValueAt(time,i,6);
            setValueAt(currBooking.getQuantity(),i,7);
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
