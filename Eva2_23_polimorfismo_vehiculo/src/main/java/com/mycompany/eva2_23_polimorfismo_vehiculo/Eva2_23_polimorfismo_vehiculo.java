/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_23_polimorfismo_vehiculo;

/**
 *
 * @author Perti
 */
public class Eva2_23_polimorfismo_vehiculo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Automovil Auto = new Automovil ("Tesla",0,"x",2020); 
        Auto.acelerar(50);
        Auto.tablero();
        Bicicleta bici =new Bicicleta ("Montaña","XXX","Harley Davidson",0); 
        bici.acelerar(10);
        bici.tablero();
        
      public staticc void cambiarV(Vehiculo vehi,int 
  
    }
}

interface Vehiculo {
    public abstract void acelerar (int cambio ); 
    void tablero (); 
}
class vehiculo {
    private String Marca; 
    protected int Velocidad ; 
    
    public vehiculo (){
        this.Marca = "____";
        this.Velocidad = 80; 
        
    }

    public vehiculo(String Marca, int Velocidad) {
        this.Marca = Marca;
        this.Velocidad = Velocidad;
    }

    public String getMarca() {
        return Marca;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }
    
}


class Automovil extends vehiculo implements Vehiculo{
    private String Modelo; 
    private int Año; 
   
    public Automovil (){
        this.Modelo = "____"; 
        this.Año = 2004; 
    }
 
    
    public Automovil(String Modelo, int Año) {
      super(); 
        this.Modelo = Modelo;
        this.Año = Año;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getAño() {
        return Año;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    @Override
    public void acelerar(int cambio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }

    @Override
    public void tablero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
    }
    
}

class Bicicleta extends vehiculo implements Vehiculo {
    private String Tipo; 
    private int Rodada; 
    
    public Bicicleta () {
    this.Tipo = "____";
    this.Rodada = 20; 
    
}

    public Bicicleta(String Tipo, int Rodada) {
        this.Tipo = Tipo;
        this.Rodada = Rodada;
    }

    public String getTipo() {
        return Tipo;
    }

    public int getRodada() {
        return Rodada;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setRodada(int Rodada) {
        this.Rodada = Rodada;
    }

    @Override
    public void acelerar(int cambio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void tablero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}