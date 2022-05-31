
package main.Entidades;

import java.util.Scanner;

public class Circunferencia {
    //Atributos
    private Double radio;
    private Double area;
    private Double perimetro;
    
    //Metodo Constructor

    public Circunferencia(Double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }
    
    

    //getter y Setter
    
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }
    
    
    
    //Metodo crear circunferencia
    public void crearCircunferencia(){
        
        System.out.println("Ingrese el diametro:");
        radio=leer.nextDouble();
        
    }
    
    Scanner leer = new Scanner(System.in);
    
    //Metodo calcular area
    public void area(){
        
        area= Math.PI * Math.pow(2, radio);
  
    }
    
    public void perimetro(){
        perimetro= 2* Math.PI * radio;
    }
    
    public void mostrar(){
        System.out.println("El area de la circunferencia es " + area);
        System.out.println("El perimetro de la circunferencia es " + perimetro);
    }
    
}
