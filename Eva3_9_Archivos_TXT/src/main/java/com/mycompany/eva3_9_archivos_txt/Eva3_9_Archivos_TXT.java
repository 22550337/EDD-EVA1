/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_9_archivos_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Perti
 */
public class Eva3_9_Archivos_TXT {
final static String RUTA = "C:\\Texto_Poo\\Prueba_P.txt\\"; 
    public static void main(String[] args) {
        
             try {
                 readUsingFiles(RUTA); 
             } catch (IOException ex){
                 ex.printStackTrace();
             }
    }
    //Files se lee todo el contenido del archivo y se
    //transfiere a memoria principal (RAM)
   
    public static void readUsingFiles(String ruta) throws IOException{
        //Construimos la ruta en base a la cadena de textos 
        Path path = Paths.get(ruta); 
        
        List <String>TodasLineas = Files.readAllLines(path); 
       System.out.println("RESULTADOS: ");
        System.out.println(TodasLineas.toString());
        
        for (int i = 0; i<TodasLineas.size(); i++){
            System.out.println(TodasLineas.get(i));
        }
        
    }
    
    
}
