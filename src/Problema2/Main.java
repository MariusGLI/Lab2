package Problema2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Citirea versurilor din fișierul de intrare și crearea vectorului de obiecte Vers
        List<Vers> versuri = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("cantec_in.txt"))) {
            while (scanner.hasNextLine()) {
                String linie = scanner.nextLine();
                versuri.add(new Vers(linie));
            }
        } catch (IOException e) {
            System.out.println("Eroare la citirea fișierului de intrare: " + e.getMessage());
            return;
        }

        // Scrierea versurilor procesate în fișierul de ieșire
        try (FileWriter writer = new FileWriter("cantec_out.txt")) {
            for (Vers vers : versuri) {
                String textVers = vers.transformaCuMajuscule();
                int numarCuvinte = vers.numarCuvinte();
                int numarVocale = vers.numarVocale();

                // Construim linia cu detaliile cerute
                String linie = textVers + " | Cuvinte: " + numarCuvinte + " | Vocale: " + numarVocale;

                // Adăugăm steluța dacă versul se termină cu gruparea "a" (sau altă terminatie aleasă)
                if (vers.seTerminaCu("a")) {
                    linie += " *";
                }

                // Scriem linia procesată în fișierul de ieșire
                writer.write(linie + System.lineSeparator());
            }
            System.out.println("Fișierul cantec_out.txt a fost creat cu succes.");
        } catch (IOException e) {
            System.out.println("Eroare la scrierea fișierului de ieșire: " + e.getMessage());
        }
    }
}
