import java.util.*;

public class ejercicio6 {
    public static void main(String[] args) {
        // Modifica el programa anterior de tal forma que no se repita ningún número en el array
        // además de que tiene que estar comprendido en un rango entre 20-40.
        Random randomNum = new Random();
        int[][] array = new int [6][10];
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        int filas = array.length;
        int columnas = array[0].length;
        int total = 0;

        // Rellenamos el array con números aleatorios entre 20 y 40
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = randomNum.nextInt(21) + 20;
            }
        }

        Set<Integer> vistos = new HashSet<>();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int valor = array[i][j];
                if (vistos.contains(valor)) {
                    array[i][j] = 0; // Los repetidos lo convertimos en 0
                } else {
                    vistos.add(valor);
                }
            }
        }


        for (int i = 0; i < array.length; i++) { // Recorre las filas
            int sumaFila = 0;
            for (int j = 0; j < array[i].length; j++) { // Recorre las columnas
                if (array[i][j] == 0) {
                    System.out.printf("    %-7s ", " "); // mostramos un espacio en lugar de 0
                } else {
                    System.out.printf("   "+ " %-7d ", array[i][j]);
                }
                sumaFila += array[i][j];

            }
            total += sumaFila;
            System.out.printf("Fila %d Suma = %-6d\n", i, sumaFila);
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        for (int j = 0; j < array[0].length; j++) { // Recorre las columnas
            int sumaColumna = 0;
            for (int i = 0; i < array.length; i++) { // Recorre las filas
                sumaColumna += array[i][j];
            }
            System.out.printf("   "+ " %-7d ", sumaColumna);
            total += sumaColumna;
        }
        System.out.println("Total= " + total);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();

        int mayor = array[0][0];
        int menor = array[0][0];
        int filaMenor = 0;
        int filaMayor = 0;
        int columnaMenor = 0;
        int columnaMayor = 0;

        for (int i = 0; i < array.length; i++) { // Recorre las filas
            for (int j = 0; j < array[i].length; j++) { // Recorre las columnas
                if (array[i][j]>mayor) {
                    mayor = array[i][j];
                    filaMayor = i;
                    columnaMayor = j;
                } else if (array[i][j]<menor) {
                    menor = array[i][j];
                    filaMenor = i;
                    columnaMenor = j;
                }
            }
        }
    }
}
