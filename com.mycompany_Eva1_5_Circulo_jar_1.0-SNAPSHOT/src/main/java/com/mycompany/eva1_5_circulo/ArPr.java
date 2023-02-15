/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_5_circulo;

/**
 *
 * @author Perti
 */
public class ArPr {
    private double ArE;
    private double PeR; 
    private int  RaD; 
    
    //Constructores 
    public ArPr (){
       PeR = 0;  
       RaD = 4; 
        ArE = 0; 
    }
    
    public void ArEa (){//operación para el area del circulo
        ArE = (Math.PI)* (RaD^2); 
        System.out.println("El area es ="+ArE);
        
    }
    public void PeRi(){//Operación para el perimetro del circulo 
        PeR =2*Math.PI*RaD; 
        System.out.println("El perimetro es = "+PeR);
    }
}
