/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_25_has.a.direction;

/**
 *
 * @author Perti
 */
public class Eva2_25_hasADirection {

    public static void main(String[] args) {
        Persona perso = new Persona (); 
       perso.setNoM("Angel");
       perso.setApellido("Martinez");
       perso.setEdad(18);
       
      /* Direccion direccion =new Direccion (); 
       direccion.setCalle("Av. industrias");
       direccion.setNumero(11101);
       direccion.setColonia("complejo industrial Chihuahua");
       direccion.setCP("31135");
       direccion.setCiudad("Chihuahua");
       direccion.setEstado("Chihuahua");
       perso.setDireccion(direccion);*/
      
       perso.ImprimirD();
    }
}

class Direccion{
    private String Calle; 
    private int Numero; 
    private String Colonia; 
    private String CP; 
    private String Ciudad; 
    private String Estado; 

    public Direccion(){
        this.Calle = "_____";
        this.Numero = 0 ;
        this.Colonia = "_____";
        this.CP = CP;
        this.Ciudad = "______";
        this.Estado = "_______";
    }
    
    public Direccion(String Calle, int Numero, String Colonia, String CP, String Ciudad, String Estado) {
        this.Calle = Calle;
        this.Numero = Numero;
        this.Colonia = Colonia;
        this.CP = CP;
        this.Ciudad = Ciudad;
        this.Estado = Estado;
    }

    public String getCalle() {
        return Calle;
    }

    public int getNumero() {
        return Numero;
    }

    public String getColonia() {
        return Colonia;
    }

    public String getCP() {
        return CP;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    public void ImPD(){
        System.out.println("Direccion:");
         System.out.println(Calle + " # "+ Numero+", "+Colonia + "\n C.P "+CP+", "+ Ciudad+", "+Estado);
    }
    
}

class Persona {
    private String NoM;
    private String Apellido;
    private int Edad; 
    private Direccion direccion ; //
    
    public Persona (){
    this.NoM = "_____";
        this.Apellido = "_____";
        this.Edad = 0;
        this.direccion = null;//Se da la orden de que no existe el objeto Direccion    
    }

    public Persona(String NoM, String Apellido, int Edad, Direccion direccion) {
        this.NoM = NoM;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.direccion = direccion;
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setNoM(String NoM) {
        this.NoM = NoM;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public void ImprimirD(){
       System.out.println("Persona:");
       System.out.println(NoM+" "+Apellido+ " "+
               Edad + " años");
       if (direccion == null )
           System.out.println(NoM +" "+Apellido+ " No tiene direccion ");
       else 
       direccion.ImPD();
    }
    
}

class Sucursal {
        private String NoMSucursal; 
        private Direccion direccion; 
}