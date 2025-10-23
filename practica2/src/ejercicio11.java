import java.util.Scanner:

public class ejercicio8 {
    public static void main(String[] args) {
        // Escribe un programa java que invierta el orden de
        // los valores de un array. Por invertir el orden de los valores de un array,
        // me refiero que el último pasa a ser el primero, el
        // penúltimo el segundo y así sucesivamente. PRUEBA CON UN ARRAY DE TAMAÑO 6
        Scanner s = new Scanner(System.in);
        int[] array = new int[6];

        System.out.println("Introduce 6 números:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Mostrar el array original
        System.out.println("Array original:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Invertir el orden de los elementos
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        // Mostrar el array invertido
        System.out.println("Array invertido:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}