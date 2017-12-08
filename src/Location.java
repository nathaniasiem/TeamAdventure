
import java.util.ArrayList;
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
    //stores images as an array from Screen Class 
    //create an Array list of the location
    private ArrayList<Screen> displays = new ArrayList<>();

    //indicates the location name 
    private String locationName;

    //stores the directions
    private String[] locationDirection;

    //keeps track of the amount of images in location
    private int ImageNum;

    //method to identify the image with location
    public Location(Scanner input) {
        //scans for the location name
        locationName = input.nextLine();
        //be able to retrieve the photos within the location
        locationDirection = new String[]{"N", "E", "W", "S"};
        //store the number of images
        ImageNum = 4;

        //created a loop that goes through each image from the 4 directions
        for (int i = 0; i < ImageNum; i++) {
            //input is received from screen class due to method in scanning the text file 
            Screen display = new Screen(input);
            displays.add(display);
        }
    }

    //call location name
    public String Lname() {
        return this.locationName;
    }

    //create a method 
    public Screen getScreen(String direction) {
        for (Screen display : displays) {
            if (display.getDirection().equals(direction)) {
                return display;
            }

        }
        return null;
    }
}
