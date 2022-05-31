
package main;

import main.Entidades.Rectangulo;

public class MainGuia6Ejer4 {

    public static void main(String[] args) {
 
        Rectangulo r1= new Rectangulo();
        
        r1.crearRectangulo();
        
        r1.dibujo(r1.getBase(), r1.getAltura());
        
        System.out.println("El perimetro del rectanulo es " + r1.perimetro(r1.getBase(),r1.getAltura()));
        
        System.out.println("El area del rectangulo es " + r1.superficie(r1.getBase(), r1.getAltura()));
        
    }
    
}
