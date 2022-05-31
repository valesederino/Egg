
package main.Entidades;

public class Matematica {
    //Atributos
    
    private Double nro1;
    private Double nro2;
    
    
    //Constructores

    public Matematica() {
    }

    public Matematica(Double nro1, Double nro2) {
        this.nro1 = nro1;
        this.nro2 = nro2;
    }
    
    //Getters y Setters

    public Double getNro1() {
        return nro1;
    }

    public void setNro1(Double nro1) {
        this.nro1 = nro1;
    }

    public Double getNro2() {
        return nro2;
    }

    public void setNro2(Double nro2) {
        this.nro2 = nro2;
    }
    
    
    
    
    // Otros metodos
    
    //Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    
    public Double devolverMayor(Double Nro1, Double Nro2){
           
        if (Nro1>Nro2) { return Nro1;}
        else { return Nro2;}
        }
        
    
    //Método calcularPotencia() para calcular la potencia del mayor valor de la clase
    //elevado al menor número. Previamente se deben redondear ambos valores.
    
    
    public void calcularPotencial(Double Nro1, Double Nro2){
        Double potencia;       
        potencia= Math.pow(Math.abs(Math.round(Nro1)),Math.abs(Math.round(Nro2)));
        System.out.println(" El valor de la potencia es " + potencia);       
    }
    
    //• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
     
    public Double  calculaRaiz(Double num){
        
    return Math.sqrt(num);
        
    }
    
    }

