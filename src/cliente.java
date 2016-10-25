import java.io.Serializable;
import java.util.List;

/**
 * Created by DAM on 11/10/16.
 */
public class cliente implements Serializable {

    private String nombre;
    private String apellidos;
    private String numero;
    private String dni;
    private boolean vip;
    private ListaPresupuestos presupuestos;


    public cliente() {

    }

    public cliente(String nombre, String apellidos, String numero, String dni, boolean vip) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numero = numero;
        this.dni = dni;
        this.vip = vip;
        presupuestos = new ListaPresupuestos();

    }

    public ListaPresupuestos  getPresupuestos() {
        return presupuestos;
    }

    public void setPresupuestos(ListaPresupuestos presupuestos) {
        this.presupuestos = presupuestos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }


    @Override
    public String toString() {
        return "cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numero='" + numero + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
