import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by DAM on 11/10/16.
 */


public class main {

    private static ListaClientes lc = new ListaClientes();
    private static Fichero miFichero;


    public static void main(String[] args) {
        miFichero = new Fichero("clientes.xml");

        lc = (ListaClientes) miFichero.leer();
        if (lc == null) {
            lc = new ListaClientes();
        } else {

        }
        int opcion;

        do {
            mostrarMenu();
            opcion = EntradaDatos.pedirEntero("ELIGE UNA OPCION");
            switch (opcion) {
                case 1:
                    alta_cliente();
                    break;
                case 2:
                    String numero = EntradaDatos.pedirCadena("Numero de telefono");
                    cliente c = lc.comprobarnumero(numero);

                    if (c == null) {
                        alta_cliente();
                        c = lc.comprobarnumero(numero);
                        presupuesto(c);

                    } else {
                        for (presupuesto p : c.getPresupuestos().getLista()) {
                            System.out.println(p);
                        }
                        presupuesto(c);
                    }
                    miFichero.grabar(lc);
                    break;
                case 3:
                    obtenerPresupuestos();
                    break;
                case 4:
                    numero = EntradaDatos.pedirCadena("Numero de telefono");
                    c = lc.comprobarnumero(numero);

                    if (c == null) {
                        System.out.println("no existe introduce uno correcto");

                    } else {
                        // Para cada presupuesto de la lista de presupuestos del cliente c sout(p)
                        for (presupuesto p : c.getPresupuestos().getLista()) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Presupuestos rechazados");
                    PresupuestoRechazado();
                    System.out.println("************************");

                    break;
                case 6:
                    System.out.println("Listado Presupuestos y numero de presupuestos segun cliente");
                    totales();
                    break;
                case 7:

                    break;

                case 8:

                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (opcion != 8);

    }


    private static void mostrarMenu() {

        System.out.println("____________________________________");
        System.out.println("MENU ");
        System.out.println("1. Alta cliente");
        System.out.println("2. Nuevo presupuesto");
        System.out.println("3. Presupuestos pendientes");
        System.out.println("4. Listado presupuestos de cliente");
        System.out.println("5. Listado de presupuestos rechazados");
        System.out.println("6. Listado de clientes");
        System.out.println("7. Cambiar estado de presupuesto");
        System.out.println("8. Salir");
        System.out.println("");
        System.out.println("_____________________________________");
    }


    private static void alta_cliente() {
        String nombre = EntradaDatos.pedirCadena("Nonbre: ");
        String apellidos = EntradaDatos.pedirCadena("Apellido: ");
        String numero = EntradaDatos.pedirCadena("Numero de telefono");
        String dni = EntradaDatos.pedirCadena("Numero de DNI");
        int vip = EntradaDatos.pedirEntero("Vip  0-NO 1-SI");
        cliente cliente = new cliente(nombre, apellidos, numero, dni, (vip == 0) ? false : true);
        lc.alta(cliente);
        miFichero.grabar(lc);
        //System.out.println(cliente);
    }

    private static void presupuesto(cliente c) {

        Random r = new Random();
        int numeroid = r.nextInt((2147483646 - 2) + 1) + 2;
        String asunto = EntradaDatos.pedirCadena("Asunto");
        Double importeNeto = EntradaDatos.pedirDouble("importe neto");
        String aceptado = EntradaDatos.pedirCadena("Estado: ");
        // creamos el constructor
        presupuesto presupuesto = new presupuesto(numeroid, asunto, importeNeto, aceptado);
        c.getPresupuestos().alta(presupuesto);

    }

    public static void obtenerPresupuestos() {
        // Recorremos la lista de clientes
        System.out.println("Presupuestos pendientes");
        for (cliente c : lc.getLista()) {
            System.out.println("Presupuestos del cliente " + c.getNombre());
            // Recorremos la lista de presupuestos del cliente
            for (presupuesto p : c.getPresupuestos().getLista()) {
                System.out.println(p);
            }
        }
    }

    public static void PresupuestoRechazado() {
        presupuesto p = null;
        for (cliente c : lc.getLista()) {
            p = c.getPresupuestos().obtenerPresupuestoEstado("rechazado");
            System.out.println(p);
        }
    }

    public static void totales() {
        for (cliente x : lc.getLista()) {
            System.out.println(x + "  " + x.getPresupuestos().getLista().size());
            System.out.println("*******");
        }
    }
}


