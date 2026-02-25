package com.rpg.utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rpg.model.personajes;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class jsonHelper {
    public static void leerPersonajes() {
        try {
            Reader reader = Files.newBufferedReader(Paths.get("ficheros/personaje.json"));
            List<personajes> lista = new Gson().fromJson(
                    reader,
                    new TypeToken<List<personajes>>() {
                    }.getType()
            );
            for (personajes p: lista) {
                System.out.println("Nombre personajes: " + p.getNombre());
            }
        } catch (IOException e) {
            System.out.println("No se puede abrir el fichero");
        }
    }
}
