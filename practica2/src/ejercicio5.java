import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){
        // Crea un array de números donde le indicamos por teclado el tamaño del array,
        // rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla el
        // valor de cada posición y la suma de todos los valores.
        Scanner s = new Scanner(System.in);

        // Pedimos que indique el tamaño del array
        System.out.println("Dime el tamaño del array");

        int arrayLength = s.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()* 9 + 1);
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println("El índice es " + j + " Su valor es " + array[j]);
        }
        int suma = 0;
        for (int k = 0; k < array.length; k++) {
            suma += array[k];
        }
        System.out.println("La suma es " + suma);

        }
    }