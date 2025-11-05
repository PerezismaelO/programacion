import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        // Escribe un programa que solicite 20 números enteros. Estos números debemos de
        // introducirlo en un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales
        // de filas y en las columnas el mayor número de la columna. La suma total debe aparecer en
        // la esquina inferior derecha.
        /*Scanner s = new Scanner(System.in);

        int[][] array = new int [4][5];

        for (int i = 0; i < array.length; i++) {  Recorre las filas
            for (int j = 0; j < array[i].length; j++) {  Recorre las columnas
                System.out.println("Introduce un número");
                array[i][j] = s.nextInt();
            }
        }*/
        int[][] array = {
                {2, 5, 3, 6, 7},
                {7, 4, 3, 2, 45},
                {6, 63, 2, 4, 6},
                {3, 5, 6, 7, 3}
        };
        int total = 0;
        for (int i = 0; i < array.length; i++) { // Recorre las filas
            int sumaFila = 0;
            for (int j = 0; j < array[i].length; j++) { // Recorre las columnas
                sumaFila += array[i][j];
                System.out.printf("  " + " %-7d ", array[i][j]);
            }
            total += sumaFila;
            System.out.printf("Fila %d Suma = %-6d\n", i, sumaFila);
            System.out.println();
        }


        for (int j = 0; j < array[0].length; j++) { // Recorre las filas
            int mayor = array[0][j];
            for (int i = 0; i < array.length; i++) { // Recorre las columnas

                if (array[i][j]>mayor) {
                    mayor = array[i][j];

                }
            }
            System.out.printf("   %-8d", mayor);
        }
        System.out.println("Total= " + total);
    }
}