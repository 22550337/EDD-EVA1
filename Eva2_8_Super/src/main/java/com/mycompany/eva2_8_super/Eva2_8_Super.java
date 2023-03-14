/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_8_super;

/**
 *
 * @author Perti
 */
public class Eva2_8_Super {

    public static void main(String[] args) {
        Animal animal = new Animal ("aadal",10); 
       Mamifero mamifero = new Mamifero ("Negro","AXASXA",10); 
       Canes Can = new Canes (); 
      
    }
}

class Animal {
    private String NoM; 
    private int PeSo;

    public Animal (){
       System.out.println("Its Alive!!!");
       
    } 
    
    public Animal(String NoM, int PeSo) {
        this.NoM = NoM;
        this.PeSo = PeSo;
       System.out.println("Its Alive!!!");
    }
    
 
    public void respirar (){
        System.out.println("Estoy respirando!");
    }

    public String getNoM() {
        return NoM;
    }

    public int getPeSo() {
        return PeSo;
    }

    public void setNoM(String NoM) {
        this.NoM = NoM;
    }

    public void setPeSo(int PeSo) {
        this.PeSo = PeSo;
    }
    
}

class Mamifero extends Animal {
    private String CRP; //Color de pelo 
    
 public Mamifero (){
     // Super ---> Es un un apuntador a la superclase
     //Lo primero a llamar en un constructor es llamar 
     //al constructor de la super clase 
     super.respirar();//Llamada al constructor default 
     System.out.println("Soy un Mamifero");   
 }
 
    public Mamifero(String CRP, String NoM, int PeSo) {
        super(NoM,PeSo);//Llamada al constructor de la super clase 
        this.CRP = CRP;
        System.out.println("Soy un Mamifero constructor 2"); 
    }

    public String getCRP() {
        return CRP;
    }

    public void setCRP(String CRP) {
        this.CRP = CRP;
    }
    
}

class Canes extends Mamifero{

    public Canes() {
        super(); 
        System.out.println("Soy un Can !!"); 
    }
    
}