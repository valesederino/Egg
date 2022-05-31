
package main.Entidades;

import java.util.Scanner;

public class Ahorcado {
    
    Scanner leer = new Scanner(System.in);
    
    
    
    //Atributos
    
    private char [] vector; //asi asigna un vector como atributo
    private int tamanio;
    private int cantletras; //cantidad de letras ENCONTRADAS
    private int cantjugadas;
    
    
    //Constructores

    public Ahorcado() {
    }

    public Ahorcado(char[] vector, int tamanio, int cantletras, int cantjugadas) {
        this.vector = vector;
        this.tamanio = tamanio;
        this.cantletras = cantletras;
        this.cantjugadas = cantjugadas;
    }
    
    //getters y setters
    
    public Scanner getLeer(){
        
        return leer;
        
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public char[] getVector() {
        return vector;
    }

    public void setVector(char[] vector) {
        this.vector = vector;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getCantletras() {
        return cantletras;
    }

    public void setCantletras(int cantletras) {
        this.cantletras = cantletras;
    }

    public int getCantjugadas() {
        return cantjugadas;
    }

    public void setCantjugadas(int cantjugadas) {
        this.cantjugadas = cantjugadas;
    }

    //Metodos
    //Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas 
    //máxima.
    //Con la palabra del usuario, pone la longitud de la palabra, como la 
    //longitud del vector.
    //Después ingresa la palabra en el vector, letra por letra, quedando cada 
    //letra de la palabra en un índice del vector. 
    //Y también, guarda en cantidad de jugadas máximas, el valor que ingresó el 
    //usuario y encontradas en 0.
    
    public String crearJuego() {
        int i;
        String guion="-";
        System.out.println("Ingrese la palabra a buscar:");
        String palabra= leer.next();
        tamanio=palabra.length();

        System.out.println("Ingrese la cantidad de jugadas maxima: ");
        cantjugadas=leer.nextInt();
        vector = new char[tamanio]; //aca defino el tamanio del vector
        for (i=0;i<tamanio;i++){            
            //vector[i]= palabra.charAt(i);}
            vector[i]=guion.charAt(0);} //Inicializo con guiones tipo char al espacio del vector
        cantletras=0;
        return palabra;
    }
    
    //Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
    //Nota: buscar como se usa el vector.length.
    
    
    public void longitud(){
        int i;
        System.out.println("Esta es la palabra que debes adivinar:");
        for (i=0;i<tamanio;i++){            
            System.out.print(" _ ");}
        System.out.println("");
        System.out.println("");
    }
    
    //Método buscar(letra): este método recibe una letra dada por el usuario y 
    //busca sila letra ingresada es parte de la palabra o no. 
    //También informará si la letra estaba o no.
    
    
    public void buscarLetra(char letra, String palabra){
        int i, contar=0, intentos=0; 


        for (i=0;i<tamanio;i++){            
            if (String.valueOf(letra).equals(palabra.substring(i,i+1)) && vector[i]!=letra){      
                //aca busca si esta la letra en la palabra y tb chequea que en el vector no haya asignado ya la letra previamente
                vector[i]=letra; contar=contar+1; }
            System.out.print(" " + vector[i] + " ");                            
        }//fin del for
        
        System.out.println("");
        cantletras=cantletras+contar;
        intentos=intentos+1;
        encontradas(letra, contar, intentos);
       
}
    
   //Método encontradas(letra): que reciba una letra ingresada por el usuario y 
    //muestre cuantas letras han sido encontradas y cuantas le faltan. 
    //Este método además deberá 
    //devolver true si la letra estaba y false si la letra no estaba, ya que, 
    //cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
    
    public boolean encontradas(char letra, int contar, int intentos){
        int faltan;
        
        if (contar==0) { //quiere decir que la letra no fue encontrada
            if (cantjugadas!=0) { System.out.println("Esa letra ya la ingreso!");}
            cantjugadas=cantjugadas-intentos;      
            if (cantjugadas==0) {System.out.println("Lo lamento. No tiene mas intentos. PERDIO.");}
            else {System.out.println("Le quedan " + cantjugadas + " intentos");}
            
            return false; }
        else {
       
            System.out.println("La letra '" + letra + "' se encontro " + contar + " vez/veces.");
            
            faltan=tamanio-cantletras;
            System.out.println("Faltan encontrar " + faltan + " letras.");
            
            cantjugadas=cantjugadas-intentos;    
            
            System.out.println("Le quedan " + cantjugadas + " intentos");
            return true;
            } // fin del else
      
  } // fin del Metodo
    
    
    public void juego(){
        
        String palabra;
        palabra=crearJuego(); //aqui se ingresa la palabra a adivinar y la cantidad de intentos
        longitud(); //este metodo muestra las rayitas de la palabra a adivinar
        
        do{
           System.out.println("Ingrese una letra...");  
           
           buscarLetra(leer.next().charAt(0), palabra); //aqui pido el ingreso de un solo caracter y mando tb la palabra original
           if (cantletras==tamanio) {System.out.println("EXCELENTE! "); System.out.println("GANO EL JUEGO"); break;}
           
    
        }while (cantjugadas>0 || cantletras==tamanio);
        
    }
    
    
   
}
    
