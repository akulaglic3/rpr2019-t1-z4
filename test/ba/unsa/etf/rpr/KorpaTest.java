package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa pom= new Korpa();
        pom.dodajArtikl(new Artikl("Lopata", 300 , "13"));
        pom.dodajArtikl(new Artikl("Jadro", 300 , "18"));
        pom.dodajArtikl(new Artikl("Crni jadro", 300 , "10"));
        assertEquals(900,pom.dajUkupnuCijenuArtikala());
    }

    @Test
    void getArtikli() {
        Korpa pom= new Korpa();
        pom.dodajArtikl(new Artikl("Lopata", 300 , "13"));
        assertEquals(300,pom.getArtikli()[0].getCijena());

    }
}


