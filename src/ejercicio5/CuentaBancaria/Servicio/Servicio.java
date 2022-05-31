
package ejercicio5.CuentaBancaria.Servicio;

import ejercicio5.CuentaBancaria.Entidad.Entidad;
import java.util.Scanner;

public class Servicio {

    //Scanner / recordemos que es una clase y necesitamos de los metodos de esa dlase para hacer algunas funciones
    Scanner leer = new Scanner(System.in); 
    
    
        public void menu(){

        System.out.println(" Cree una cuenta");
        
        Entidad cuenta =new Entidad();
        cuenta = crearCuenta();
        int opcion;

        do {                           
        System.out.println(" - - - - - - -  BANCO EGG - - - - - - -");
        System.out.println("");
        System.out.println("");            
        System.out.println("Menu de opciones:");
        System.out.println("------------------------------------------");  
        
        System.out.println(" 1- Deposito");
        System.out.println(" 2- Extraccion");
        System.out.println(" 3- Adelanto");
        System.out.println(" 4- Consulta Cuenta");
        System.out.println(" 5- Consulta Saldo");
        
        System.out.println(" 6- Salir");
            
        opcion=leer.nextInt();
        
        switch (opcion) {

            case 1: cuenta.setSaldo(ingresar(cuenta.getSaldo()));
                    break;
            case 2: cuenta.setSaldo(retirar(cuenta.getSaldo()));
                    break;
            case 3: cuenta.setSaldo(extraccionRapida(cuenta.getSaldo()));
                    break;
            case 4: consultaCuenta(cuenta);
                    break;
            case 5: consultaSaldo(cuenta.getSaldo());
                    break;                 
            case 6: break;
        }
        
        } while (opcion!=6);
        
    } 
    
    
    public Entidad crearCuenta(){ //aqui estoy creando una funcion de tipo Clase Entidad / que me pide que importe xq no sabe donde esta
        
        Entidad creacuenta =new Entidad(); //creo un objeto creacuenta de tipo Clase Entidad
        
        System.out.println("- - - - Transaccion:  Creacion de cuenta  - - - - ");
        System.out.println("");   
        
        System.out.println("Ingrese el numero de cuenta: ");
        creacuenta.setNumeroCuenta(leer.nextInt());
        
        System.out.println("Ingrese el DNI: ");
        creacuenta.setDNI(leer.nextLong());
        
        System.out.println("Ingrese el saldo: ");
        creacuenta.setSaldo(leer.nextDouble());
        
        System.out.println("");
        System.out.println("");
        
    return creacuenta; //aqui retorna el objeto creacuenta que contiene los datos ingresados x el usuario        
    }
    
    
    // Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
    
    public double ingresar(double saldo){ //saldo contiene cuenta.getSaldo()

        Entidad cuentabancaria= new Entidad(); //creo un objeto nuevo, cuentabancaria y seteo el atributo saldo.
        cuentabancaria.setSaldo(saldo);
        
        System.out.println("- - - - Transaccion:  D E P O S I T O  - - - - ");
        System.out.println("");
        System.out.println("Ingrese el saldo a agregar:  ");
        double ingresodesaldo= leer.nextDouble();
        cuentabancaria.setSaldo(cuentabancaria.getSaldo()+ingresodesaldo);

        System.out.println("El saldo le quedo en " + cuentabancaria.getSaldo() );
        System.out.println("");
        System.out.println("");
    
        return cuentabancaria.getSaldo();
    }
    
    //Método retirar(double retiro): el método recibe una cantidad de dinero a retirar 
    //y se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, 
    //se pondrá el saldo actual en 0.
    
    public double retirar(double saldo){
        
        Entidad cuentabancaria= new Entidad();
        cuentabancaria.setSaldo(saldo);
        
        System.out.println("- - - - Transaccion:  R E T I R O - - - - ");
        System.out.println("");
        System.out.println("Su saldo actual es de $" + cuentabancaria.getSaldo());
        System.out.println("");
        System.out.println("Ingrese el monto a retirar:  ");
        double montoaretirar= leer.nextDouble();
        if (montoaretirar>cuentabancaria.getSaldo()) {
            System.out.println("El monto que desea ingresar SUPERA el saldo disponible."); 
            }
        else{        
            cuentabancaria.setSaldo(cuentabancaria.getSaldo()-montoaretirar);}
            System.out.println("El saldo le quedo en $" + cuentabancaria.getSaldo() ); 
            System.out.println("");
            System.out.println("");
            
        return cuentabancaria.getSaldo();       
    }
    
    //Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    
    public double extraccionRapida(double saldo){
        
            Entidad cuentabancaria= new Entidad();
            cuentabancaria.setSaldo(saldo);
            
            if (cuentabancaria.getSaldo()>0){
                System.out.println("Ud. ha seleccionado retirar el 20% de su saldo disponible que en este momento es de $" +cuentabancaria.getSaldo()); 
                double extraccion= (saldo*20)/100;
                System.out.println("Podra extraer $ " + extraccion);
                cuentabancaria.setSaldo(cuentabancaria.getSaldo()-extraccion);
                System.out.println("Su cuenta quedo en $" + cuentabancaria.getSaldo());
            }
            else {
                System.out.println("Ud. no dispone de fondos.");}
            
           return cuentabancaria.getSaldo(); 
        }
    
    
    public void consultaCuenta(Entidad cuenta){
        

        System.out.println("Cuenta nro: "+ cuenta.getNumeroCuenta());
        System.out.println("DNI nro: " + cuenta.getDNI());
        System.out.println("Saldo: $" + cuenta.getSaldo());
        System.out.println("");
        System.out.println("");
    }
    
    public double consultaSaldo(double saldo){
        Entidad cuentabancaria= new Entidad();
        cuentabancaria.setSaldo(saldo);
        
        System.out.println("El saldo de esta cuenta es de $" + cuentabancaria.getSaldo());
         System.out.println("");
        System.out.println("");
        return cuentabancaria.getSaldo();
    }
    
    
    }
    
    
    

