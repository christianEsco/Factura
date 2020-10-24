
package parcialfactura;

public class Descripcion {
     int Cantidad;
    String Descripcion;
    double valor;

    public Descripcion(int Cantidad, String Descripcion, double valor) {
        this.Cantidad = Cantidad;
        this.Descripcion = Descripcion;
        this.valor = valor;    
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
        System.out.println("=========================================================");
        System.out.println(" Cantidad \t\t " + " Despcion \t\t" + " Valor " + " Total" ) ;
        System.out.println(this.Cantidad +"\t\t"+ this.Descripcion +"\t\t"+ this.valor + "\t\t" );
        return " ";
        
    }
}
