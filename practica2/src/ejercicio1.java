import java.util.Scanner;

public class ejercicio1 {

    //Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por consola el índice y el valor al que corresponde.
    public static void main(String[] args){
        System.out.println("test");
        //Crea un array de 10 posiciones de números pedidos por teclado
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[10];
        System.out.println("Introduce un valor:");
        for(int i=0; i<10; i++) {
            System.out.println("Introduce el siguiente valor:");
            arrayInt[i] = sc.nextInt();
        }
    }
}
