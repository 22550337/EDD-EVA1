/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_4_formato_apa;

/**
 *
 * @author Perti
 */
public class Documento {
    private String Autor; 
    private String Titulo; 
    private int Año; 
    private String Mes; 
    private int Dia; 
    private String Ciudad; 

    public Documento(String Autor, String Titulo, int Año, String Mes, int Dia, String Ciudad) {
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.Año = Año;
        this.Mes = Mes;
        this.Dia = Dia;
        this.Ciudad = Ciudad;
    }

    public String getAutor() {
        return Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public int getAño() {
        return Año;
    }

    public String getMes() {
        return Mes;
    }

    public int getDia() {
        return Dia;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    
    
}
