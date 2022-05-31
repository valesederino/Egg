
package main.Entidades;

import java.util.Scanner;


public class Operacion {

Scanner leer = new Scanner(System.in);

    //Atributos
    private int numero1;
    private int numero2;
    
    //Metodos constructores, sin parametros y con parametros
    
    public Operacion(){
        
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //Metodos get y Set

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //Otros metodos
    
    public void crearOperacion(){
        
        System.out.println("Ingrese un numero:");
        numero1= leer.nextInt();
        System.out.println("Ingrese otro numero:");
        numero2= leer.nextInt();
        
    }
    
    
    public int sumar(){
        int suma;
        suma=numero1 + numero2;
        return suma;
        
    }
   
    public int restar(){
        int resta;
        resta=numero1 - numero2;
        return resta;
        
    }
    
    
    public int multiplicar(){
        int multiplicacion;
        if (numero1==0 || numero2==0){
            System.out.println("ERROR");
            multiplicacion=0;}
        else {
        multiplicacion=numero1 * numero2;}
        return multiplicacion;
        
    }
    
    public int dividir(){
        int division;
        if (numero1==0 || numero2==0){
            System.out.println("ERROR");
            division=0;}
        else {
        division=numero1 / numero2;}
        return division;
    
}
}

