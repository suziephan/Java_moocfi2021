/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NT
 */
public class Fitbyte {
    private int age;
    private int restingrate;
    public Fitbyte( int age, int restingrate) {
        this.age = age;
        this.restingrate = restingrate;
               
    }
    public int getRestingRate() {
        return this.restingrate;
    }
    
   
    
    public double targetHeartRate (double pct) {
        double maximumratepct =  206.3 - (0.711 * this.age);
        
        double x = (maximumratepct - this.restingrate)*pct +this.restingrate;
        
        return x;
    }
    
}
