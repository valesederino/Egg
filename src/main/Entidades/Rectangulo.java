
package main.Entidades;

import java.util.Scanner;


public class Rectangulo {

Scanner leer = new Scanner(System.in);    
//Atributos
    
    private int base;
    private int altura;
    
 //Metodos constructores

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
//gets y Sets

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    
    
    
    
 // Metodos varios
    
    public void crearRectangulo(){
        
        System.out.println("Ingrese en cm uno de los lados de un rectangulo:");
        base= leer.nextInt();
        
        System.out.println("Ingrese en cm otro de los lados de un rectangulo:");
        altura= leer.nextInt();
    }
    
    public double superficie(int base, int altura){
        int superficie;
        superficie= base*altura;       
        return superficie;
    }
    
    public double perimetro(int base, int altura){
        int perimetro;
        perimetro= (base+altura)*2;       
        return perimetro;
    }
    
    public void dibujo(int base, int altura){
        int j, i;
        
        for (i=0;i<altura;i++){           
            System.out.print("*");
            if (i==0 || i==altura-1){
               for (j=1;j<base;j++){
                   System.out.print("*");} // fin del for de j
                }//fin del if 
            else {
                for (j=1;j<base-1;j++){
                    System.out.print(" ");} // fin del for de j
                System.out.print("*");
            } // fin del else
           System.out.println("");
        } //fin del for de i
        
    }
    
}
