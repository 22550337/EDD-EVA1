/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_18_sobrecrfc;

/**
 *
 * @author Perti
 */
public class Eva1_18_sobreCRFC {

    public static void main(String[] args) {
    
       System.out.println(GRFC("Angel","Martinez","Montes", 2004, 9, 22));
    }
    public static String GRFC(String NoM, String ApP,String ApM, int Añ, int Me, int Di){
       String ap = ApP.charAt(0)+ " "; 
       String ap2 = ApP.charAt(1) + " ";
       String apM = ApM.charAt(0) + " ";
       String nomb =NoM.charAt(0) + " "; 
       String RfC = ap + apM + nomb + Añ + Me + Di;
       return RfC; 
    }
}
