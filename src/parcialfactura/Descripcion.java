/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialfactura;

/**
 *
 * @author DELL
 */
public class Descripcion {
     int Cantidad;
    String Descripcion;
    double valor;
    double total;

    public Descripcion() {
    }

    public Descripcion(int Cantidad, String Descripcion, double valor, double total) {
        this.Cantidad = Cantidad;
        this.Descripcion = Descripcion;
        this.valor = valor;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

        public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString (){
        System.out.println(" Cantidad \t\t " + " Despcion \t\t" + " Valor " + " Total" ) ;
        System.out.println(this.Cantidad +"\t\t"+ this.Descripcion +"\t\t"+ this.valor + "\t\t" +  this.total );
        return " ";
        
    }
}
