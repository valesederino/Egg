
package main.Entidades;

import java.util.Date;
import java.util.Scanner;


public class Person {
  
    Scanner leer=new Scanner(System.in);

    //Atributos
    
    private String nombre;
    private Date nacimiento;
    
    //Constructores

    public Person() {
        nacimiento= new Date(); //esto es para que no se cree la fecha en null
        
    }

    public Person(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }
    
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
  
    //Otros Metodos
    
    
    public void crearPersona(){// throws ParseException{
        
        System.out.println("Ingrese el nombre:");
        nombre=leer.next();

        System.out.println("Ingrese el dia de nacimiento con este formato dd");
        int dia= leer.nextInt();
        
        System.out.println("Ingrese el mes de nacimiento con este formato mm");
        int mes= leer.nextInt();
        
        System.out.println("Ingrese el año de nacimiento con este formato aaaa");
        int anio= leer.nextInt();
        
        Date fechanacim = new Date(anio-1900, mes-1, dia); //aqui se crea el objeto tipo Date
        
        nacimiento= fechanacim;//se guarda la fecha de nacimiento en el atributo
        
        //System.out.println(fechanacim.toString());             
    }
    
        
    public void mostrarPersona(int edad){    
        System.out.println("La persona que quedo creada es:");  
        System.out.println(nombre);
        System.out.println("Nacida el: " + nacimiento);
        System.out.println("De " + edad + " anios.");
    }
  
    public int calcularEdad(){            
        Date hoy = new Date();
        int edad=0;
        if (hoy.getYear()> nacimiento.getYear()) {
            if (hoy.getMonth() >= nacimiento.getMonth()) {
                if (hoy.getDate()>=nacimiento.getDate()){
                    edad=hoy.getYear()- nacimiento.getYear();}
                else { edad=hoy.getYear()- nacimiento.getYear()-1;}
            }
        }
            
             
        System.out.println("Su edad es " + edad);        
        return edad;
    }

    
    //Agregar a la clase el método menorQue(int edad) que recibe como parámetro 
    //otra edad y retorna true en caso de que el receptor tenga menor edad que la 
    //persona que se recibe como parámetro, o false en caso contrario.
    
    public boolean menorQue(int edad1, int edad){
        if (edad1>edad){return true;}
        return false;
}

}