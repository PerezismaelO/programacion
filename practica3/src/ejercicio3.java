import java.util.Random;

public class ejercicio3 {
    public static void main(String[] args) {
        // Modifica el programa anterior de tal forma que los números que se introducen en el array
        // se generen de forma aleatoria (valores entre 1 y 1999).
        /*Scanner s = new Scanner(System.in);

        int[][] array = new int [4][5];

        for (int i = 0; i < array.length; i++) {  Recorre las filas
            for (int j = 0; j < array[i].length; j++) {  Recorre las columnas
                System.out.println("Introduce un número");
                array[i][j] = s.nextInt();
            }
        }*/
        System.out.println("--------------------------------------------------------------------------");
        int[][] array = new int [4][5];

        Random randomNum = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomNum.nextInt(1999) + 1;
            }
        }
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
        System.out.println("--------------------------------------------------------------------------");
        };

    }

