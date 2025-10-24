
public class ejercicio2 {
    static void main(String[] args){
        // Muestra por pantalla todos los elementos de un array de
        // numeros enteros separados por un espacio
        // Realiza un array con diferentes valores

        // Inicializamos el array y le damos valores
        int[] array = {10,2,5,7,4,1,67,9,3,8};

        // Recorremos el array para que los escriba con un espacio entre cada valor
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]);
        }
    }
}
