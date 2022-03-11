package com.mycompany.tuto_proyecto2;

/**
 *
 * @author marti
 */
public class ser_vivo {
    
    private int tamaño, peso;
    private String color_de_ojos, nombre;
    private Boolean is_male;
    
    ser_vivo(){    
    }
    
    public int getTamaño(){
        return this.peso;
    }
    public int getPeso(){
        return this.tamaño;
    }
    public String getColor_de_ojos(){
        return this.color_de_ojos;
    }
    public String getNombre(){
        return this.nombre;
    }
    public Boolean getMale(){
        return this.is_male;
    }
    public void setTamaño(int Param){
        this.peso = Param;
    }
    public void setPeso(int Param){
        this.tamaño = Param;
    }
    public void setColor_de_ojos(String Param){
        this.color_de_ojos = Param;
    }
    public void setNombre(String Param){
        this.nombre = Param;
    }
    public void setMale(Boolean Param){
        this.is_male = Param;
    }
}
