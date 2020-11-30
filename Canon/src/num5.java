/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class num5 {
    public static void main(String[] args) {
          String given = "Irynne Canon";
        String mask = "ca";
        String output = null;
        StringBuffer buff = new StringBuffer (given);
        for(int i = 0; i < buff.length(); i++){
            for(int j =0; j< mask.length(); j++){
                if(buff.charAt(i)== mask.charAt(j)){
                buff.deleteCharAt(i);
            }
        }
    }
    output = buff.toString();
    System.out.println("the given string is " + given);
    System.out.println("the given mask string is " + mask);
    System.out.println("the new string is: " + output);
    }
}

