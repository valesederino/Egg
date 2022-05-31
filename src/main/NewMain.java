package main;

import main.Entidades.Libro;


public class NewMain {


    public static void main(String[] args) {
        // TODO code application logic here
      
        Libro l1= new Libro(); //creacion de objeto
        l1.crearLibro(); 
        l1.mostrar();
        System.out.println("La cantidad de paginas es " + l1.getNropagina()); //porque nropagina no esta dentro del mostrar() en la clase Libro
        //entonces tengo que bucarlo con un getter
    }
    
}