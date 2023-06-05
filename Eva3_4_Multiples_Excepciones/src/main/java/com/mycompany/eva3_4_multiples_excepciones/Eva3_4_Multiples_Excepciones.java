/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Perti
 */
public class Eva3_4_Multiples_Excepciones {

    public static void main(String[] args) {
         int x,y;
         do{
        try{
         
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce el valor (entero)  de x");
        x = input.nextInt(); 
        System.out.println("Introduce el valor (entero)  de y");
        y = input.nextInt(); 
        int resu = x/y; 
        
        System.out.println("La division de " +x+" / "+y+"es = "+resu);
        break; 
        }catch (InputMismatchException e){
            System.out.println("La captura de las variables es incorecta "+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre cero "+e.getMessage());
        }
         
}while (true);         
        System.out.println("Terminamos el programa correctamete");
    }
}
