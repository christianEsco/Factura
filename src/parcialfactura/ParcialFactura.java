package parcialfactura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @Christian Alvaro Esciobar Lacan ---- 2000224 Juan Josue Chajil Navarro
 * ****** 2000166
 */
public class ParcialFactura {

    public static List<Encabezado> ListEncabezado = new ArrayList();
    public static Scanner in = new Scanner(System.in);
    public static int opcion1;
    public static int opcion;

    public static void main(String[] args) {

        do {

            Menu();
            switch (opcion) {
                case 1:
                    Encabezado();
                    break;
                case 2:
                    MostrarDatos();
                    break;
                default:
                    System.out.println("============================================");
                    System.out.println("Ingrese ina opcion valida");
                    System.out.println("============================================");
                    break;
            }//fin del switch
        } while (opcion != 3);
    }

    public static void Menu() {
        System.out.println("--------------------------------");
        System.out.println("Menu");
        System.out.println("1. Agregar ");
        System.out.println("2. Modtrsr");
        System.out.println("3. Salir");
        opcion = in.nextInt();
        System.out.println("\n");
    }

    public static void Encabezado() {
        //Ingreso de Factura encabezado
        System.out.println("Ingrese los siguientes datos para guardar registro");
        System.out.println("Serie: ");
        int serie = in.nextInt();
        System.out.println("Numero de la factura: ");
        int numero = in.nextInt();
        System.out.println("Fecha: ");
        String fecha = in.next();
        System.out.println("Nombre: ");
        String nombre = in.next();
        System.out.println("Direccion: ");
        String direccion = in.next();
        System.out.println("Ingresar Nit: ");
        int nit = in.nextInt();
        List<Descripcion> Listdescripcion = new ArrayList();
        do {
// Ingreso descripcion
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("===============================================");
            System.out.println("Ingrese Detalle de Factura");
            System.out.println("Cantidad de productos");
            int cantidad = in.nextInt();
            System.out.println("Descripción ");
            String descripcion1 = in.next();
            System.out.println("Valor del producto");
            double valor = in.nextDouble();
            // Inicia el Array list dentro de Encabezado
            Listdescripcion.add(new Descripcion(cantidad, descripcion1, valor));
            System.out.println("\n-------------------------------------------------");
            System.out.println("¿Decea ingresar un nuevo producto con descripcion?");
            System.out.println("1. Ingresar nuevo producto");
            System.out.println("2.Salir");
            opcion1 = in.nextInt();
        } while (opcion1 != 2);
        // Agrega un array list al encabezado junto con los detalles de productos
        ListEncabezado.add(new Encabezado(serie, numero, fecha, nombre, direccion, nit, Listdescripcion));
    }

    public static void MostrarDatos() {
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Datos a mostrar son:");
        System.out.println("-----------------------------------");
        for (Encabezado encabezado : ListEncabezado) {
            System.out.println("\n-------------------------------------");
            System.out.println("\t\tFactura numero     " + encabezado.getNumero());
            System.out.println("---------------------------------------");
            System.out.println(encabezado.toString());
            encabezado.mostrarDetalle();
        }

    }

}
