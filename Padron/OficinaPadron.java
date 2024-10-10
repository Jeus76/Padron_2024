
/**
 * Write a description of class OficinaPadron here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class OficinaPadron
{
private ArrayList<Habitante> habitantesPadron = new
ArrayList<>();
public void annadir(Habitante habitante){
habitantesPadron.add(habitante);
}
public ArrayList getHabitantesPadron(){
return habitantesPadron;
}
public int calcularNumeroHabitantes(){
int suma = 0;
for(Habitante habitante : habitantesPadron){
suma++;
}
return suma;
}
}
 