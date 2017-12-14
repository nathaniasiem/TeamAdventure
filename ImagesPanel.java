
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class ImagesPanel extends JComponent {
    //something to store in the image
    private BufferedImage image = null;
    
  
    
    @Override
    public void paintComponent(Graphics g){
        //there is an image to draw
        if(image != null){
            //draw the image
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        }
        }
    
    /**
     * Method to set the image on the screen and repaint it
     * @param img for the Adventure game
     */
    public void setImage(BufferedImage img){
        //store the image
        this.image = img;
        //repaint to draw image
        this.repaint();
    }
      
    }
    
    
    
    
    

