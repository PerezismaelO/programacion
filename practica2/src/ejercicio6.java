import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args){
        // Programa Java que guarda en un array 10 números enteros que se leen por teclado. A
        // continuación se recorre el array y calcula cuántos números son positivos, cuántos negativos
        // y cuántos ceros.
        Scanner s = new Scanner(System.in);
        // Iniciamos el array
        int[] array = new int[10];
        // Damos valores a las variables para utilizarlas más tarde
        int contarPar = 0;
        int contarImpar = 0;
        int ceros = 0;

        // Recorremos el array para indicar por teclado sus valores
        for (int i = 0; i < array.length; i++) {
            System.out.println("Indica los valores de los indices");
            array[i] = s.nextInt();
        }
        // Volvemos a recorrer el array para analizar que valores son positivos, negativos o ceros utilizando un if.
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                contarPar++;
            } else if (array[i] % 2 != 0) {
                contarImpar++;
            } else {
                ceros++;
            }
        }
        System.out.println("Hay " + contarPar + " números pares");
        System.out.println("Hay " + contarImpar + " números impares");
        System.out.println("Hay " + ceros + " ceros");
        }
    }

