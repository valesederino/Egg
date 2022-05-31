
package main;

import java.util.Scanner;


public class MainGuia6ExtrasEjer5 {

   
    public static void main(String[] args) {
  
        String [] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto= mes[9];
        Scanner leer = new Scanner(System.in);
        boolean bandera=true;
        System.out.println("Ingrese un mes, a ver si adivina el que tengo en mente: ");
        
        do {            
            String adivina= leer.next();    
        
            if (adivina.equals(mesSecreto)){System.out.println("Adivino!"); break; }
            else {System.out.println("Lo lamento. Intente otra vez: "); bandera=true;}
        
        } while (bandera=true);
            
   }
        
    
    
}
