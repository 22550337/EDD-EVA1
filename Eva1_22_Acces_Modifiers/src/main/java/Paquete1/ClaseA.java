/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author Perti
 */
public class ClaseA {
    public int publicA; 
    int defaultA; 
    private int privateA; 
    
    public void prueba(){
       ClaseB objB = new ClaseB();
      //objB.defaultB; 
      //objB.publicB;ATRIBUTOS VISIBLES 
      
       ClaseC objC = new ClaseC ();
       //objC.publicC; Atributos visibles
       //objC.defaultC
       
       //Clase D es default en otro archivo 
       //pero mismo paquete 
       ClaseD objD = new ClaseD (); 
       //objD.publicD; Atributoos visibles 
       //objD.defaultD;
       
       //Es necesario agregar el import para usar la claseE
       ClaseE objE = new ClaseE ();   
       //objE.publicE; Atributos visibles 
       //El aspecto default solo es visible en el mismo paquete
       
        //Al ser de dominio defaul no es visible en este paquete
       //ClaseF objF = new ClaseF ();
       
    }
}

class ClaseB{
    public int publicB; 
    int defaultB; 
    private int privateB; 
}
