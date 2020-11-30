/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Assessment_2 {
     public static void main(String[] args) {
          String [][] stringarray = new String[10][10];
        
        for( int i =0; i<stringarray.length; i++){
            
            for(int f = 0; f<stringarray[i].length; f++){
                
                stringarray[i][f]=" @ ";
            }
        }
        for(int i = 0; i<stringarray.length; i++) {
            
            for(int f =0; f<stringarray[i].length; f++){
                
                System.out.print(stringarray[i][f]);
            }
         System.out.print("\n");
        }
        
    }
  
}
    
    
