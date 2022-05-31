
package main;

import java.util.Scanner;
import main.Entidades.Cadena;


public class MainGuia6Ejer8 {

 
    public static void main(String[] args) {

    Scanner leer =new Scanner(System.in).useDelimiter("\n");

    
    Cadena c1= new Cadena();
    System.out.println("Ingrese una frase:");
    c1.setFrase(leer.next());
    c1.setLongitud(c1.getFrase().length());
    

    System.out.println("La frase " + c1.getFrase() + " tiene " + c1.mostrarVocales() + " vocales.");
    System.out.println("Escrita invertida es "); 
    c1.invertirFrase();

    System.out.println("");

    System.out.println("Ingrese un caracter que quiera encontrar DENTRO de la frase: " + c1.getFrase());
    String caract=leer.next();
    c1.vecesRepetido(caract);
    
    System.out.println("Ingrese una frase para COMPARAR SU LONGITUD con: " + c1.getFrase());
    String compara=leer.next();
    c1.compararLongitud(compara);
    
    System.out.println("Ingrese una frase para CONCATENARLA con: " + c1.getFrase());
    String concatena=leer.next();
    c1.unirFrases(concatena);
    
    System.out.println("Ingrese una LETRA para que REEMPLACE a la letra a en la frase: " + c1.getFrase());
    String letra=leer.next();
    c1.reemplazar(letra);
      
    System.out.println("Ingrese un caracter que quiera encontrar DENTRO de la frase: " + c1.getFrase());
    String letter=leer.next();
    if (c1.contiene(letter)== true) { System.out.println("El caracter esta!");}
    else {System.out.println("El caracter NO esta");}
    
    }
    
    
    
    
        }
