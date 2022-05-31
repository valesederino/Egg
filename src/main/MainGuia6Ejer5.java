
package main;

import main.Entidades.Cuenta;
import java.util.Scanner;

public class MainGuia6Ejer5 {


    public static void main(String[] args) {
        String resp;
       Scanner leer= new Scanner(System.in);
        
        Cuenta c1=new Cuenta();
        c1.crearCuenta();
        
        System.out.println("Ok hagamos un INGRESO de $$$$$$:");

        c1.ingresar();
        
        System.out.println("El saldo actual de su cuenta ha quedado en $ " + c1.getSaldoActual());
        
        System.out.println("Ahora hagamos una EXTRACCION de $$$$$$:");

        c1.Retirar();
        
        System.out.println("El saldo actual de su cuenta ha quedado en $ " + c1.getSaldoActual());
        
        System.out.println("Veamos una EXTRACCION RAPIDA de $$$$$$:");

        c1.extraccionRapida();
        
        System.out.println("El saldo actual de su cuenta ha quedado en $ " + c1.getSaldoActual());
        
        System.out.println("Desea consultar el saldo de su cuenta?");
        
        resp= leer.next();
        
        if (resp.equals("S")){
            System.out.println("El saldo actual que tiene es de $" + c1.getSaldoActual());
        }
        
        System.out.println("Desea consultar los datos de su cuenta? S/N");
        
        resp= leer.next();
        
        if (resp.equals("S")){
            System.out.println("Los datos de su cuenta son ");
            System.out.println("Nro de cuenta: " + c1.getNroCuenta());
            System.out.println("DNI: " + c1.getDniCliente());
        }
        
        }
    }
    
