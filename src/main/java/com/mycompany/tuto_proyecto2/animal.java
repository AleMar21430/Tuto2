package com.mycompany.tuto_proyecto2;

/**
 *
 * @author marti
 */
public class animal extends ser_vivo{
    
    private String especie;
    
    animal(){
    }
    
     public String GetSpecies(){
        return this.especie;
    }
    public void SetSpecies(String Param){
        this.especie = Param;
    }
}
