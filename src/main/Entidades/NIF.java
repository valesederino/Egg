
package main.Entidades;

import java.util.Scanner;


public class NIF {
    
    String [] verificador = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    Scanner leer = new Scanner(System.in);
    
    
   //Atributos
    
    private long DNI;
    private String letra;
    
   //Constructores

    public NIF() {
    }

    public NIF(long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    //Otros metodos
    
    //Método crearNif(): le pide al usuario el DNI y 
    //con ese DNI calcula la letra que le corresponderá. Una vez calculado, 
    //le asigna la letra que le corresponde según el resultado del calculo.
    
    
    public String crearNif(){
        System.out.println("Ingrese su DNI:");
        DNI=leer.nextLong();
        long resto=Math.abs(DNI%23);
        int myInt = (int) resto; //aqui tuve que convertir de long a int para poder usar el valor como ndice del vector
        letra=verificador[myInt];
        return verificador[myInt];
       
    }
    
    //Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
    
    public void mostrar(String cod){
        
        System.out.println("La informacion codificada resulta ser " + DNI + "-" + cod);
         
    }
}
