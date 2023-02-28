/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_19_static;

/**
 *
 * @author Perti
 */
public class Eva1_19_Static {

    public static void main(String[] args) {
        //Static es algo que podemos usar sin crear instancias de una clase 
        System.out.println("Pi = " + Math.PI);
        System.out.println("Numeros aleatorios = "+Math.random());
        Utilerias utileria = new Utilerias (); 
        utileria.saludo();
        Utilerias.OtroS();
        /*Saludo2. no existe*/ 
    }
    public void saludo2 (){
       System.out.println ("Hola"); 
    }
}






class Utilerias {
    //Este método existe hasta que se cra un objeto de la 
    //Clase. Solo se usa atraves de un objeto 
 public void saludo (){
     System.out.println("Hola :)"); 
 }
 //El método OtroS existe en el momento que el programa
 //inicia su ejecución. No necesita que se cree un objeto 
 //de la clase para poder utilizarlo. Se usa atraves de la clase 
 public static void OtroS(){
     System.out.println("Otro saludo (Static)");
 }
}
class OtraC{
    
}



