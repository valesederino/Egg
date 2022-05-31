
package main.Entidades;

import java.util.Scanner;


public class Cafetera {
    //Atributos
    Scanner leer = new Scanner(System.in);
    
    private int capacidadMaxima= 200;
    private int capacidadActual;
    
    //Constructores

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }
    
    //Getters y Setters

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
    
    public void llenarCafetera(){        
        capacidadActual=capacidadMaxima;
    }
 
    //otros metodos
    
    public void servirTaza(int tamanio){
        int resto;
        if (capacidadActual>=tamanio){
            capacidadActual=capacidadActual-tamanio;
            System.out.println("Su taza se lleno");}
        else if (capacidadActual>0) {
             resto=(tamanio-capacidadActual)*-1;
             capacidadActual=0;
             System.out.println("Su taza se lleno a medias. Le faltaron " + resto + " mls. para llenarse.");}

    }
    
    
    public void vaciarCafetera(){        
        capacidadActual=0;
    }
 
    public void agregarCafe(int cant){
        if (cant+capacidadActual <= capacidadMaxima){
        capacidadActual=cant;
        System.out.println("Su cafetera ha quedado con " + capacidadActual + " mls. de cafe.");}
        else {
        System.out.println("Lo siento, esa cantidad derramaria el cafe de lacafetera");}

    }

}