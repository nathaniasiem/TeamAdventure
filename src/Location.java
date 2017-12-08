import java.util.Scanner;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fabed2976
 */
public class Location {
    //created instance variables available throughout program
    //indicates the location name 
    private String locationName;
    //stores images as an array from Screen class
    private Screen[] locationImage;
    //keeps track of the amount of images in location
    private int ImageNum;

    //method to identify the image with location
    public Location(Scanner input) {
       //scans for the location name
       locationName = input.nextLine();
       //be able to retrieve the photos within the location
        locationImage = new Screen[4];
        //store the number of images
        ImageNum = 4;
        //created a loop that goes through each image
        for(int i=0;i<ImageNum;i++){
            //input is received from screen class due to method in scanning the text file 
            Screen display = new Screen(input);
            locationImage[i]=display;
        }
    }
       
    //call location name
    public String Lname() {
        return this.locationName;
    }

    //call image of the location
    public String Limg(int position) {
        return locationImage[position].getImage();
    }
    
    //call the amount of images within a location
    public int getImageNum() {
        return this.ImageNum;
    }
    
    //method to go to the current next location
    public String nextLocation(int position){
        return locationImage[position].getNextLocation();
    }
    
    //a boolean if the front view is blocked
    public boolean getisBlocked(int position){
        return locationImage[position].getblock();
        
    }
    
    
}