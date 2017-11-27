
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
    private String[] locationName;
    private String[] locationImage;
    
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
    public String[] Lname(String locateName){
        return this.locationName;
    }
    public String[]Limg(String locationImage){
        return this.locationImage;
    }


        }
    
    
    

