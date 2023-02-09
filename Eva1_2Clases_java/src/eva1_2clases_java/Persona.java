/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2clases_java;

/**
 *
 * @author Perti
 */
public class Persona {
    //Atributos de la clase 
    private String NoM; 
    private String Apell;
    
    private int Eda; 
    
    private boolean EsTaCvL; 
    //Metodos : comportamiento
    //Lectura y esscritura de atributos 
    //Métodos get --> leer, método set -->escribir 
    //métodos: 
    //Modificador valor de retorno nombre(argumentos)(implementación)
    public String getNoM(){
        return NoM; 
    }
    public void setNoM(String valor){
        NoM = valor;      
    }
    public String getApell(){
    return Apell; 
}
    public void setApell(String valor){
        Apell = valor; 
    }
   public int getEda(){
   return Eda;     
   }
   public void setEda(int valor){
       Eda=valor; 
   }
   public boolean getEsTaCvL(){
       return EsTaCvL; 
   }
   public void setEsTaCvL (boolean valor){
       EsTaCvL = valor; 
   }
   
   public void ImPDat(){
       //Concatenación 
       System.out.println("Datos almacenados ");
       System.out.println("Nombre completo " + NoM + " " +Apell);
       System.out.println("Edad: "+Eda);
       
       if(EsTaCvL = true)
        System.out.println("Estado civil: soltero ");
       else 
       System.out.println("Estado civil: casado ");
      
   }
}
