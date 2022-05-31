
package ejercicio6.NesExpresso.Servicio;


import ejercicio6.NesExpresso.Entidad.NespressoEntidad;
import java.util.Scanner;

public class NespressoServicio {
    
    Scanner leer = new Scanner(System.in);
    
    
    //Metodos
    
    public void menu(){
        
        System.out.println("Llenare la cafetera con 500 ml de cafe");
        
        NespressoEntidad entidad = new NespressoEntidad();
        entidad = llenarCafetera();

        int opcion;

        do {                           
            
        System.out.println("CAFETERA NESPRESSO / Menu de opciones:");
        System.out.println("------------------------------------------");  
        
        System.out.println(" 1- Llenar cafetera");
        System.out.println(" 2- Servir taza");
        System.out.println(" 3- Vaciar cafetera");
        System.out.println(" 4- Agregar cafe");       
        System.out.println(" 5- Salir");
            
        opcion=leer.nextInt();
        
        switch (opcion) {

            case 1: llenarCafetera();                    
                    break;
            case 2: 
                    entidad.setCapacidadAtual(servirTaza(entidad.getCapacidadAtual()));
                    break;
            case 3: entidad.setCapacidadAtual(vaciarCafetera());
                    break;
            case 4: System.out.println("Ingrese mas cafe. Cuantos ml?:");
                    int mascafe = leer.nextInt();
                    entidad.setCapacidadAtual(agregarCafe(mascafe));
                    break;
            case 5: break;}   
            
        
        } while (opcion!=5);
        
    } // fin Metodo menu()
    
    
    public NespressoEntidad llenarCafetera(){
        
        NespressoEntidad entidad = new NespressoEntidad();
        
        entidad.setCapacidadAtual(500);
        entidad.setCapacidadMaxima(500);
      
        return entidad;
    }
    
    
    //Método servirTaza(int): se pide el tamaño de una taza vacía, 
    //el método recibe el tamaño de la taza y simula la acción de servir la taza 
    //con la capacidad indicada. Si la cantidad actual de café “no alcanza” 
    //para llenar la taza, se sirve lo que quede. El método le informará al 
    //usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
    
    public int servirTaza(int capacidadactual){
        
        NespressoEntidad entidad = new NespressoEntidad();
        entidad.setCapacidadAtual(capacidadactual);
        
        System.out.println("Ingrese el tamano de la taza en ml:");
        int tamanotaza = leer.nextInt();
        
        if (tamanotaza<=entidad.getCapacidadAtual()){
            entidad.setCapacidadAtual(entidad.getCapacidadAtual()-tamanotaza);
            System.out.println("Taza llena.");}
        else {
            entidad.setCapacidadAtual(-(entidad.getCapacidadAtual()-tamanotaza)); 
            System.out.println("La taza NO se lleno. Solo se llenaron " + (-(entidad.getCapacidadAtual()-tamanotaza) + "mililitros"));}
        
        return entidad.getCapacidadAtual();
        }
    
    
    public int vaciarCafetera(){
        
         NespressoEntidad entidad = new NespressoEntidad();
         entidad.setCapacidadAtual(0);
         
         return entidad.getCapacidadAtual();
         
    }
    
    //Método agregarCafe(int): se le pide al usuario una cantidad de café, el 
    //método lo recibe y se añade a la cafetera la cantidad de café indicada.
    
    public int agregarCafe(int mascafe){
        
        NespressoEntidad entidad =new NespressoEntidad();
        entidad.setCapacidadAtual(entidad.getCapacidadAtual()+mascafe);
        
        return entidad.getCapacidadAtual();
    }
    
    }

