package Problema4;

import java.time.LocalDate;
import java.time.Period;

public class Persoana {
    private String nume;
    private String cnp;

    // Constructor cu parametri pentru nume și CNP
    public Persoana(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    // Getter pentru nume
    public String getNume() {
        return nume;
    }

    // Setter pentru nume
    public void setNume(String nume) {
        this.nume = nume;
    }

    // Getter pentru CNP
    public String getCnp() {
        return cnp;
    }

    // Setter pentru CNP
    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    // Metoda pentru calcularea vârstei
    public int getVarsta() {
        // Extragem anul, luna și ziua nașterii din CNP
        int an = Integer.parseInt(cnp.substring(1, 3));
        int luna = Integer.parseInt(cnp.substring(3, 5));
        int zi = Integer.parseInt(cnp.substring(5, 7));

        // Adăugăm secolul pe baza primei cifre din CNP
        if (cnp.charAt(0) == '1' || cnp.charAt(0) == '2') {
            an += 1900; // Secolul 20
        } else if (cnp.charAt(0) == '5' || cnp.charAt(0) == '6') {
            an += 2000; // Secolul 21
        }

        // Creăm o dată din anul, luna și ziua nașterii
        LocalDate dataNasterii = LocalDate.of(an, luna, zi);
        LocalDate dataCurenta = LocalDate.now();

        // Calculăm vârsta folosind diferența între date
        Period period = Period.between(dataNasterii, dataCurenta);
        return period.getYears();
    }
}
