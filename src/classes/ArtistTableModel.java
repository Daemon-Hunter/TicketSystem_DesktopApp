/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import datamodel.Artist;
import gui.Home;
import gui.PnlArtists;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 10512691
 */
public class ArtistTableModel extends DefaultTableModel {
    
    private final String[] headers = { "Name", "Description", "Tags", "More"};
    
    private final Class<?>[] types = {String.class, String.class, String.class, JButton.class};
    private final ArrayList<Artist> artists;
    
    
    // access to parent -> wrapper. therefore can get access to artist list, and then open
    // new JPanel that displays the artist data. Pass JPanel the artist object.
    public ArtistTableModel(ArrayList<Artist> artists, int rows, int columns) {
        super(rows, columns);
        this.artists = artists;
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
