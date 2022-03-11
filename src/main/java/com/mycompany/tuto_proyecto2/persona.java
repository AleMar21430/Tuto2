package com.mycompany.tuto_proyecto2;

/**
 *
 * @author marti
 */
public class persona extends ser_vivo{
    
    private int numero_dpi;
    
    persona(){
    }
    
     public int GetDpi(){
        return this.numero_dpi;
    }
    public void SetDpi(int Param){
        this.numero_dpi = Param;
    }
    
}
