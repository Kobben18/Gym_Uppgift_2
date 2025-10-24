import java.time.*;

public class Medlem {
    private final String namn;
    private final String personnummer;
    private final LocalDate betalning;
    private final String medlemTyp;

    public Medlem(String namn, String personnummer, LocalDate betalning, String medlemTyp) {
        this.namn = namn;
        this.personnummer = personnummer;
        this.betalning = betalning;
        this.medlemTyp = medlemTyp;
    }

    public boolean medlemCheck() {
        return Period.between(betalning, LocalDate.now()).getYears() < 1;
    }

    public String toString() {
        return namn + " (" + medlemTyp + ")";
    }

    public String getNamn() {
        return namn;
    }

    public String getPersonnummer() {
        return personnummer;
    }
}
