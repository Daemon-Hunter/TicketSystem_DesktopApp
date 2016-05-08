/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;

/**
 *
 * @author 10512691
 */
public class ImageAssist {
    
    public static ArrayList<BufferedImage> duplicate(BufferedImage original) {
        
            ArrayList<BufferedImage> results = new ArrayList<>(5);
            
            results.add(resizeImage(120, 120, original));
            results.add(resizeImage(160, 160, original));
            results.add(resizeImage(240, 240, original));
            results.add(resizeImage(320, 320, original));
            results.add(resizeImage(480, 480, original));
            results.add(resizeImage(720,720, original));
            return results;
    }
    
    private static BufferedImage resizeImage(int width, int height, BufferedImage original) {
        if (original != null) 
        {
            BufferedImage newImage = new BufferedImage(width, height, original.getType());
            Graphics2D g = newImage.createGraphics();
            g.drawImage(original, 0, 0, width, height, null);
            g.dispose();
            
            return newImage;
            
        } else {
            throw new NullPointerException("Null original image");
        }
    }

    public static ArrayList<BufferedImage> createDefaults() throws IOException {
            Random r = new Random();
        
            String filename = "src/images/defaults/defaultImage" + r.nextInt(7) + ".gif";
            
            BufferedImage img = ImageIO.read(new File(filename));
            return ImageAssist.duplicate(img);
    }
}
