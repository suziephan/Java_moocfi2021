/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NT
 */
public class Timer {
    private ClockHand second;
    private ClockHand secondhd;
    public Timer () {
        this.second = new ClockHand (60);
        this.secondhd = new ClockHand(100);
    }
    public void advance() {
        this.secondhd.advance();
            if (this.secondhd.value() ==0) {
                this.second.advance();
            }
    }
    public String toString() {
        return this.second.value()+":"+ this.secondhd.value();
    }
    
}
