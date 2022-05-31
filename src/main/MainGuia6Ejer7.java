
package main;

import java.util.Scanner;
import main.Entidades.Persona;

public class MainGuia6Ejer7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int sumabajo=0, sumaideal=0, sumasobre=0, sumamayor=0, sumamenor=0;
        double porcentaje;
        boolean bandera;
                
        Persona p1= new Persona();
        Persona p2= new Persona();
        Persona p3= new Persona();
        Persona p4= new Persona();        
   
        p1.crearPersona();
        p1.calcularIMC();
        p1.esMayorDeEdad();
        
        
        p2.crearPersona();
        p2.calcularIMC();
        p2.esMayorDeEdad();
        

        p3.crearPersona();
        p3.calcularIMC();
        p3.esMayorDeEdad();
        
        if (p1.getImc()==1) { sumabajo+=1;}
        if (p2.getImc()==1) { sumabajo+=1;}
        if (p3.getImc()==1) { sumabajo+=1;}

        if (p1.getImc()==2) { sumaideal+=1;}
        if (p2.getImc()==2) { sumaideal+=1;}
        if (p3.getImc()==2) { sumaideal+=1;}
        if (p1.getImc()==3) { sumasobre+=1;}
        if (p2.getImc()==3) { sumasobre+=1;}
        if (p3.getImc()==3) { sumasobre+=1;}
        
        if (p1.getEstadoedad()==1) {sumamayor+=1;}
        if (p1.getEstadoedad()==2) {sumamenor+=1;}
        if (p2.getEstadoedad()==1) {sumamayor+=1;}
        if (p2.getEstadoedad()==2) {sumamenor+=1;}
        if (p3.getEstadoedad()==1) {sumamayor+=1;}
        if (p3.getEstadoedad()==2) {sumamenor+=1;}
        

        System.out.println("Informe FINAL");
        
        System.out.println("El porcentaje de gente con BAJO peso es de " + (sumabajo*100/3));
        System.out.println("El porcentaje de gente con peso IDEAL es de " + (sumaideal*100/3)); 
        System.out.println("El porcentaje de gente con SOBREpeso es de " + (sumasobre*100/3));  
        
        System.out.println("La cantidad de mayores de edad es " + sumamayor); 
           System.out.println("La cantidad de menores de edad es " + sumamenor); 
       
       
        
        
    }
    
  
}
    


