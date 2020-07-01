
package ExamenParcial;

public class CPersona {
    
    private String codigo;
    private String nombre;
    private double tarifa;
    private int hora;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public void registrar (String nom, String cod, double tarifa, int hora){
        this.nombre = nom;
        this.codigo = cod;
        this.tarifa = tarifa;
        this.hora = hora;
    }
    
    public void mostrarSueldo(){
        System.out.println("El promedio es : " +hallarSueldo());
    }
    
    public double hallarSueldo(){
        double sueldo;
        sueldo=this.tarifa*this.hora;
        return sueldo;
    }
    
    public void mostrarDatos(){
        System.out.println("\nCodigo = " +codigo);
        System.out.println("Nombre = " +nombre);
        System.out.println("Tarifa = " +tarifa);
        System.out.println("Horas = " +hora);
        System.out.println("Su sueldo diario es: " + hallarSueldo());
        System.out.println("Su sueldo mensual es: " + hallarSueldo() * 30);
    }
    
    
}
