import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by DAM on 21/10/16.
 */
public class ListaPresupuestos implements Serializable {


    private ArrayList<presupuesto> lista;


    public ListaPresupuestos() {
        lista = new ArrayList<>();
    }

    public void alta(presupuesto p) {
        lista.add(p);
    }

    public ArrayList<presupuesto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<presupuesto> lista) {
        this.lista = lista;
    }
}
