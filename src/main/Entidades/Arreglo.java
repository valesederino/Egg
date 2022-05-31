
package main.Entidades;

import java.util.Arrays;


public class Arreglo {
    //Atributos
   private Double [] A = new Double[50];
   private Double [] B = new Double[20];
    
    //Constructores

    public Arreglo() {
    }
    
     //Getters y Setters
    
    public Double[] getA(){
        return A;
    }

    public void setA(Double[] A) {
        this.A = A;
    }

    public Double[] getB() {
        return B;
    }

    public void setB(Double[] B) {
        this.B = B;
    }

    
    //otros Metodos
    public void crearArreglos() {
        int i;
        for (i=0;i<50;i++){
            A[i]= Math.random()*10;           
        }             
    }
    
    public void mostrarxPantalla(){
       int i;
        System.out.println("Asi quedo el vector A: ");
         for (i=0;i<50;i++){            
             System.out.println(A[i] + " ");           
         }                 
        }
                        
    
    //el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números ordenados al arreglo B de 20 elementos, y 
    //rellenar los 10 últimos elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
    public void mostrasdeMeaMa(Double [] A, Double [] B){
        int i;
        Arrays.sort(A);

        for (i=0;i<10;i++){            
             B[i]=A[i];        
        }
            for (i=10;i<20;i++){            
             B[i]= 0.5;          
        }
            
        System.out.println("Asi quedo el vector A ORDENADO: ");        
        for (i=0;i<50;i++){            
             System.out.println(i + "- " + A[i] + " ");          
        }
        System.out.println("Asi quedo el vector B: ");        
        for (i=0;i<20;i++){            
             System.out.println(i + "- " + B[i] + " ");          
        }
    }
}
