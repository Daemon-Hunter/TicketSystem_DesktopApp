/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contentpanel.users;

import bookings.IBooking;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import tickets.ITicket;

/**
 *
 * @author Dominic
 */
public class UserTicketModel extends DefaultTableModel{
    
   private final String[] headers = { "Ref No.", "Event", "Name", "Description","Price","Quantity","Amount Paid"};
   private final List<IBooking> bookings;

    
    UserTicketModel(List<IBooking> bookings, int size)
    {
        super(size,7);
        this.bookings = bookings;

               for (int i = 0; i < 20 && i < bookings.size(); i++) {
                     
            try {
                IBooking currBooking = bookings.get(i);
                ITicket currTicket = currBooking.getTicket();
               
                NumberFormat formatter = NumberFormat.getCurrencyInstance();
                String price = formatter.format(currTicket.getPrice());
                String amountPaid = formatter.format(currTicket.getPrice() * currBooking.getQuantity());
              
                this.setValueAt(currBooking.getBookingID().toString(),i,0);
                this.setValueAt(currTicket.getChildEvent().getParentEvent().getName(),i,1);
                this.setValueAt(currTicket.getChildEvent().getName(),i,2);
                this.setValueAt(currTicket.getDescription(),i,3);       
                this.setValueAt(price, i, 4);
                this.setValueAt(Integer.toString(currBooking.getQuantity()),i,5);
                this.setValueAt(amountPaid,i,6);
            } catch (IOException ex) {
                Logger.getLogger(UserTicketModel.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
               

    }
    UserTicketModel()
    {
        super(0,7);
        bookings = new ArrayList<>();
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
