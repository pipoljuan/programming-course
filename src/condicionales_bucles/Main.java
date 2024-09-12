package condicionales_bucles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //elevarNumerosAlCuadrado();

    }

    public static void elevarNumerosAlCuadrado() {
        System.out.println("introduzca numeros");
        Scanner scanner = new Scanner(System.in);
        int primernumero = scanner.nextInt();
        while (primernumero >= 0) {
            System.out.println(primernumero * primernumero);
            primernumero = scanner.nextInt();
        }
        System.out.println("fin del programa");
    }
}
