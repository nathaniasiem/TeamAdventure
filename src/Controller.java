/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class Controller {
    
    //create a String variable location
    private String location;
    
    //create a String variable direction
    private String direction;
    
    public Controller(){

    }
    
    public String getLocation(){
        return location;
    }
    
    public String getDirection(){
        return direction;
    }
    
    //a method to allow the user to turn north 
    //find a new screen
    //ask the user if it is blocked ot not
    public void turnNorth(){
        direction = "N";
  
    }
    
    public void turnSouth(){
        direction = "S";
    }
    
    public void turnEast(){
        direction = "E";

    }
    
    public void turnWest(){
       direction = "W";
       
    }
    
    //method to allow the user to go forward
    public void goForward(){
        
    }
}
