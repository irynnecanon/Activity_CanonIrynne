/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class num3 {
     public static void main(String[] args) {
         float [] example = {5,10,15,20,30};
        float sum =0;
        float ave =0;
        for(int i=0; i < example.length; i++) {
            sum += example[i];
            
        }
        ave = sum/example.length;
        System.out.println("total average is:" + ave);
    }
    
}

