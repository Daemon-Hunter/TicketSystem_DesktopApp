/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author 10512691
 */
public class CustomListBox extends JLabel implements ListCellRenderer {

    public CustomListBox() {
        setOpaque(true);
    }
    
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        // Sets the list box value to the given object's string representation
        setText(value.toString());

        // Colors every other value
        if (index % 2 == 0)
            setBackground(new Color(230, 230, 230));
        else
            setBackground(Color.WHITE);

        return this;
    }
    
}
