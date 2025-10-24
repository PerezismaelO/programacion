import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        // Crea un programa que muestre por pantalla la nota de un estudiante, de entre una lista de
        // estudiantes con sus respectivas notas. El nombre del estudiante lo introduce el usuario por
        // teclado (usa la clase Scanner). Utiliza un array para los nombres de los alumnos y otro para
        // las notas. ¿Serías capaz de hacerlo con un array BIdimensional?
        Scanner s = new Scanner(System.in);
        String[] arrayNombres = {"Ana", "Carlos", "Alba", "Carla", "Mónica"};
        double[] arrayNotas = {4, 2.6, 9, 8.7, 5.6};
        String estudiante;
        System.out.println("Dime el nombre de un estudiante: ");
        estudiante = s.nextLine();
        for (int i = 0; i < arrayNombres.length; i++) {
            if (estudiante.equals(arrayNombres[i])) {
                System.out.println("La nota del estudiante es: " + arrayNombres[i] + " " + arrayNotas[i]);
                break;
            } else if (!estudiante.equals(arrayNombres[i])) {
                System.out.println("No está inscrito");
                break;
            }


        }

    }
}
