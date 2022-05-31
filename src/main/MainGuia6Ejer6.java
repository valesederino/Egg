
package main;

import java.util.Scanner;
import main.Entidades.Cafetera;


public class MainGuia6Ejer6 {


    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);

        Cafetera c1= new Cafetera();

        c1.llenarCafetera();
    
        System.out.println("Recuerde que tenemos una cafetera de 200 ml de capacidad...");
        System.out.println("Ingrese el tamanio de la taza donde quiere servir el cafe");

        c1.servirTaza(leer.nextInt());
        
        c1.vaciarCafetera();
        
        System.out.println("Ingrese la cantidad de cafe que desea ingresar a la cafetera");
        c1.agregarCafe(leer.nextInt());
        
        
    }
    
}
