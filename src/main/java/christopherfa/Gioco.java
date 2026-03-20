package christopherfa;

public abstract class Gioco {
    protected String id, titolo;
    protected int anno;
    protected double prezzo;

    public Gioco(String id, String titolo, int anno, double prezzo) {
        this.id = id;
        this.titolo = titolo;
        this.anno = anno;
        this.prezzo = (prezzo > 0) ? prezzo : 1.0;

    }

    @Override
    public String toString() {
        return id + " | " + titolo + " (" + anno + ") | " + prezzo + "€";
    }


}