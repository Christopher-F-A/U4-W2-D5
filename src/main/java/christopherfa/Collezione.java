package christopherfa;

public class Collezione {
    private Gioco[] inventario;
    private int indice = 0;

    public Collezione(int capacità) {
        this.inventario = new Gioco[capacità];
    }

    public void add(Gioco g) {
        if (indice < inventario.length) {
            inventario[indice++] = g;
        } else {
            System.out.println("Spazio esaurito");
        }
    }

    public void stampa() {
        for (int i = 0; i < indice; i++) {
            System.out.println(inventario[i].toString());
        }
    }
}