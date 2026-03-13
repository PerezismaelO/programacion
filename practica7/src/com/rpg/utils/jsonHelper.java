package com.rpg.utils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rpg.handler.formatoInvalidoException;
import com.rpg.handler.rpgDataException;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class jsonHelper {

    private final ObjectMapper mapper = new ObjectMapper();

    // Lee una lista de objetos desde un fichero JSON
    public <T> List<T> readList(String ruta, Class<T> clase) throws rpgDataException {
        try {
            return mapper.readValue(
                    new File(ruta),
                    mapper.getTypeFactory().constructCollectionType(List.class, clase)
            );
        } catch (IOException e) {
            throw new formatoInvalidoException("Error leyendo JSON '" + ruta + "': " + e.getMessage());
        }
    }

    // Guarda una lista de objetos en un fichero JSON
    public <T> void writeList(String ruta, List<T> lista) throws rpgDataException {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(ruta), lista);
        } catch (IOException e) {
            throw new rpgDataException("Error guardando JSON '" + ruta + "': " + e.getMessage());
        }
    }
}
