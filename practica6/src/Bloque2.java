import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Bloque2 {
    public void repoGremios() {
        System.out.println("Ejercicio 7");

        HashMap<String, ArrayList<String>> nombreGremio = new HashMap<>();

        // Hay que crear el ArrayList de magod.
        ArrayList<String> magos = new ArrayList<>();
        magos.add("Cassandra");
        magos.add("Orfeo");
        magos.add("Merlín");

        // Creamos un array de otro gremio
        ArrayList<String> Elfos = new ArrayList<>();
        Elfos.add("Amarie");
        Elfos.add("Arwen");
        Elfos.add("Celeborn");

        // Ahora guardamos los arrayList en el HashMap
        nombreGremio.put("magos", magos);
        nombreGremio.put("elfos", Elfos);

        imprimeGremio(nombreGremio, "elfos");
    }
    // Metodo para imprimir los nombres de un gremio especifico
    public void imprimeGremio(HashMap<String, ArrayList<String>> nombreGremio, String nombre) {
        if (nombreGremio.containsKey(nombre)) {
            // Imprime el nombre del gremio
            System.out.println(nombre);
            // Recorre el gremio que le hemos dicho
            for (String nombres: nombreGremio.get(nombre)) {
                // Imprime los nombres que hay dentro del gremio
                System.out.println(nombres);
            }
            } else {
            System.out.println("Ese gremio no se puede identificar");
        }
        System.out.println("----------------------------------");
    }
    public void Loot() {
        System.out.println("Ejercicio 8");

        HashMap<String, HashSet<String>> Mounstro = new HashMap<>();
        HashSet<String> Trasgo = new HashSet<>();

        Trasgo.add("Espada oxidada");
        Trasgo.add("Espada oxidada");
        Trasgo.add("Poción envenenada");

        Mounstro.put("Trasgo", Trasgo);
        System.out.println("El Trasgo ha soltado: " + Trasgo);
        System.out.println("----------------------------------");
    }

    public void estadisticasCompletas() {
        System.out.println("Ejercicio 9");
        HashMap<String, HashMap<String, Integer>> jugadores = new HashMap<>();
        HashMap<String, Integer> statsConan = new HashMap<>();
        statsConan.put("Fuerza", 18);
        statsConan.put("Destreza", 12);

        jugadores.put("Conan", statsConan);
         if (jugadores.containsKey("Conan")) {
             int fuerza = statsConan.get("fuerza") + 2;
             statsConan.put("fuerza", fuerza);

         }
         System.out.println("Estadisticas de Conan");
         System.out.println(statsConan);
         System.out.println("----------------------------------");
    }
}
