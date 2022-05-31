
package main.Entidades;

import java.util.Scanner;

public class Libro {
    //atributos
    
    private int Isbn;
    private String titulo;
    private String autor;
    private int nropagina;
    
    //constructor

    public Libro() {
    }

    public Libro(int Isbn, String titulo, String autor, int nropagina) {
        this.Isbn = Isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nropagina = nropagina;
    }
    
    //metodos

    public void setIsbn(int Isbn) {
        this.Isbn = Isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNropagina(int nropagina) {
        this.nropagina = nropagina;
    }

    public int getIsbn() {
        return Isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNropagina() {
        return nropagina;
    }
    
    
    public void crearLibro(){
        
        System.out.println("Ingrese el nombre del libro");
        titulo=leer.next();
        System.out.println("Ingrese el ISBN del libro");
        Isbn=leer.nextInt();
        System.out.println("Ingrese el autor del libro");
        autor=leer.next();
        System.out.println("Ingrese nro de pags del libro");
        nropagina=leer.nextInt();
              
    }
      Scanner leer= new Scanner(System.in).useDelimiter("\n");
      
      
      public void mostrar(){
          System.out.print("El titulo del libro es " + titulo);
          System.out.println (" y el ISBN es " + Isbn);
          
      }
}

