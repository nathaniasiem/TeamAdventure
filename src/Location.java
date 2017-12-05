
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
    public Location() {
        //created a scanner to scan the file
       Scanner input = new Scanner (System.in);
       //scans for the location name
       locationName = input.nextLine();
       //be able to retrieve the photos within the location
        locationImage = new Screen[4];
        //store the number of images
        ImageNum = 4;
        //created a loop that goes through each 
       
    }

    //call location name
    public String Lname(String locateName) {
        return this.locationName;
    }

    //call image of the location
    public String Limg(int position) {
        return locationImage[position].getImage();
    }
    
    //call the amount of images within a location
    public int numOfImgs(int ImageNum) {
        return this.ImageNum;
    }
}
