/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contentpanel.events;

import events.IChildEvent;
import events.IParentEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dominic
 */
public class EventTableModel extends DefaultTableModel{

   private final String[] headers = { "Name", "Description","Venue","Start Time","End Time"};
   private final List<IChildEvent> childEvents;

    
    
    EventTableModel(List<IChildEvent> events, int size) throws IOException
    {
        super(size, 5);
        childEvents = events;
       
               for (int i = 0; i < 20 && i < events.size(); i++) {
              IChildEvent currEvent = events.get(i);
              String startTime, endTime;
              DateFormat dateFormatter;
         

            try{    
                   startTime = currEvent.getStartDateTime().toString().substring(0,10);
                   startTime += " - " + currEvent.getStartDateTime().toString().substring(10,19);
                   endTime = currEvent.getEndDateTime().toString().substring(0,10);
                   endTime += " - " + currEvent.getEndDateTime().toString().substring(10,19);
            }catch(IllegalArgumentException ex)
            {
                startTime = "No StartTime Found" ;
                endTime = "No StartTime Found" ;

            }
              this.setValueAt(currEvent.getName(), i, 0);
              this.setValueAt(currEvent.getDescription(),i,1);
              this.setValueAt(currEvent.getVenue().getName(),i,2);
              this.setValueAt(startTime, i, 3);
              this.setValueAt(endTime, i, 4);
    }

       
}
    public EventTableModel()
    {
        super(0,5);
        childEvents = null;
        
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
