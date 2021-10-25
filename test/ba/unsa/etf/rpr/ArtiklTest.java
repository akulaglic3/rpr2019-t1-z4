package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl a=new Artikl("Lopta", 30,"1");
        assertEquals("Lopta", a.getNaziv());
    }

    @Test
    void getCijena() {
        Artikl a=new Artikl("Lopta", 30,"1");
        assertEquals(30, a.getCijena());
    }
}