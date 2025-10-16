import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        // Crea un array de 10 posiciones de números pedidos por teclado
        Scanner scanner = new Scanner(System.in);
        int[] arrayint = new int [10];
        for (int i = 0; i < arrayint.length; i++) {
            System.out.println("Introduce un número");
            arrayint[i] = scanner.nextInt();
        }
        System.out.println("Valores del array");
        // Mostrar índice de cada valor del array
        for ( int i = 0; i < arrayint.length; i++) {
            System.out.println("Índice " + i + "  Valor: " + arrayint[i]);
        }
        scanner.close();
    }
}

