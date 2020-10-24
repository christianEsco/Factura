package parcialfactura;

import java.util.ArrayList;
import java.util.List;

public class Encabezado {

    int Serie;
    int Numero;
    String Fecha;
    String Nombre;
    String Direccion;
    int Nit;
    double Total;
    List<Descripcion> descripcion = new ArrayList();

    public Encabezado(int Serie, int Numero, String Fecha, String Nombre, String Direccion, int Nit,
            List<Descripcion> Listdescripcion) {
        this.Serie = Serie;
        this.Numero = Numero;
        this.Fecha = Fecha;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Nit = Nit;
        this.descripcion = Listdescripcion;
        ActualizarTotal();

    }

    public Encabezado() {

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

    public List<Descripcion> getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(List<Descripcion> descripcion) {
        this.descripcion = descripcion;
    }

    public void ActualizarTotal() {
        double valortotal = 0;
        for (Descripcion descripcion1 : descripcion) {
            valortotal = valortotal + (descripcion1.getValor() * descripcion1.getCantidad());
        }
        this.Total = valortotal;
    }

    public void mostrarDetalle() {
        System.out.println("\n-------------------------------------");
        System.out.println("\t\tDetalle");
        System.out.println("---------------------------------------");
        System.out.println("Cant.\t\tDesc.\t\tValor\t\tSubtotal");
        for (Descripcion descripcion1 : descripcion) {
            System.out.println(descripcion1.Cantidad + "\t\t"
                    + descripcion1.getDescripcion() + "\t\t"
                    + descripcion1.getValor() + "\t\t"
                    + descripcion1.getValor() * descripcion1.getCantidad());
        }

    }

    @Override
    public String toString() {
        System.out.println("Serie\t" + Serie);
        System.out.println("Numero\t" + Numero);
        System.out.println("Fecha\t" + Fecha);
        System.out.println("Nombre\t" + Nombre);
        System.out.println("Direccion\t" + Direccion);
        System.out.println("Nit\t" + Nit);
        System.out.println("Total\t" + Total);
        return " ";

    }

}
