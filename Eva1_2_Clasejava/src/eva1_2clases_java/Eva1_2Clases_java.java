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
public class Eva1_2Clases_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Clase es la receta: 
        //Objetos es el platillo 
        //Intantaciación:
        //1.Declarar la identificador para el objeto 
        //2.Asignar memoria con new
        //3. Invocar su constructor
        //Persona () --> constructor;
        //constructor --> método
        Persona person1 = new Persona(); 
        /*
        //Esta sección 
        person1.NoM = "Angel"; 
        person1.Apell = "Martinez"; 
        person1.Eda = 18;
        person1.EsTaCvL = true;  //True es soltero 
        
        System.out.println(person1.NoM );
        System.out.println(person1.Apell);
        System.out.println(person1.Eda);
       System.out.println(person1.EsTaCvL);*/
        
       person1.setNoM("Angel Roberto");
       person1.setApell("Martinez Montes");
       person1.setEda(18);
       person1.setEsTaCvL(true);
       
       person1.ImPDat();
       
       
      /* 
       System.out.println(person1.getNoM());
      System.out.println(person1.getApell());
      System.out.println(person1.getEda());
      System.out.println(person1.getEsTaCvL());*/
      
      //Persona 2
       Persona person2 = new Persona(); 
       
       person2.setNoM("Daniela");
       person2.setApell("piñon polanco");
       person2.setEda(18);
       person2.setEsTaCvL(true);
       person2.ImPDat();
    }
    
}
