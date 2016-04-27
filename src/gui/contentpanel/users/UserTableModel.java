/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contentpanel.users;

import events.IArtist;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import people.IUser;

/**
 *
 * @author Dominic
 */
public class UserTableModel extends DefaultTableModel{
      
   private final String[] headers = { "Name", "Email", "Address", "Postcode"};
   private final List<IUser> users;

   public UserTableModel(List<IUser> users, int size){
       super(size,4);
       this.users = users;
       
       for (int i = 0; i < 20 && i < users.size(); i++) {
              String name;
              IUser currUser = users.get(i);

              name = currUser.getFirstName() + " " + currUser.getLastName();

              this.setValueAt(name, i, 0);
              this.setValueAt(currUser.getEmail(),i,1);
              this.setValueAt(currUser.getAddress(),i,2);
              this.setValueAt(currUser.getPostcode(), i, 3);
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
