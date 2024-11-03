package principal;

import dominio.Catalogo;
import interfaz.Menu;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo(); // Crea el catálogo
        // Crea la instancia del menú
        Menu menu = new Menu(catalogo); // Pasa el catálogo al menú
        menu.mostrarMenu(); // Muestra el menú
    }
}