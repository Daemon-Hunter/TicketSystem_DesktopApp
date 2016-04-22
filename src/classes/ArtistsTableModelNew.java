/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 10512691
 */
public class ArtistsTableModelNew extends AbstractTableModel {
    
    private final String[] headers = { "Name", "Description", "Tags", "More"};
    
    private final Class<?>[] types = {String.class, String.class, String.class, JButton.class};

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
