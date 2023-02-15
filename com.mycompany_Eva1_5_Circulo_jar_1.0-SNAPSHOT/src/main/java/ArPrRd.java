/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Perti
 */
public class ArPrRd {
    private double ArE;
    private double PeR; 
    private double RaD; 
    
    //Constructores 
    public ArPrRd (){
       PeR = 0;  
        RaD =4; 
        ArE = 0; 
    }
    
    public void ArEa (){//operación para el area del circulo
        
        
    }
    public void PeRi(){//Operación para el perimetro del circulo 
        PeR =2*Math.PI*RaD; 
        System.out.println("El perimetro es = "+PeR);
    }
    
  
}
