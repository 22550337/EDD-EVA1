/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_3_constructores;

/**
 *
 * @author Perti
 */
public class CuentaBancaria {
    //Datos personales 
    private String CliNt;
    private String NuMcU; 
    private double SaL; 
    //Constructores 
    //defaul y con argumentos
    public CuentaBancaria(){//costructor defaul 
        NuMcU = "---";
        SaL = 0; 
      CliNt = "----"; 
    }
    public CuentaBancaria (String NmC,double Sl,String NomC){
        NuMcU = NmC; 
        SaL = Sl; 
        CliNt = NomC; 
    }
    
    //Comportamiento 
    public String getCliNt (){
        return CliNt; 
    }
    public void setCliNt(String Dato){
        CliNt = Dato; 
    }
    public String getNuMcU(){
         return NuMcU; 
    }
    public void setNuMCu (String Dato){
        NuMcU = Dato; 
    }
    public double getSaL (){
        return SaL; 
    }
    public void setSal (double Dato){
        SaL = Dato; 
    }
    
    
        
}
