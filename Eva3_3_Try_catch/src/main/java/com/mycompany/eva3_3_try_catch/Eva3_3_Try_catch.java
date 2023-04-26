/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_3_try_catch;

/**
 *
 * @author Perti
 */
public class Eva3_3_Try_catch {

    public static void main(String[] args) {
        int x = 5, y= 0;
        try{
        int resu = x/y;
        System.out.println("Resultado es = "+resu);
    
    }catch (ArithmeticException e){
        System.out.println("Exception"+ e.getMessage()); 
    }
        
    }
    
    
}
