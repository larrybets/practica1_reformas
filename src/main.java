/**
 * Created by DAM on 11/10/16.
 */


public class main {
    public static void main(String[] args) {

        int opcion;
        do {
            mostrarMenu();
            opcion = EntradaDatos.pedirEntero("ELIGE UNA OPCION");
            switch (opcion) {
                case 1:
                    alta_cliente();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;

                case 8:

                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (opcion != 0);

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
        cliente cliente = new cliente (nombre, apellidos, numero,dni, (vip == 0)? false : true);
        System.out.println(cliente);
    }

}


