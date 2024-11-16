package Problema4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Citirea numărului de persoane
        System.out.print("Introduceți numărul de persoane: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumăm newline-ul rămas

        // Creăm un vector de obiecte Persoana
        Persoana[] persoane = new Persoana[n];

        // Citim datele pentru fiecare persoană
        for (int i = 0; i < n; i++) {
            System.out.print("Introduceți numele persoanei " + (i + 1) + ": ");
            String nume = scanner.nextLine();

            String cnp;
            while (true) {
                System.out.print("Introduceți CNP-ul persoanei " + (i + 1) + ": ");
                cnp = scanner.nextLine();

                // Validarea CNP-ului (să aibă 13 caractere și să fie numeric)
                if (cnp.length() == 13 && cnp.matches("[0-9]+")) {
                    break;
                } else {
                    System.out.println("CNP-ul introdus este invalid. Vă rugăm să-l reintroduceți.");
                }
            }

            // Creăm obiectul Persoana și îl adăugăm în vector
            persoane[i] = new Persoana(nume, cnp);
        }

        // Afișăm informațiile despre fiecare persoană
        System.out.println("\nInformații despre persoane:");
        for (int i = 0; i < n; i++) {
            Persoana p = persoane[i];
            System.out.println(p.getNume() + ", " + p.getCnp() + ", Vârstă: " + p.getVarsta());
        }

        scanner.close();
    }
}

