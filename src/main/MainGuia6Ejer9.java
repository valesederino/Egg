
package main;

import java.util.Scanner;
import main.Entidades.Matematica;

public class MainGuia6Ejer9 {


    public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
    Matematica m1 = new Matematica();
    Double mayor, menor;
    
    //m1.setNro1(Math.random()*10) esa expresion genera un nro aleatorio entre 0 y 10
    //Math.round(m1.getNro1()*100.0)/100.0); y esta obtiene solo 2 decimales
    //entonces quedaron guardados a traves de los Sets dos nros reales random entre 0 y 10 con 2 decimales
    m1.setNro1(Math.round((Math.random()*10)*100.0)/100.0);
    m1.setNro2(Math.round((Math.random()*10)*100.0)/100.0);
 
    
    System.out.println("Los valores asignados aleatoriamente son los siguientes:");
    

    System.out.println("nro1: " + m1.getNro1()); 
    System.out.println("nro2: " + m1.getNro2()); 
    
    
    if (m1.devolverMayor(m1.getNro1(), m1.getNro2())== m1.getNro1()) { mayor=m1.getNro1(); menor=m1.getNro2();}
    else { mayor=m1.getNro2(); menor=m1.getNro1();}
    
    System.out.println("De ambos valores, el MAYOR es " + mayor);
    
    System.out.println("");
    System.out.println("Tomare entonces el nro MAYOR: " + mayor  + " y lo elevare a la potencia del menor: " + menor);
    System.out.println(" pero antes debo redondearlos a: " + Math.round(m1.getNro1()) + " y " + Math.round(m1.getNro2()) );
    
    m1.calcularPotencial(m1.getNro1(),m1.getNro2());
    
    System.out.println("Finalmente, el calculo de la RAIZ CUADRADA de " + menor + " es " + (Math.round(m1.calculaRaiz(menor)*100.0))/100.0 +"");
    

    }
    

    
  
}
