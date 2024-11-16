package Problema1;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Creăm un obiect JudeteSorter și citim județele din fișier
            JudeteSorter sorter = new JudeteSorter("judete_in.txt");

            // Afișăm lista de județe sortate
            sorter.afiseazaJudete();

            // Cerem utilizatorului să introducă un județ pentru a-i găsi poziția
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceți numele județului pentru a găsi poziția sa în lista sortată: ");
            String judetCautat = scanner.nextLine();

            // Căutăm județul introdus de utilizator în lista sortată
            int pozitie = sorter.cautaJudet(judetCautat);

            if (pozitie >= 0) {
                System.out.println("Județul " + judetCautat + " se află pe poziția " + pozitie + " în lista sortată.");
            } else {
                System.out.println("Județul " + judetCautat + " nu a fost găsit în lista județelor.");
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Fișierul nu a fost găsit: " + e.getMessage());
        }
    }
}

