/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_13_alcance;

/**
 *
 * @author Perti
 */
public class Eva1_13_alcance {

    public static void main(String[] args) {
        int x = 100; //se puede usar en cualquier espacio del main ya que no esta anidada 
        
        for (int i = 0; i < 10; i++)
        {
        System.out.println("x = "+x);
            System.out.println("I =" + i );
         
            int j = 100; //Apartir de aqui es visible la J 
            {
            int z = 10; 
            System.out.println("z = "+z);
        }//aqui termina el alcance de la varibale Z 
            System.out.println("j = "+j);
        }//Termina el bloque for 
    /*System.out.println("i = "+i);//No  esta declarada fuera del bloque for */
    System.out.println("x = "+x);//Demuestra que es utilizable en todo el main 
    }
    public void algo (){//No es del alcance de la variable X 
        System.out.println("x = " );
    }
}
