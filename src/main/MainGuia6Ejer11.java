
package main;

import java.util.Date;
import java.util.Scanner;


public class MainGuia6Ejer11 {


    public static void main(String[] args) {

        int dia;
        int mes;
        int anio;
        
        int resta;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el dia con formato dd:");
        dia=leer.nextInt();
        System.out.println("Ingrese el mes con formato mm:");
        mes=leer.nextInt();
        System.out.println("Ingrese el anio con formato aa:");
        anio=leer.nextInt();
        
        Date fecha = new Date(anio, mes-1, dia); //clase Date recibiendo datos del usuario
       
        System.out.println("La fecha ingresada es: " + fecha );
       
        Date fechaActual = new Date(); //clase Date que automaticamente trae la fecha de hoy.
        
        resta= fechaActual.getYear() - fecha.getYear();
        
        System.out.println("La fecha de hoy es:" + fechaActual);
       
        System.out.println("Han transcurrido " + resta + " anios");
        
        
        
    }

}
