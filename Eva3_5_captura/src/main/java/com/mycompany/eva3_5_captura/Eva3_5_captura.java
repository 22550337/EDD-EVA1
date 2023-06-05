/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_5_captura;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Perti
 */
public class Eva3_5_captura {

    public static void main(String[] args) {
        int x ; 
        
        do {
            try{
                Scanner input = new Scanner (System.in);
        System.out.println("Introduce el valor (entero) de x: ");
        x =  input.nextInt();
        break; 
            }catch (InputMismatchException e){
                System.out.println("No se introdujo un valor valido, vuelve a capturar "+e.getMessage());
            }
        } while (true); 
        System.out.println("Valor de x = "+x);
        }
}
