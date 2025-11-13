public class ejercicio3 {
    public static void main(String[] args) {
        // Crea un array que contenga 5 números. Realiza un programa que te muestre
        // por pantalla SOLO el más pequeño de ellos.

        // Inicializamos el array con 5 valores
        int[] array = {51, 9, 4, 67, 45};
        // Le asignamos la variable menor al primer índice del array
        int menor = array[0];

        // Queremos recorrer el array para que vaya observando si cada valor del índice
        // es menor al anterior. Si es así, a la variable menor se le asigna el valor
        // más pequeño. Y así hasta que recorra el array entero.
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        System.out.println("El numero más pequeño es: " + menor);
    }

}