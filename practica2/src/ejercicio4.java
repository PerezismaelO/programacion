public class ejercicio4 {
    public static void main(String[] args){
       // Crea un array de números de 100 posiciones, que contendrá los números del
        // 1 al 100. Obtén la suma de todos ellos y la media.

        int[] array = new int[100]; // Iniciamos el array de 100 posiciones
        for (int i = 0; i < array.length; i++) { // Recorremos el array para darles los valores a todas las posiciones
            array[i] = i + 1;
        }
        int suma = 0;
        for (int i = 0; i < array.length; i++) { // Lo recorremos de nuevo para calcular la suma y la media
            suma += array[i];

        }
        int media = suma / array.length;
        System.out.println("La suma es " + suma);
        System.out.println("La media es " + media);
    }

}
