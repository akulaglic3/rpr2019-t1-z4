package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket market = new Supermarket();
        market.dodajArtikl(new Artikl("Telefon", 1000, "1"));
        market.dodajArtikl(new Artikl("Metla", 10, "2"));
        market.dodajArtikl(new Artikl("Lopta", 15, "13"));
        market.dodajArtikl(new Artikl("Lopata", 25, "15"));
        market.dodajArtikl(new Artikl("Jadro", 2, "23"));
        assertNotNull(market);
    }

    @Test
    void getArtikli() {
        Supermarket market = new Supermarket();
        market.dodajArtikl(new Artikl("Telefon", 1000, "1"));
        market.dodajArtikl(new Artikl("Metla", 10, "2"));
        market.dodajArtikl(new Artikl("Lopta", 15, "13"));
        Artikl[] a={new Artikl("Telefon", 1000, "1"), new Artikl("Metla", 10, "2"), new Artikl("Lopta", 15, "13")};
        assertEquals(a[0].getKod(), market.getArtikli()[0].getKod());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket market = new Supermarket();
        market.dodajArtikl(new Artikl("Telefon", 1000, "1"));
        market.dodajArtikl(new Artikl("Metla", 10, "2"));
        market.dodajArtikl(new Artikl("Lopta", 15, "13"));
        market.izbaciArtiklSaKodom("2");
        assertNull(market.getArtikli()[2]);
    }
}