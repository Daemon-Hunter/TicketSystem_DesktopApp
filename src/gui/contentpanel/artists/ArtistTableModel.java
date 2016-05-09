/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contentpanel.artists;

import events.IArtist;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 10512691
 */
public class ArtistTableModel extends DefaultTableModel {
    
    private final String[] headers = { "Name", "Description", "Tags", "More"};
    
    
    // access to parent, and therefore wrapper. Can get access to artist list, and then open
    // new JPanel that displays the artist data. Pass JPanel the artist object.
    public ArtistTableModel(List<IArtist> artists, int rows) {
        super(rows, 4);
        
        IArtist currArtist;
        
        // Populate model with data
        for (int i = 0; i < 20 && i < artists.size(); i++) {
            currArtist = artists.get(i);
            String artistTags = "";

            this.setValueAt(currArtist.getName(), i, 0);

            this.setValueAt(currArtist.getDescription(), i, 1);

            for (String tag : currArtist.getTags()) {
                artistTags += tag + ", ";
            }
            if (artistTags.length() > 2) {
                artistTags = artistTags.substring(0, artistTags.length() - 2);
            }
            this.setValueAt(artistTags, i, 2);
            
            this.setValueAt("...", i, 3);
        }
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
