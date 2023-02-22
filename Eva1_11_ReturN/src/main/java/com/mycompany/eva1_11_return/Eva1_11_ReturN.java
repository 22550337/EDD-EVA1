/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_11_return;

/**
 *
 * @author Perti
 */
public class Eva1_11_ReturN {

    public static void main(String[] args) {
        int ReS; 
        ReS = square (10); //Invocación o llamada a función 
        System.out.println("Resultado = "+ReS);
    }
    public static  int square (int num){//Metodo square int num 
        
       return num * num; //Regresar un valor
       
    }
}
