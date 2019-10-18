package ba.unsa.etf.rpr;

public class Artikl {
    String naziv, kod;
    double cijena;
    public Artikl(String naziv, String kod, double cijena){postavi(naziv,kod,cijena);};
    public void postavi(String naziv, String kod, double cijena){this.naziv=naziv; this.kod=kod; this.cijena=cijena; }
}
