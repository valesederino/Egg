
package main;

import java.util.Scanner;
import main.Entidades.Arreglo;

public class MainGuia6Ejer10 {

   
    public static void main(String[] args) {

        Arreglo a1= new Arreglo();
        Scanner leer = new Scanner(System.in);
        
        a1.crearArreglos();
        
        a1.mostrarxPantalla();
        
        a1.mostrasdeMeaMa(a1.getA(), a1.getB());
    }
    
}
