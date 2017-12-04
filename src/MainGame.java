
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
    
     //create an Array list of the location
    private ArrayList<Location> locations;
    
    public MainGame(){
         //create a blank file reader
        //help read the file
        FileReader file = null;
        try{
            //fix this proper loading later
            file = new FileReader("images/pics.txt");
        }catch(Exception e){
            //print out the error messages
            e.printStackTrace();
            //exit the program
            System.exit(0);
        }
        
          //Use a Scanner with the file
        Scanner in = new Scanner(file);
    }
    
    /**
     * A method to allow the user to go forward 
     */
    public void goForward(){
        //Location c = locations.get(getnextLocation());
        //gui.setPictureName(c.getDescription());
        
    }
    
    /**
     * A method to allow the user to turn left
     */
    public void turnLeft(){
        //if classNum is in out of bounds
       //if(ImageNum > 0)
       
    }
    
    /**
     * A method to allow the user to turn right
     */
    public void turnRight(){
        //if the number of pictures is out of bounds
    }
    
    
       
           
        
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainGame Adventure = new MainGame();
    }
}
