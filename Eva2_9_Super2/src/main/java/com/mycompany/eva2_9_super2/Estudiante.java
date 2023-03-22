/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_3_extens;

import com.mycompany.eva2_9_super2.Persona;

/**
 *
 * @author Perti
 */

//Clase derivada extens clase base 
//Subclase
public class Estudiante extends Persona {
    private String NC; 

   
  public Estudiante (){
      super (); 
  }
    public Estudiante(String NoM, String ApE, int EdA,String NC) {
       super (); 
        this.NC = NC ; 
    }

    
    public String getNC() {
        return NC;
    }

    public void setNC(String NC) {
        this.NC = NC;
    }
    
    
}
