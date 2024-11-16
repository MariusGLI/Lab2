package Problema3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Citirea șirului principal
        System.out.print("Introduceți șirul principal: ");
        String sirPrincipal = scanner.nextLine();

        // Crearea unui obiect StringManipulator
        StringManipulator manipulator = new StringManipulator(sirPrincipal);

        // Citirea șirului care va fi inserat
        System.out.print("Introduceți șirul de inserat: ");
        String sirDeInserat = scanner.nextLine();

        // Citirea poziției unde se va insera șirul
        System.out.print("Introduceți poziția de inserare: ");
        int pozitieInserare = scanner.nextInt();
        scanner.nextLine();  // Consumă linia rămasă

        // Inserarea șirului
        manipulator.inserareSir(sirDeInserat, pozitieInserare);
        System.out.println("Șirul după inserare: " + manipulator.getSir());

        // Citirea poziției de ștergere și numărului de caractere de șters
        System.out.print("Introduceți poziția de ștergere: ");
        int pozitieStergere = scanner.nextInt();

        System.out.print("Introduceți numărul de caractere de șters: ");
        int numarCaractereDeSters = scanner.nextInt();

        // Ștergerea secvenței de caractere
        manipulator.stergereSir(pozitieStergere, numarCaractereDeSters);
        System.out.println("Șirul după ștergere: " + manipulator.getSir());

        scanner.close();
    }
}
