package com.mycompany.eva2_9_super2;

//*
 //* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 //


/**
 *
 * @author Perti
 */
public class Persona {
    private String NoM; 
    private String ApE; 
    private String EdA; 

public Persona (){
    this.NoM = "_____"; 
    this.ApE = "______";
    this.EdA = "______"; 
}    

    public Persona(String NoM, String ApE, String EdA) {
        this.NoM = NoM;
        this.ApE = ApE;
        this.EdA = EdA;
    }

    
    public String getNoM() {
        return NoM;
    }

    public String getApE() {
        return ApE;
    }

    public String getEdA() {
        return EdA;
    }

    public void setNoM(String NoM) {
        this.NoM = NoM;
    }

    public void setApE(String ApE) {
        this.ApE = ApE;
    }

    public void setEdA(String EdA) {
        this.EdA = EdA;
    }
    
    
}
