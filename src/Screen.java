import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;
import javax.imageio.ImageIO;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class Screen {
    public BufferedImage image;
    public boolean isBlocked;
    public String currentLocation;
    public String nextLocation;
    public String direction;
    public String nextDirection;
    public String locationName;
    private String imageName;

    
    //method to scan in the file to display image
    public Screen(Scanner input){
        //checks the direction user is facing
        direction = input.next();
        //reads the image name
        imageName = input.next();
        //reads the indicator if it is true or false
        String wall = input.next();
        //condition when checking if user is blocked
        if(wall.equals("false")){
            isBlocked=false;
            nextLocation = input.next();
            nextDirection = input.next();
        }else{
            isBlocked=true;
            input.next();
        }
        
        try{
            image = ImageIO.read(new File ("pics.txt" + imageName));
        } catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }
    }
    //method that returns the location of the user
    public String cLocation(String user){
        return currentLocation;
    }
 
    //method that identifies the direction the user is currently facing
    public String getDirection (){
        return direction;
    }
    
    //method that identifies the direction is going to face next
    public String getNextDirection(){
        return nextDirection;
    }
    
    //method to give the next location 
    public String getNextLocation (){
        return nextLocation;
    }
    
    //method to retrieve the image
    public BufferedImage getImage(){
        return image;

    }
    //method that identifies if the user is able to move or not
    
    public boolean getblock (String direction){
        return isBlocked;
        }   


}