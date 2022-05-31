
package ejercicio5.CuentaBancaria;

//import ejercicio5.CuentaBancaria.Entidad.Entidad;
import ejercicio5.CuentaBancaria.Servicio.Servicio;
import java.util.Scanner;

public class NewMain {
   
    public static void main(String[] args) {
      
        Scanner leer=new Scanner(System.in);
 
        Servicio sc = new Servicio();//creacion de objeto tipo clase Servicio, que usaremos para colocar los metodos
        //que modificaran los atributos del objeto que creemos con la clase Entidad.
        
        sc.menu();
    }               
        
       
    }
    
   
