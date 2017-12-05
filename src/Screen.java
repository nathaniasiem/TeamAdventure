import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class Screen {
    public String image;
    public boolean isBlocked;
    public String currentLocation;
    public String nextLocation;
    public String direction;
    public String nextDirection;
    
    //method to scan in the file
    public Screen(Scanner input){
        //checks the direction user is facing
        direction = input.next();
        //reads the image name
        image = input.next();
        //
        String check = input.next();
        //condition when checking if user is blocked
        if(check.equals("false")){
            isBlocked=false;
            nextLocation = input.next();
            nextDirection = input.next();
        }else{
            isBlocked=true;
            input.next();
        }
    }
    //method that returns the location of the user
    public String cLocation(String user){
        return currentLocation;
    }
    
    //method that identifies if the user is able to move or not
    
    public boolean block (){
        return isBlocked;
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
    public String getImage(){
        return this.image;
    }
}