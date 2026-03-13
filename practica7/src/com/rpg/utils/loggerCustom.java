package com.rpg.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class loggerCustom {

    private static final String RUTA_LOG = "resources/errores.log";
    private static final DateTimeFormatter FMT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static Object log;

    // Escribe una línea en el fichero errores.log
    public static void log(String mensaje) {
        String timestamp = LocalDateTime.now().format(FMT);
        String linea = "[" + timestamp + "] ERROR: " + mensaje;

        // true = modo append: añade al final sin borrar lo anterior
        try (FileWriter fw = new FileWriter(RUTA_LOG, true)) {
            fw.write(linea + "\n");
        } catch (IOException e) {
            System.err.println("No se pudo escribir en el log: " + e.getMessage());
        }
    }
}

