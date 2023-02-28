/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_21_static_3;

/**
 *
 * @author Perti
 */
public class Eva1_21_Static_3 {

    public static void main(String[] args) {
        System.out.println(Prueba.valor);
       Prueba.valor++; 
       System.out.println(Prueba.valor);//Si se modifico
       //Ahora con objetos 
       System.out.println();
       
       
       
    }
}

class Prueba {
    public static int valor =100; 
}
class Pobj{
    public int valor=100;
    
}
 