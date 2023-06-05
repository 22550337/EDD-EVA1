/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_10_escribir_archivos_txt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Perti
 */
public class Eva3_10_Escribir_Archivos_Txt {

    public static void main(String[] args) {
        
        String ruta = "C:\\Texto_Poo\\ "; 
        
        
        try{
        writeUsingFiles(ruta+"Archivos Files.txt","Vallio madres compradre, ya me perdi"); 
        writeUsingFileWriter(ruta+"Archivo FileWriter.txt","Prueba de archivo"); 
        writeUsinigBufferedWriter(ruta+"Archivo BufferedWriter.txt","Prueba de BufferedWriter"); 
        }catch (IOException ex){
            Logger.getLogger(Eva3_10_Escribir_Archivos_Txt.class.getName()).log(Level.SEVERE,null,ex);
                    
        }
    }
    
    public static void writeUsingFiles(String ruta, String datos) throws IOException{
        Path path = Paths.get(ruta); 
        Files.write(path, datos.getBytes()); 
    }
    
    public static void writeUsingFileWriter (String Ruta, String datos) throws IOException{
        File file = new File(Ruta); 
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(datos);
        fileWriter.close();
    }
    
    public static void writeUsinigBufferedWriter(String ruta, String datos) throws IOException{
        File file = new File (ruta); 
        FileWriter fileWriter = new FileWriter (file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); 
        for (int i = 0;  i < 10; i++) {
           bufferedWriter.write(datos);
           bufferedWriter.write((i+1)+" "+datos);
           bufferedWriter.write("\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
