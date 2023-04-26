/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_24_collections;

import java.util.ArrayList;

/**
 *
 * @author Perti
 */
public class Eva2_24_collections {

    public static void main(String[] args) {
       
        //Collection--->contenedores 
        ArrayList miArreglo = new ArrayList () ;
        miArreglo.add(new persona()); 
        miArreglo.add(new perro()); 
        miArreglo.add(new Automovil ()); 
               
        ArrayList<Integer>miArreglo2 = new ArrayList (); 
        miArreglo2.add(200); 
        miArreglo2.add(300); 
        miArreglo2.add(400); 
        miArreglo2.add(500);
         System.out.println(" "+miArreglo2);
    }
}

class persona{
    
}
class perro{
    
}
class Automovil{
    
}