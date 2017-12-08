
import java.io.File;
import java.io.FileNotFoundException;
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
public class Map {
    
    //create an instance variable for the initial location
    private String curLocation;
    
    //create an instance variable for the initial direction
    private String curDirection;
    
    //create an Array list of the location
    private ArrayList<Location> locations;
    
    public Map(String fileName){
        //intialize the array list
        locations = new ArrayList<>();
        try{
            
            //make the scanner for the text File
            Scanner in = new Scanner(new File(fileName));
            
            //initialize the current location as the "word" / position
            curLocation = in.next();
            
            ////initialize the current direction as the "word" / position
            curDirection = in.next();
            
            //Make Screens
            //loop to the end of the file
            while(in.hasNext()){
                
                //creatinf a screen from the scanner
                Location scr = new Location(in);
                
                //added the created screen to the list
                locations.add(scr);
                
            }
            //throws the error if file is not found (fileName)
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
            
        }
        
    }
    
    /**
     * Method for getting the initial Location of the user 
     * @return the initial location
     */
    public String getIntialLocation(){
        return curLocation;
        
    }
    
    /**
     * Method for getting the initial direction of the user
     * @return the initial direction
     */
    public String getInitialDirection(){
        return curDirection;
    }
    
    public Screen getLocation(String loc, String dir){
        //go through each screen
        for(Location s: locations){
            //checks if the name of the locationmatched the locations 
            if(s.getLocName().equals(loc)){
                //if it found its macth, asks the method to see if htere is a direction match
                return s.getScreen(dir);
                
            }
        }
        //if not matched was found, it will return nothing
        return null;
    }
    
   
}

