/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_4_formato_apa;

import java.util.logging.Logger;

/**
 *
 * @author Perti
 */
public class Libro extends Documento {
  private String Editorial; 
    private String Pagina; 
    
    public Libro(String Autor, String Titulo, int Año, String Mes, int Dia, String Ciudad) {
        super(Autor, Titulo, Año, Mes, Dia, Ciudad);
    }

    Libro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
