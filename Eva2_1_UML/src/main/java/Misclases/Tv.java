/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Misclases;

/**
 *
 * @author Perti
 */
public class Tv {
    boolean Pw; 
    int VoL; 
    int CaN; 
    
    public void getEnAp(){
        if(Pw == true){
            Pw=false; 
            System.out.print("Apagando pantalla ");
        }
        else {
            Pw = true; 
            System.out.print("Encendiendo pantalla");
        }
    }
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
