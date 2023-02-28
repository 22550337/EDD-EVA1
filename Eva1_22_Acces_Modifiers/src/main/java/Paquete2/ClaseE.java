/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

import Paquete1.ClaseA;
import Paquete1.ClaseC;

/**
 *
 * @author Perti
 */
public class ClaseE {
    public int publicE; 
    int defaultE; 
    private int privateE; 
    
    public void prueba(){
      ClaseA objA = new ClaseA();
      //objA.publicA; Atributos visibles
      
      ClaseC objC = new ClaseC (); 
      //objC.publicC; Atributos visibles 
      
      ClaseF objF = new ClaseF();
      //objF.publicF; Atributos visibles 
      //objF.defaultF
    }
}

class ClaseF{
    public int publicF; 
    int defaultF; 
    private int privateF; 
}

