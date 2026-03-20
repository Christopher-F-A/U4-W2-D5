package christopherfa;

public class Videogioco extends Gioco {
    private String piattaforma;
    private int durataOre; //
    private String genere;


    public Videogioco(String id, String titolo, int anno, double prezzo, String piattaforma, int durataOre, String genere) {
        super(id, titolo, anno, prezzo);
        this.piattaforma = piattaforma;
        this.durataOre = durataOre;
        this.genere = genere.toUpperCase();
    }

    @Override
    public String toString() {

        return super.toString() + " | Plat: " + piattaforma + " | Durata: " + durataOre + "h | Genere: " + genere;
    }
}