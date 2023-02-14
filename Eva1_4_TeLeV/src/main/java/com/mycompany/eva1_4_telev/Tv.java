/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_4_telev;

/**
 *
 * @author Perti
 */
public class Tv {
    private boolean Pw; 
    private int VoL; 
    private int CaN; 
    
    //Constructores
    public Tv (){//constructor defaul 
        VoL = 2; 
        Pw = false; //apagado 
        CaN = 100; 
    }
    //Metodos para operar la TV
    //Encender y apagar la TV 
    public void EnAp (){   //cambiar estado de poder 
        //verificar el estado de la TV
        if (Pw == true){
            Pw = false;  
            System.out.println("Apagando la pantalla");
        }//Si hay mas de una instruccion se agregan las llaves 
        else{
            Pw = true ;
            System.out.println("Endendiendo la pantalla");
        } //linea 29
    }
    //Volumen 
    public void SuBvOl (){
        if (Pw == true)//Dar la función solo se puede subir cuando esta prendida
            //No debemos de pasar de 100
            if (VoL < 100){
                VoL ++; //Acumulador
        System.out.println("Volumen = "+VoL);
            }
        
    }
    public void BaJvOl (){
        if (Pw == true)//Lo mismo, "solo funcionara cuando la tele este prendida"
            if (VoL > 0){
        VoL--; //Acumulador 
        System.out.println("Volumen = "+VoL);
            }
    }
    public void SuBcAn (){
        if (Pw == true)
           CaN++; 
            if (CaN > 100){
            CaN=0;
             System.out.println("Canal = "+CaN);
            }
    }
    public void BaJcAn (){
        if (Pw == true )
            CaN--; 
            if (CaN < 0){
                CaN = 100; 
                System.out.println("Canal = "+CaN);
            }
        
    }
}
