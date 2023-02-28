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
public class ClaseC {
    public int publicC; 
    int defaultC; 
    private int privateC; 
    
   public void prueba(){
      ClaseA objA = new ClaseA();
     //objD.publicD; Atributoos visibles 
     //objD.defaultD;
      ClaseB objB = new ClaseB(); 
      //ClaseB objB = new ClaseB();
      //objB.defaultB; 
      //objB.publicB;ATRIBUTOS VISIBLES
      
      ClaseD objD = new ClaseD (); 
       //objD.publicD; Atributoos visibles 
       //objD.defaultD;
       
       ClaseE objE = new ClaseE ();   
       //objE.publicE; Atributos visibles 
       //El aspecto default solo es visible en el mismo paquete
   } 
    
}

class ClaseD{
    public int publicD; 
    int defaultD; 
    private int privateD; 
}