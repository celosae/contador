

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario el límite para el contador
        System.out.print("Ingrese el limite para el contador: ");
        int limite = scanner.nextInt();

        // Cuenta creciente
        System.out.println("\nCuenta Creciente:");
        for(int i = 1; i <= limite; i++) {
            System.out.print(i + " ");
        }

        // Cuenta decreciente
        System.out.println("\n\nCuenta Decreciente:");
        for(int i = limite; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}

