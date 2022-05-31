
package main.Entidades;


public class Cancion {
    //Atributos
            
            private String titulo;
            private String autor;
            
    //Constructores

    public Cancion() {
    }

            
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
            
    //Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
            
}
