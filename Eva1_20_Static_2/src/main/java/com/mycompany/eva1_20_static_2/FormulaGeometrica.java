/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_20_static_2;

/**
 *
 * @author Perti
 */
public class FormulaGeometrica {
    //Constante 
    //final --> significado para clase 
    //           Significado para variables: solo pueden aignar una 
    //            vez un valor 
    public static final double Pi = 3.14159;
    //Area 
    public static double AreaT(double base, double altura){
        return (base * altura)/2; 
    }
    public static double AreaC(double radio){
        return Pi * radio *radio ; 
    }
    //Perimetro 
    public static double PerC(double radio){
        return Pi *(radio *2); 
    }
    //Volumen 
    public static double VolE(double radio){
        return (4.0/3.0)* Pi *(radio *radio*radio); 
    }
}
