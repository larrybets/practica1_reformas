import java.io.Serializable;

/**
 * Created by DAM on 11/10/16.
 */
public class presupuesto implements Serializable{

    //main consultas menus..etc etc

    private int numero_presupuesto;
    private String asunto;
    private Double importeNeto;
    private String estado;

    public presupuesto() {
    }

    public presupuesto(int numero_presupuesto, String asunto, Double importeNeto, String aceptado) {
        this.numero_presupuesto = numero_presupuesto;
        this.asunto = asunto;
        this.importeNeto = importeNeto;
        this.estado = aceptado;
    }

    public int getNumero_presupuesto() {
        return numero_presupuesto;
    }

    public void setNumero_presupuesto(int numero_presupuesto) {
        this.numero_presupuesto = numero_presupuesto;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Double getImporteNeto() {
        return importeNeto;
    }

    public void setImporteNeto(Double importeNeto) {
        this.importeNeto = importeNeto;
    }

    public String getAceptado() {
        return estado;
    }

    public void setAceptado(String aceptado) {
        this.estado = aceptado;
    }

    @Override
    public String toString() {
        return "presupuesto{" +
                "numero_presupuesto=" + numero_presupuesto +
                ", asunto='" + asunto + '\'' +
                ", importeNeto=" + importeNeto +
                ", aceptado='" + estado + '\'' +
                '}';
    }
}
