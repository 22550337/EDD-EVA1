/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_14_clases_abs2;

/**
 *
 * @author Perti
 */

//Si se usan metodos abtractos, toda la clase 
//debe ser abtracta (abstract)
public abstract class Persona {
    private String NoM; 
     private int EdA;

    public Persona(String NoM, int EdA) {
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
     //Los metodos abtractos pueden coexistir con 
    //metodos normales 
    public abstract void ImPD (); 
     
}
