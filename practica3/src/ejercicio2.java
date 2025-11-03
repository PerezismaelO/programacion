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
        int [][] array = {
                {2, 5, 3, 6, 7},
                {7, 4, 3, 2, 45},
                {6, 63, 2, 4, 6},
                {3, 5, 6, 7, 3}
        };

    }
}
