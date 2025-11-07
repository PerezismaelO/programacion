import java.util.Random;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        // Crear un programa que cuando se le introduzca números enteros rellene un array de 6 filas
        // por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos
        // incluidos). A continuación, el programa deberá:
        // dar la posición del número máximo y mínimo
        // la suma total de todas las filas y columnas
        // la suma de todas las columna
        Random randomNum = new Random();

        int[][] array = new int [6][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomNum.nextInt(1001);

            }
        }
        int total = 0;
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < array.length; i++) { // Recorre las filas
            int sumaFila = 0;
            for (int j = 0; j < array[i].length; j++) { // Recorre las columnas
                sumaFila += array[i][j];
                System.out.printf("   " + " %-7d ", array[i][j]);
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
        System.out.println("El número más pequeño es " + menor + " y está en la posición " + "[" + filaMenor + "][" + columnaMenor + "]");
        System.out.println("El número más grande es " + mayor + " y está en la posición " + "[" + filaMayor + "][" + columnaMayor + "]");
    }
}

