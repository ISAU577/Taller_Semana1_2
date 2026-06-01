package calculadorabasica;
import java.util.Scanner;

public class Calculadorabasica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("- CALCULADORA DE MULTIPLICACIÓN (2 CIFRAS ENTERAS) ---");

    
        int num1 = leerNumeroValido(scanner, "Ingrese el primer número: ");
        int num2 = leerNumeroValido(scanner, "Ingrese el segundo número: ");

     
        int resultado = multiplicar(num1, num2);
        System.out.println("\nEl resultado de la multiplicación es: " + resultado);

        scanner.close();
    }

    public static int leerNumeroValido(Scanner scanner, String mensaje) {
        String input;
        while (true) {
            System.out.print(mensaje);
            input = scanner.nextLine(); 

            if (input.trim().isEmpty()) {
                System.out.println(" Error: El campo no puede estar vacío. Intente de nuevo.");
                continue;
            }

            if (!input.matches("^-?[0-9]+$")) {
                System.out.println(" Error: Solo se permiten números enteros. Intente de nuevo.");
                continue;
            }

            int numero = Integer.parseInt(input);
            int absoluto = Math.abs(numero);

            if (absoluto < 10 || absoluto > 99) {
                System.out.println(" Error: El número debe tener exactamente dos cifras. Intente de nuevo.");
                continue;
            }

            return numero;
        }
    }
    
    public static int multiplicar(int a, int b) {
        return a * b;
    }
}

