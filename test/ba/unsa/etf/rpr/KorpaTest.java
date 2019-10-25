package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private Korpa korpa = new Korpa();
    private Artikl artikl= new Artikl ("Biciklo", "1000", "1");




    @Test
    void getArtikli() {

    }

    @Test
    void dodajArtikl() {
        assertTrue(korpa.dodajArtikl(artikl));
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa1 = new Korpa();
        Artikl artikal1= new Artikl ("Biciklo", "1000", "2");
        korpa1.dodajArtikl(artikal1);
        assertEquals(2,korpa1.dajUkupnuCijenuArtikala());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa1 = new Korpa();
        Artikl artikal1= new Artikl ("Biciklo", "1000", "2");
        korpa1.dodajArtikl(artikal1);
        korpa1.izbaciArtiklSaKodom("1000");
        assertEquals(0,korpa1.dajUkupnuCijenuArtikala());
    }
}