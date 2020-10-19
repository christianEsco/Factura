
package parcialfactura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Encabezado {
    Scanner in = new Scanner(System.in);
    int Serie;
    int Numero;
    String Fecha;
    String Nombre;
    String Direccion;
    int Nit;
    double Total;
    List<Descripcion> descripcion = new ArrayList();

    public Encabezado(int Serie, int Numero, String Fecha, String Nombre, String Direccion, int Nit, double Total) {
        this.Serie = Serie;
        this.Numero = Numero;
        this.Fecha = Fecha;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Nit = Nit;
        this.Total = Total;
    }

   

    public Encabezado() {

    }

   

    public List<Descripcion> getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(List<Descripcion> descripcion) {
        Descripcion desc = new Descripcion();
        this.descripcion = descripcion;
    }
    
    
    
    
    

    public Encabezado(int Serie, int Numero, String Fecha, String Nombre, String Direccion, int Nit) {
        this.Serie = Serie;
        this.Numero = Numero;
        this.Fecha = Fecha;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Nit = Nit;
    }

    public int getSerie() {
        return Serie;
    }

    public void setSerie(int Serie) {
        this.Serie = Serie;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getNit() {
        return Nit;
    }

    public void setNit(int Nit) {
        this.Nit = Nit;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    @Override
    public String toString() {
        System.out.println(" Serie\t  Numero\t  Fecha\t   Nombre\t Direccion\t  Total\t  descripcion");
        System.out.println( Serie +"\t\t" +   Numero+"\t\t" +  Fecha+"\t\t" +  Nombre+"\t\t" +  Direccion+"\t\t" +  Nit+"\t\t" +  Total);
        for (Descripcion descripcion1 : descripcion) {
            System.out.println(descripcion1.toString());
        }
        return " ";

    
    
    } 
    
    
    
    
}
