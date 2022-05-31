
package ejercicio5.CuentaBancaria.Entidad;


public class Entidad {
    //atributos
    
    private int numeroCuenta;
    private long DNI;
    private double saldo;
    
    //Constructores

    public Entidad() {
    }

    public Entidad(int numeroCuenta, long DNI, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }
    
   
    
    //Getters y Setters

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
