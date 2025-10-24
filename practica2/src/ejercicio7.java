import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        // Programa Java que llene un array con 10 números enteros que se leen por teclado. A
        // continuación calcula y muestra la media de los valores positivos y la de los valores negativos
        // del array.
        Scanner s = new Scanner(System.in);
        // Iniciamos el array
        int[] array = new int[10];
        // Le damos nombre a las variables
        int sumarPositivos = 0;
        int sumarNegativos = 0;
        int contarPositivos = 0;
        int contarNegativos = 0;
        // Recorremos el array con un for para darle los valores por teclado
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese un valor: ");
            array[i] = s.nextInt();

            if (array[i] > 0) {
                sumarPositivos += array[i];
                contarPositivos++;
            } else if (array[i] < 0) {
                sumarNegativos += array[i];
                contarNegativos++;
            }
        }
        System.out.println("La suma de los positivos es " + sumarPositivos);
        System.out.println("La suma de los negativos es " + sumarNegativos);
        if (contarPositivos > 0){
            double mediaPositivos = sumarPositivos/contarPositivos;
            System.out.println("La media de los números positivos es: " + mediaPositivos);
        } else {
            System.out.println("No hay números positivos");
        }
        if (contarNegativos > 0){
            double mediaNegativos = sumarNegativos/contarNegativos;
            System.out.println("La media de los números negativos es: " + mediaNegativos);
        } else  {
            System.out.println("No hay números negativos");
        }
        s.close();
    }
}
