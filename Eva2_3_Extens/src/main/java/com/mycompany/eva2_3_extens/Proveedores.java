/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_3_extens;

/**
 *
 * @author Perti
 */
public class Proveedores extends Persona {
    private String RfC; 

    public Proveedores(String NoM, String ApE, String EdA) {
        super(NoM, ApE, EdA);
    }  

    Proveedores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public String getRfC() {
        return RfC;
    }

    public void setRfC(String RfC) {
        this.RfC = RfC;
    }
    
    
}
