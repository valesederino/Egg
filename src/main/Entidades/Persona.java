
package main.Entidades;

import java.util.Scanner;


public class Persona {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int bajo=0, bien=0, alto=0, mayor=0, menor=0;
    
    //Atributos
    private String nombre;
    private int edad;
    private String sexo;
    private Double peso;
    private Double altura;
    private int Imc;
    private int estadoedad;
    private String domicilio;
    private String pruebaparagit;
    
   
    //Constructores

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int getImc() {
        return Imc;
    }

    public void setImc(int Imc) {
        this.Imc = Imc;
    }

    public int getEstadoedad() {
        return estadoedad;
    }

    public void setEstadoedad(int estadoedad) {
        this.estadoedad = estadoedad;
    }
    
    
    //otros Metodos
    
    public void crearPersona(){
        
        System.out.println("Ingrese los datos de la persona:");
        
        System.out.println("Nombre:");
        nombre=leer.next();
        System.out.println("edad:");
        edad=leer.nextInt(); 
        System.out.println("sexo: H -hombre-  M -mujer-   O -otro- ");
        sexo=leer.next();
        if (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
              System.out.println("ERROR");}
        
        System.out.println("peso:");
        peso=leer.nextDouble();
        System.out.println("altura:");
        altura=leer.nextDouble();
    }
    
//Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
//que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
//fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
//está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
//fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
    
    public int calcularIMC(){
        double imc;

       imc= peso/(altura*altura);
        System.out.println("Su IMC es de " + imc);
        if (imc<20){System.out.println("Ud. esta POR DEBAJO de su peso ideal."); return Imc=1;}
        else {
            if (imc>=20 && imc<=25){System.out.println("Ud. ESTA en su peso ideal"); return Imc=2;}
            else {System.out.println("Ud. esta POR ENCIMA de su peso ideal"); return Imc=3;}
            }
        
        
            }
  
//Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
public int esMayorDeEdad(){
if (edad>=21){System.out.println("Es mayor de edad.");return estadoedad=1;}
else {System.out.println("Es menor de edad");return estadoedad=2;}
 
}




}