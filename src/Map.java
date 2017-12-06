
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class Map {
   
    //public get Screen

    //create an instance variable for the initial location
    private String initialLocation;
    
    //create an instance variable for the initial direction
    private String initialDirection;
    
    //create an Array list of the location
    private ArrayList<Location> locations;
    
    public Map(){
        
    }
    
    /**
     * Method for getting the initial Location of the user 
     * @return the initial location
     */
    public String getIntialLocation(){
        return initialLocation;
        
    }
    
    /**
     * Method for getting the initial direction of the user
     * @return the initial direction
     */
    public String getInitialDirection(){
        return initialDirection;
    }
    
    //public get Screen(String findLocation, String findDirection){
    //for(Location loc: this.locations){
    //if(loc.getName().equals(findLocation)){
    //return loc.getScreen(findDirection);
    //}
    //}
    //return null;
    

}

