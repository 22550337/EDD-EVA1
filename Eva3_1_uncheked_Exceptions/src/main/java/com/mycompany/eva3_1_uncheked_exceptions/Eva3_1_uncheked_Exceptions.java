/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_1_uncheked_exceptions;

import java.util.Scanner;

/**
 *
 * @author Perti
 */
public class Eva3_1_uncheked_Exceptions {

    public static void main(String[] args) {
        //Son todas de RUNTIMEEXCEPTION
        
        
        //Aritmetic Exception: 
        //division entre cero 
       System.out.println("Iniciando el programa");
        int x = 5, y= 0;
        System.out.println("Inicializando las variable");
        int resu = x/y; 
        
        System.out.println("Calculando la division ");
        System.out.println("Division = "+resu);
        
       Scanner input = new Scanner (System.in); 
       System.out.println("Introduce un numero: ");
       int nume = input.nextInt(); 
       System.out.println("Tu numero es = " + nume);
       
       //Indexoutofbounds Exception
       
       int [] arreglo = new int [5]; //0 - (N-1)
       arreglo [0] = 100; 
       arreglo [1]= 200; 
       arreglo [2]=300; 
       arreglo [3]=400;
       arreglo [4]=500;
       arreglo [5]=600; //Error de lógica 5 no es una posicion valida 
       
       //Nullpointer Exception 
       prueba objPrueba = null; 
       
       System.out.println("Valor de x ="+objPrueba.x);
    }
    
}

class prueba {
    public int x = 100; 
}
