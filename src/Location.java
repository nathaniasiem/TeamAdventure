
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
    //indicates the location name and image

    private String locationName;
    private String[] locationImage;
    private int ImageNum;

    //method to identify the image with location
    public Location() {
    }

    //call location name
    public String Lname(String locateName) {
        return this.locationName;
    }

    //call image of the location
    public String[] Limg(String locationImage) {
        return this.locationImage;
    }

    public int numOfImgs(int ImageNum) {
        return this.ImageNum;
    }
}
