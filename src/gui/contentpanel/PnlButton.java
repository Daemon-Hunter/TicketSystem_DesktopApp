/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contentpanel;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Dominic
 */
public abstract class PnlButton extends javax.swing.JPanel {
    
    
    protected void lightButton(javax.swing.JLabel label, String file){
        // Set the font and image white
        label.setForeground(Color.WHITE);
        Icon icon = new ImageIcon(getClass().getResource(file));
        label.setIcon(icon);
    }
    
    protected void darkButton(javax.swing.JLabel label, String file){
        // Set the font and image light grey
            label.setForeground(Color.LIGHT_GRAY);
            Icon icon = new ImageIcon(getClass().getResource(file));
            label.setIcon(icon);
    }
}
