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
        System.out.println("Array original:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Invertimos el orden de los elementos
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        // Mostramos el array invertido
        System.out.println("Array invertido:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}