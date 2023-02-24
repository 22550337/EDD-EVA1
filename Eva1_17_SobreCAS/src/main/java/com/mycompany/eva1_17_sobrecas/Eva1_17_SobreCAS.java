/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_17_sobrecas;

/**
 *
 * @author Perti
 */
public class Eva1_17_SobreCAS {

    public static void main(String[] args) {
       System.out.println("Area del circulo = "+ArE(4.5));
       System.out.println("Area del Tringulo ="+ArE(5,5)); 
       System.out.println("Area del trapecio = "+ArE(5,6,5));
    }
    //Area circulo
    public static double ArE( double R){
        return  Math.PI *R; 
    }
    public static double ArE (double BE, double Aa){
        return (BE*Aa)/2; 
    }
    public static double ArE (double B, double h,double b){
        return (h*(B*b))/2;  
    }
}
