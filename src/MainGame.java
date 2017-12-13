
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class MainGame {
    
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a new GUI
        ImageFrame GUI = new ImageFrame();
        
        //show the Gui game
        GUI.setVisible(true);
        
        //create the map by loading in the "pics.txt"
        Map map = new Map("images/pics.txt");
        
        //it sets coordinates , and calls the mao as well as the ImageFrame
        Controller c = new Controller (GUI,map);
        
        
        
        
        
    }
}


