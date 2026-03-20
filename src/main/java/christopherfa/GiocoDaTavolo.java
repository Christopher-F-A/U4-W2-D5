package christopherfa;

public class GiocoDaTavolo extends Gioco {
    private int numGiocatori;
    private int durataMedia;

    public GiocoDaTavolo(String id, String titolo, int anno, double prezzo, int numGiocatori, int durataMedia) {
        super(id, titolo, anno, prezzo);
        // validazione da 2 a 10
        if (numGiocatori < 2) this.numGiocatori = 2;
        else if (numGiocatori > 10) this.numGiocatori = 10;
        else this.numGiocatori = numGiocatori;

        this.durataMedia = durataMedia;
    }

    @Override
    public String toString() {
        return super.toString() + " | Giocatori: " + numGiocatori + " | Durata: " + durataMedia + " min";
    }
}