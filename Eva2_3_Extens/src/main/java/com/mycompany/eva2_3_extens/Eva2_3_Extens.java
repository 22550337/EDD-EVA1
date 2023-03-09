/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_3_extens;

/**
 *
 * @author Perti
 */
public class Eva2_3_Extens {

    public static void main(String[] args) {
       
      Estudiante estu = new Estudiante();  
      estu.setNoM("Angel");
      estu.setApE("Martinez");
      estu.setNC("22550337");
      estu.setEdA("18");
      
      System.out.println("Imprimir Datos");
      System.out.println("Nombre: "+estu.getNoM());
      System.out.println("Apellido: "+estu.getApE());
      System.out.println("Numero de control "+estu.getNC());
      System.out.println("Edad: "+estu.getEdA());
      //--------------
      
      Proveedores prove = new Proveedores ();
      
      prove.setNoM("Roberto");
      prove.setApE("Montes");
      prove.setRfC("MAMA040922");
      prove.setEdA("18");
      
      System.out.println("Imprimir Datos del proveedor");
      System.out.println("Nombre: "+estu.getNoM());
      System.out.println("Apellido: "+estu.getApE());
      System.out.println("Numero de control "+estu.getNC());
      System.out.println("Edad: "+estu.getEdA());
      
    }
}
