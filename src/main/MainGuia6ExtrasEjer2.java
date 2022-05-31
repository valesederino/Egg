
package main;

import java.util.Scanner;
import main.Entidades.Punto;


public class MainGuia6ExtrasEjer2 {


    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        Punto p1= new Punto();
        
        p1.crearPuntos();
        
        System.out.println("La distancia entre los dos puntos es " + p1.calcularDistancia());
        
        
    }
    
}
