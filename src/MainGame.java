
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
    
    public void goForward(){
        
    }
    
    public void turnLeft(){
        //if classNum is in bounds
       
    }
    
    public void turnRight(){
        //if the number of pictures is out of bounds
    }
    
    
       
           
        
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
