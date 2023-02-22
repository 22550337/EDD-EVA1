/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_12_calieu;

import javax.swing.JOptionPane;

/**
 *
 * @author Perti
 */
public class Eva1_12_CaliEU {

    public static void main(String[] args) {
        String caL; 
        caL = CaL(85); //Almacenar el resultado dentro de una variable
        System.out.println("Calificación para 85 = "+caL);//Resultado de la variable almacenada 
        System.out.println("Calificación para un 70 = "+CaL(70));//Invocación dentro de otra función 
        CaL(100); //Ignoro el resultado 
    }
    public static String CaL (int CaLi){
        if ((CaLi >= 91) && (CaLi <= 100)){
            return "A"; 
        }else if ((CaLi >= 81) && (CaLi <= 90)){
            return "B"; 
        }else if ((CaLi >= 71) && (CaLi <= 80)){
            return "C"; 
        }else {
            return "D"; 
        }
    }
}
