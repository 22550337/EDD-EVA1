/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_7_this;

/**
 *
 * @author Perti
 */
public class Eva2_7_This {

    public static void main(String[] args) {
       //ImP();
      //
    }
    public void ImP (){
//Aqui también es visible this 
}
}


//this es una referencia a una instancia de la clase 
//Todos los objetos tienen this 
//Se puede usar this en cualquier clase 
//this solo funciona iternamente dentro del objeto 
class Persona {
    private String NoM;

    public Persona(String NoM) {
        this.NoM = NoM;
        //this.NoM es el atributo de la clase 
        //Nombre es la variable (Parametro) declarado en el método 
    }
    public String getNoM() {
        return NoM;
    }

    public void setNoM(String NoM) {
        this.NoM = NoM;
    }
    public void ImPdS(){
        System.out.println("El nombre es: "+this.NoM);
        
    }
}
