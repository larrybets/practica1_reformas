import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DAM on 18/10/16.
 */
public class ListaClientes implements Serializable {

    private ArrayList<cliente> lista;


    public ListaClientes() {
        lista = new ArrayList<>();
    }

    public ArrayList<cliente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<cliente> lista) {
        this.lista = lista;
    }

    public void alta(cliente c) {
        lista.add(c);
    }

    public void baja(cliente c) {
        lista.remove(c);
    }

    public cliente comprobarnumero(String numero) {
        for (cliente c : lista) {
            if (c.getNumero().equalsIgnoreCase(numero)) {
                System.out.println(c.getNumero());
                return c;
            }
        }
        return null;
    }




}
