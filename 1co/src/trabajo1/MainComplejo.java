/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo1;

/**
 *
 * @author JAVIER
 */
public class MainComplejo {
    
    public static void main(String[] args) {
        Complejo n1 =  new Complejo(4, 7);
        Complejo n2 = new Complejo(2, 8);
        
        Complejo sumaComplejo =  n1.Suma(n2);
        Complejo resstComplejo =  n1.Resta(n2);
        
        System.out.println("Resultad de la suma : " +n1.toFloatString()+" + " +n2.toFloatString()+" = " +sumaComplejo.toFloatString());
        System.out.println("Resultad de la resta : " +n1.toFloatString()+" - " +n2.toFloatString()+" = " +resstComplejo.toFloatString());
    }
    
}
