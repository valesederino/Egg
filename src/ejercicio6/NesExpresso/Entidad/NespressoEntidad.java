
package ejercicio6.NesExpresso.Entidad;


public class NespressoEntidad {
    
    //Atributos
    
    private int capacidadMaxima;
    private int capacidadAtual;
    
    
    //Constructores

    public NespressoEntidad() {
    }

    public NespressoEntidad(int capacidadMaxima, int capacidadAtual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadAtual = capacidadAtual;
    }
    
    
    //Getters y Setters

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadAtual() {
        return capacidadAtual;
    }

    public void setCapacidadAtual(int capacidadAtual) {
        this.capacidadAtual = capacidadAtual;
    }
    
    
    
}
