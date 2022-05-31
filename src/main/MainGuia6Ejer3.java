
package main;

import main.Entidades.Operacion;


public class MainGuia6Ejer3 {


    public static void main(String[] args) {
    
        Operacion op1= new Operacion();
        
        op1.crearOperacion();
              
        System.out.println("Voy a presentar diferentes operaciones entre los dos numeros ingresados:");
   
        System.out.println("La suma es " + op1.sumar());
        
        System.out.println("La resta es " + op1.restar());
        
        System.out.println("La multiplicacion es " + op1.multiplicar());
        
        System.out.println("La division es " + op1.dividir());
        
    }
    
    
    
    
}
