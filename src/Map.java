
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
    
    private String initialLocation;
    private String initialDirection;
    
    private ArrayList<Location> locations;
    
    public Map(){
        
    }
    
    public String getIntialLocation(){
        return initialLocation;
        
    }
    
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

