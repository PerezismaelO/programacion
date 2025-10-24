import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        // Crea un programa que:
        // Cree una lista de Strings (ArrayList<String>).
        // Pida al usuario nombres por teclado hasta que introduzca la palabra "fin".
        // Luego pida un nombre a buscar y diga si está en la lista o no, mostrando también en
        // qué posición se encuentra si existe.
        Scanner s = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        String entrada;
        String nombre;

        // Pedimos nombres hasta escribit "fin"
        System.out.println("Introduce un nombre:");
        do {
            System.out.println("Nombre: ");
            entrada = s.nextLine().trim();
            if (!entrada.equals("fin")) {
                nombres.add(entrada);
            }
        } while (!entrada.equals("fin"));

        // Recorremos la lista con un for each
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        // Buscamos un nombre, si está en el Arraylist, devuelve "está en la lista"
        // , y si no pues devuelve que no está.
        System.out.print("Introduce un nombre a buscar: ");
        String nombreBuscado = sc.nextLine().trim();

        if (nombres.contains(nombreBuscado)) {
            int posicion = nombres.(nombreBuscado);
            System.out.println("El nombre '" + nombreBuscado + "' está en la lista en la posicion " + posicion);
        } else {
            System.out.println("El nombre '" + nombreBuscado + "' no se encuentra en la lista.");
        }
    }
}



