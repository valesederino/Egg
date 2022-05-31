
package main;

import main.Entidades.Circunferencia;

public class MainGuia6Ejer2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Circunferencia c1 = new Circunferencia();
        
        c1.crearCircunferencia();
        c1.area();
        c1.perimetro();
        System.out.println("El area de la circunferencia es " + c1.getArea());
        System.out.println("El perimetro de la circunferencia es " + c1.getPerimetro());
        //aqui arriba utilice gets xq los atributos de area y perimetro estan definidads como private
        //y al estar en una clase DISTINTA a aquella donde estan creados -Clase Circunferencia- no 
        // puedo usar el nombre suelto, directamente. Necesito los gets
        
        
        //Voy a probar hacer OTRO calculo sin agregarlo como atributo a la clase
        
        System.out.println("el calculo es " +  Math.PI * Math.pow(2, c1.getRadio()));
    }
    
}
