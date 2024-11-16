package Problema2;

import java.util.Random;

public class Vers {
    private String textVers;
    private static final String VOCALE = "AEIOUaeiou";
    private static final Random random = new Random();

    // Constructor pentru clasa Vers
    public Vers(String text) {
        this.textVers = text;
    }

    // Metodă care returnează numărul de cuvinte în vers
    public int numarCuvinte() {
        return textVers.trim().isEmpty() ? 0 : textVers.trim().split("\\s+").length;
    }

    // Metodă care returnează numărul de vocale în vers
    public int numarVocale() {
        int count = 0;
        for (char c : textVers.toCharArray()) {
            if (VOCALE.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // Metodă care verifică dacă versul se termină cu un șir dat
    public boolean seTerminaCu(String terminatie) {
        return textVers.endsWith(terminatie);
    }

    // Metodă care transformă versul în majuscule dacă numărul generat este mai mic decât 0.1
    public String transformaCuMajuscule() {
        if (random.nextDouble() < 0.1) {
            return textVers.toUpperCase();
        }
        return textVers;
    }

    // Metodă pentru obținerea versului
    public String getTextVers() {
        return textVers;
    }
}

