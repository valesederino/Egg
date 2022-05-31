
package main.Entidades;

import java.util.Scanner;

public class Cuenta {
    

    Scanner leer = new Scanner(System.in);
    //Atributos
    
    private int nroCuenta;
    private long dniCliente;
    private Double saldoActual;
    private Double interes;
    
    //Constructores

    public Cuenta() {
    }

    public Cuenta(int nroCuenta, long dniCliente, Double saldoActual, Double interes) {
        this.nroCuenta = nroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }
    
    
    //Getters y Setters

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public Double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(Double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }
    
    
    //Otros Metodos
    
    public void crearCuenta(){
        
        System.out.println("Ingrese los siguientes datos;");
        System.out.println("Nro de Cuenta del ciente:");
        nroCuenta=leer.nextInt();
        
        System.out.println("DNI del cliente:");
        dniCliente= leer.nextLong();
        
        System.out.println("Saldo actual:");
        saldoActual= leer.nextDouble();
        
        System.out.println("Interes:");
        interes=leer.nextDouble();
        
        System.out.println("Datos completados!");
        System.out.println("------------------------------------");
        System.out.println("");
        
    }
 
    public Double ingresar(){
        Double ingreso;
        System.out.println("Ingrese la suma de dinero que quiere agregar a la cuenta:");
        ingreso=leer.nextDouble();
        saldoActual=saldoActual+ingreso;
       
        return saldoActual;
    }
    
    
    public Double Retirar(){
        Double retirar;
        System.out.println("Ingrese la suma de dinero que quiere retirar de la cuenta:");
        retirar=leer.nextDouble();  
        if (saldoActual<0 || (retirar>saldoActual) ){
            System.out.println("Lo lamento, no tiene saldo disponible.");}
        else {
        saldoActual=saldoActual-retirar;}
       
        return saldoActual;
    }
    
    
    public Double extraccionRapida(){
        Double retirar;
        System.out.println("Ingrese la suma de dinero que quiere retirar de la cuenta:");
        retirar=leer.nextDouble();  
        if (saldoActual<0 || (retirar>(saldoActual*0.2)) ){
            System.out.println("Lo lamento, no puede sacar esa cantidad, supera el 20% de su saldo.");}
        else {
        saldoActual=saldoActual-retirar;}
       
        return saldoActual;
    }
    
    
    
}
