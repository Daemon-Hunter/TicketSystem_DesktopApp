/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 10512691
 */
public class ArtistTableModel extends DefaultTableModel {
    private final String[] headers = { "Name", "Description", "Tags", "More"};
    
    public ArtistTableModel(int rows, int columns) {
        super(rows, columns);
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return headers[columnIndex];
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}
