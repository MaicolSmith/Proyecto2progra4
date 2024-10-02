package proyecto;

import java.util.Scanner;

public class registro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Inicio");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Olvide Contraseña");
            System.out.println("3. Volver a Menu Princial");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Registro...");
                    System.out.println("Proximamente ...");
                    menu.main(args);
                    break;
                case 2:
                    System.out.println("Olvide Contraseña ...");
                    System.out.println("Proximamente ...");
                    menu.main(args);
                    break;
                case 3:
                    System.out.println("Volver a Menu Principal...");
                    inicio.main(args);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}