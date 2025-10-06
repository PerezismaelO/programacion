import java.util.Scanner;

public class ejercicio1 {

    //Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por consola el índice y el valor al que corresponde.
    public static void main(String[] args) {
        System.out.println("test");
        //Crea un array de 10 posiciones de números pedidos por teclado
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[10];
        System.out.println("Introduce un valor:");
        int i;
        int valor = 0;
        for (i = 0; i < 10; i++) {
            valor = sc.nextInt();
            System.out.println("Introduce otro valor:");
        }
        //Muestra por consola el índice y el valor al que correspone.
        System.out.println("índice " + i++ + " = al valor " + valor);
    }
}
