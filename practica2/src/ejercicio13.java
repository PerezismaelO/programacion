import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        // Crea un programa que:
        // Cree una lista de enteros (ArrayList<Integer>).
        // Pida números por teclado hasta que el usuario introduzca un número negativo (ese
        // no se añade).
        // Muestre por pantalla todos los números de la lista y la suma total de los mismos.
        Scanner s = new Scanner(System.in);
        // Inicializamos el array con un tamaño cualquiera
        int[] array = new int[1000];
        int numero;
        int contadorNum = 0;
        int sumaNum = 0;

        // Recorremos el array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un número: ");
            numero = s.nextInt();
            array[contadorNum] = numero;
            contadorNum++;
            sumaNum += numero;
            if (numero < 0) {
                break;
            }
        }

        System.out.println("Los números introducidos son:");
        // Recorremos otra vez el array para contar los números positivos y sumarlos
        for (int i = 0; i < contadorNum; i++) {
            System.out.println(array[i]);
        }
        System.out.println("La suma total es: " + sumaNum);
    }
}



