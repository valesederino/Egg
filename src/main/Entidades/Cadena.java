
package main.Entidades;

import java.util.Scanner;


public class Cadena {
    
    Scanner leer =new Scanner(System.in).useDelimiter("\n");
    
    //Atributos
    
    private String frase;
    private int longitud;
    
    // Constructores

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }
    
    //Getters y Setters

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    //Otros metodos
            
    
    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    
    public int mostrarVocales(){
        int i=0, j=1;
        int vocal=0;
        for (i=0;i<longitud;i++){
            if (frase.substring(i,j).equals("a") || frase.substring(i,j).equals("e") || frase.substring(i,j).equals("i")|| frase.substring(i,j).equals("o") || frase.substring(i,j).equals("u")) {
            vocal+=1;} //fin del if
            j=j+1;
            }// fin del for
        return vocal;
        }// fin del metodo
    
   
    //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
    //Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    
    public void invertirFrase(){
    int i=0, j=longitud-1;
        int vocal=0;
        for (i=0;i<longitud;i++){

            System.out.print(frase.substring(j,longitud-i)); //fin del if
            j=j-1;}// fin del for

        }// fin del metodo
   
    //Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
    // y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    //Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    
    public void vecesRepetido(String caract){
        int i, j=1, cant=0;

        for (i=0;i<longitud;i++){
            if (frase.substring(i,i+1).equals(caract)) {
            cant+=1;} //fin del if
            }// fin del for

         System.out.println("El caracter " + caract + " se repite " + cant + " veces en la frase " + frase);

    }
    
    
    //Método compararLongitud(String frase), deberá comparar la longitud de la frase
    //que compone la clase con otra nueva frase ingresada por el usuario.
    
    public void compararLongitud(String compara){
        
        if (frase.length()==compara.length()){
        System.out.println("Las frases tienen la misma longitud: " + compara.length() + " caracteres."); }
        else {System.out.println("Las frases tienen longitud diferente"); }       
    }
    
    //Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
       //con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    
    public void unirFrases(String texto){
        String unidas;
        unidas=frase + " " + texto;
        System.out.println("Las frases concatenadas quedaron asi: " + unidas);
    }
    
    //Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    //encuentren en la frase, por algún otro carácter seleccionado por el usuario y
    //mostrar la frase resultante.
    
    public void reemplazar(String letra){
        int i;
        String otra="";// en esta variable ire armando la palabra con el caracter reemplazado
        for (i=0;i<longitud;i++){
            if (frase.substring(i,i+1).equals("a")) {
                otra= otra + letra;}
            else { otra= otra+frase.substring(i,i+1);}
            }// fin del for
        System.out.println("la frase quedo " + otra );
    }
    
    //Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    //ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    
     public boolean contiene(String letter){
        int i, conta=0;

        for (i=0;i<longitud;i++){
            if (frase.substring(i,i+1).equals(letter)) {conta+=1;} //fin del if     
        }// fin del for
        if (conta==0){return false;}
        else {return true;}
     }
    
}


