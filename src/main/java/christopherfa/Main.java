package christopherfa;

public class Main {
    public static void main(String[] args) {

        Collezione c = new Collezione(10);
        c.add(new Videogioco("V1", "Elden Ring1", 2022, 59.90, "PC", 100, "RPG"));
        c.add(new Videogioco("V2", "Elden Ring2", 2023, 69.90, "Playstation", 200, "ACTION"));
        c.add(new Videogioco("V3", "Elden Ring3", 2024, 79.90, "Xbox", 300, "SPORT"));
        c.add(new Videogioco("V4", "Elden Ring4", 2025, 89.90, "PC", 400, "SIMULAZIONE"));
        c.add(new Videogioco("V5", "Elden Ring5", 2026, 99.90, "Gameboy", 500, "RPG"));
        c.add(new Videogioco("V6", "Elden Ring6", 2027, 109.90, "DS", 600, "RPG"));
        c.add(new GiocoDaTavolo("T1", "Risiko1", 1957, 35.0, 6, 120));
        c.add(new GiocoDaTavolo("T2", "Risiko2", 1958, 36.0, 6, 130));
        c.add(new GiocoDaTavolo("T3", "Risiko3", 1959, 37.0, 6, 140));
        c.add(new GiocoDaTavolo("T4", "Risiko4", 1960, 38.0, 6, 150));
        c.add(new GiocoDaTavolo("T5", "Risiko5", 1961, 39.0, 6, 160));// test, non visibile nella collezione e comunica spazio esaurito
        c.add(new GiocoDaTavolo("T6", "Risiko6", 1962, 40.0, 6, 170));
        c.stampa();}

}

