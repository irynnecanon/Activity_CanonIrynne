/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class num4 {
    public static void main(String[] args) {
    String given = "irynne Canon";
    String contain = "anon";
        
        String getLast = given.substring(given.length()-4, given.length());
        System.out.println("given string is: " +given);
         System.out.println("string containing " +contain+" at last " + (getLast.equals(contain)));
    }
}
