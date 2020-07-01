
package ExamenParcial;
import java.util.Scanner;

public class CArregloPersona {
    static Scanner teclado = new Scanner (System.in);
    
    int TOPE; //PARA SABER EL MAXIMO DE ELEMENTOS
    int FINAL; // COLA LLENA O VACIA
    int MAX;
    CPersona[] empleado;
    
    public CArregloPersona (int MAX){
        this.FINAL = 0;
        this.TOPE = 0;
        this.MAX = MAX;
        this.empleado = new CPersona[this.MAX+1];
        
        for(int i = 0; i<this.MAX+1; i++){
            empleado[i] = new CPersona();
        }
    }
    
    public int getFrente(){
        return TOPE;
    }
    
    public boolean isColaLena(){
        if(FINAL == MAX){
            return true;
        } else{
            return false;
        }
    }
    
    public boolean isColaVacia(){
        if(TOPE == FINAL){
            return true;
        } else {
            return false;
        }
    }
    
    public void llenar(int posicion, String codigo, String nombre, double tarifa, int hora){
        empleado[posicion].registrar(codigo, nombre, tarifa, hora);
        TOPE++;
    }
        
    
    public void mostrar(){
        if(this.isColaVacia()){
            System.out.println("Elementos inexistentes para mostrar");
        } else {
            for (int i=0; i<TOPE; i++){
                empleado[i].mostrarDatos();
            }
        }
    }
    
    public void eliminar (){
        if (this.isColaVacia()){
            System.out.println("*****No hay datos almacenados*****");
        } else {
            TOPE--;
            System.out.println("*****Se elimino los datos del empleado*****");
        }
    }
    
    public void buscar (String buscar){
        if(isColaVacia()){
            System.out.println("No hay datos para realizar la busqueda");
        } else {
            for(int i=0 ; i<TOPE; i++){
                if(buscar == empleado[i].getCodigo()){
                    empleado[i].mostrarDatos();
                    break;
                } else{
                    System.out.println("No se encontro el elmento a buscar");
                }
            }
        }
    }
}
