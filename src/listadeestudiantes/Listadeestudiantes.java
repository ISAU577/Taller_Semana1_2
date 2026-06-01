package listadeestudiantes;

import java.util.ArrayList;
import java.util.Scanner;

public class Listadeestudiantes {

    public static void main(String[] args) {
     
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Registro Continuo de Estudiantes ---");
        System.out.println("Escribe el nombre del estudiante o la palabra 'fin' para terminar.\n");

        while (true) {
            try {
                System.out.print("Ingresa el nombre del estudiante: ");
                String entrada = scanner.nextLine();

                if (entrada == null || entrada.trim().isEmpty()) {
                    throw new IllegalArgumentException("El nombre no puede estar vacío.");
                }

                String nombre = entrada.trim();

                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }

                if (nombre.matches(".*\\d.*")) {
                    throw new IllegalArgumentException("El nombre no debe contener números.");
                }

                lista.add(nombre);

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Por favor, intenta de nuevo.\n");
            }
        }

        System.out.println("\n--- Lista Completa de Estudiantes ---");
        if (lista.isEmpty()) {
            System.out.println("No se registraron estudiantes.");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println((i + 1) + ". " + lista.get(i));
            }
        }

        scanner.close();
    }
}
