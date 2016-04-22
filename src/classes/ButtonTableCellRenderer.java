/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author 10512691
 */
public class ButtonTableCellRenderer implements TableCellRenderer {
    
    JTable table;
    JButton renderButton;
    JButton editButton;
    String text;
    
    public ButtonTableCellRenderer(JTable table, int column) {
        super();
        this.table = table;
        renderButton = new JButton();
        
        editButton = new JButton();
        editButton.setFocusPainted(false);
        
        TableColumnModel colModel = table.getColumnModel();
        colModel.getColumn(column).setCellRenderer(this);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) 
    {
        renderButton.setBackground(Color.WHITE);
        renderButton.setForeground(Color.BLACK);
        renderButton.setBorderPainted(false);
        return renderButton;
    }
    
}
