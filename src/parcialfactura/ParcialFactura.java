package parcialfactura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParcialFactura {
    public static List<Encabezado> encabezadoo = new ArrayList();
    public static List<Descripcion> descripcion = new ArrayList();
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
        System.out.println("Menu");
        System.out.println("1. Agregar ");
        System.out.println("2. Modtrsr");
        System.out.println("3. Salir");
        opcion = in.nextInt();
    }

    public static void Encabezado() {
        System.out.println("Ingrese los siguientes datos para registro");
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
        encabezadoo.add(new Encabezado(serie,numero,fecha,nombre,direccion,nit));
        do {

            Encabezado desc = new Encabezado();

            System.out.println("===============================================");
            System.out.println("Cantidad de productos");
            int cantidad = in.nextInt();
            System.out.println("Descripción ");
            String descripcion1 = in.next();
            System.out.println("Valor del producto");
            double valor = in.nextDouble();
            double total = cantidad * valor;
            descripcion.add(new Descripcion(cantidad, descripcion1, valor, total));

            System.out.println("1. Ingresar");
            System.out.println("2.Salir");
            opcion1 = in.nextInt();

        } while (opcion1 != 2);
    }

    public static void  MostrarDatos() {
        System.out.println("Datos a mostrar son:");
        for (Encabezado encabezados : encabezadoo) {
            System.out.println(encabezados.toString());

            for (Descripcion descripciones : descripcion) {
                System.out.println(descripciones.toString());
            }
            
        }
        

    }

        
    }
