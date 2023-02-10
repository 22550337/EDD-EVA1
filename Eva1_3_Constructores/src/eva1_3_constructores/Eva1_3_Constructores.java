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
public class Eva1_3_Constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaBancaria client1 = new CuentaBancaria("1", 1000, "Angel Martinez"); 
        
        //Datos por almacenar 
        
        /*client1.setCliNt("Angel Martinez ");
        client1.setNuMCu("22550337");
        client1.setSal(890.40);*/
        
        System.out.println("Datos del cliente:");
        
         System.out.println(client1.getNuMcU());
       String NoMC= client1.getCliNt(); 
       System.out.println(NoMC);
       System.out.println(client1.getSaL());
       
       CuentaBancaria client2 = new CuentaBancaria("2",98.40 , "Paco Anchondo"); 
       
       System.out.println("Datos del cliente:");
        
       
     System.out.println(client2.getNuMcU());
     String NoMc = client2.getCliNt(); 
     System.out.println(NoMc);
     System.out.println(client2.getSaL());
     
     CuentaBancaria client3 = new CuentaBancaria("3", 754.89, "Hassa Gomez"); 
     
     System.out.println("Datos del Cliente:");
     
      System.out.println(client3.getNuMcU());
     String Nomc = client3.getCliNt(); 
     System.out.println(Nomc);
     System.out.println(client3.getSaL());
    }
    
}
