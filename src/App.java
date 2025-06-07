import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        int opcion;

        do {
            System.out.println(" MENÚ DE RECARGA ");
            System.out.println("1. Recargar saldo");
            System.out.println("2. Consultar saldo");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto a recargar: $");
                    double recarga = scanner.nextDouble();
                    if (recarga > 0) {
                        saldo += recarga;
                        System.out.println("Recarga exitosa. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Monto inválido. Intente de nuevo.");
                    }
                    break;

                case 2:
                    System.out.println("Su saldo actual es: $" + saldo);
                    break;

                case 3:
                    System.out.println("Gracias por usar el simulador de recargas. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

            System.out.println();
        } while (opcion != 3);

        scanner.close();
    }
}
