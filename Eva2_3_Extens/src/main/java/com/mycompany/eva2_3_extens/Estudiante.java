/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_3_extens;

/**
 *
 * @author Perti
 */

//Clase derivada extens clase base 
//Subclase
public class Estudiante extends Persona {
    private String NC; 

    public Estudiante(String NoM, String ApE, int EdA) {
        super(NoM, ApE, EdA);
    }

    Estudiante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String getNC() {
        return NC;
    }

    public void setNC(String NC) {
        this.NC = NC;
    }
    
    
}
