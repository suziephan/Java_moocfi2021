/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NT
 */
public class Archive {
    private String name;
    private String id;
    public Archive (String id, String name) {
        this.name = name;
        this.id = id;
    
    }
    public String getName() {
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    @Override
    public String toString() {
        return this.id+": "+this.name;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if ( !(compared instanceof Archive)) {
            return false;
            
        }
        Archive compareObj = (Archive) compared;
        //if( this.getId().equals(compareObj.getId())) {
          //  return true;
        //} else {
          //  return false;
        //}
        return this.getId().equals(compareObj.getId());
        
    
    
}
    
    
}
