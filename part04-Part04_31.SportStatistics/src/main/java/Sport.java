/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NT
 */
public class Sport {
    private String home;
    private String visit;
    private int homepoint;
    private int visitpoint;
    public Sport (String value){
        String[] parts = value.split(",");
        this.home = parts[0];
        this.visit = parts[1];
        this.homepoint = Integer.valueOf(parts[2]);
        this.visitpoint = Integer.valueOf(parts[3]);
    }
    public String getHome() {
        return this.home;
    }
    public String getVisit(){
        return this.visit;
    }
    public int getHomeScore() {
        return this.homepoint;
    }
    public int getVisitScore(){
        return this.getVisitScore();
    }
    
    

}
