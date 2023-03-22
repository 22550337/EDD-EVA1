/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_3_extens;

/**
 *
 * @author Perti
 */
public class Docente extends Persona {
    private String PZ; 
    
    public Docente(String NoM, String ApE, int EdA) {
        super(NoM, ApE, EdA);
    }

    public String getPZ() {
        return PZ;
    }

    public void setPZ(String PZ) {
        this.PZ = PZ;
    }
    
    
    
}
