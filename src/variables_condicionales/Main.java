package variables_condicionales;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //longitudDeUnaCircunferenciaDadoSuRadio();
        //areaDeUnCirculoDandoSuRadio();
        //solucionesRealesAUnaEcuacionDeSegundoGrado();

    }
    
    public static void longitudDeUnaCircunferenciaDadoSuRadio() {
        System.out.println("diametro = r+r y la longitud de la circunferencia es diametro x PI");
        System.out.println("introducir radio de la circunferencia");
        Scanner scanner = new Scanner(System.in);
        int radio = scanner.nextInt();
        System.out.println("la longitud de la circunferencia del radio dado es:");
        System.out.println(radio * 2 * 3.14);
    }

    public static void areaDeUnCirculoDandoSuRadio() {
        System.out.println("introducir radio");
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        System.out.println(Math.PI * (r * r));
    }

    public static void solucionesRealesAUnaEcuacionDeSegundoGrado() {
        System.out.println("ingresar coeficiente 1");
        System.out.println("ingresar coeficiente 2");
        System.out.println("ingresar coeficiente 3 ");
        Scanner scanner = new Scanner(System.in);
        int coe1 = scanner.nextInt();
        int coe2 = scanner.nextInt();
        int coe3 = scanner.nextInt();
        System.out.println("el determinante de los coeficientes dados es:");
        int d = ((coe2 * coe2) - 4 * coe1 * coe3);
        System.out.println(d);
        if (d < 0) System.out.println("no existen soluciones reales");
        else {
            boolean b = 0 < d;
            System.out.println("existe solución real");
        }
    }

}
