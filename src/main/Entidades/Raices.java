//Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2o grado. 

//Las ecuaciones cuadráticas pueden aparecer en aplicaciones diferentes. La fórmula cuadrática es una manera útil 
//de resolver estas ecuaciones, ¡o cualquier otra ecuación! La fórmula cuadrática, , se obtiene completando 
//el cuadrado en la ecuación cuadrática .
// El discriminante en la fórmula cuadrática es la cantidad dentro dela raiz cuadrada. Determina el número 
//y el tipo de soluciones que tiene una ecuación cuadrática. Si el discriminante es positivo, hay 2 soluciones reales. 
//Si es cero, hay 1 solución real. Si el discriminante es negativo, hay 2 soluciones complejas (pero no hay soluciones reales).

//Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. 
//Hay que insertar estos 3 valores para construir el objeto a través de un método constructor. 
//Luego, las operaciones que se podrán realizar son las siguientes:

package main.Entidades;

import java.util.Scanner;

public class Raices {
    
    Scanner leer = new Scanner(System.in);
    
    //Atributos
    
    private int a;
    private int b;
    private int c;
    
    //Constructores

    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    //getters y setters

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    
    
    //Metodos
    
    public void ingresarValores(){
        
        System.out.println("Ingrese un valor para a: ");
        a= leer.nextInt();
        System.out.println("Ingrese un valor para b: ");
        b= leer.nextInt();
        System.out.println("Ingrese un valor para c: ");
        c= leer.nextInt();
        //Para que salgan dos raices a o c deben ser valores negativos
    }
    
    
    //Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente formula: (b^2)-4*a*c
    
    public Double getDiscriminante(){
        
        return Math.pow(b,2)-4*a*c;
    }
    
    //Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, 
    //el discriminante debe ser mayor o igual que 0.
    
    public boolean tieneRaices(Double valor){
        
        if (valor>0){return true;}
        return false;
        }
    
    //Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, 
    //el discriminante debe ser igual que 0
    
    
    public boolean tieneRaiz(Double valor){
        
        if (valor==0){return true;}
        return false;
    }
    
    //Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
    public void obtenerRaices(Raices r1){ //aca puse como argumento que recibe al OBJEtO ya que este posee la info cargada por el usuario
                                          //que es la necesaria para calcular el discriminante.
            if (r1.tieneRaices(r1.getDiscriminante())==true){
                Double x1= (-b + Math.sqrt((Math.pow(b,2)-4*a*c)))/2*a;
                Double x2= (-b - Math.sqrt((Math.pow(b,2)-4*a*c)))/2*a;
                System.out.println("Una posible solucion es x1= " + x1);
                System.out.println("La otra posible solucion es x2= " + x2);
    }
            
    }
    
    //Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
    //Es en el caso en que se tenga una única solución posible.
    
    public void obtenerRaiz(Raices r1){
        if (r1.tieneRaiz(r1.getDiscriminante())==true){
                Double x3= (-b + Math.sqrt((Math.pow(b,2)-4*a*c)))/2*a;
               
                System.out.println("La unica solucion solucion es x= " + x3);
    }
    
    }
    
    //Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), 
    //y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación 
    //con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos 
    //y en caso de no existir solución, se mostrará un mensaje.

    public void calcular(Raices r1){
        
        int bandera=0;
        
        if (r1.tieneRaices(r1.getDiscriminante()) == true) {
            System.out.println("Esta ecuacion tiene dos raices.");
            r1.obtenerRaices(r1);
            bandera=1;
        }

        if (r1.tieneRaiz(r1.getDiscriminante()) == true) {
            System.out.println("La ecuacion tiene una unica solucion");
            r1.obtenerRaiz(r1);
            bandera=1;
        }
        
        if (bandera==0){System.out.println("la ecuación no tiene solución real alguna (la raiz de un número negativo no es un número real).");}
        
        
        
    }
    
    
}
        

