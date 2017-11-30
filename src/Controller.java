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
    
    private GUI gui;
    
    private Map map;
    
    public Controller(GUI gui, Map map){
        this.gui = gui;
        this.map = map;
        
        this.location = map.getIntialLocation();
        this.direction = map.getInitialDirection();
        
        // Make sure the GUI can talk to you!
        gui.setController(this);

        // Set the starting image
        //Screen start = map.getScreen(location, direction);

        // Sets image, the the location/direction, and if it is blocked so it can be accessed in gui
        //gui.setImage(start.getImage());
        //gui.setScreenLabel();
       // gui.setBlocked(start.isBlocked());
    }
        
        

    /**
     * Get the users location on the map
     * @return the location
     */
    public String getLocation(){
        return location;
    }
    
    /**
     * Get the users direction on the map
     * @return the direction
     */
    public String getDirection(){
        return direction;
    }
    
    /**
     * Method to allow the user to turn north 
     */ 
    public void turnNorth(){
        direction = "N";
        
        //Screen current = map.getScreen(location, direction);
        
        //gui.setImage(current.getImage());
        //gui.setLabel();
        //gui.setBlocked(current.isBlocked);
        
  
    }
    
    /**
     * Method to allow the user to turn south
     */
    public void turnSouth(){
        direction = "S";
        //Screen current = map.getScreen(location, direction);
        
       //gui.setImage(current.getImage());
       //gui.setLabel();
       //gui.setBlocked(current.isBlocked);
    }
    
    /**
     * Method to allow the user to turn east
     */
    public void turnEast(){
        direction = "E";
        
         //Screen current = map.getScreen(location, direction);
        
        //gui.setImage(current.getImage());
        //gui.setLabel();
        //gui.setBlocked(current.isBlocked);

    }
    
    /**
     * Method to allow the user to turn west
     */
    public void turnWest(){
       direction = "W";
       
       
        //Screen current = map.getScreen(location, direction);
        
        //gui.setImage(current.getImage());
        //gui.setLabel();
        //gui.setBlocked(current.isBlocked);
       
    }
    /**
     * Method to allow the user to go forward
     */
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



