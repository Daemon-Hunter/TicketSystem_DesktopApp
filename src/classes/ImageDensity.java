/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author 10512691
 */
public class ImageDensity {
    
    public static ArrayList<BufferedImage> create5(BufferedImage original) {
        
        if (original != null) {
            ArrayList<BufferedImage> results = new ArrayList<>(5);
            
            BufferedImage ldpi = new BufferedImage(120, 120, original.getType());
            Graphics2D g = ldpi.createGraphics();
            g.drawImage(original, 0, 0, 120, 120, null);
            g.dispose();
            results.add(ldpi);
            
            BufferedImage mdpi = new BufferedImage(160, 160, original.getType());
            g = mdpi.createGraphics();
            g.drawImage(original, 0, 0, 160, 160, null);
            g.dispose();
            results.add(mdpi);
            
            BufferedImage hdpi = new BufferedImage(240, 240, original.getType());
            g = hdpi.createGraphics();
            g.drawImage(original, 0, 0, 240, 240, null);
            g.dispose();
            results.add(hdpi);
            
            BufferedImage xhdpi = new BufferedImage(320, 320, original.getType());
            g = xhdpi.createGraphics();
            g.drawImage(original, 0, 0, 320, 320, null);
            g.dispose();
            results.add(xhdpi);
            
            BufferedImage xxhdpi = new BufferedImage(480, 480, original.getType());
            g = xxhdpi.createGraphics();
            g.drawImage(original, 0, 0, 480, 480, null);
            g.dispose();
            results.add(xxhdpi);
            
            return results;
        } else {
            throw new NullPointerException("Null original image");
        }
    }
}
