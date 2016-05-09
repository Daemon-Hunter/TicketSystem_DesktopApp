/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contentpanel.admins;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import people.IAdmin;

/**
 *
 * @author 10512691
 */
class AdminTableModel extends DefaultTableModel {
    
    private final String header = "Email";
    
    
    // access to parent, and therefore wrapper. Can get access to artist list, and then open
    // new JPanel that displays the artist data. Pass JPanel the artist object.
    public AdminTableModel(List<IAdmin> admins, int rows) {
        super(rows, 1);
        
        IAdmin currAdmin;
        
        // Populate model with data
        for (int i = 0; i < 25 && i < admins.size(); i++) {
            currAdmin = admins.get(i);
            this.setValueAt(currAdmin.getEmail(), i, 0);
        }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return header;
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}
