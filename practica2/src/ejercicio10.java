import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        // Crea un programa que muestre por pantalla la nota de un estudiante, de entre una lista de
        // estudiantes con sus respectivas notas. El nombre del estudiante lo introduce el usuario por
        // teclado (usa la clase Scanner). Utiliza un array para los nombres de los alumnos y otro para
        // las notas. ¿Serías capaz de hacerlo con un array BIdimensional?
        Scanner s = new Scanner(System.in);

        // Inicializamos el array "nombres" con 5 nombres
        String[] arrayNombres = {"Ana", "Carlos", "Alba", "Carla", "Alejandra"};
        // Inicializamos el array "notas" con 5 notas con un double
        double[] arrayNotas = {4, 2.6, 9, 8.7, 5.6};
        // Creamos la variable estudiante
        String estudiante;
        // Pedimos por teclado el nombre de un estudiante
        System.out.println("Dime el nombre de un estudiante: ");
        estudiante = s.nextLine();
        // Recorremos el array. Si el nombre de el/la estudiante está incluida en el array,
        // nos da su nota correspondiente, y si no está en el array, pues
        // dice que no está inscrito.
        for (int i = 0; i < arrayNombres.length; i++) {
            if (estudiante.equals(arrayNombres[i])) {
                System.out.println("La nota del estudiante es: " + arrayNombres[i] + " " + arrayNotas[i]);
                break;
            } else if (!estudiante.equals(arrayNombres[i])) {
                System.out.println("No está inscrito");
            }
        }
    }
}
