package christopherfa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Collezione {
    private final List<Gioco> inventario = new ArrayList<>();

    // aggiunta
    public void add(Gioco g) {
        boolean duplicato = inventario.stream()
                .anyMatch(existing -> existing.id.equals(g.id));
        if (duplicato) {
            throw new IllegalArgumentException("ID già presente: " + g.id);
        }
        inventario.add(g);
    }

    // ricerca per id
    public Gioco cercaPerId(String id) {
        return inventario.stream()
                .filter(g -> g.id.equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Nessun gioco con ID: " + id));
    }

    // ricerca per prezzo
    public List<Gioco> cercaPerPrezzo(double prezzoMax) {
        if (prezzoMax <= 0) {
            throw new IllegalArgumentException("Il prezzo deve essere positivo.");
        }
        return inventario.stream()
                .filter(g -> g.prezzo < prezzoMax)
                .collect(Collectors.toList());
    }

    // ricerca per numero giocatori
    public List<GiocoDaTavolo> cercaPerGiocatori(int num) {
        if (num < 2 || num > 10) {
            throw new IllegalArgumentException("Il numero di giocatori deve essere tra 2 e 10.");
        }
        return inventario.stream()
                .filter(g -> g instanceof GiocoDaTavolo gdt && gdt.getNumGiocatori() == num)
                .map(g -> (GiocoDaTavolo) g)
                .collect(Collectors.toList());
    }

    // stats
    public void statistiche() {
        if (inventario.isEmpty()) {
            System.out.println("La collezione è vuota.");
            return;
        }

        long totVideogiochi = inventario.stream()
                .filter(g -> g instanceof Videogioco)
                .count();

        long totTavolo = inventario.stream()
                .filter(g -> g instanceof GiocoDaTavolo)
                .count();

        Gioco piuCaro = inventario.stream()
                .max(Comparator.comparingDouble(g -> g.prezzo))
                .orElseThrow();

        double media = inventario.stream()
                .mapToDouble(g -> g.prezzo)
                .average()
                .orElse(0);

        System.out.println("\n[STATISTICHE]");
        System.out.println("Videogiochi: " + totVideogiochi);
        System.out.println("Giochi da tavolo: " + totTavolo);
        System.out.println("Gioco piu caro: " + piuCaro.titolo + " (" + piuCaro.prezzo + " euro)");
        System.out.println("Media prezzi: " + media + " euro");
    }

    // stampa
    public void stampa() {
        if (inventario.isEmpty()) {
            System.out.println("La collezione è vuota.");
            return;
        }
        inventario.forEach(g -> System.out.println(g));
    }
}