import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Bloque1 {
    public ArrayList<String> registroMuerte() {
        System.out.println("Ejercicio 1:");
        ArrayList<String> RegistroCombate = new ArrayList<>();

        RegistroCombate.add("Orco derrotado");
        RegistroCombate.add("Poción usada");
        RegistroCombate.add("Guerrero derrotado");
        RegistroCombate.add("Daño crítico");
        RegistroCombate.add("Esquive completado");
        System.out.println(RegistroCombate.get(2));
        System.out.println("----------------------------------");
        return RegistroCombate;

    }

    public HashSet<String> censoUnico() {
        System.out.println("Ejercicio 2:");
        HashSet<String> villanos = new HashSet<>();

        villanos.add("Morgoth");
        villanos.add("Sauron");
        villanos.add("Thanos");
        villanos.add("Morgoth");
        villanos.add("Duende verde");
        villanos.add("Galactus");
        System.out.println(villanos);
        System.out.println("----------------------------------");
        return villanos;

    }

    public void bolsaOro() {
        System.out.println("Ejercicio: 3");
        HashMap<String, Integer> aventurerosOro = new HashMap<>();

        aventurerosOro.put("Pedro", 46);
        aventurerosOro.put("Harry", 123);
        aventurerosOro.put("Enrique", 87);

        for (String nombre : aventurerosOro.keySet()){
            System.out.println(nombre + " tiene " + aventurerosOro.get(nombre) + " lingotes de oro.");
        }
    }
}

