/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NT
 */
import java.io.*;
import java.nio.charset.StandardCharsets;
public class semen {
    public static void main (String args[]) {
        String semen = new String ("a");
        textToByte(semen);
        
        
    }
    
    public static void textToByte(String txt) {
        byte[] array1 = txt.getBytes(StandardCharsets.US_ASCII);
                                       
        System.out.println("default");
        for (byte b : array1) {
            System.out.println(b);
        }   
                
    }
    
}
