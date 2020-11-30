/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 /*
 * @author Acer
 */
public class Irynne {
    public static void main(String[] args) {
       int [] array_f = new int [5];
        int[] array_s= new int[8];
        
        array_f[0] = 1;
        array_f[1] = 3;
        array_f[2] = 5;
        array_f[3] = 10;
        array_f[4] = 4;
        
        array_s[0] = 10;
        array_s[1] = 20;
        array_s[2] = 30;
        array_s[3] = 40;
        array_s[4] = 50;
        array_s[5] = 60;
        array_s[6] = 70;
        array_s[7] = 80;
        
        
        
        arraycopy(array_f, 1, array_s, 3, 2);
   
        
        for (int i = 0; i   < array_s.length; i++) {
            System.out.println("Array "+ i +" : " + array_s [i]);
            
    }
        
        
                
    }
    
     public static void arraycopy(int[] from, int fromstart, int[] to, int tostart, int count){
         
         for (int i = 0; i < count; i++) {
             to[tostart + i] = from[fromstart + i];
         }
     }
}
