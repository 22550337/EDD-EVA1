/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_16_sobrecarga_2;

/**
 *
 * @author Perti
 */
public class Eva1_16_Sobrecarga_2 {

    public static void main(String[] args) {
        System.out.println("Suma = "+ SuM (4,5));
        System.out.println("Suma = "+SuM(4.0,5.5));
        System.out.println("Suma = " + SuM("Hola ","Mundo"));
        SuM(); 
    }
                             //Suma int int 
    public static int SuM (int Va1, int Va2 ){
        return Va1 + Va2; 
    }
                            //Suma (double, double)
    public static double SuM (double Va1, double Va2 ){
        return Va1 + Va2; 
    }
                             //Suma (String String) 
    public static String SuM (String Va1, String Va2 ){
        return Va1 + Va2; 
    }
    public static void SuM (){
         System.out.println("Método sin parámetros suma");
    }
}
