import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        // Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas
        // personas tienen una altura superior a la media y cuántas tienen una altura inferior a la
        // media. El valor de N se pide por teclado y debe ser entero positivo.
        Scanner s = new Scanner(System.in);

        // Introducimos el número de personas
        System.out.print("Introduce el número de personas: ");
        int N = s.nextInt();
        if (N <= 0) {
            System.out.println("Error: N debe ser un número entero positivo.");
            }

        // Iniciamos array con un double para que nos de la altura en metros
        double[] array = new double[N];
        double suma = 0;


        System.out.println("Introduce las alturas: ");
        for (int i = 0; i < array.length; i++) { // Recorremos el array para introducir la altura de cada persona
            System.out.print("Altura de la persona " + (i + 1) + ": ");
            array[i] = s.nextDouble();
            suma += array[i];
        }

        double media = suma / N;
        System.out.println("La altura media es:" + media + "metros");

        // Contamos cuántas están por encima y por debajo de la media
        int superiores = 0;
        int inferiores = 0;
        // Recorremos el array y si la altura está por encima de la media se
        // añade 1 a superiores, y si no, se añade 1 a inferiores
        for (double altura : array) {
            if (altura > media) {
                superiores++;
            } else if (altura < media) {
                inferiores++;
            }
        }
        System.out.println("Personas con altura superior a la media: " + superiores);
        System.out.println("Personas con altura inferior a la media: " + inferiores);
    }
}