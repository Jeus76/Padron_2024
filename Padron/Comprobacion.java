
/**
 * Write a description of class Comprobacion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    import java.util.ArrayList;
public class Comprobacion{
public static void realizarComprobacion(){
Habitante habitante1 = new Habitante("Jesus", "Hernandez", "Mendez");
Habitante habitante2 = new Habitante("Martin","Sanchez","Rodriguez");
OficinaPadron padron = new OficinaPadron();
padron.annadir(habitante1);
padron.annadir(habitante2);
ArrayList<Habitante> habitantes = padron.
getHabitantesPadron();
for(Habitante habitante : habitantes){
System.out.println(habitante.getNombre() + " " +
habitante.getApellido1() + " " +
habitante.getApellido2());
}
System.out.println("El numero total de habitantes es " + padron.
calcularNumeroHabitantes());
}
}