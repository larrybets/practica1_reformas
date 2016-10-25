/*
 *  Clase para crear métodos comunes a proyectos para obtención de ciertos tipos de datos
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author mfontana
 */
public class DatosComunes {
    
    public static ArrayList<String> obtenerPaises() {
        ArrayList<String> paises = new ArrayList<>();
        paises.add("España");
        paises.add("Alemania");
        paises.add("Holanda");
        paises.add("Francia");
        paises.add("Italia");
        paises.add("Bélgica");
        paises.add("Suiza");
        paises.add("Inglaterra");
        paises.add("Brasil");
        paises.add("-- Escoge un país --");
        Collections.sort(paises);
        return paises;
    }
    
}
