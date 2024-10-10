
/**
 * Write a description of class Habitante here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Habitante{
    private String nombre;
    private String apellido1;
    private String apellido2;
    
    String getNombre(){
        return nombre;
    }
    String getApellido1(){
        return apellido1;
    }
    String getApellido2(){
        return apellido2;
    }
    
    public Habitante (String nombreHabitante, String apellido1Habitante, String apellido2Habitante){
        this.nombre = nombreHabitante;
        this.apellido1 = apellido1Habitante;
        this.apellido2 = apellido2Habitante;
        
    }
    public Habitante (){
        this.nombre = " ";
        this.apellido1 = " ";
        this.apellido2 = " ";
    }
    
}
    
