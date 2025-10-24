import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        // En España cada persona está identificada con un Documento Nacional de
        // Identidad (DNI) en el que figura un número y una letra, por ejemplo 56999545W.
        // Realiza un programa donde le pidas al usuario SOLO el número del dni y el
        // programa te devuelva la letra. Para calcular la letra solo tienes que dividir
        // el número del DNI entre 23, el resto de esta división se corresponde con la
        // posición de la letraen el abecedario. Utiliza un array para guardar CADA letra
        // del abecedario.
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe los números del DNI");
        // Inicializamos la variable DNI que será escrita por teclado
        int DNI = s.nextInt();
        // Inicializamos la variable letra con el valor 0
        int letra = 0;
        // Inicializamos el array
        char[] array = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        letra = DNI % 23;
        System.out.println("La letra de el DNI es " + array[letra]);
    }
}