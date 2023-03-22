/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_17_interfaces;

/**
 *
 * @author Perti
 */
public class persona implements Mostrardatos{
    private String NoM; 
    private int EdA; 

    public persona(String NoM, int EdA) {
        this.NoM = NoM;
        this.EdA = EdA;
    }   
    public String getNoM() {
        return NoM;
    }

    public int getEdA() {
        return EdA;
    }

    public void setNoM(String NoM) {
        this.NoM = NoM;
    }

    public void setEdA(int EdA) {
        this.EdA = EdA;
    }
    
    public void ImPDatos (){
System.out.println("Nombre es: "+NoM);
System.out.println("La edad es: "+EdA);
}
    
}


