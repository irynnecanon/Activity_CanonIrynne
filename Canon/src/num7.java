
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class num7 {
     public static void main(String[] args) {   
        File files = new File ("C:\\Users\\Acer");
        
       //eh pa gwa ko ser ang akon nga unod sa akon files
        
       String [] file = files.list();
        
        for (int i = 0; i < file.length; i++) {
            
            System.out.println(file[i]);
        }
    }
}

