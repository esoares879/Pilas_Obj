
package ExamenParcial;

import java.util.Scanner;

public class CAplicaPersona {
    static int posicion = 0;
    static CArregloPersona empleado;
    static Scanner teclado = new Scanner (System.in);
    
    public static void main (String[]args){
        menu ();
    }
    
    static void crearCola (){
        int tamaño;
        System.out.println("¿Cuantos trabajadores registrara?");
        tamaño = teclado.nextInt();
        empleado = new CArregloPersona(tamaño);    
    }
    
    static void ingresarDatos(){
        double tarifa;
        int hora;
        String cod,nom;
        
        System.out.println("Ingrese codigo del empleado");
        cod = teclado.next();
        System.out.println("Ingrese nombre del empleado");
        nom = teclado.next();
        
        do{
            System.out.println("Ingrese la tarifa por hora del empleado");
            tarifa = teclado.nextDouble();
            if(tarifa<=0){
                System.out.println("Se requiere una tarifa valida");
            }
        } while (tarifa <-0);
        
        do{
            System.out.println("Ingrese las cantidad de horas trabajadas del empleado");
            hora = teclado.nextInt();
            if(hora <= 0){
                System.out.println("Se requiere un total de horas validas");
            }
        } while (hora <- 0);
        
        empleado.llenar(posicion, cod, nom, tarifa, hora);
        posicion++;   
    }
    
    static void menu(){
        int opcion;
        
        do{
            System.out.println("MENU DE OPCIONES");
            System.out.println("1.- CREAR ARREGLO");
            System.out.println("2.- INGRESAR DATOS");
            System.out.println("3.- MOSTRAR DATOS");
            System.out.println("4.- ELIMINAR DATOS");
            System.out.println("5.- BUSCAR DATOS");
            System.out.println("Ingrese una opcion valida");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    crearCola ();
                    break;
                case 2:
                    ingresarDatos();
                    break;
                case 3:
                    empleado.mostrar();
                    break;
                case 4:
                    empleado.eliminar();
                case 5:
                    String buscar;
                    System.out.println("Digite codigo del empleado");
                    buscar = teclado.nextLine();
                    empleado.buscar(buscar);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Elija una opcion valida");                    
            }
        }while(opcion != 0);
    }
}
