/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_8_llamada_funcion;

/**
 *
 * @author Perti
 */
public class Eva1_8_Llamada_funcion {

    public static void main(String[] args) {
        System.out.println("Inicia main ()");
        A(); //Llamada a función 
        System.out.println("Termina main ()");
    }
    public static void A (){
        System.out.println("Inicia A ()");
        B(); //Llamada a función 
        System.out.println("Termina A ()");
    }
    public static void B (){
        System.out.println("Inicia B ()");
        System.out.println("Termina B ()");
    }
}
