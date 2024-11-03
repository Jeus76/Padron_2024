package dominio;

public class Contacto{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    public Contacto (String nombre_, String apellidos_, String telefono_, String email_){
        nombre = nombre_;
        apellido = apellidos_;
        telefono = telefono_;
        email = email_;
    }
    public Contacto (){

    }
    public String getNombre(){
        return nombre;
    }
    public Contacto setTelefono(String telefono_){
        telefono=telefono_;
        return this;
    }
    public String toString(){
        StringBuilder sb =new StringBuilder();
        sb.append("Nombre: ")
                .append(nombre)
                .append(" ")
                .append(apellido)
                .append("\n telefono")
                .append(telefono);
        return sb.toString();
    }
// la diferencia entre dos objetos iguales y de su mismo estado, cuando tienen mismas caracteristicas (nombre, apellido, etc...) tienen el mismo estado, pero no son el mismo objeto

    public boolean equals(Object o){     // metodo equals definido sirve para comparar dos objetos. sino compara las referencias
        if (o==null)
            return false;
        if (this.getClass()!=o.getClass())
            return false;
        Contacto c= (Contacto) o;
        return nombre.equals(c.nombre)&& apellido.equals(c.apellido);
    }
    public int hashCode(){
       return (nombre.hashCode()-1)*33 + apellido.hashCode();
    }
}

