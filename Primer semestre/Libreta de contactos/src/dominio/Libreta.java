package dominio;
import java.util.ArrayList;
public class Libreta {
    private String nombre;
    private ArrayList<Contacto> lista;
    public Libreta() {
        nombre = "";
        lista = new ArrayList<>();
    }
    public Contacto buscar(Contacto c){
        int p=lista.indexOf(c);
        if (p==-1)
            return null;
        else
            return lista.get(p);
    }
    //usar metodos setter para sustituir un contacto

    public Libreta add(Contacto c){
        lista.add(c);
        return this;
    }
}