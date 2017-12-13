
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class Controller {
    
    //create a String variable for the current location
    private String curLocation;
    
    //create a String variable  for the current direction
    private String curDirection;
    
    //create Gui as a private variable
    private ImageFrame gui;
    
    //create map as private variable
    private Map map;
    
    //create a list of all locations as a private variable
    private ArrayList<Location> locations = new ArrayList<>();
    
    //create an array of 4 directions as a private variable
    private String [] locationDirection;
    
    
    /**
     * constructor for the controller
     * @param gui the GUI used in the controller
     * @param map the map used to store the overall layout of the school
     */
    public Controller(ImageFrame gui, Map map){
        //initialize the variables
        this.gui = gui;
        this.map = map;
        
        //initialize the variables
        this.curLocation = map.getIntialLocation();
        this.curDirection = map.getInitialDirection();
        
        //set directon array to have corresponding spots with each direction
        locationDirection= new String[]{"N", "E", "S" , "W"};
     
        //make sure the GUI can talk to you
        gui.setController(this);
        
        //set the starting location and direction where the user starts
        Screen start = map.getLoc(curLocation, curDirection);
        
        //set the image by using the new screen
        gui.setImage(start.getImage());
    }
        
    /**
     * Method to allow the user to go forward
     */
    public void goForward(){
        // Get the current screen we are on right now
        Screen current = map.getLoc(curLocation, curDirection);

        // Switching direction to face the new direction which was clicked
        // Ask if we can move forward
        if (!current.getblock(curDirection) ) {
            // Set new location to the new Name
           curDirection = current.getNextDirection();
        }
           
           //Sets the new screen by calling map
           //Sends is to the new location and Direction
           Screen newScreen = map.getLoc(curLocation, curDirection);
           
           //sets the image by the new Screen
           gui.setImage(newScreen.getImage());

    }
    
    /** 
     * lets the user to turn left of the screen
     */
    public void turnLeft(){
        //create a for loop to got through the direction array comparing to current direction
        for(int i = 0 ; i < locationDirection.length; i++){
            if(curDirection.equals(locationDirection[i])){
                //"N" has exception since it is at position 0, so it will manually set to "W"
                if(curDirection.equals("N")){
                    curDirection = "W";
                    break;
                } else {
                    //subtract 1 position from the direction aray to set a new direction
                    curDirection = locationDirection[i - 1];
                    break;
                    
                }
            }
    }
         //Sets the new screen by calling map
           //Sends is to the new location and Direction
           Screen newScreen = map.getLoc(curLocation, curDirection);
           
           //sets the image by the new Screen
           gui.setImage(newScreen.getImage());
        
        
    }
    
    public void turnRight(){
        //create a for loop to got through the direction array comparing to current direction
        for(int i = 0 ; i < locationDirection.length; i++){
            if(curDirection.equals(locationDirection[i])){
                //"N" has exception since it is at position 0, so it will manually set to "W"
                if(curDirection.equals("N")){
                    curDirection = "W";
                    break;
                } else {
                    //subtract 1 position from the direction aray to set a new direction
                    curDirection = locationDirection[i + 1];
                    break;
                    
                }
            }
    }
         //Sets the new screen by calling map
           //Sends is to the new location and Direction
           Screen newScreen = map.getLoc(curLocation, curDirection);
           
           //sets the image by the new Screen
           gui.setImage(newScreen.getImage());
        
        
    }
        
    }






