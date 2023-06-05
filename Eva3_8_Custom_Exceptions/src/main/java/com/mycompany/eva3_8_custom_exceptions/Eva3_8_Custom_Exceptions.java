    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_8_custom_exceptions;

/**
 *
 * @author Perti
 */
public class Eva3_8_Custom_Exceptions {

    public static void main(String[] args) {
        persona Perso = new persona ();
        Perso.setNoM("Angel");
        Perso.setApellido("Martinez");
        try{
        Perso.setEdad(-10);
        }catch (DatoEntradaCheckeEx e){
            System.out.println(e.getMessage());
        }
    }
}

class persona {
    private String NoM; 
    private String Apellido; 
    private int Edad; 

    public persona (){
        this.NoM = " ";
        this.Apellido = " ";
        this.Edad = 0;
    }
    
    public persona(String NoM, String Apellido, int Edad) {
        this.NoM = NoM;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }

    public String getNoM() {
        return NoM;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setNoM(String NoM) {
        this.NoM = NoM;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEdad(int Edad) throws DatoEntradaCheckeEx {
        if (Edad < 0)
            //throw new DatoEntradaException(); ---Unchecked
            throw new DatoEntradaCheckeEx(); 
        this.Edad = Edad;
    }
    
}

class DatoEntradaException extends RuntimeException{

    public DatoEntradaException() {
        super("Dato de entrada incorrecto!! El valor debe ser positivo"); 
    }
    
}


class DatoEntradaCheckeEx extends Exception{

    public DatoEntradaCheckeEx() {
        super("Datp de entrada incorrecto!! El valor debe ser positivo"); 
    }
    
}