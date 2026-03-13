package com.rpg.utils;

import com.rpg.model.ciudades;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class txtHelper {

    private final loggerCustom logger = new loggerCustom();

    public List<ciudades> leerCiudades(String ruta) {
        List<ciudades> ciudades = new ArrayList<ciudades>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {

                // Ignorar líneas vacías o comentarios (#)
                if (linea.isBlank() || linea.startsWith("#")) continue;

                String[] partes = linea.split(";");

                // Si la línea no tiene exactamente 4 partes, está corrupta
                if (partes.length != 4) {
                    logger.log("FormatoInvalidoException en ciudades.txt: '" + linea + "'");
                    continue;  // pasa a la siguiente línea SIN parar el programa
                }

                try {
                    String nombre   = partes[0].trim();
                    int    pobl     = Integer.parseInt(partes[1].trim());
                    String clima    = partes[2].trim();
                    int    riesgo   = Integer.parseInt(partes[3].trim());
                    ciudades.add(new ciudades(nombre, pobl, clima, riesgo));
                } catch (NumberFormatException e) {
                    logger.log("DatoInvalidoException en ciudades.txt: '" + linea + "'");
                }
            }
        } catch (IOException e) {
            System.err.println("No se pudo abrir ciudades.txt: " + e.getMessage());
        }

        return ciudades;
    }
}

