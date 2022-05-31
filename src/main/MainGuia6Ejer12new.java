
package main;

import java.util.Scanner;
import main.Entidades.Person;



public class MainGuia6Ejer12new {


    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        Person p1= new Person();
              
        p1.crearPersona();      
        int edad=p1.calcularEdad();
        
        System.out.println("Ingrese la edad de otra persona:");
        int edad1=leer.nextInt();
        
        if (p1.menorQue(edad1, edad)==true){ System.out.println("La otra persona es mas grande");}
        else {System.out.println("Esta otra persona es mas joven");}
        
        p1.mostrarPersona(edad);
        
    }
    
}

