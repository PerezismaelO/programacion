import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        // Crea un array de 10 posiciones de números pedidos por teclado
        Scanner scanner = new Scanner(System.in);
        int[] arrayint = new int [10]; // Creamos el array
        for (int i = 0; i < arrayint.length; i++) { // Recorremos el array
            System.out.println("Introduce un numero");
            arrayint[i] = scanner.nextInt(); // Rellena el array con los números introducidos
        }
        System.out.println("Valores del array");
        // Mostrar índice de cada valor del array
        for ( int i = 0; i < arrayint.length; i++) { //Recorremos otra vez el array para que nos de los valores con sus respectivos índices
            System.out.println("Índice " + i + "  Valor: " + arrayint[i]);
        }
    }
}

