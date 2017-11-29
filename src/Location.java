
import java.io.FileReader;
import java.net.URL;




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
    private String[] locationName;
    private String[] locationImage;
    
    //method to read the text file of locations
    public Location (){
         //create a blank file reader
        FileReader file = null;
        try{
            URL url= Location.class.getResource("pics.txt");
        System.out.println(url); 
        file= new FileReader(url.getFile());
         }catch (Exception e){
             //handle any errors
            //print out the lovely red errors
            e.printStackTrace();
            
         }
    }
    
    //call location name
    public String[] Lname(String locateName){
        return this.locationName;
    }
    
    //call image of the location
    public String[]Limg(String locationImage){
        return this.locationImage;
    }


        }
    
    
    

