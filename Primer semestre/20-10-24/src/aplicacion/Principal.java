package aplicacion;

import dominio.*;

public class Principal {
    public static void main(String[] args) {
        Localidad localidad1 =new Localidad("Madrid" , 3460491);
        System.out.println(localidad1);

        Municipio municipio1 =new Municipio("Madrid");
        municipio1.addLocalidad(localidad1);
        System.out.println("Numero total de habitantes del municipio: " + municipio1.contarHabitantes());

        Provincia provincia1 =new Provincia("Madrid");
        provincia1.addMunicipio(municipio1);
        System.out.println("Numero total de habitantes de la provincia: " + provincia1.contarHabitantes());

    }


}
