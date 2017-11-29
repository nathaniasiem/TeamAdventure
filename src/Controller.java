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
        
        //Screen current = map.getScreen(location, direction);
        
        //gui.setImage(current.getImage());
        //gui.setLabel();
        //gui.setBlocked(current.isBlocked);
        
  
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
        // Get the screen we are on right now
        //Screen current = map.getScreen(location, direction);

        // Switching direction to face the new direction which was clicked
        // Ask if we can move forward
       // if (current.isBlocked() == false) {
            // Set new location to the new Name
           // location = current.getNewImageName();

            // Set new direction
           // direction = current.getNewDirection();

            // Find new screen
           // current = map.getScreen(location, direction);
        }

        // Sets image, the location/direction, and if it is blocked so it can be accessed in gui
       // gui.setImage(current.getImage());
       // gui.setScreenLabel();
        //gui.setBlocked(current.isBlocked());
        
    }



