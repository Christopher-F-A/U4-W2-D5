package christopherfa;

public class Videogioco extends Gioco {
    private String piattaforma;
    private String genere;

    public Videogioco(String id, String titolo, int anno, double prezzo, String piattaforma, String genere) {
        super(id, titolo, anno, prezzo);
        this.piattaforma = piattaforma;
        this.genere = genere.toUpperCase();
    }

    @Override
    public String toString() {
        return super.toString() + " | Genere: " + genere;
    }
}