public class ejercicio3 {
    public static void main(String[] args) {
        // Crea un array que contenga 5 números. Realiza un programa que te muestre
        // por pantalla SOLO el más pequeño de ellos.
        int[] array = {51, 9, 4, 67, 45};
        int menor = array[3];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[3]){
                menor = array[i];
                System.out.println(menor);
            }
        }
    }
}