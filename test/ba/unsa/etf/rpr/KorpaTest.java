package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private Korpa korpa;
    private Artikl artikl;
    @BeforeEach
    void setUp(){
        Korpa korpa = new Korpa();
        Artikl artikl = new Artikl ("Biciklo", "1000", "1");
    }
    @Test
    void getArtikli() {
    }

    @Test
    void dodajArtikl() {

    }

    @Test
    void dajUkupnuCijenuArtikala() {
    }

    @Test
    void izbaciArtiklSaKodom() {
    }
}