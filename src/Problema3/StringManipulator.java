package Problema3;

public class StringManipulator {
    private StringBuilder sb;

    // Constructorul primește șirul principal și îl stochează într-un StringBuilder
    public StringManipulator(String sirPrincipal) {
        this.sb = new StringBuilder(sirPrincipal);
    }

    // Metoda de inserare a unui șir într-o anumită poziție
    public void inserareSir(String sirDeInserat, int pozitieInserare) {
        if (pozitieInserare >= 0 && pozitieInserare <= sb.length()) {
            sb.insert(pozitieInserare, sirDeInserat);
        } else {
            System.out.println("Poziția de inserare este în afara limitelor șirului.");
        }
    }

    // Metoda de ștergere a unei secvențe de caractere dintr-o anumită poziție
    public void stergereSir(int pozitieStergere, int numarCaractereDeSters) {
        if (pozitieStergere >= 0 && pozitieStergere + numarCaractereDeSters <= sb.length()) {
            sb.delete(pozitieStergere, pozitieStergere + numarCaractereDeSters);
        } else {
            System.out.println("Poziția de ștergere sau numărul de caractere sunt în afara limitelor șirului.");
        }
    }

    // Metoda pentru obținerea șirului modificat
    public String getSir() {
        return sb.toString();
    }
}

