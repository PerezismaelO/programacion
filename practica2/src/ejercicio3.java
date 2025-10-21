public class ejercicio3 {
    public static void main(String[] args) {
        // Crea un array que contenga 5 números. Realiza un programa que te muestre
        // por pantalla SOLO el más pequeño de ellos.
        int[] array = {51, 9, 4, 67, 45};
        int menor = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];

            }
        }
        System.out.println("El numero más pequeño es: " + menor);
    }

}