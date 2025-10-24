import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        // Crea un programa en Java que: 1. Pida al usuario por teclado 10 números enteros
        // y los guarde en un array. 2. Recorra el array para encontrar:
        // El valor máximo y la posición en la que aparece.
        // El valor mínimo y la posición en la que aparece.
        Scanner s = new Scanner(System.in);
        int[] array = new int[10];
        // Pedir 10 números
        System.out.println("Introduce un numero:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array[i] = s.nextInt();
        }
        //Inicializamos máximo y mínimo con el primer valor del array
        int maximo = array[0];
        int minimo = array[0];
        int posicionMax = 0;
        int posicionMin = 0;

        // Recorrer el array para encontrar el máximo y el mínimo
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
                posicionMax = i;
            }
            if (array[i] < minimo) {
                minimo = array[i];
                posicionMin = i;
            }
        }
        // Mostrar los resultados
        System.out.println("Valor máximo: " + maximo + " en la posicion " + posicionMax);
        System.out.println("Valor mínimo: " + minimo + " en la posicion " + posicionMin);

        s.close();
    }
}