/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NT
 */
public class Books {
    private String title;
    private int page;
    private int publicYear;
    
    public Books(String title, int page, int publicYear) {
        this.title = title;
        this.page = page;
        this.publicYear = publicYear;
        
               
    }
    public String getTitle (){
        return this.title;
    }
    public int getPage() {
        return this.page;
    }
    
    public int getpublicYear() {
        return this.publicYear;
    }
    public String toString () {
        return this.title +", " + this.page + " pages" + ", "+  this.publicYear;
    }
}
