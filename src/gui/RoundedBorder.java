/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.border.AbstractBorder;

/**
 *
 * @author 10512691
 */
public class RoundedBorder extends AbstractBorder {
    
    @Override public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        
        
        // Create a graphics object to draw the rounded border
        Graphics2D graphics = (Graphics2D)g.create();
        
        // Creates a rectangle from coordinates (x, y), of size (width * height).
                        /* width-1 & height-1 made edges rounder! */
        // Corners are rounded by an arch of height 'h', and width 'h' - making
        // the two sides of the rectangle semi-circular.
        int h = height-1;
        RoundRectangle2D round = new RoundRectangle2D.Float(x, y, width-1, h, h, h);
        
        Container parent = c.getParent();
        if(parent!=null) {
            // Set the colour of the graphics creator to the background color.
            graphics.setColor(parent.getBackground());
            
            // Create the border rectangle with the same background colour
            Area corner = new Area(new Rectangle2D.Float(x, y, width, height));
            
            // Subtracts the shape of the round border object from itself
            corner.subtract(new Area(round));
            
            // Graphics2D object then fills the interior of the shape.
            graphics.fill(corner);
        } else {
            graphics.setColor(Color.GRAY);
        }
        graphics.draw(round);
        graphics.dispose();
    }
    
    @Override 
    public Insets getBorderInsets(Component c) {
        return new Insets(4, 8, 4, 8);
    }
    
    @Override 
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.left = insets.right = 8;
        insets.top = insets.bottom = 4;
        return insets;
    }
}
