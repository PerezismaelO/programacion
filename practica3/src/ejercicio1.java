public class ejercicio1 {
    public static void main(String[] args){

        // Define un array de números tipo double de 3 filas por 7 columnas con nombre doub y asigna los
        // valores según la siguiente tabla. Muestra el contenido de todos los elementos del array
        // dispuestos en forma de tabla como se muestra en la figura.

        double[][] doub = {
                {0, 30, 2, 1.5, 1.5, 5},
                {70, 1.5, 1.5, 1.5, 0, 1.5},
                {1.5, 1.5, -2, 9, 1.5, 11,}
        };
        System.out.println("ArrayDoub | Columna0 | Columna 1 | Columna2 | Columna3 | Columna4 | Columna5 |");
        System.out.println("------------------------------------------------------------------------------");
        for (int i = 0; i < doub.length; i++) { // Recorre las filas
            System.out.print("Fila " +  i  + "   ");
            for (int j = 0; j < doub[i].length; j++) { // Recorre las columnas
                if (doub[i][j] == 1.5) {
                    System.out.print(" |         ");
                } else {
                    System.out.printf(" | %-8.0f", doub[i][j]);
                }
            }

            System.out.println();
        }
        System.out.println("------------------------------------------------------------------------------");
    }
}
