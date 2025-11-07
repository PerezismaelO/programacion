import java.util.Random;

public class ejercicio4 {
    public static void main(String[] args) throws InterruptedException {
        // Modifica el programa anterior de tal forma que las sumas parciales y la suma total
        // aparezcan en la pantalla con un pequeño retraso, dando la impresión de que el ordenador
        // se queda “pensando” antes de mostrar los números.
        /*Scanner s = new Scanner(System.in);

        int[][] array = new int [4][5];

        for (int i = 0; i < array.length; i++) {  Recorre las filas
            for (int j = 0; j < array[i].length; j++) {  Recorre las columnas
                System.out.println("Introduce un número");
                array[i][j] = s.nextInt();
            }
        }*/
        Thread.sleep(100);
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
            Thread.sleep(500);
            System.out.printf("Fila %d Suma = %-6d\n", i, sumaFila);
            System.out.println();
        }


        for (int j = 0; j < array[0].length; j++) { // Recorre las columnas
            int mayor = array[0][j];
            for (int i = 0; i < array.length; i++) { // Recorre las filas

                if (array[i][j]>mayor) {
                    mayor = array[i][j];

                }
            }
            Thread.sleep(250);
            System.out.printf("   %-8d", mayor);
        }
        System.out.println("Total= " + total);
        Thread.sleep(100);
        System.out.println("--------------------------------------------------------------------------");
    };

}


