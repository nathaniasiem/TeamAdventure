
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
    
    
    private MainGame gui;
   
    
    public MainGame(){
         //create a blank file reader
        //help read the file
        FileReader file = null;
        try{
            //fix this proper loading later
            file = new FileReader("pics.txt");
        }catch(Exception e){
            //print out the error messages
            e.printStackTrace();
            //exit the program
            System.exit(0);
        }
        
          //Use a Scanner with the file
        Scanner in = new Scanner(file);
    
        while(in.hasNext()){
           Location cur = new Location(in);
           locations.add(cur);
        }
           
        //gui = new GUI (this);
        //set the text for the next image
       // Location cur =locations.get(getImageNum);
        //gui.image(cur.Lname());
        //show it
       // gui.setVisible(true);
    }
        
    /**
     * A method to allow the user to go forward 
     */
    public void goForward(){
        //set the text for the next location
       // Location cur = locations.get(index);
        //gui.setImage(cur.Lname());

    }
    
    /**
     * A method to allow the user to turn left
     */
    public void turnLeft(){
        //if classNum is in out of bounds
       // if(ImageNum < 4 )
     
    }
    
    /**
     * A method to allow the user to turn right
     */
    public void turnRight(){
        //if the number of pictures is out of bounds
        //if classNum is in out of bounds
      // if(ImageNum >= 0 && ImageNum  < 4){
        //turnsleft
       // ImageNum++;
   ///} else {
      //  ImageNum = 0;
      // }
        // Location c = locations.get(getNextLocation());
       // GUI.setPictureName(c.Lname());
        
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainGame Adventure = new MainGame();
    }
}


