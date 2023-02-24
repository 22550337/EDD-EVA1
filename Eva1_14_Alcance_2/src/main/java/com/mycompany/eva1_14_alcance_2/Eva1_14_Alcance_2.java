/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_14_alcance_2;

/**
 *
 * @author Perti
 */
public class Eva1_14_Alcance_2 {

    public static void main(String[] args) {
        int x =100; //Visible dentro de todo el bloque main
        for (int i = 0; i < 10; i++){
            int x =100; //La variable ya esta declarada dentro del bloque main
            
            int y =100;//Visible en el bloque for 
            
            if (i == 5){
                
            }
            
        }
        int y = 100; //Aqui la variable "y" estara declarada en el for, pero al terminar el for puede 
                       //volver a ser utilizable
    }
    
}
