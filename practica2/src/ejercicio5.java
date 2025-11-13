import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){
        // Crea un array de números donde le indicamos por teclado el tamaño del array,
        // rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla el
        // valor de cada posición y la suma de todos los valores.
        Scanner s = new Scanner(System.in);

        // Pedimos que indique el tamaño del array
        System.out.println("Dime el tamaño del array");

        int arrayLength = s.nextInt(); // El numero pedido por teclado será la longitud del array
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) { // Recorremos el array para asignarles números entre el 0 y el 9
            array[i] = (int) (Math.random()* 10);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("El índice es " + i + " Su valor es " + array[i]);
        }
        int suma = 0;
        for (int i = 0; i < array.length; i++) { // Lo recorremos otra vez para hacer la suma
            suma += array[i];
        }
        System.out.println("La suma es " + suma);
        }
    }