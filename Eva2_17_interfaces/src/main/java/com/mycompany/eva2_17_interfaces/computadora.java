/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_17_interfaces;

import java.util.logging.Logger;

/**
 *
 * @author Perti
 */
public class computadora {
    private String procesador; 
   private int memoria; 

    public computadora(String procesador, int memoria) {
        this.procesador = procesador;
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
   
   public void ImPDatos (){
System.out.println("Nombre es: ");
System.out.println("La edad es: ");
System.out.println("El procesador es: "+procesador);
System.out.println("La memoria es de: "+memoria);
}
   
}
