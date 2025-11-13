import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        // Escribe un programa java que invierta el orden de
        // los valores de un array. Por invertir el orden de los valores de un array,
        // me refiero que el último pasa a ser el primero, el
        // penúltimo el segundo y así sucesivamente. PRUEBA CON UN ARRAY DE TAMAÑO 6
        Scanner s = new Scanner(System.in);
        // Inicializamos el array de tamaño 6
        int[] array = new int[6];
        // Pedimos 6 valores
        System.out.println("Introduce 6 números:");
        // Recorremos el array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array[i] = s.nextInt();
        }
        // Mostramos el array original para despues poder invertir el orden de los elementos
        System.out.println("Array normal:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int[] invertido = new int[6];
        System.out.println();
        for (int i = 0; i < array.length; i++) { // Recorremos el array e invertimos el orden de los números
            invertido[i] = array[array.length - 1 - i];
        }

        System.out.println("El array invertido es:");
        for (int i = 0; i < invertido.length; i++) {
            System.out.print(invertido[i] + " ");
        }
    }
}