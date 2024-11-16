package Problema1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class JudeteSorter {

    private String[] judete;

    // Constructor care citește județele din fișier și le stochează într-un tablou
    public JudeteSorter(String numeFisier) throws FileNotFoundException {
        this.judete = citesteJudeteDinFisier(numeFisier);
        Arrays.sort(this.judete);  // Sortăm județele la inițializare
    }

    // Metodă pentru citirea județelor dintr-un fișier și salvarea lor într-un tablou de String-uri
    private String[] citesteJudeteDinFisier(String numeFisier) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File(numeFisier));
        StringBuilder continut = new StringBuilder();

        while (fileScanner.hasNextLine()) {
            continut.append(fileScanner.nextLine()).append(",");
        }
        fileScanner.close();

        // Împărțim șirul de județe pe baza separatorului ","
        return continut.toString().split(",");
    }

    // Metodă pentru afișarea listei de județe sortate
    public void afiseazaJudete() {
        System.out.println("Lista sortată a județelor:");
        System.out.println(Arrays.toString(judete));
    }

    // Metodă pentru căutarea binară a unui județ în lista sortată
    public int cautaJudet(String judetCautat) {
        return Arrays.binarySearch(this.judete, judetCautat);
    }
}

