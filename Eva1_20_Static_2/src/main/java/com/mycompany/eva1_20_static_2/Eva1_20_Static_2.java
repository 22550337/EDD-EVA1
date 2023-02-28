/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_20_static_2;

/**
 *
 * @author Perti
 */
public class Eva1_20_Static_2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        final int x;
        x = 100; 
     FormulaGeometrica formulas = new FormulaGeometrica();
     //formulas. no existe ningun metoo dentro del objeto 
     System.out.println ("Mi Pi = "+FormulaGeometrica.Pi); 
     System.out.println("Area triangulo = "+FormulaGeometrica.AreaT(4, 6));
     System.out.println ("Volumen Esfera = "+FormulaGeometrica.VolE(5));
    }
}
