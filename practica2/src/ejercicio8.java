import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        // Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas
        // personas tienen una altura superior a la media y cuántas tienen una altura inferior a la
        // media. El valor de N se pide por teclado y debe ser entero positivo.
        Scanner s = new Scanner(System.in);
        int N;

        // El número de personas
        System.out.print("Introduce el número de personas: ");
        N = s.nextInt();
        if (N <= 0) {
            System.out.println("Error: N debe ser un número entero positivo.");
            }
        while (N <= 0);
        double[] array = new double[N];
        double suma = 0;

        // Leer las alturas
        System.out.println("Introduce las alturas: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Altura de la persona " + (i + 1) + ": ");
            array[i] = s.nextDouble();
            suma += array[i];
        }

        // Calcular la media
        double media = suma / N;
        System.out.println("La altura media es:" + media);

        // Contar cuántas están por encima y por debajo
        int superiores = 0, inferiores = 0;

        for (double altura : array) {
            if (altura > media) {
                superiores++;
            } else if (altura < media) {
                inferiores++;
            }
        }
        System.out.println("Personas con altura superior a la media: " + superiores);
        System.out.println("Personas con altura inferior a la media: " + inferiores);
        s.close();

    }
}